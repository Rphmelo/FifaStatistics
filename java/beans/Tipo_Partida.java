//Pacote
package br.com.melo.beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Melo
 *
 */
public class Tipo_Partida implements Serializable{

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String descricao;
	
	//M�todo construtor vazio
	public Tipo_Partida() {
		super();
	}
	
	//M�todo construtor cheio
	public Tipo_Partida(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	//M�todos getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	//M�todos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
