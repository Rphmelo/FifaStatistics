/**
 * 
 */
package beans;

/**
 * @author Raphael de  Melo
 *
 */
public class Falta {
	
	//Atributos
	private int total;
	private double media;

	//Construtor vazio
	public Falta() {
		super();
		}
	
	//Construtor cheio
	public Falta(int total, double media) {
		super();
		this.total = total;
		this.media = media;
	}
	
	//Métodos getters
	public int getTotal() {
		return total;
	}
	public double getMedia() {
		return media;
	}
	
	//Métodos setters
	public void setTotal(int total) {
		this.total = total;
	}
	public void setMedia(double media) {
		this.media = media;
	}

	
}
