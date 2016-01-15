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

import beans.Casa;
import beans.Estatistica;
import beans.Jogador;
import beans.Liga;
import beans.Partida;
import beans.Time;
import beans.Tipo_Partida;
import beans.Visitante;

/**
 * @author Raphael de Melo
 *
 */
public class PartidaDAO {

	// Variaveis auxiliares
	PreparedStatement smt = null;
	ResultSet result = null;
	String sql = null;

	//Método que lista as partidas
	public List<Partida> listar(Connection con) throws SQLException {
		// Variaveis auxiliares
		List<Partida> matchList = new ArrayList<Partida>();
		Partida partida = null;
		Estatistica estatistica = null;
		Tipo_Partida tipo_Partida = null;
		Casa casa = null;
		Visitante visitante = null;
		Jogador jogador = null;
		Liga liga = null;
		Time time = null;
		// Script sql
		sql = "Select Part.Cd_Partida, Jog.Nm_Jogador, "
				+ "Ti.Nm_Time, Est.Ds_Resultado, L.Nm_Liga, " 
				+ "Est.Qt_Gols , Est.Nr_Posse_Bola, "  
				+ "Est.Qt_Finalizacao, Est.Qt_Finalizacao_Certa, " 
				+ "Est.Qt_Faltas_Cometidas , Est.Nr_Precisao_Passe, " 
				+ "Part.Dt_Partida , Tp.Ds_Tipo_Partida, Jog2.Nm_Jogador, " 
				+ "Ti2.Nm_Time , L2.Nm_Liga , Est2.Qt_Gols, " 
				+ "Est2.Nr_Posse_Bola , Est2.Qt_Finalizacao, "  
				+ "Est2.Qt_Finalizacao_Certa , Est2.Qt_Faltas_Cometidas, "
				+ "Est2.Nr_Precisao_Passe , Est2.Ds_Resultado "
				+ "From T_Fifa_Partida Part Inner Join T_Fifa_Tipo_Partida Tp On Tp.Cd_Tipo_Partida = Part.Cd_Tipo_Partida Inner Join "
				+ "T_Fifa_Casa C On Part.Cd_Casa = C.Cd_Casa Inner Join T_Fifa_Visitante Vis On Part.Cd_Visitante = Vis.Cd_Visitante "
				+ "Inner Join T_Fifa_Estatistica Est On Est.Cd_Estatistica = C.Cd_Estatistica_Cas Inner Join T_Fifa_Estatistica Est On "
				+ "Est.Cd_Estatistica = C.Cd_Estatistica_Cas Inner Join T_Fifa_Jogador Jog On Est.Cd_Jogador = Jog.Cd_Jogador Inner Join "
				+ "T_Fifa_Time Ti On Est.Cd_Time = Ti.Cd_Time Inner Join T_Fifa_Liga L On L.Cd_Liga = Ti.Cd_Liga Inner Join T_Fifa_Estatistica "
				+ "Est2 On Est2.Cd_Estatistica = Vis.Cd_Estatistica_Vis Inner Join T_Fifa_Jogador Jog2 On Est2.Cd_Jogador = Jog2.Cd_Jogador "
				+ "Inner Join T_Fifa_Time Ti2 On Est2.Cd_Time = Ti2.Cd_Time Inner Join T_Fifa_Liga L2 On L2.Cd_Liga = "
				+ "Ti2.Cd_Liga Order By Part.Cd_Partida desc";
		// Preparando estrutura
		smt = con.prepareStatement(sql);
		// Gerando resultado
		result = smt.executeQuery();
		while (result.next()) {
			//Instanciando
			partida = new Partida();
			tipo_Partida = new Tipo_Partida();
			casa = new Casa();
			visitante = new Visitante();
			//preenchendo jogador-1
			jogador = new Jogador();
			jogador.setNome(result.getString(2));
			//Preenchendo liga-1
			liga = new Liga();
			liga.setNome(result.getString(5));
			//Preenchendo time-1
			time = new Time();
			time.setLiga(liga);
			time.setNome(result.getString(3));
			//Preenchendo estatistica-1
			estatistica = new Estatistica();
			estatistica.setJogador(jogador);
			estatistica.setTime(time);
			estatistica.setFaltasCometidas(result.getByte(10));
			estatistica.setFinalizacao(result.getByte(8));
			estatistica.setFinalizacaoCerta(result.getByte(9));
			estatistica.setGols(result.getByte(6));
			estatistica.setPosseDeBola(result.getByte(7));
			estatistica.setPrecisaoPasse(result.getByte(11));
			estatistica.setResultado(result.getString(4).charAt(0));
			//Preenchendo casa
			casa.setEstatistica(estatistica);
			//preenchendo jogador-2
			jogador = new Jogador();
			jogador.setNome(result.getString(14));
			//Preenchendo liga-2
			liga = new Liga();
			liga.setNome(result.getString(16));
			//Preenchendo time-2
			time = new Time();
			time.setLiga(liga);
			time.setNome(result.getString(15));
			//Preenchendo estatistica-2
			estatistica = new Estatistica();
			estatistica.setJogador(jogador);
			estatistica.setTime(time);
			estatistica.setFaltasCometidas(result.getByte(21));
			estatistica.setFinalizacao(result.getByte(19));
			estatistica.setFinalizacaoCerta(result.getByte(20));
			estatistica.setGols(result.getByte(17));
			estatistica.setPosseDeBola(result.getByte(18));
			estatistica.setPrecisaoPasse(result.getByte(22));
			estatistica.setResultado(result.getString(23).charAt(0));
			//Preenchendo visitante
			visitante.setEstatistica(estatistica);
			//Preenchendo Tipo de partida
			tipo_Partida.setNome(result.getString(13));
			//Preenchendo partida
			partida.setCasa(casa);
			partida.setVisitante(visitante);
			partida.setTipo_partida(tipo_Partida);
			partida.setCodigo(result.getInt(1));
			partida.setData(result.getDate(12));
			//Adicionando partida na lista
			matchList.add(partida);
		}
		// Fechando estrutura e resultado
		result.close();
		smt.close();
		return matchList;
	}
}
