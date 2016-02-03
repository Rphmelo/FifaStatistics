/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Falta;
import beans.Finalizacao;
import beans.Gol;
import beans.Jogador;
import beans.Media;
import beans.Partida;

/**
 * @author Raphael de Melo
 *
 */
public class MediaDAO {

	// Variaveis auxiliares
	PreparedStatement smt = null;
	ResultSet result = null;
	String sql = null;

	// Buscando Vitorias, derrotas e empates de cada jogador
	public List<Media> listarResultado(Connection con) throws SQLException {
		// Variáveis auxiliares
		List<Media> listResultado = new ArrayList<Media>();
		Media media = null;
		Jogador jogador = null;
		Gol gol = null;
		Finalizacao fin = null;
		Falta falta = null;
		// Script SQL
		sql = "SELECT JO.cd_jogador, JO.nm_jogador, COUNT(EST.cd_estatistica), NVL(JOG.VITORIAS, 0), "
				+ "NVL(JOG2.DERROTAS, 0), NVL(JOG3.EMPATES, 0), ROUND((NVL(JOG.VITORIAS * 3, 0) "
				+ "+ NVL(JOG2.DERROTAS * 0, 0) + NVL(JOG3.EMPATES * 1, 0)) / (COUNT(EST.cd_estatistica) * 3) "
				+ "* 100, 2) FROM T_FIFA_ESTATISTICA EST LEFT JOIN (SELECT J.cd_jogador, J.nm_jogador, COUNT"
				+ "(EST2.ds_resultado) AS " + "VITORIAS" + " FROM T_FIFA_ESTATISTICA EST2 JOIN T_FIFA_JOGADOR J ON "
				+ "J.cd_jogador = EST2.cd_jogador WHERE EST2.ds_resultado = 'V' GROUP BY J.cd_jogador, J.nm_jogador) "
				+ "JOG ON JOG.cd_jogador = EST.cd_jogador LEFT JOIN (SELECT J.cd_jogador, J.nm_jogador, COUNT(EST3.ds_resultado) "
				+ "AS " + "DERROTAS" + " FROM T_FIFA_ESTATISTICA EST3 JOIN T_FIFA_JOGADOR J ON J.cd_jogador = EST3.cd_jogador WHERE "
				+ "EST3.ds_resultado = 'D' GROUP BY J.cd_jogador, J.nm_jogador) JOG2 ON JOG2.cd_jogador = EST.cd_jogador LEFT "
				+ "JOIN (SELECT J.cd_jogador, J.nm_jogador, COUNT(EST4.ds_resultado) AS " + "EMPATES" + " FROM T_FIFA_ESTATISTICA EST4 "
				+ "JOIN T_FIFA_JOGADOR J ON J.cd_jogador = EST4.cd_jogador WHERE EST4.ds_resultado = 'E' GROUP BY J.cd_jogador, "
				+ "J.nm_jogador) JOG3 ON JOG3.cd_jogador = EST.cd_jogador JOIN T_FIFA_JOGADOR JO ON JO.cd_jogador = EST.cd_jogador "
				+ "GROUP BY JO.cd_jogador, JO.nm_jogador, JOG.VITORIAS, JOG2.DERROTAS, JOG3.EMPATES ORDER BY JO.nm_jogador ASC";

		// Preparando estrutura
		smt = con.prepareStatement(sql);
		// Gerando resultado
		result = smt.executeQuery();
		while (result.next()) {
			jogador = new Jogador();
			media = new Media();
			jogador.setCodigo(result.getInt(1));
			jogador.setNome(result.getString(2));
			media.setJogador(jogador);
			media.setQtPartida(result.getInt(3));
			media.setQtVitoria(result.getInt(4));
			media.setQtDerrota(result.getInt(5));
			media.setQtEmpate(result.getInt(6));
			media.setAproveitamento(result.getFloat(7));
			listResultado.add(media);
		}
		// Fechando estrutura e resultado
		result.close();
		smt.close();
		return listResultado;
	}
	
	// Buscando Vitorias, derrotas e empates de cada jogador
	public List<Media> listarMedia(Connection con, List<Media> listMedia) throws SQLException {
		// Variáveis auxiliares
		List<Partida> listPartida = null;
		Gol gol = null;
		Finalizacao fin = null;
		Falta falta = null;
		PartidaDAO pdao = null;
		// Script SQL
		sql = "SELECT Jog.cd_jogador, JOG.nm_jogador, COUNT(EST.cd_estatistica), SUM(EST.qt_gols), ROUND(AVG(EST.qt_gols), 1), "
				+ "ROUND(AVG(EST.nr_precisao_passe), 1), ROUND(AVG(EST.qt_finalizacao_certa), 0), SUM(EST.qt_finalizacao_certa), "
				+ "ROUND(AVG(EST.qt_finalizacao), 0), SUM(EST.qt_finalizacao), ROUND(AVG(EST.qt_faltas_cometidas), 1), "
				+ "SUM(EST.qt_faltas_cometidas) , ROUND(AVG(EST.nr_posse_bola), 1)  FROM T_FIFA_ESTATISTICA EST JOIN T_FIFA_JOGADOR "
				+ "JOG ON JOG.cd_jogador = EST.cd_jogador GROUP BY JOG.cd_jogador, JOG.nm_jogador ORDER BY  JOG.nm_jogador ASC";

		// Preparando estrutura
		smt = con.prepareStatement(sql);
		// Gerando resultado
		result = smt.executeQuery();
		for(int indice = 0; result.next(); indice++) {
			//Variavel responsavel por chamar o metodo para listar as partidas feitas por um jogador
			pdao = new PartidaDAO();
			//Lista de partidas feitas por um jogador
			listPartida = pdao.listarPersonalizadoJog(con, listMedia.get(indice).getJogador());
			//Preenchendo os dados sobre gols relacionados ao jogador
			gol = new Gol();
			int golContra = listMedia.get(indice).somarGolsContra(listPartida, listMedia.get(indice).getJogador());
			gol.setGolsContra(golContra);
			gol.setGolsPro(result.getInt(4));
			gol.setSaldo();
			gol.setMedia(result.getFloat(5));
			listMedia.get(indice).setGol(gol);
			//Preenchendo a precisão no passe relacionada ao jogador
			listMedia.get(indice).setPrecisaoPasse(result.getFloat(6));
			//Preenchendo os dados das finalizações feitas pelo jogador
			fin = new Finalizacao();
			fin.setMediaFinCerta(result.getFloat(7));
			fin.setTotalFinCerta(result.getInt(8));
			fin.setMediaFin(result.getFloat(9));
			fin.setTotalFin(result.getInt(10));
			fin.setAproveitamento();
			listMedia.get(indice).setFin(fin);
			//Preenchendo os dados sobre faltas feitas pelo jogador
			falta = new Falta();
			falta.setMedia(result.getFloat(11));
			falta.setTotal(result.getInt(12));
			listMedia.get(indice).setFalta(falta);
			//Preenchendo a posse de bola do jogador
			listMedia.get(indice).setPosseBola(result.getFloat(13));
		}
		// Fechando estrutura e resultado
		result.close();
		smt.close();
		return listMedia;
	}

}
