//Pacote
package beans;

//Classes importadas
import java.io.Serializable;

/**
 * @author Raphael de Melo
 *
 */
public class Estatistica implements Serializable{

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Jogador jogador;
	private Time time;
	private byte gols;
	private byte posseDeBola;
	private byte finalizacao;
	private byte finalizacaoCerta;
	private byte faltasCometidas;
	private byte precisaoPasse;
	private String resultado;
	
	//Método construtor vazio
	public Estatistica() {
		super();
	}
	
	//Método construtor cheio
	public Estatistica(int codigo, Jogador jogador, Time time, byte gols,
			byte posseDeBola, byte finalizacao, byte finalizacaoCerta,
			byte faltasCometidas, byte precisaoPasse, String resultado) {
		super();
		this.codigo = codigo;
		this.jogador = jogador;
		this.time = time;
		this.gols = gols;
		this.posseDeBola = posseDeBola;
		this.finalizacao = finalizacao;
		this.finalizacaoCerta = finalizacaoCerta;
		this.faltasCometidas = faltasCometidas;
		this.precisaoPasse = precisaoPasse;
		this.resultado = resultado;
	}


	//Métodos getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCodigo() {
		return codigo;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public Time getTime() {
		return time;
	}
	public byte getGols() {
		return gols;
	}
	public byte getPosseDeBola() {
		return posseDeBola;
	}
	public byte getFinalizacao() {
		return finalizacao;
	}
	public byte getFinalizacaoCerta() {
		return finalizacaoCerta;
	}
	public byte getFaltasCometidas() {
		return faltasCometidas;
	}
	public byte getPrecisaoPasse() {
		return precisaoPasse;
	}
	public String getResultado() {
		return resultado;
	}
	
	//Métodos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public void setGols(byte gols) {
		this.gols = gols;
	}
	public void setPosseDeBola(byte posseDeBola) {
		this.posseDeBola = posseDeBola;
	}
	public void setFinalizacao(byte finalizacao) {
		this.finalizacao = finalizacao;
	}
	public void setFinalizacaoCerta(byte finalizacaoCerta) {
		this.finalizacaoCerta = finalizacaoCerta;
	}
	public void setFaltasCometidas(byte faltasCometidas) {
		this.faltasCometidas = faltasCometidas;
	}
	public void setPrecisaoPasse(byte precisaoPasse) {
		this.precisaoPasse = precisaoPasse;
	}
	public void setResultado(char res) {
		this.resultado = String.valueOf(res);
	}
	
	
}
