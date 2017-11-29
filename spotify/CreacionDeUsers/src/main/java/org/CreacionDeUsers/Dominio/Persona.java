package Dominio;

public class Persona {
	
	protected String nombre;
	protected String PrApellido;
	protected String SegApellido;
	protected String DNI;
	
	public Persona(String nombre, String PrApellido, String segApellido, String DNI) {
		this.nombre=nombre;
		this.PrApellido=PrApellido;
		this.SegApellido=segApellido;
		this.DNI=DNI;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	public String getPrApellido()
	{
		return this.PrApellido;
	}
	public String getSegApellido()
	{
		return this.SegApellido;
	}
	public String getDNI()
	{
		return this.DNI;
	}
	
	
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setPrApellido(String PrApellido)
	{
		this.PrApellido=PrApellido;
	}
	public void setSegApellido(String SegApellido)
	{
		this.SegApellido=SegApellido;
	}
	public void setDNI(String DNI)
	{
		this.DNI=DNI;
	}
	
	
}
