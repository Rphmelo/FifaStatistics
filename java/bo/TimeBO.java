/**
 * 
 */
package bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Jogador;
import beans.Time;
import dao.TimeDAO;
import excecao.Excecao;

/**
 * @author Raphael de Melo
 *
 */
public abstract class TimeBO {

	// Objeto DAO
	public static TimeDAO timeDAO = new TimeDAO();

	// Método que lista os times
	public static List<Time> listar(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws SQLException, Excecao {
		if(con == null){
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Time> teamList = timeDAO.listar(con);
		if(teamList.size() == 0){
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return teamList;	
	}

}
