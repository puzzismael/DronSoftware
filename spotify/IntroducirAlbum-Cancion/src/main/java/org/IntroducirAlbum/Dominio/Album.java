package org.IntroducirAlbum.Dominio;

import java.util.ArrayList;
import java.util.Stack;

import org.IntroducirAlbum.Persistencia.GestorAlbum;

public class Album {
	
	private String ID,nombre ,tipo,PrecioCancion,PrecioAlbum, artista, estreno,ranking,pais,NVentas;

	private double precioAlbum;
	private ArrayList<Cancion> canciones;
	
public Album(String ID,String nombre,String tipo,String PrecioCancion,String PrecioAlbum,String artista,String estreno,String ranking,
		String pais,String NVentas ) {
		
		this.ID=ID;
		this.nombre=nombre;
		this.tipo=tipo;
		this.PrecioCancion=PrecioCancion;
		this.artista=artista;
		this.estreno=estreno;
		this.ranking=ranking;
		this.pais=pais;
		this.NVentas=NVentas;
	}
public String getNombre()
{
	return nombre;
}
public String getProducto()
{
	return tipo;
}
public Album()
{
	
}

/*public String getNombreAlbum() {
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
*/
public  Album [] obtenerListaDeBD()
{
	GestorAlbum gAlbm =new GestorAlbum();
	Album [] albm=gAlbm.obtenerLista();
	return albm;
}
public void insertarBD()
{
	GestorAlbum GestorAlbum =new GestorAlbum();
	GestorAlbum.Insertar(ID,nombre ,tipo,PrecioCancion,PrecioAlbum, artista, estreno,ranking,pais,NVentas);
}
public void EliminarRegistro(String id)
{
	GestorAlbum GestAlb=new GestorAlbum();
	GestAlb.eliminar(id);
}
public String getID() {
	// TODO Auto-generated method stub
	return ID;
}
public String getTipo() {
	// TODO Auto-generated method stub
	return tipo;
}
public String getPrecioCancion() {
	// TODO Auto-generated method stub
	return PrecioCancion;
}
public String getArtista() {
	// TODO Auto-generated method stub
	return artista;
}
public String getEstreno() {
	// TODO Auto-generated method stub
	return estreno;
}

public String getRanking() {
	// TODO Auto-generated method stub
	return ranking;
}
public String getPais() {
	// TODO Auto-generated method stub
	return pais;
}
public String getNVentas() {
	// TODO Auto-generated method stub
	return NVentas;
}
public String getPrecioAlbum() {
	// TODO Auto-generated method stub
	return PrecioAlbum;
}
}

