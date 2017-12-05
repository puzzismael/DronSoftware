package org.CreacionDeUsers.Persistencia;

import java.sql.Date;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import org.CreacionDeUsers.Dominio.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class GestorUser {
	PreparedStatement ps;
	ResultSet rs;
	public static void main(String[]args)
	{
		GestorUser gu=new GestorUser();
		gu.Insertar("e","jhh", "adad", "rt", "yyy", "edad", "municipio", "CodigoPostal", "correo", "estudios"," cuentaBancaria");
		
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
}
