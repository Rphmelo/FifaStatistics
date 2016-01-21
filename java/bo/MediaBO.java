package bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Media;
import dao.MediaDAO;
import excecao.Excecao;

public abstract class MediaBO {

	// Objeto DAO
	public static MediaDAO mediaDAO = new MediaDAO();

	// Buscando Vitorias, derrotas e empates de cada jogador
	public static List<Media> listarResultado(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException {
		if (con == null) {
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Media> averageList = mediaDAO.listarResultado(con);
		if (averageList == null) {
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return averageList;
	}

	// Método que lista as medias
	public static List<Media> listarMedia(Connection con,
			List<Media> listMedia, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException {
		if (con == null) {
			Excecao.database(request, response);
			throw new Excecao();
		}
		List<Media> averageList = mediaDAO.listarMedia(con, listMedia);
		if (listMedia == null) {
			Excecao.NoData(request, response);
			throw new Excecao();
		}
		return averageList;
	}
}
