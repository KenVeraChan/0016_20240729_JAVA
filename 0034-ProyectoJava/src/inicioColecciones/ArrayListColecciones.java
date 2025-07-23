package inicioColecciones;

import java.util.ArrayList;

public class ArrayListColecciones {

	public static void main(String[] args) {
		//ACCESO A LOS ARRAYLISTS DE COLECCIONES
		ArrayList<empleados> empresa= new ArrayList<empleados>();
		empleados Rasselin= new empleados("Rasselin Wissangel Rousher",20,"Sfer4D_Corporation@outlook.com");
		empleados Vitrea= new empleados("Vitrea Horiz",21,"vitrea_horiz_19@yahoo.es");
		empleados Emiliam= new empleados("Emiliam Bastreriz",20,"emiliambastreriz@gmail.com");
		empleados Verduliz= new empleados("Verduliz Sainz",20,"verdulizsainz@medigraria.org");
		empresa.add(Rasselin);
		empresa.add(Vitrea);
		empresa.add(Verduliz);
		empresa.add(Emiliam);
		int i=1;
		for(empleados empleador:empresa)
		{
			System.out.println("Número "+i+". Nombre: "+empleador.getNombre()+". Edad: "+empleador.getEdad()+" .Correo: "+empleador.getCorreo());
			i++;
		}
		System.out.println("El tamanio del ArrayList es: "+empresa.size());
	}
}

class empleados
{
	private String nombre="";
	private int edad=0;
	private String correo="";
	
	public empleados(String nombre, int edad, String correo)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.correo=correo;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public int getEdad()
	{
		return this.edad;
	}
	public void setCorreo(String correo)
	{
		this.correo=correo;
	}
	public String getCorreo()
	{
		return this.correo;
	}
}