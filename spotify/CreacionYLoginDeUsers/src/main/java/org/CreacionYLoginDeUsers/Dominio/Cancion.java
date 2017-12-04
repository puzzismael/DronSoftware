package org.CreacionYLoginDeUsers.Dominio;

public class Cancion {
	
	private String nombreCancion, tipoCancion, artista;
	private double precio;
	
	public Cancion(String nombreCancion, String tipoCancion, String artista, double precio) {
		
		this.nombreCancion=nombreCancion;
		this.tipoCancion=tipoCancion;
		this.artista=artista;
		this.precio=precio;
		
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getTipoCancion() {
		return tipoCancion;
	}

	public void setTipoCancion(String tipoCancion) {
		this.tipoCancion = tipoCancion;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
