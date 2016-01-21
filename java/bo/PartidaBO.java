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
import beans.Partida;
import dao.PartidaDAO;
import excecao.Excecao;

/**
 * @author Raphael de Melo
 *
 */
public abstract class PartidaBO {

	// Objeto DAO
	public static PartidaDAO partidaDAO = new PartidaDAO();

	// Método que lista as partidas
	public static List<Partida> listar(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException {
		if (con == null) {
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Partida> matchList = partidaDAO.listar(con);
		if (matchList == null) {
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return matchList;
	}

	// Método que lista as partidas entre dois jogadores
	public static List<Partida> listar2(Connection con, Jogador jog1, Jogador jog2,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException {
		if (con == null) {
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Partida> matchList = partidaDAO.listar2(con, jog1, jog2);
		if (matchList == null) {
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return matchList;
	}

	// Método que lista as partidas de um jogador específico
	public static List<Partida> listar3(Connection con, Jogador jog,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException {
		if (con == null) {
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Partida> matchList = partidaDAO.listar3(con, jog);
		if (matchList == null) {
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return matchList;
	}
}
