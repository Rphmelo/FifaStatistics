/**
 * 
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe para conexão com o Banco de Dados.
 * 
 * @author Raphael de Melo Silva
 *  
 */

public final class ConexaoFactory {
	private static ConexaoFactory conexao = null;

	/**
	 * Método instancia uma conexao.
	 * @param - não recebe parâmetros 
	 * @return ConexaoFactory conexao
	 */
	
	public static ConexaoFactory controlarInstancia() {
		if (conexao == null) {
			conexao = new ConexaoFactory();
		}
		return conexao;
	}

	/**
	 * Método que solicita usuário e senha.
	 * 
	 * @param String usuario
	 * @param String senha
	 * @exception Exception
	 * @return Connection
	 */
	
	public Connection getConexao(String usuario, String senha) throws Exception {

		try {
			String url = "BLABLABLA";

			if (url.indexOf("oracle") > 0) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} 
			return DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}// fim da classe ConexaoFactory