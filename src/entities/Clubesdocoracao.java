package entities;

public class Clubesdocoracao {
	/*
	 * desenvolve um programa em que você vai descrever em ordem de preferência os times futebol brasileiro você admira.
	 * Em seguida, informe o ídolo de cada clube e o estado federativo do club.
	 */
	private String time;
	private String crack;
	private int ordem;
	private String estado;
	public Clubesdocoracao(String time, String crack, String estado) {
		super();
		this.time = time;
		this.crack = crack;
	
		this.estado = estado;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCrack() {
		return crack;
	}
	public void setCrack(String crack) {
		this.crack = crack;
	}
	public int getOrdem() {
		return ordem;
	}
	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String toString() {
		return 
				
				time
				+", "
				+crack
				+", "
				+estado
				+".";
	}
}
