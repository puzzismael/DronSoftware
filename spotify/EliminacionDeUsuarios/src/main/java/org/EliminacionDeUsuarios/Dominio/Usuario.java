package org.EliminacionDeUsuarios.Dominio;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class Usuario {
	private String usuario, contraseña,dni, nombre, apellidos,direccion, id,fechanacimiento, sexo;
	private long tarjetaCredito;
	private ArrayList<Album> albumes;
	private ArrayList<Cancion> cancion;
	
	public Usuario(String usuario, String contraseña, String id,String nombre, String apellidos, String direccion, String dni, String fechanacimiento,
			 String sexo, long tarjetaCredito,ArrayList<Album> albumes, ArrayList<Cancion> cancion ) {
		
		super();
		this.usuario=usuario;
		this.contraseña=contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.id = id;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
		this.sexo = sexo;
		this.albumes=albumes;
		this.cancion=cancion;
		this.tarjetaCredito=tarjetaCredito;
	}
	
	public Usuario(String usuario, String contraseña, String nombre, String apellidos){
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
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
	
	
	
}
