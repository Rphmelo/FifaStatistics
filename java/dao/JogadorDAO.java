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

import conexao.ConexaoFactory;
import beans.Jogador;
import excecao.Excecao;

/**
 * @author Raphael de Melo
 *
 */
public class JogadorDAO {
	
	//Variaveis auxiliares
	PreparedStatement smt = null;
	ResultSet result = null;
	String sql = null;
	
	//Método que lista os jogadores
	public List<Jogador> listar(Connection con) throws SQLException{
		//Variavel auxiliar
		List<Jogador> playerList = new ArrayList<Jogador>();
		Jogador jog;
		//Script sql
		sql = "SELECT cd_jogador, nm_jogador FROM T_FIFA_JOGADOR Order by nm_jogador ASC";
		//Preparando estrutura
		smt = con.prepareStatement(sql);
		result = smt.executeQuery();
		while(result.next()){
			jog = new Jogador();
			jog.setCodigo(result.getInt("cd_jogador"));
			jog.setNome(result.getString("nm_jogador"));
			playerList.add(jog);
		}
		return playerList;
	}

}
