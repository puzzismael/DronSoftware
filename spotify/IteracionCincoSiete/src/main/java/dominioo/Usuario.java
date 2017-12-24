package dominioo;



import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


import persistenciaa.GestorUser;



public class Usuario {
	private String  ID,contraseña,nacionalidad,nombre,Genero,edad,municipio,CodigoPostal,correo,estudios,cuentaBancaria;
	Album album;
	String seguridad;
	String tipoUsuario;
	boolean formatMail;
	boolean existe;
	String ingreso;
	String login;
	int bol;
	boolean valido;
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
		GestorUser gUs =new GestorUser();
		Usuario [] us=gUs.obtenerLista();
		return us;
	}

	public String getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	public String getContraseña() {
		// TODO Auto-generated method stub
		return contraseña;
	}public void EliminarRegistro(String id)
	{
		GestorUser user=new GestorUser();
		user.eliminar(id);
	}public String getCorreo() {
		return this.correo;
	}

	public String getApellidos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCancion() {
		// TODO Auto-generated method stub
		return null;
	}
	public void RegistrarUsuario(int id, String nombre, int edad,String contraseña,String correo){
		GestorUser GestorUser =new GestorUser();
		estaEnBD(id);
		if (nombre.length()<=4||nombre.length()>=201||edad<12||contraseña.length()<=19||contraseña.length()>=201){
	    ingreso="error";
		}
		if(contraseña.length()<=200&&contraseña.length()>=101){
		seguridad ="buena";
		}
		if(contraseña.length()<=100&&contraseña.length()>=20){
			seguridad ="mala";
			}
		if(nombre.length()<=30&&nombre.length()>=5){
		login="normal";
		}
		
		if(nombre.length()<=200&&nombre.length()>=31)
		{
			login="grande";
		}
		if (edad<18)
		{tipoUsuario="joven";
		}
		if(edad>24){tipoUsuario="adulto";
		}
		if(edad>50){tipoUsuario="mayor";
		}
		if((correo.substring(ObtenerIndice(correo))).equals("@hotmail.com")) {
			formatMail=true;
		}else if((correo.substring(ObtenerIndice(correo))).equals("@gmail.com")){
			formatMail=true;
		}else if((correo.substring(ObtenerIndice(correo))).equals("@info.com")) {
			formatMail=true;
		}else {
			formatMail=false;	
		}
			GestorUser.Insertar(id, nombre, edad,contraseña, correo);
	}

	private int ObtenerIndice(String correo) {
		int cont=0;
		int indice=0;
		while(cont <correo.length()) {
			
			if(correo.charAt(cont)=='@') {
				indice=cont;
				cont=correo.length();
			}
			cont++;
		}
		return cont;
	}

	private void estaEnBD(int id) {
		int [] vector= {1,2,3,4};
		int cont=0;
		while(cont <vector.length) {
			
	    if(vector[cont]==id) {
	    	existe=true;
	    }else {
	    	existe=false;
	    }
	    cont++;
		}
		
	}
	
	public void AñadirBoletos(int id,int ultimaCompra,int precio,int bol)
	{   
		GestorUser gu=new GestorUser();
		estaEnBD(id);
	if(id<=-1||ultimaCompra<=-1||precio<=-1||bol<=-1) {
		valido=false;
	}
	else {
		valido=true;
	}
		
	if(ultimaCompra<=3) {
		bol+=2;
	}if(ultimaCompra>=4&&ultimaCompra<=10) {
		bol++;
	}
	if(ultimaCompra>=11) {
		bol--;
	}
	
	
	if(precio>=51) {
		bol++;
	}
	
	if(bol>=11) {
		bol=bol-5;
	}
	if (existe&&valido) {
		gu.insertarBoletos(id,ultimaCompra,precio,bol);
	}
	this.bol=bol;
	
	}
	
public int getBoletos() {
	return this.bol;
}
public boolean getExiste() {
	return this.existe;
}

public boolean getValido() {
	// TODO Auto-generated method stub
	return valido;
}
public static void enviarmensaje(int edad, int cuentabanc) {
	if (edad <0 || cuentabanc <0)
		System.out.printf("Error al enviar mensaje");
	if (edad >58 && cuentabanc < 114)
		System.out.printf("\n Recibiras un pequeña rebaja cuando compres");
	if(edad > 1 && edad < 8 )	
		System.out.printf("\n No cumples la edad reglamentada");
	if(cuentabanc < 4)
		System.out.printf("\n No aceptamos cuentas menores a 4");
}
public static int asignarid(int edad, int cuentabanc) {
	int id=cuentabanc;
	if (edad <=0 || cuentabanc <=0)
		System.out.printf("Error al asignar id");
	if (edad >18 && cuentabanc < 14)
		id=cuentabanc*19;
	if(edad<29)	
		id=edad+cuentabanc;
	if(cuentabanc>14)
		id=cuentabanc-edad;
	return id;
}

}
