package Dominio;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public class Usuario {
	private String dni,cp, nombre, apellidos,nacionalidad,direccion,municipio,alergias,medicación, id;
	private String sexo,historia,historial,pruebas;
//	private ImageIcon image=new ImageIcon(FramePrincipal.class.getResource("/resources/paciente.png")); 
	
	

	private String fechacimiento;
	
	
	public Usuario(String id,String nombre, String apellidos, String nacionalidad, String direccion, String municipio, String cp,
			String alergias, String medicación,String dni,String edad,  String historia, String sexo,String historial, String pruebas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		this.municipio = municipio;
		this.alergias = alergias;
		this.medicación = medicación;
		this.id = id;
		this.dni = dni;
		this.fechacimiento = edad;
		this.cp = cp;
		this.sexo = sexo;
		this.historia=historia;
		this.historial=historial;
		this.pruebas=pruebas;
		
	}
	


	public Usuario(String id,String nombre, String apellidos, String nacionalidad, String direccion, String municipio, String cp,
			String dni,String edad, String sexo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.direccion = direccion;
		this.municipio = municipio;
		this.id = id;
		this.dni = dni;
		this.fechacimiento = edad;
		this.cp = cp;
		this.sexo = sexo;
		
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEdad() {
		return fechacimiento;
	}
	public void setEdad(String date) {
		this.fechacimiento = date;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getMedicación() {
		return medicación;
	}

	public void setMedicación(String medicación) {
		this.medicación = medicación;
	}
	
	
	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

	public String getPruebas() {
		return pruebas;
	}

	public void setPruebas(String pruebas) {
		this.pruebas = pruebas;
	}
}
