package org.AdquisicionProductos.Dominio;

public class Usuario {
	private String nHistorial;
	private String cip;
	private String tipoDocumentoID;
	private String documentoID;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String genero;
	private String foto;
	
	public Usuario(String nHistorial, String cip, String documentoID, String nombre, String apellidos,
			String fechaNacimiento, String genero, String foto) {
		this.nHistorial = nHistorial;
		this.cip = cip;
		this.documentoID = documentoID;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.foto = foto;
	}

	public Usuario(String nHistorial, String cip, String tipoDoc, String documentoID, String nombre, String apellidos,
			String fechaNacimiento, String genero, String foto) {
		this.nHistorial = nHistorial;
		this.cip = cip;
		this.tipoDocumentoID = tipoDoc;
		this.documentoID = documentoID;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.foto = foto;
	}

	
	public Usuario() {
		
	}

	public String getnHistorial() {
		return nHistorial;
	}

	public void setnHistorial(String nHistorial) {
		this.nHistorial = nHistorial;
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	/**
	 * @return the tipoDocumentoID
	 */
	public String getTipoDocumentoID() {
		return tipoDocumentoID;
	}

	/**
	 * @param tipoDocumentoID the tipoDocumentoID to set
	 */
	public void setTipoDocumentoID(String tipoDocumentoID) {
		this.tipoDocumentoID = tipoDocumentoID;
	}

	public String getDocumentoID() {
		return documentoID;
	}

	public void setDocumentoID(String documentoID) {
		this.documentoID = documentoID;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
}
