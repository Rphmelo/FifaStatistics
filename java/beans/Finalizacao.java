/**
 * 
 */
package beans;

/**
 * @author Raphael de Melo
 *
 */
public class Finalizacao {

	//Atributos
	private int totalFin;
	private int totalFinCerta;
	private float mediaFin;
	private float mediaFinCerta;
	private float aproveitamento;
	
	//Método construtor vazio
	public Finalizacao() {
		super();
	}
	
	//Método construtor cheio
	public Finalizacao(int totalFin, int totalFinCerta, float mediaFin,
			float mediaFinCerta, float aproveitamento) {
		super();
		this.totalFin = totalFin;
		this.totalFinCerta = totalFinCerta;
		this.mediaFin = mediaFin;
		this.mediaFinCerta = mediaFinCerta;
		this.aproveitamento = aproveitamento;
	}
	
	//Métodos getters
	public int getTotalFin() {
		return totalFin;
	}
	public int getTotalFinCerta() {
		return totalFinCerta;
	}
	public float getMediaFin() {
		return mediaFin;
	}
	public float getMediaFinCerta() {
		return mediaFinCerta;
	}
	public float getAproveitamento() {
		return aproveitamento;
	}
	
	//Métodos setters
	public void setTotalFin(int totalFin) {
		this.totalFin = totalFin;
	}
	public void setTotalFinCerta(int totalFinCerta) {
		this.totalFinCerta = totalFinCerta;
	}
	public void setMediaFin(float mediaFin) {
		this.mediaFin = mediaFin;
	}
	public void setMediaFinCerta(float mediaFinCerta) {
		this.mediaFinCerta = mediaFinCerta;
	}
	public void setAproveitamento() {
		this.aproveitamento = (this.mediaFinCerta / this.mediaFin) * 100;
	}
	
	

}
