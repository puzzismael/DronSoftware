package org.AdquisicionProductos.Dominio;

import org.AdquisicionProductos.Persistencia.GestorAdquisicionProductos;
import org.IntroducirAlbum.Persistencia.GestorAlbum;

public class ProductoAdquirido {

	String id,Producto,Comprador;
	public ProductoAdquirido() {
		
	}
	public ProductoAdquirido(String id,String Producto,String Comprador)
	{
		this.id=id;
		this.Producto=Producto;
		this.Comprador=Comprador;
	}
	public  ProductoAdquirido[] obtenerListaDeBD()
	{
		GestorAdquisicionProductos gAp =new GestorAdquisicionProductos();
		ProductoAdquirido [] pa=gAp.obtenerLista();
		return pa;
	}
	public String getID()
	{
		return id;
	}
	public String  getPrecio()
	{
		return Producto;
	}
	public String getComprador() {
		return Comprador;
	}
	public void insertarBD(String id,String producto,String comprador)
	{
		GestorAdquisicionProductos GestorProd =new GestorAdquisicionProductos();
		GestorProd.Insertar(id,producto,comprador);
	}
}
