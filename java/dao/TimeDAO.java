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
import beans.Time;

/**
 * @author Raphael de Melo
 *
 */
public class TimeDAO {
	
	//Variáveis auxiliares
	PreparedStatement smt = null;
	ResultSet result = null;
	String sql = "";
	
	//Método que lista os times
	public List<Time> listar(Connection con) throws SQLException{
		//Lista de times e objeto Time e Liga
		List<Time> teamList = new ArrayList<Time>();
		Time time = null;
		Liga liga = null;
		//Script sql
		sql = "SELECT T.nm_time , T.cd_time AS, L.nm_liga AS , L.cd_liga AS " 
				+ "FROM T_FIFA_TIME T JOIN T_FIFA_LIGA L ON L.cd_liga ="
				+ " T.cd_liga ORDER BY T.nm_time ASC";
		//Preparando estrutura
		smt = con.prepareStatement(sql);
		//Gerando resultado
		result = smt.executeQuery();
		while(result.next()){
			time = new Time();
			liga = new Liga();
			liga.setCodigo(result.getInt("L.cd_liga"));
			liga.setNome(result.getString("L.nm_liga"));
			time.setCodigo(result.getInt("T.cd_time"));
			time.setNome(result.getString("T.nm_time"));
			time.setLiga(liga);
			teamList.add(time);
		}
		//Fechando estrutura e resultado
		result.close();
		smt.close();
		return teamList;
	}

}
