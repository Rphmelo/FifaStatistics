/**
 * 
 */
package beans;

/**
 * @author Raphael de Melo
 *
 */
public class Gol {

	//Atributos
	private float media;
	private int golsPro;
	private int golsContra;
	private int saldo;
	
	//Construtor vazio
	public Gol() {
		super();
	}
	
	//Construtor cheio
	public Gol(float media, int golsPro, int golsContra, int saldo) {
		super();
		this.media = media;
		this.golsPro = golsPro;
		this.golsContra = golsContra;
		this.saldo = saldo;
	}
	
	//Métodos getters
	public float getMedia() {
		return media;
	}
	public int getGolsPro() {
		return golsPro;
	}
	public int getGolsContra() {
		return golsContra;
	}
	public int getSaldo() {
		return saldo;
	}
	
	//Métodos setters
	public void setMedia(float media) {
		this.media = media;
	}
	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}
	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}
	public void setSaldo() {
		this.saldo = this.golsPro - this.golsContra;
	}
	
	
}
