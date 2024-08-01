package variosProblemas;

public class Programa001 {
	// 1. Programa que pida por teclado la base y la altura de un cuadrado y nos retorne el área por la terminal.
	private double ladoCuadrado=0;
	
	public Programa001() 
	{
		
	}
	public void setPrograma001(double ladoCuadrado)
	{
		this.ladoCuadrado=ladoCuadrado;
		double superficie=this.ladoCuadrado*this.ladoCuadrado;
		System.out.println("El area del cuadrado es: "+String.format("%.2f",superficie)+" unidades cuadradas");
	}
}
