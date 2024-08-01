package clasesRepaso;

public class jefesEmpresa extends empleadosEmpresa{

	private String departamento="";
	private int antiguedadEmpresa=0;
	
	public jefesEmpresa(String nombre)
	{

	}
	public void setDepartamento(String departamento)
	{
		this.departamento=departamento;
	}
	public String getDepartamento()
	{
		return this.departamento;
	}
	public void setAntiguedadEmpresa(int antiguedadEmpresa)
	{
		this.antiguedadEmpresa=antiguedadEmpresa;
	}
	public int getAntiguedadEmpresa()
	{
		return this.antiguedadEmpresa;
	}
	
}
