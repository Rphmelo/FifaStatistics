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
	private float media;

	//Construtor vazio
	public Falta() {
		super();
		}
	
	//Construtor cheio
	public Falta(int total, float media) {
		super();
		this.total = total;
		this.media = media;
	}
	
	//Métodos getters
	public int getTotal() {
		return total;
	}
	public float getMedia() {
		return media;
	}
	
	//Métodos setters
	public void setTotal(int total) {
		this.total = total;
	}
	public void setMedia(float media) {
		this.media = media;
	}

	
}
