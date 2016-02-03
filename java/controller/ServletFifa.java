package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Jogador;
import beans.Liga;
import beans.Media;
import beans.Partida;
import beans.Time;
import beans.Tipo_Partida;
import bo.JogadorBO;
import bo.LigaBO;
import bo.MediaBO;
import bo.PartidaBO;
import bo.TimeBO;
import bo.Tipo_PartidaBO;
import conexao.ConexaoFactory;
import excecao.Excecao;

/**
 * Servlet implementation class ServletFifa
 */
@WebServlet("/ServletFifa")
public class ServletFifa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletFifa() {
		super();
	}

	// Método que envia lista de jogadores para a pagina JSP
	public void listarJogador(Connection con, String fork,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException, ServletException, IOException {
		// Chamando o método BO
		List<Jogador> playerList = JogadorBO.listar(con, request, response);
		int numberList = Integer.parseInt(request.getParameter("numberList"));
		// Atributos que serão manipulados pela EL na página JSP
		request.setAttribute("listaOutros", playerList);
		request.setAttribute("tipoLista", "Jogadores");
		request.setAttribute("numberList", numberList);
	}

	// Método que envia lista de times para a pagina JSP
	public void listarTime(Connection con, String fork,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException, ServletException, IOException {
		// Chamando o método BO
		List<Time> teamList = TimeBO.listar(con, request, response);
		int numberList = Integer.parseInt(request.getParameter("numberList"));
		// Atributos que serão manipulados pela EL na página JSP
		request.setAttribute("listaTime", teamList);
		request.setAttribute("tipoLista", "Times");
		request.setAttribute("numberList", numberList);
	}

	// Método que envia lista de ligas para a pagina JSP
	public void listarLiga(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException,
			ServletException, IOException {
		// Chamando o método BO
		List<Liga> leagueList = LigaBO.listar(con, request, response);
		int numberList = Integer.parseInt(request.getParameter("numberList"));
		// Atributos que serão manipulados pela EL na página JSP
		request.setAttribute("listaOutros", leagueList);
		request.setAttribute("tipoLista", "Ligas");
		request.setAttribute("numberList", numberList);
		request.getRequestDispatcher("consulta.jsp").forward(request, response);
	}

	// Método que envia lista de tipos de partida para a pagina JSP
	public void listarTpPartida(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException,
			ServletException, IOException {
		// Chamando o método BO
		List<Tipo_Partida> matchTypeList = Tipo_PartidaBO.listar(con, request,
				response);
		int numberList = Integer.parseInt(request.getParameter("numberList"));
		// Atributos que serão manipulados pela EL na página JSP
		request.setAttribute("listaOutros", matchTypeList);
		request.setAttribute("tipoLista", "Tipo de partida");
		request.setAttribute("numberList", numberList);
		request.getRequestDispatcher("consulta.jsp").forward(request, response);
	}

	// Método que envia lista de partidas para a pagina JSP
	public void listarPartida(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException,
			ServletException, IOException {
		// Chamando o método BO
		List<Partida> matchList = PartidaBO.listarTudo(con, request, response);
		// Atributos que serão manipulados pela EL na página JSP
		int numberList = Integer.parseInt(request.getParameter("numberList"));
		request.setAttribute("listaPartida", matchList);
		request.setAttribute("tipoLista", "Partidas");
		request.setAttribute("numberList", numberList);
		request.getRequestDispatcher("consulta.jsp").forward(request, response);
	}

	// Método que lista as médias de cada jogador
	public void listarMedia(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException,
			ServletException, IOException {
		List<Media> listaResultado = MediaBO.listarResultado(con, request, response);
		List<Media> listaMedia = MediaBO.listarMedia(con, listaResultado, request, response);
		request.setAttribute("listaMedia", listaMedia);
		request.getRequestDispatcher("desempenho.jsp").forward(request, response);
	}

	// Método que lista a média personalizada dos jogadores
	public void listarMediaPersonalizada(Connection con, HttpServletRequest request,
			HttpServletResponse response) throws Excecao, SQLException,
			ServletException, IOException {
		//variavel auxiliar
		Media media = new Media();
		//Preenchendo objetos Jogador
		String nomeJog1 = request.getParameter("nm-jog-2");
		String nomeJog2 = request.getParameter("nm-jog-3");
		Jogador jog1 = new Jogador();
		Jogador jog2 = new Jogador();
		jog1.setNome(nomeJog1);
		jog2.setNome(nomeJog2);
		//Preenchendo lista de partidas
		List<Partida> listaPartida = PartidaBO.listarPersonalizado(con, jog1, jog2, request, response);
		//Preenchendo Lista de Media
		List<Media> listaMedia = media.listarMediaPersonalizada(listaPartida); 
		request.setAttribute("listaMedia", listaMedia);
		request.getRequestDispatcher("desempenho.jsp").forward(request, response);
	
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fork = request.getParameter("fork");
		Connection con = null;
		String usuario, senha;
		usuario = "blablabla";
		senha = "blablabla";
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			if (fork.equals("jogador")) {
				this.listarJogador(con, fork, request, response);
				request.getRequestDispatcher("consulta.jsp").forward(request,
						response);
			} else if (fork.equals("time")) {
				this.listarTime(con, fork, request, response);
				request.getRequestDispatcher("consulta.jsp").forward(request,
						response);
			} else if (fork.equals("liga")) {
				this.listarLiga(con, request, response);
			} else if (fork.equals("tppartida")) {
				this.listarTpPartida(con, request, response);
			} else if (fork.equals("partida")) {
				this.listarPartida(con, request, response);
			} else if (fork.equals("consulta-p")) {
				this.listarJogador(con, fork, request, response);
				this.listarTime(con, fork, request, response);
				request.getRequestDispatcher("consulta_Personalizada.jsp")
						.forward(request, response);
			}else if(fork.equals("media")){
				this.listarMedia(con, request, response);
			}else if(fork.equals("p-jog-2")){
				this.listarMediaPersonalizada(con, request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
