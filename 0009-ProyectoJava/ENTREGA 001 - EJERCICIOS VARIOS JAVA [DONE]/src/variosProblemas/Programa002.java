package variosProblemas;

public class Programa002 {

	private double nota1=0;
	private double nota2=0;
	private double suma=0;
	private double producto=0;
	
	public Programa002() 
	{	
		
	}
	public void setCalificaciones(double nota1, double nota2)
	{
		this.nota1=nota1;
		this.nota2=nota2;
	}
	public double getSuma(double nota1, double nota2)
	{
		suma=nota1+nota2;
		return suma;
	}
	public double getProducto(double nota1, double nota2)
	{
		producto=nota1*nota2;
		return producto;
	}
}
