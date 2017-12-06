package org.AdquisicionProductos.Persistencia;

import java.sql.ResultSet;
import java.util.Stack;

import javax.swing.JOptionPane;

import org.AdquisicionProductos.Dominio.ProductoAdquirido;
import org.IntroducirAlbum.Persistencia.GestorBD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GestorAdquisicionProductos {
	PreparedStatement ps;
	ResultSet rs;
	public static void main(String[]args) {
		GestorAdquisicionProductos pc=new GestorAdquisicionProductos();
		
		pc.eliminar("s");
	}
	public ProductoAdquirido [] obtenerLista()
	{  
		Connection con =null;
		GestorBD c=new GestorBD();
		ProductoAdquirido [] adquisiciones = null;
		try {
			con =c.getConection();
			ps =(PreparedStatement) con.prepareStatement("SELECT * from adquirir");
			rs=ps.executeQuery();
			rs.last();
			int numRows = rs.getRow(); 
			rs.beforeFirst();
			int cont=0;
			ProductoAdquirido productAdq;
			adquisiciones  =new ProductoAdquirido[numRows];
			System.out.println(numRows);
			
			
				
			ps =(PreparedStatement) con.prepareStatement("SELECT * from adquirir ");
			rs=ps.executeQuery();
			
			
		    while(cont<numRows) {
			if(rs.next())
			{	productAdq=new ProductoAdquirido(rs.getString("id"),rs.getString("Producto"),rs.getString("Comprador"));
				adquisiciones[cont]=productAdq;
				cont++;
				
			}
			else {
				JOptionPane.showMessageDialog(null,"No existe una persona con la clave");
			}
		}
	
			
			
			
	}catch(Exception ex){
		System.err.println(ex);
		
	}
		
		
		return adquisiciones;
	}
	public  void Insertar(String id, String Producto, String comprador) {
		
		Connection con =null;
		GestorBD c=new GestorBD();
		try {
			
			con =c.getConection();
			ps =(PreparedStatement) con.prepareStatement("INSERT INTO adquirir (id,Producto,Comprador)VALUES(?,?,?)");
			ps.setString(1,id);
			ps.setString(2,Producto);
			ps.setString(3, comprador);
			
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
			ps =(PreparedStatement) con.prepareStatement("DELETE FROM adquirir where id=?");
		
			ps.setString(1,id);
			
			int res =ps.executeUpdate();
			
			
			
		}catch(Exception exc){
			System.err.println(exc);
			
		}
		
		
	}
}
