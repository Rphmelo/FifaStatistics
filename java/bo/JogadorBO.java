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
import dao.JogadorDAO;
import excecao.Excecao;

/**
 * @author Melo
 *
 */
public abstract class JogadorBO {

	// Objeto DAO
	public static JogadorDAO jogadorDAO = new JogadorDAO();

	public static List<Jogador> consultar(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException {
		if(con == null){
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Jogador> playerList = jogadorDAO.consultar(con);
		if(playerList == null){
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return playerList;	
	}

}
