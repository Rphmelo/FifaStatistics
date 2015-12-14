//Pacote
package br.com.melo.beans;

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
	private Pais pais;
	
	//Método construtor vazio
	public Time() {
		super();
	}

	//Método construtor cheio
	public Time(int codigo, String nome, Pais pais) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.pais = pais;
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
	public Pais getPais() {
		return pais;
	}
	
	//Métodos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	

}
