/**
 * 
 */
package bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Tipo_Partida;
import dao.Tipo_PartidaDAO;
import excecao.Excecao;

/**
 * @author Raphael de Melo
 *
 */
public abstract class Tipo_PartidaBO {
	
	// Objeto DAO
	public static Tipo_PartidaDAO tipo_PartidaDAO = new Tipo_PartidaDAO();

	// Método que lista os tipos de partida
	public static List<Tipo_Partida> listar(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException {
		if (con == null) {
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Tipo_Partida> matchTypeList = tipo_PartidaDAO.listar(con);
		if (matchTypeList == null) {
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return matchTypeList;
	}
}