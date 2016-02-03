/**
 * 
 */
package bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Liga;
import dao.LigaDAO;
import excecao.Excecao;

/**
 * @author Raphael de Melo
 *
 */
public abstract class LigaBO {

	// Objeto DAO
	public static LigaDAO ligaDAO = new LigaDAO();

	//Método que lista as ligas
	public static List<Liga> listar(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException {
		if(con == null){
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Liga> leagueList = ligaDAO.listar(con);
		if(leagueList.size() == 0){
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return leagueList;
	}
}
