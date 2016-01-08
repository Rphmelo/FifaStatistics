//Pacote
package beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Raphael de Melo
 *
 */
public class Jogador implements Serializable {

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	
	//Método construtor vazio
	public Jogador() {
		super();
	}
	
	//Método construtor cheio
	public Jogador(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	//Métodos getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	
	//Métodos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
