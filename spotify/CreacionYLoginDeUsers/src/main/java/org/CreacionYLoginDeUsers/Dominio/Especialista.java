package Dominio;

public class Especialista {
	private String id, nombre, apellidos, dni, tlf, movil, email,direccion, localidad, provincia, Especialidad,  titulacion, entra, sale, clinica, dirClinica, tlfClinica, colegiado, expe;
	
	public Especialista(String id, String nombre, String apellidos, String dni, String tlf, String movil, String email,
			String direccion, String localidad, String provincia, String especialidad, String titulacion, String entra,
			String sale, String clinica, String dirClinica, String tlfClinica, String colegiado, String expe) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tlf = tlf;
		this.movil = movil;
		this.email = email;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		Especialidad = especialidad;
		this.titulacion = titulacion;
		this.entra = entra;
		this.sale = sale;
		this.clinica = clinica;
		this.dirClinica = dirClinica;
		this.tlfClinica = tlfClinica;
		this.colegiado = colegiado;
		this.expe = expe;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getEntra() {
		return entra;
	}

	public void setEntra(String entra) {
		this.entra = entra;
	}

	public String getSale() {
		return sale;
	}

	public void setSale(String sale) {
		this.sale = sale;
	}

	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

	public String getDirClinica() {
		return dirClinica;
	}

	public void setDirClinica(String dirClinica) {
		this.dirClinica = dirClinica;
	}

	public String getTlfClinica() {
		return tlfClinica;
	}

	public void setTlfClinica(String tlfClinica) {
		this.tlfClinica = tlfClinica;
	}

	public String getColegiado() {
		return colegiado;
	}

	public void setColegiado(String colegiado) {
		this.colegiado = colegiado;
	}

	public String getExpe() {
		return expe;
	}

	public void setExpe(String expe) {
		this.expe = expe;
	}
	
	
	
}
