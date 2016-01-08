/**
 * 
 */
package excecao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @autor Raphael de Melo
 *
 */
public class Excecao extends Exception{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	public Excecao(){
		super();
	}
	
	//Mensagem padrão informando que o problema está sendo tratado
	public static void standardWithSolution(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("MensagemFalha", "Ops, algo deu errado! ");
		request.setAttribute("MensagemSolucao",
				"Estamos trabalhando para resolvê-la o mais rápido possível.");
	}
	//Mensagem padrão para qualquer outro tipo de falha
	public static void standardWithoutSolution(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("MensagemFalha", "Ops, algo deu errado! ");
	}

	//Mensagem de falha com o banco de dados
	public static void database(HttpServletRequest request,
			HttpServletResponse response) {
		request.setAttribute("Falha",
				"Desculpe, há uma falha na conexão com o banco de dados. ");
		Excecao.standardWithSolution(request, response);
		try {
			request.getRequestDispatcher("falhas.jsp").forward(request,
					response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	//Mensagem de falha para pesquisas que retornem null
	public static void NoData(HttpServletRequest request,
			HttpServletResponse response){
		request.setAttribute("Falha", "Não há dados que preencha este tipo de pesquisa.");
		Excecao.standardWithoutSolution(request, response);
		try {
			request.getRequestDispatcher("falhas.jsp").forward(request,
					response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
