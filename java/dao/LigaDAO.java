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

import beans.Liga;

/**
 * @author Raphael de Melo
 *
 */
public class LigaDAO {

	PreparedStatement smt = null;
	ResultSet result = null;
	String sql = null;

	// Método que retorna uma lista de objetyo Liga
	public List<Liga> listar(Connection con) throws SQLException {
		// Variaveis auxiliares
		List<Liga> leagueList = new ArrayList<Liga>();
		Liga liga = null;
		// Script sql
		sql = "SELECT cd_liga, nm_liga FROM "
				+ "T_FIFA_LIGA Order By nm_liga Asc";
		// Preparando estrutura
		smt = con.prepareStatement(sql);
		// Gerando resultado
		result = smt.executeQuery();
		while (result.next()) {
			liga = new Liga();
			liga.setCodigo(result.getInt("cd_liga"));
			liga.setNome(result.getString("nm_liga"));
			leagueList.add(liga);
		}
		// Fechando estrutura e resultado
		result.close();
		smt.close();
		return leagueList;
	}

}
