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
 * @author Raphael de Melo
 *
 */
public abstract class JogadorBO {

	// Objeto DAO
	public static JogadorDAO jogadorDAO = new JogadorDAO();

	//Método que lista os jogadores
	public static List<Jogador> listar(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException {
		if(con == null){
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Jogador> playerList = jogadorDAO.listar(con);
		if(playerList.size() == 0){
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return playerList;	
	}

}
