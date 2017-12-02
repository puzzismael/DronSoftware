package org.CreacionYLoginDeUsers.Dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class Supervisor {
	
	private String usuario, contraseña, nombre, apellidos, dni,direccion, localidad, email, eCivil, provincia;
	private int tlf,movil, ext,cp, colegiado;
	private ArrayList<usuario> users;
	private ArrayList<Consulta> consultas;
	private ArrayList<Especialista> especialistas;
	//private ImageIcon image=new ImageIcon(FramePrincipal.class.getResource("/resources/doctor1.png")); 
	
	
	public Supervisor(String usuario, String contraseña, String nombre, String apellidos, String dni, int colegiado, int tlf
			,int movil, String direccion, int ext, String localidad, String email, int cp, String eCivil, String provincia
			,ArrayList<usuario> users,ArrayList<Consulta> consultas,ArrayList<Especialista> especialistas) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni=dni;
		this.colegiado=colegiado;
		this.tlf=tlf;
		this.movil=movil;
		this.direccion=direccion;
		this.ext=ext;
		this.localidad=localidad;
		this.email=email;
		this.cp=cp;
		this.eCivil=eCivil;
		this.provincia=provincia;
		this.consultas=consultas;
		this.especialistas=especialistas;
		this.users=users;
	}

	public Supervisor(String usuario, String contraseña, String nombre, String apellidos){
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
	}
	 
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String geteCivil() {
		return eCivil;
	}

	public void seteCivil(String eCivil) {
		this.eCivil = eCivil;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public int getExt() {
		return ext;
	}

	public void setExt(int ext) {
		this.ext = ext;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public int getColegiado() {
		return colegiado;
	}

	public void setColegiado(int colegiado) {
		this.colegiado = colegiado;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
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
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getTlf() {
		return tlf;
	}	
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}
	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}
	public ArrayList<Especialista> getEspecialistas() {
		return especialistas;
	}
	public void setEspecialistas(ArrayList<Especialista> especialistas) {
		this.especialistas = especialistas;
	}
	public ArrayList<usuario> getPacientes() {
		return users;
	}
	public void setPacientes(ArrayList<usuario> users) {
		this.users = users;
	}
}
