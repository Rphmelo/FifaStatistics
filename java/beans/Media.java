/**
 * 
 */
package beans;

import java.util.ArrayList;
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
				soma = soma
						+ partida.get(indice).getCasa().getEstatistica()
								.getGols();
			}
			if (!partida.get(indice).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nmJogador)) {
				soma = soma
						+ partida.get(indice).getVisitante().getEstatistica()
								.getGols();
			}
		}
		return soma;
	}

	/*
	 * Método que preenche os jogadores em uma lista de media de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> preencherJogador(List<Partida> listaPartida, List<Media> listaMedia) {
		Jogador jog1 = new Jogador(), jog2 = new Jogador();
		jog1.setNome(listaPartida.get(0).getCasa().getEstatistica().getJogador().getNome());
		jog2.setNome(listaPartida.get(0).getVisitante().getEstatistica().getJogador().getNome());
		listaMedia.get(0).setJogador(jog1);
		listaMedia.get(1).setJogador(jog2);
		return listaMedia;
	}
	
	/*
	 * Método que retorna a quantidade de partidas de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularQtPartida(List<Partida> listaPartida,
			List<Media> listaMedia) {
		int qtPartida = listaPartida.size();
		for (int i = 0; i < listaMedia.size(); i++) {
			listaMedia.get(i).setQtPartida(qtPartida);
		}
		return listaMedia;
	}

	/*
	 * Método que retorna a quantidade de vitorias de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularVitoria(List<Partida> listaPartida,
			List<Media> listaMedia) {
		Media media1 = new Media();
		Media media2 = new Media();
		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();
		// Variaveis que guardarão a quantidade de vitórias de cada jogador
		int vJog1 = 0, vJog2 = 0;

		// Calculando a quantidade de vitórias para os que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)
					&& listaPartida.get(i).getCasa().getEstatistica()
							.getResultado().equals("V")) {
				vJog1++;
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)
					&& listaPartida.get(i).getCasa().getEstatistica()
							.getResultado().equals("V")) {
				vJog2++;
			}
		}

		// Calculando a quantidade de vitórias para os Visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)
					&& listaPartida.get(i).getVisitante().getEstatistica()
							.getResultado().equals("V")) {
				vJog1++;
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)
					&& listaPartida.get(i).getVisitante().getEstatistica()
							.getResultado().equals("V")) {
				vJog2++;
			}
		}
		// Preenchendo media 1
		Jogador jog1 = new Jogador();
		jog1.setNome(nomeJog1);
		media1.setJogador(jog1);
		media1.setQtVitoria(vJog1);
		// Preenchendo media 2
		Jogador jog2 = new Jogador();
		jog2.setNome(nomeJog2);
		media2.setJogador(jog2);
		media2.setQtVitoria(vJog2);
		// Preenchendo a lista
		listaMedia.add(media1);
		listaMedia.add(media2);
		// Retorna a lista de médias com o campo 'Viória' preenchido
		return listaMedia;
	}

	/*
	 * Método que retorna a quantidade de derrotas de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularDerrota(List<Partida> listaPartida,
			List<Media> listaMedia) {
		Media media1 = new Media();
		Media media2 = new Media();
		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();
		// Variaveis que guardarão a quantidade de derrotas de cada jogador
		int dJog1 = 0, dJog2 = 0;

		// Calculando a quantidade de derrotas para os que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)
					&& listaPartida.get(i).getCasa().getEstatistica()
							.getResultado().equals("D")) {
				dJog1++;
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)
					&& listaPartida.get(i).getCasa().getEstatistica()
							.getResultado().equals("D")) {
				dJog2++;
			}
		}

		// Calculando a quantidade de derrotas para os Visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)
					&& listaPartida.get(i).getVisitante().getEstatistica()
							.getResultado().equals("D")) {
				dJog1++;
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)
					&& listaPartida.get(i).getVisitante().getEstatistica()
							.getResultado().equals("D")) {
				dJog2++;
			}
		}
		// Preenchendo media 1
		Jogador jog1 = new Jogador();
		jog1.setNome(nomeJog1);
		media1.setJogador(jog1);
		media1.setQtDerrota(dJog1);
		// Preenchendo media 2
		Jogador jog2 = new Jogador();
		jog2.setNome(nomeJog2);
		media2.setJogador(jog2);
		media2.setQtDerrota(dJog2);
		// Preenchendo a lista
		listaMedia.add(media1);
		listaMedia.add(media2);
		// Retorna a lista de médias com o campo 'Derrota' preenchido
		return listaMedia;
	}

	/*
	 * Método que retorna a quantidade de derrotas de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularEmpate(List<Partida> listaPartida,
			List<Media> listaMedia) {
		Media media1 = new Media();
		Media media2 = new Media();
		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();
		// Variaveis que guardarão a quantidade de empates de cada jogador
		int eJog1 = 0, eJog2 = 0;

		// Calculando a quantidade de empates para os que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)
					&& listaPartida.get(i).getCasa().getEstatistica()
							.getResultado().equals("E")) {
				eJog1++;
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)
					&& listaPartida.get(i).getCasa().getEstatistica()
							.getResultado().equals("E")) {
				eJog2++;
			}
		}
		// Calculando a quantidade de empates para os Visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)
					&& listaPartida.get(i).getVisitante().getEstatistica()
							.getResultado().equals("E")) {
				eJog1++;
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)
					&& listaPartida.get(i).getVisitante().getEstatistica()
							.getResultado().equals("E")) {
				eJog2++;
			}
		}
		// Preenchendo media 1
		Jogador jog1 = new Jogador();
		jog1.setNome(nomeJog1);
		media1.setJogador(jog1);
		media1.setQtEmpate(eJog1);
		// Preenchendo media 2
		Jogador jog2 = new Jogador();
		jog2.setNome(nomeJog2);
		media2.setJogador(jog2);
		media2.setQtEmpate(eJog2);
		// Preenchendo a lista
		listaMedia.add(media1);
		listaMedia.add(media2);
		// Retorna a lista de médias com o campo 'Empate' preenchido
		return listaMedia;
	}

	/*
	 * Método que retorna o aproveitamento de dois jogadores entre si de acordo
	 * com a pesquisa do usuário
	 */
	public List<Media> calcularAproveitamento(List<Partida> listaPartida,
			List<Media> listaMedia) {
		// Aproveitamento
		float aproveitamento = 0;
		// Desempenho
		int vitoria, derrota, empate, qtPartida = 0;
		for (int i = 0; i < listaMedia.size(); i++) {
			// Preenchendo variaveis auxiliares
			vitoria = listaMedia.get(i).getQtVitoria();
			derrota = listaMedia.get(i).getQtDerrota();
			empate = listaMedia.get(i).getQtEmpate();
			qtPartida = listaMedia.get(i).getQtPartida();
			// calculando aproveitamento
			aproveitamento = (((vitoria * 3) + empate + (derrota * 0)) / (qtPartida * 3)) * 100;
			listaMedia.get(i).setAproveitamento(aproveitamento);
		}
		return listaMedia;
	}

	/*
	 * Método que retorna a media de posse de bola de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularPosseBola(List<Partida> listaPartida,
			List<Media> listaMedia) {
		int posJog1 = 0, posJog2 = 0;
		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();
		// Somando a posse de bola para os que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)) {
				posJog1 += listaPartida.get(i).getCasa().getEstatistica()
						.getPosseDeBola();
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				posJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getPosseDeBola();
			}
		}
		// Somando a posse de bola para os visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)) {
				posJog1 += listaPartida.get(i).getVisitante().getEstatistica()
						.getPosseDeBola();
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				posJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getPosseDeBola();
			}
		}
		int mediaPosse1 = posJog1 / listaPartida.size();
		int mediaPosse2 = posJog2 / listaPartida.size();

		// Preenchendo posse de bola na lista
		listaMedia.get(0).setPosseBola((byte) mediaPosse1);
		listaMedia.get(1).setPosseBola((byte) mediaPosse2);
		// Retorna lista de media com a posse de bola preenchida
		return listaMedia;
	}

	/*
	 * Método que retorna a media de precisao no passe de dois jogadores entre
	 * si de acordo com a pesquisa do usuário
	 */
	public List<Media> calcularPresPasse(List<Partida> listaPartida,
			List<Media> listaMedia) {
		int pasJog1 = 0, pasJog2 = 0;
		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();
		// Somando a precisao no passe para os que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)) {
				pasJog1 += listaPartida.get(i).getCasa().getEstatistica()
						.getPosseDeBola();
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				pasJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getPosseDeBola();
			}
		}
		// Somando a precisao no passe para os visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)) {
				pasJog1 += listaPartida.get(i).getVisitante().getEstatistica()
						.getPosseDeBola();
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				pasJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getPosseDeBola();
			}
		}
		int mediaPasse1 = pasJog1 / listaPartida.size();
		int mediaPasse2 = pasJog2 / listaPartida.size();

		// Preenchendo posse de bola na lista
		listaMedia.get(0).setPrecisaoPasse((byte) mediaPasse1);
		listaMedia.get(1).setPrecisaoPasse((byte) mediaPasse2);
		// Retorna lista de media com a precisão no passe preenchida
		return listaMedia;
	}

	/*
	 * Método que retorna dados relacionados a gol de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularGol(List<Partida> listaPartida,
			List<Media> listaMedia) {
		int gTotalJog1 = 0, gTotalJog2 = 0;

		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();

		// Somando todos os gols feitos pelos jogadores que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)) {
				gTotalJog1 += listaPartida.get(i).getCasa().getEstatistica()
						.getGols();
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				gTotalJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getGols();
			}
		}
		// Somando todos os gols feitos pelos visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)) {
				gTotalJog1 += listaPartida.get(i).getVisitante()
						.getEstatistica().getGols();
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				gTotalJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getGols();
			}
		}
		// Variaveis que guardam valores sobre gol
		int mediaGolJog1 = gTotalJog1 / listaPartida.size();
		int mediaGolJog2 = gTotalJog2 / listaPartida.size();
		int golContraJog1 = this.somarGolsContra(listaPartida, listaMedia
				.get(0).getJogador());
		int golContraJog2 = this.somarGolsContra(listaPartida, listaMedia
				.get(1).getJogador());
		// Preenchendo gol
		Gol golJog1 = new Gol();
		Gol golJog2 = new Gol();
		// Jogador 1
		golJog1.setGolsPro(gTotalJog1);
		golJog1.setMedia(mediaGolJog1);
		golJog1.setGolsContra(golContraJog1);
		golJog1.setSaldo();
		// Jogador 2
		golJog2.setGolsPro(gTotalJog2);
		golJog2.setMedia(mediaGolJog2);
		golJog2.setGolsContra(golContraJog2);
		golJog2.setSaldo();
		// Preenchendo lista
		listaMedia.get(0).setGol(golJog1);
		listaMedia.get(1).setGol(golJog2);
		return listaMedia;
	}

	/*
	 * Método que retorna dados relacionados a gol de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> calcularFin(List<Partida> listaPartida,
			List<Media> listaMedia) {
		int fTotalJog1 = 0, fTotalJog2 = 0, fCertaTotalJog1 = 0, fCertaTotalJog2 = 0;

		// Criando variaveis com o nome dos jogadores
		String nomeJog1 = "", nomeJog2 = "";
		nomeJog1 = listaMedia.get(0).getJogador().getNome();
		nomeJog2 = listaMedia.get(1).getJogador().getNome();

		// Somando todas as finalizações feitas pelos jogadores que jogaram em
		// casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)) {
				fTotalJog1 += listaPartida.get(i).getCasa().getEstatistica()
						.getFinalizacao();
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				fTotalJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getFinalizacao();
			}
		}
		// Somando todas as finalizações feitas pelos visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)) {
				fTotalJog1 += listaPartida.get(i).getVisitante()
						.getEstatistica().getFinalizacao();
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				fTotalJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getFinalizacao();
			}
		}

		// Somando todas as finalizações certas feitas pelos 
		//jogadores que jogaram em casa
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getCasa().getEstatistica().getJogador()
					.getNome().equals(nomeJog1)) {
				fCertaTotalJog1 += listaPartida.get(i).getCasa().getEstatistica()
						.getFinalizacaoCerta();
			} else if (listaPartida.get(i).getCasa().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				fCertaTotalJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getFinalizacaoCerta();
			}
		}
		// Somando todas as finalizações certas feitas pelos visitantes
		for (int i = 0; i < listaPartida.size(); i++) {
			if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog1)) {
				fCertaTotalJog1 += listaPartida.get(i).getVisitante()
						.getEstatistica().getFinalizacaoCerta();
			} else if (listaPartida.get(i).getVisitante().getEstatistica()
					.getJogador().getNome().equals(nomeJog2)) {
				fCertaTotalJog2 += listaPartida.get(i).getCasa().getEstatistica()
						.getFinalizacaoCerta();
			}
		}

		// Variaveis que guardam valores sobre finalizacao
		int mediaFinJog1 = fTotalJog1 / listaPartida.size();
		int mediaFinJog2 = fTotalJog2 / listaPartida.size();
		int mediaFinCertaJog1 = fCertaTotalJog1 / listaPartida.size();
		int mediaFinCertaJog2 = fCertaTotalJog2 / listaPartida.size();
		// Preenchendo Finalizacao
		Finalizacao finJog1 = new Finalizacao();
		Finalizacao finJog2 = new Finalizacao();
		// Jogador 1
		finJog1.setTotalFin(fTotalJog1);
		finJog1.setTotalFinCerta(fCertaTotalJog1);
		finJog1.setMediaFin(mediaFinJog1);
		finJog1.setMediaFinCerta(mediaFinCertaJog1);
		finJog1.setAproveitamento();
		// Jogador 2
		finJog2.setTotalFin(fTotalJog2);
		finJog2.setTotalFinCerta(fCertaTotalJog2);
		finJog2.setMediaFin(mediaFinJog2);
		finJog2.setMediaFinCerta(mediaFinCertaJog2);
		finJog2.setAproveitamento();
		// Preenchendo lista
		listaMedia.get(0).setFin(finJog1);
		listaMedia.get(1).setFin(finJog2);
		return listaMedia;
	}
	
	/*
	 * Método que retorna uma lista de media de dois jogadores entre si de
	 * acordo com a pesquisa do usuário
	 */
	public List<Media> listarMediaPersonalizada(List<Partida> listaPartida) {
		List<Media> listaMedia = new ArrayList<Media>();
		listaMedia = this.preencherJogador(listaPartida, listaMedia);
		listaMedia = this.calcularVitoria(listaPartida, listaMedia);
		listaMedia = this.calcularDerrota(listaPartida, listaMedia);
		listaMedia = this.calcularEmpate(listaPartida, listaMedia);
		listaMedia = this.calcularQtPartida(listaPartida, listaMedia);
		listaMedia = this.calcularAproveitamento(listaPartida, listaMedia);
		listaMedia = this.calcularFin(listaPartida, listaMedia);
		listaMedia = this.calcularGol(listaPartida, listaMedia);
		listaMedia = this.calcularPosseBola(listaPartida, listaMedia);
		listaMedia = this.calcularPresPasse(listaPartida, listaMedia);
		return listaMedia;
	}
}