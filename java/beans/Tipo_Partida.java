//Pacote
package beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Raphael de Melo
 *
 */
public class Tipo_Partida implements Serializable{

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	
	//M�todo construtor vazio
	public Tipo_Partida() {
		super();
	}
	
	//M�todo construtor cheio
	public Tipo_Partida(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	//M�todos getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	
	//M�todos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
