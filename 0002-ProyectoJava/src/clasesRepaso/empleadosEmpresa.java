package clasesRepaso;

public class empleadosEmpresa {

	private String nombre="";
	private String apellidos="";
	private int diaNacimiento=0;
	private int mesNacimiento=0;
	private int anioNacimiento=0;
	private int edad=0;
	private String cargo="";
	
	public empleadosEmpresa()
	{
		
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public void setApellidos(String apellidos)
	{
		this.apellidos=apellidos;
	}
	public String getApellidos()
	{
		return this.apellidos;
	}
	public void setDiaNacimiento(int diaNacimiento)
	{
		this.diaNacimiento=diaNacimiento;
	}
	public int getDiaNacimiento()
	{
		return this.diaNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento)
	{
		this.mesNacimiento=mesNacimiento;
	}
	public int getMesNacimiento()
	{
		return this.mesNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento)
	{
		this.anioNacimiento=anioNacimiento;
	}
	public int getAnioNacimiento()
	{
		return this.anioNacimiento;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public int getEdad()
	{
		return this.edad;
	}
	public void setCargo(String cargo)
	{
		this.cargo=cargo;
	}
	public String getCargo()
	{
		return this.cargo;
	}
}
