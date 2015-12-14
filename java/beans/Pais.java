//Pacote
package br.com.melo.beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Melo
 *
 */
public class Pais implements Serializable {

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	
	//Método construtor vazio
	public Pais() {
		super();
	}
	
	//Método construtor cheio
	public Pais(int codigo, String nome) {
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
