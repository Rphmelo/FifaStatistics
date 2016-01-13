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
import beans.Jogador;
import beans.Time;
import bo.JogadorBO;
import bo.TimeBO;
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

    //Método que envia lista de jogadores para a pagina JSP
    public void listarJogador(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException, ServletException, IOException {
    	//Chamando o método BO
    	List<Jogador> playerList = JogadorBO.listar(con, request, response); 
    	int numberList = Integer.parseInt(request.getParameter("numberList"));
    	//Atributos que serão manipulados pela EL na página JSP
    	request.setAttribute("listaOutros", playerList);
    	request.setAttribute("tipoLista", "Jogadores");
    	request.setAttribute("numberList", numberList);
    	request.getRequestDispatcher("consulta.jsp").forward(request, response);
    }
    
    //Método que envia lista de times para a pagina JSP
    public void listarTime(Connection con,
			HttpServletRequest request, HttpServletResponse response)
			throws Excecao, SQLException, ServletException, IOException {
    	//Chamando o método BO
    	List<Time> teamList = TimeBO.listar(con, request, response); 
    	int numberList = Integer.parseInt(request.getParameter("numberList"));
    	//Atributos que serão manipulados pela EL na página JSP
    	request.setAttribute("listaTime", teamList);
    	request.setAttribute("tipoLista", "Times");
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
		usuario = "blabla";
		senha = "blabla";
		try {
			con = ConexaoFactory.controlarInstancia()
					.getConexao(usuario, senha);
			if (fork.equals("jogador")) {
				this.listarJogador(con, request, response);
			} else if (fork.equals("time")) {
				this.listarTime(con, request, response);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
