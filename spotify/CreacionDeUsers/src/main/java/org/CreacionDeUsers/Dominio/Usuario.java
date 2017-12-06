package org.CreacionDeUsers.Dominio;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.CreacionDeUsers.Persistencia.GestorUser;




public class Usuario {
	private String  ID,contraseña,nacionalidad,nombre,Genero,edad,municipio,CodigoPostal,correo,estudios,cuentaBancaria;
	//private long tarjetaCredito;
	//private ArrayList<Album> albumes;
	//private ArrayList<Cancion> cancion;
	
	public Usuario(String ID,String contraseña,String nacionalidad ,String nombre ,String Genero, String edad,String  municipio,
			String CodigoPostal, String correo, String estudios,String  cuentaBancaria) {
		
		super();
		this.ID = ID;
		this.contraseña=contraseña;
		this.nacionalidad=nacionalidad;
		this.nombre = nombre;
		this.Genero=Genero;
		this.edad=edad;
		this.municipio=municipio;
		this.CodigoPostal=CodigoPostal;
		this.correo=correo;
		this.estudios=estudios;
		this.cuentaBancaria=cuentaBancaria;
		
		
	}
	
	//public Usuario(String usuario, String contraseña, String nombre, String apellidos){
		//this.usuario = usuario;
		//this.contraseña = contraseña;
		//this.nombre = nombre;
		//this.apellidos = apellidos;
	//}


	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/*public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public long getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(long tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public ArrayList<Album> getAlbumes() {
		return albumes;
	}

	public void setAlbumes(ArrayList<Album> albumes) {
		this.albumes = albumes;
	}

	public ArrayList<Cancion> getCancion() {
		return cancion;
	}

	public void setCancion(ArrayList<Cancion> cancion) {
		this.cancion = cancion;
	}
	*/
	public void insertarBD()
	{
		GestorUser GestorUser =new GestorUser();
		GestorUser.Insertar(ID, contraseña, nacionalidad, nombre, Genero, edad, municipio, CodigoPostal, correo, estudios, cuentaBancaria);
	}
	public  Usuario [] obtenerListaDeBD()
	{
		GestorUser gUser =new GestorUser();
		Usuario [] user=gUser.obtenerLista();
		return user;
	}

	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
}
