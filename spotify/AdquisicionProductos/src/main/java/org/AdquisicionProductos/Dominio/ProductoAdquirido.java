package org.AdquisicionProductos.Dominio;

import org.AdquisicionProductos.Persistencia.GestorAdquisicionProductos;
import org.IntroducirAlbum.Persistencia.GestorAlbum;

public class ProductoAdquirido {
	double descuento=0;
	double precio=0;
	public static void main(String[]args) {
		ProductoAdquirido pa=new ProductoAdquirido();
		
	}
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
	
	public String getComprador() {
		return Comprador;
	}
	public void insertarBD(String id,String producto,String comprador)
	{   
		GestorAdquisicionProductos GestorProd =new GestorAdquisicionProductos();
		GestorProd.Insertar(id,producto,comprador);
	}
	public void InsertarAdquisicion(int id,int edad,String producto,String comprador,double precio)
	{   
		if(edad<=11||id<=0||precio<=0){
			descuento=-1;
		}else if(((edad>=12)&&(edad<=18))&&(id<=100)){
			descuento=0.2;
		}else if(((edad>=19)&&(edad<=39))&&(id<=100)){
			descuento=0.3;
		}else if(((edad>=40))&&(id<=100)){
			descuento=0.4;
		}else if(((edad>=12)&&(edad<=18))&&((id<=200)&&(id>=101))){
			descuento=0.5;
		}else if(((edad>=19)&&(edad<=39))&&((id<=200)&&(id>=101))){
			descuento=0.6;
		}else if(((edad>=40))&&((id<=200)&&(id>=101))){
			descuento=0.7;
		}else if(((edad>=12)&&(edad<=18))&&(id>=201)){
			descuento=0.8;
		}else if(((edad>=19)&&(edad<=39))&&(id>=201)) {
			descuento=0.9;
		}else if(((edad>=40))&&(id>=201)){
			descuento=1;
		}	
		
		
		if(precio>=101){
			descuento=descuento/2;
		}
		precio=precio*descuento;
		this.precio=precio;
		
		GestorAdquisicionProductos GestorProd =new GestorAdquisicionProductos();
		GestorProd.InsertarAdquisicion(id, edad, producto, comprador,precio,descuento);
	
	}
	
	
	
	public  double getDescuento() {
		return this.descuento;
	}
	public  double getPrecio() {
		return this.precio;
	}
}
