package persistenciaa;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Stack;

import javax.swing.JOptionPane;
import dominioo.*;

import org.IntroducirAlbum.Persistencia.GestorBD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GestorUser {
	PreparedStatement ps;
	ResultSet rs;
	public static void main(String[]args)
	{
		GestorUser gu=new GestorUser();
		gu.obtenerLista();
		
	}
	
	public void Insertar(String ID,String contraseña,String nacionalidad,String nombre,String Genero,String edad,String municipio,String CodigoPostal,
			String correo,String estudios,String cuentaBancaria)
	{
	Connection con =null;
	GestorBD c=new GestorBD();
	try {
		
		con =c.getConection();
		ps =(PreparedStatement) con.prepareStatement("INSERT INTO usuario (ID,contraseña,nacionalidad,nombre,Genero,edad,municipio,CódigoPostal,Correo,estudios,Banc)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,ID );
		ps.setString(2,contraseña);
		ps.setString(3, nacionalidad);
		ps.setString(4, nombre);
		ps.setString(5, Genero);
		ps.setString(6,edad);
		ps.setString(7,municipio);
		ps.setString(8,CodigoPostal);
		ps.setString(9,correo);
		ps.setString(10,estudios);
		ps.setString(11,cuentaBancaria);
		int res =ps.executeUpdate();
		
		
		if(res >0)
			
		{	
			JOptionPane.showMessageDialog(null,"Usuario guardado");
		} else {
			
			JOptionPane.showMessageDialog(null,"Error al guardar Usuario ");
		}
	}catch(Exception exc){
		System.err.println(exc);
		
	}
}

	public Usuario[] obtenerLista() {
		 Stack <String> pila=new Stack();
			Connection con =null;
			GestorBD c=new GestorBD();
			Usuario [] users = null;
			try {
				con =c.getConection();
				ps =(PreparedStatement) con.prepareStatement("SELECT * from usuario ");
				rs=ps.executeQuery();
				rs.last();
				int numRows = rs.getRow(); 
				rs.beforeFirst();
				int cont=0;
				Usuario  user;
				users =new Usuario[numRows];
				System.out.println(numRows);
				
				
				
					
				ps =(PreparedStatement) con.prepareStatement("SELECT * from usuario ");
				rs=ps.executeQuery();
				
				
			    while(cont<numRows) {
				if(rs.next())
				{	user=new Usuario(rs.getString("ID"),rs.getString("contraseña"),rs.getString("nacionalidad"),
					rs.getString("nombre"),rs.getString("Genero"),rs.getString("edad"),
					rs.getString("municipio"),rs.getString("CódigoPostal"),rs.getString("correo"),rs.getString("estudios"),rs.getString("Banc"));
					users[cont]=user;
					cont++;
					
					
					
					
				
				}
				else {
					JOptionPane.showMessageDialog(null,"No existe una persona con la clave");
				}
			}
		
				
				
				
		}catch(Exception ex){
			System.err.println(ex);
			
		}
			
			return users;
		
	}
	public void eliminar(String id)
	{
		Connection con =null;
		GestorBD c=new GestorBD();
		try {
			con =c.getConection();
			ps =(PreparedStatement) con.prepareStatement("DELETE FROM usuario where ID=?");
		
			ps.setString(1,id);
			
			int res =ps.executeUpdate();
			
			
			
		}catch(Exception exc){
			System.err.println(exc);
			
		}
		
		
	}

	public void Insertar(int id, String nombre, int edad, String contraseña, String correo) {
		// TODO Auto-generated method stub
		
	}
}
