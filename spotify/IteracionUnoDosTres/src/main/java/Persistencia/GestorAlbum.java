package Persistencia;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Stack;

import javax.swing.JOptionPane;

import Dominio.Album;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GestorAlbum {
	PreparedStatement ps;
	ResultSet rs;
	public static void main(String[]args)
	{
		GestorAlbum gu=new GestorAlbum();
		
	}
	
	public void Insertar(String id,String nombre,String tipo,String PrecioCancion,String PrecioAlbum,String artista,String estreno,String ranking,
			String pais,String NVentas)
	{
	Connection con =null;
	GestorBD c=new GestorBD();
	try {
		
		con =c.getConection();
		ps =(PreparedStatement) con.prepareStatement("INSERT INTO album (id,nombre,tipo,precioCancion,precioAlbum,artista,estreno,ranking,pais,NVentas)VALUES(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,id);
		ps.setString(2,nombre);
		ps.setString(3, tipo);
		ps.setString(4, PrecioCancion);
		ps.setString(5, PrecioAlbum);
		ps.setString(6,artista);
		ps.setString(7,estreno);
		ps.setString(8,ranking);
		ps.setString(9,pais);
		ps.setString(10,NVentas);
		int res =ps.executeUpdate();
		
		
	}catch(Exception exc){
		System.err.println(exc);
		
	}
}
	public void eliminar(String id)
	{
		Connection con =null;
		GestorBD c=new GestorBD();
		try {
			con =c.getConection();
			ps =(PreparedStatement) con.prepareStatement("DELETE FROM album where id=?");
		
			ps.setString(1,id);
			
			int res =ps.executeUpdate();
			
			
			
		}catch(Exception exc){
			System.err.println(exc);
			
		}
		
		
	}
	public Album [] obtenerLista()
	{   Stack <String> pila=new Stack();
		Connection con =null;
		GestorBD c=new GestorBD();
		Album [] albumes = null;
		try {
			con =c.getConection();
			ps =(PreparedStatement) con.prepareStatement("SELECT * from album ");
			rs=ps.executeQuery();
			rs.last();
			int numRows = rs.getRow(); 
			rs.beforeFirst();
			int cont=0;
			Album album;
			albumes =new Album[numRows];
			System.out.println(numRows);
			
			
				
			ps =(PreparedStatement) con.prepareStatement("SELECT * from album ");
			rs=ps.executeQuery();
			
			
		    while(cont<numRows) {
			if(rs.next())
			{	album=new Album(rs.getString("id"),rs.getString("nombre"),rs.getString("tipo"),
				rs.getString("precioCancion"),rs.getString("precioAlbum"),rs.getString("artista"),
				rs.getString("estreno"),rs.getString("ranking"),rs.getString("pais"),rs.getString("NVentas"));
				albumes[cont]=album;
				cont++;
				
			}
			else {
				JOptionPane.showMessageDialog(null,"No existe una persona con la clave");
			}
		}
	
			
			
			
	}catch(Exception ex){
		System.err.println(ex);
		
	}
		
		return albumes;
	}
	
	public void modificarRegistro(String id,String nombre,String tipo,String PrecioCancion,String PrecioAlbum,String artista,String estreno,String ranking,
			String pais,String NVentas) {
		Connection con =null;
		GestorBD c=new GestorBD();
		try {
			con =c.getConection();
			ps =(PreparedStatement) con.prepareStatement("UPDATE album SET nombre=?,tipo=?,precioCancion=?,precioAlbum=?,artista=?,estreno=?,ranking=?,pais=?,NVentas=? where id=?");
		
			ps.setString(1,nombre);
			ps.setString(2, tipo);
			ps.setString(3, PrecioCancion);
			ps.setString(4, PrecioAlbum);
			ps.setString(5,artista);
			ps.setString(6,estreno);
			ps.setString(7,ranking);
			ps.setString(8,pais);
			ps.setString(9,NVentas);
			 ps.setString(10, id);
			
			int res =ps.executeUpdate();
			
			
			if(res >0)
				
			{	
				JOptionPane.showMessageDialog(null,"Persona modificada");
			} else {
				
				JOptionPane.showMessageDialog(null,"Error al modificar persona ");
			}
		}catch(Exception exc){
			System.err.println(exc);
			
		}
		
	}

	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}
	}


