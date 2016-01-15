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
import beans.Tipo_Partida;

/**
 * @author Raphael de Melo
 *
 */
public class Tipo_PartidaDAO {
	// Variaveis auxiliares
	PreparedStatement smt = null;
	ResultSet result = null;
	String sql = null;

	//Método que lista os tipos de partida
	public List<Tipo_Partida> listar(Connection con) throws SQLException {
		// Variaveis auxiliares
		List<Tipo_Partida> matchTypeList = new ArrayList<Tipo_Partida>();
		Tipo_Partida tipo_Partida = null;
		// Script sql
		sql = "SELECT cd_tipo_partida, ds_tipo_partida FROM "
				+ "T_FIFA_TIPO_PARTIDA Order by ds_tipo_partida Asc";
		// Preparando estrutura
		smt = con.prepareStatement(sql);
		// Gerando resultado
		result = smt.executeQuery();
		while (result.next()) {
			tipo_Partida = new Tipo_Partida();
			tipo_Partida.setCodigo(result.getInt("cd_tipo_partida"));
			tipo_Partida.setNome(result.getString("ds_tipo_partida"));
			matchTypeList.add(tipo_Partida);
		}
		// Fechando estrutura e resultado
		result.close();
		smt.close();
		return matchTypeList;
	}
}