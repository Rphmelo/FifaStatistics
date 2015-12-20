//Pacote
package beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Melo
 *
 */
public class Time implements Serializable {

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private Liga liga;
	
	//M�todo construtor vazio
	public Time() {
		super();
	}

	//M�todo construtor cheio
	public Time(int codigo, String nome, Liga liga) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.liga = liga;
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
	public Liga getLiga() {
		return liga;
	}
	
	//M�todos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	
	
	

}
