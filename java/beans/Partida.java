//Pacote
package beans;

//Classes importadas
import java.io.Serializable;
import java.util.Date;

/**
 * @author Raphael de Melo
 *
 */
public class Partida implements Serializable{

	/**
	 * Atributos
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Visitante visitante;
	private Casa casa;
	private Tipo_Partida tipo_partida;
	private Date data;
	
	//Método construtor vazio
	public Partida() {
		super();
	}
	
	//Mpetodo construtor cheio
	public Partida(int codigo, Visitante visitante, Casa casa,
			Tipo_Partida tipo_partida, Date data) {
		super();
		this.codigo = codigo;
		this.visitante = visitante;
		this.casa = casa;
		this.tipo_partida = tipo_partida;
		this.data = data;
	}
	
	//Métodos getters
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCodigo() {
		return codigo;
	}
	public Visitante getVisitante() {
		return visitante;
	}
	public Casa getCasa() {
		return casa;
	}
	public Tipo_Partida getTipo_partida() {
		return tipo_partida;
	}
	public Date getData() {
		return data;
	}
	
	//Métodos setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public void setTipo_partida(Tipo_Partida tipo_partida) {
		this.tipo_partida = tipo_partida;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
