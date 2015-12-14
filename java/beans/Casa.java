//Pacote
package br.com.melo.beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Melo
 *
 */
public class Casa implements Serializable{

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Estatistica estatistica;
	
	//M�todo construtor vazio
	public Casa() {
		super();
	}
	
	//M�todo construtor cheio
	public Casa(int codigo, Estatistica estatistica) {
		super();
		this.codigo = codigo;
		this.estatistica = estatistica;
	}
	
	//M�todos getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCodigo() {
		return codigo;
	}
	public Estatistica getEstatistica() {
		return estatistica;
	}
	
	//M�todos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setEstatistica(Estatistica estatistica) {
		this.estatistica = estatistica;
	}
	
	

}
