package datos;

public class objetoPersonas {
	
	String frase=new String();
	private String nombre="";
	private String apellidos="";
	private int edad=0;
	private String profesion="";
	
	public objetoPersonas()
	{
		//Se pone en vacío porque es un constructor sin mas
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String getApellidos()
	{
		return this.apellidos;
	}
	public void setApellidos(String apellidos)
	{
		this.apellidos=apellidos;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	
	public String getProfesion()
	{
		return this.profesion;
	}
	public void setProfesion(String profesion)
	{
		this.profesion=profesion;
	}
}
