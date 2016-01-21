/**
 * 
 */
package beans;

import java.util.List;

/**
 * @author Raphael de Melo
 *
 */
public class Media {

	// Atributos
	private Jogador jogador;
	private byte posseBola;
	private byte precisaoPasse;
	private Finalizacao fin;
	private Falta falta;
	private Gol gol;
	private int qtVitoria;
	private int qtEmpate;
	private int qtDerrota;
	private double aproveitamento;
	private int qtPartida;

	// Construtor vazio
	public Media() {
		super();
	}

	// Construtor cheio
	public Media(Jogador jogador, byte posseBola, byte precisaoPasse,
			Finalizacao fin, Falta falta, Gol gol, int qtVitoria, int qtEmpate,
			int qtDerrota, double aproveitamento, int qtPartida) {
		super();
		this.jogador = jogador;
		this.posseBola = posseBola;
		this.precisaoPasse = precisaoPasse;
		this.fin = fin;
		this.falta = falta;
		this.gol = gol;
		this.qtVitoria = qtVitoria;
		this.qtEmpate = qtEmpate;
		this.qtDerrota = qtDerrota;
		this.aproveitamento = aproveitamento;
		this.qtPartida = qtPartida;
	}

	// Métodos getters
	public Jogador getJogador() {
		return jogador;
	}

	public byte getPosseBola() {
		return posseBola;
	}

	public byte getPrecisaoPasse() {
		return precisaoPasse;
	}

	public Finalizacao getFin() {
		return fin;
	}

	public Falta getFalta() {
		return falta;
	}

	public Gol getGol() {
		return gol;
	}

	public int getQtVitoria() {
		return qtVitoria;
	}

	public int getQtEmpate() {
		return qtEmpate;
	}

	public int getQtDerrota() {
		return qtDerrota;
	}

	public double getAproveitamento() {
		return aproveitamento;
	}

	public int getQtPartida() {
		return qtPartida;
	}

	// Métodos setters
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public void setPosseBola(byte posseBola) {
		this.posseBola = posseBola;
	}

	public void setPrecisaoPasse(byte precisaoPasse) {
		this.precisaoPasse = precisaoPasse;
	}

	public void setFin(Finalizacao fin) {
		this.fin = fin;
	}

	public void setFalta(Falta falta) {
		this.falta = falta;
	}

	public void setGol(Gol gol) {
		this.gol = gol;
	}

	public void setQtVitoria(int qtVitoria) {
		this.qtVitoria = qtVitoria;
	}

	public void setQtEmpate(int qtEmpate) {
		this.qtEmpate = qtEmpate;
	}

	public void setQtDerrota(int qtDerrota) {
		this.qtDerrota = qtDerrota;
	}

	public void setAproveitamento(double aproveitamento) {
		this.aproveitamento = aproveitamento;
	}

	public void setQtPartida(int qtPartida) {
		this.qtPartida = qtPartida;
	}

	// Método que retorna a quantidade de gols sofridos de cada jogador
	public int somarGolsContra(List<Partida> partida, Jogador jogador) {
		String nmJogador = jogador.getNome();
		int soma = 0;
		for (int indice = 0; indice < partida.size(); indice++) {
			if (!partida.get(indice).getCasa().getEstatistica().getJogador()
					.getNome().equals(nmJogador)) {
				soma = soma + partida.get(indice).getCasa().getEstatistica()
								.getGols();
			}
			if (!partida.get(indice).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nmJogador)) {
				soma = soma + partida.get(indice).getVisitante().getEstatistica()
								.getGols();
			}
		}
		return soma;
	}
}
