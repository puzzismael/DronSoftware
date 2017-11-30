package org.IntroducirAlbum.Dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class usuario extends Persona{
	
	
	
	private String telefono;
	private String domicilio;
	private String antecfamiliares;
	private String alergias;
	private String vacunas;
	private String tratamiento;
	private String operaciones;
	private String enfCronicas;
	
	public usuario()
	{
		super(null, null, null, null);
	}
	
	public usuario(String nombre, String PrApellido, String SegApellido,String DNI,String telefono,
	String domicilio,String antecfamiliares,String alergias,String vacunas,String tratamiento,
	String operaciones,String enfCronicas)
	{
		super(nombre, PrApellido,  SegApellido,DNI);
		this.telefono=telefono;
		this.domicilio=domicilio;
		this.antecfamiliares=antecfamiliares;
		this.alergias=alergias;
		this.vacunas=vacunas;
		this.tratamiento=tratamiento;
		this.operaciones=operaciones;
		this.enfCronicas=enfCronicas;
	}
	
	
	public String getTelefono()
	{
		return this.telefono;
	}
	public String getDomicilio()
	{
		return this.domicilio;
	}
	public String getAntecFamiliares()
	{
		return this.antecfamiliares;
	}
	public String getAlergias()
	{
		return this.alergias;
	}
	public String getVacunas()
	{
		return this.vacunas;
	}
	public String getTratamiento()
	{
		return this.tratamiento;
	}
	public String getOperaciones()
	{
		return this.operaciones;
	}
	public String getEnfCronicas()
	{
		return this.enfCronicas;
	}
	
	
	public  void setTelefono(String telefono)
	{
		this.telefono=telefono;
	}
	public void setDomicilio(String domicilio)
	{
		this.domicilio=domicilio;
	}
	public void setAntecFamiliares(String antecfamiliares)
	{
		 this.antecfamiliares=antecfamiliares;
	}
	public void setAlergias(String alergias)
	{
		this.alergias=alergias;
	}
	public  void setVacunas(String vacunas)
	{
		this.vacunas=vacunas;
	}
	public void setTratamiento( String tratamiento)
	{
		this.tratamiento=tratamiento;
	}
	public  void setOperaciones(String operaciones)
	{
		this.operaciones=operaciones;
	}
	public void setEnfCronicas(String enfCronicas)
	{
		this.enfCronicas=enfCronicas;
	}
	
	
	 
		
		
	
}

