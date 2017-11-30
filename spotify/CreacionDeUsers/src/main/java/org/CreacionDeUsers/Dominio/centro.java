package org.CreacionDeUsers.Dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Stack;

public class centro {
Stack <usuario> usuarios ;
	
	public centro(Stack <usuario> usuarios)
	{
		this.usuarios=usuarios;
	}
	public centro()
	{
		
	}
	public void setPacientes(Stack <usuario> user)
	{
		this.usuarios=user;
	}
	
	public Stack Leer_fichero() throws FileNotFoundException
	{	
		
		
		String nombre;
		String PrApellido;
		String SegApellido;
		String DNI;
		String telefono;
		String domicilio;
		String antecfamiliares;
	    String alergias;
		String vacunas;
		String tratamiento;
		String operaciones;
		String enfCronicas;
		
		
		
		
		this.usuarios=new Stack();

		
		File f=new File("Pacientes.txt");
		Scanner datos=new Scanner(f);
		
		while (datos.hasNext())
		{	
			nombre=datos.next();//para cadena sin blancos 
			PrApellido=datos.next();
			SegApellido=datos.next();
			DNI=datos.next();
			telefono=datos.next();
			domicilio=datos.next();
			antecfamiliares=datos.next();
			alergias=datos.next();
			vacunas=datos.next();
			tratamiento=datos.next();
			operaciones=datos.next();
			enfCronicas=datos.next();
			
			this.usuarios.add(new usuario(nombre,PrApellido,SegApellido,DNI,telefono,domicilio,
					antecfamiliares,alergias,vacunas,tratamiento,operaciones,enfCronicas));
			
		}
		
		datos.close();
		
		return this.usuarios;	
	}
	public void escribirFichero()
	{
		
		FileWriter fichero = null;
		
		try {

			fichero = new FileWriter("Pacientes.txt");

			for(int i=0;i<usuarios.size();i++)
				fichero.write( usuarios.elementAt(i).getNombre()+" "+usuarios.elementAt(i).getPrApellido()+" "
						+usuarios.elementAt(i).getSegApellido()+" "+usuarios.elementAt(i).getDNI()+" "+usuarios.elementAt(i).getTelefono()
						+" "+usuarios.elementAt(i).getDomicilio()+" "+usuarios.elementAt(i).getAntecFamiliares()+" "+usuarios.elementAt(i).getAlergias()+
						" "+usuarios.elementAt(i).getVacunas()+" "+usuarios.elementAt(i).getTratamiento()+" "+usuarios.elementAt(i).getOperaciones()+" "
						+usuarios.elementAt(i).getEnfCronicas()+"\n");
			

			fichero.close();

		} catch (Exception ex) {
			
		}
	
	}
	public int  NumPacientes() throws FileNotFoundException
	{	
		int tam=0;
		File f=new File("Pacientes.txt");
		Scanner datos=new Scanner(f);

		while (datos.hasNext())
		{	
			datos.hasNextLine();
			tam++;
		}
		return tam;
	}
}
