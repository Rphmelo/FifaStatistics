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

import conexao.ConexaoFactory;
import dao.JogadorDAO;
import beans.Jogador;
import bo.JogadorBO;
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
        // TODO Auto-generated constructor stub
    }

    public void consultarJogador(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException, ServletException, IOException {
    	//Chamando o método BO
    	List<Jogador> playerList = JogadorBO.consultar(con, request, response); 
    	int numberList = Integer.parseInt(request.getParameter("numberList"));
    	//Atributos que serão manipulados pela EL na página JSP
    	request.setAttribute("listaOutros", playerList);
    	request.setAttribute("tipoLista", "Jogadores");
    	request.setAttribute("numberList", numberList);
    	request.getRequestDispatcher("consulta.jsp").forward(request, response);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fork = request.getParameter("fork");
		Connection con = null;
		String usuario, senha;
		usuario = "blablabla";
		senha = "blablabla";
		
		if(fork.equals("jogador")){
			try {
				this.consultarJogador(con, request, response);
			} catch (Excecao | SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
