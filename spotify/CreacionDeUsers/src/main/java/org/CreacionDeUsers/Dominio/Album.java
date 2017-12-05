package org.CreacionDeUsers.Dominio;

import java.util.ArrayList;

public class Album {
	
	private String nombreAlbum, tipoAlbum, artistaAlbum;
	private double precioAlbum;
	private ArrayList<Cancion> canciones;
	
public Album(String nombreAlbum, String tipoAlbum, String artistaAlbum, double precioAlbum, ArrayList<Cancion> canciones ) {
		
		this.nombreAlbum=nombreAlbum;
		this.tipoAlbum=tipoAlbum;
		this.artistaAlbum=artistaAlbum;
		this.precioAlbum=precioAlbum;
		this.canciones=canciones;
	}

public String getNombreAlbum() {
	return nombreAlbum;
}

public void setNombreAlbum(String nombreAlbum) {
	this.nombreAlbum = nombreAlbum;
}

public String getTipoAlbum() {
	return tipoAlbum;
}

public void setTipoAlbum(String tipoAlbum) {
	this.tipoAlbum = tipoAlbum;
}

public String getArtistaAlbum() {
	return artistaAlbum;
}

public void setArtistaAlbum(String artistaAlbum) {
	this.artistaAlbum = artistaAlbum;
}

public double getPrecioAlbum() {
	return precioAlbum;
}

public void setPrecioAlbum(double precioAlbum) {
	this.precioAlbum = precioAlbum;
}

public ArrayList<Cancion> getCanciones() {
	return canciones;
}

public void setCanciones(ArrayList<Cancion> canciones) {
	this.canciones = canciones;
}

}
