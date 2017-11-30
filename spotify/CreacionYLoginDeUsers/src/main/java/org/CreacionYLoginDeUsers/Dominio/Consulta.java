package Dominio;

public class Consulta {
	private Usuario user;
	private String horaCita, motivo,dia;
	
	public Consulta(Usuario user,String dia, String horaCita, String motivo) {
		this.user = user;
		this.horaCita = horaCita;
		this.motivo = motivo;
		this.dia=dia;
	}
	
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Usuario getUsuario() {
		return user;
	}
	public void setPaciente(Usuario user) {
		this.user = user;
	}
	public String getHoraCita() {
		return horaCita;
	}
	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
}
