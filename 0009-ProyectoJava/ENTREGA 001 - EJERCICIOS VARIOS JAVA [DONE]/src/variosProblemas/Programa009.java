package variosProblemas;

public class Programa009 {

	private double ingreso=0;
	private double ahorro=0;
	private double objetivo=0;
	
	public Programa009()
	{
		
	}
	public void setObjetivo(double objetivo)
	{
		this.objetivo=objetivo;
	}
	public double getObjetivo()
	{
		return this.objetivo;
	}
	public void setaHucha(double ahorro,  double ingreso, double objetivo)
	{
		this.ahorro=ahorro;
		this.ingreso=ingreso;
		this.objetivo=objetivo;
		System.out.println("  <Ingreso Realizado>  "+ingreso+"€");
		System.out.println("  <Ahorro Actual>      "+this.ahorro+"€");
		System.out.println("  <Dinero Objetivo>    "+this.objetivo+"€");
	}
	public double ingreso(double ingreso)
	{
		this.ingreso=ingreso;
		this.ahorro=this.ahorro+this.ingreso;
		System.out.println("  <Ingreso Realizado>  "+ingreso+"€");
		System.out.println("  <Ahorro Actual>      "+this.ahorro+"€");
		System.out.println("  <Dinero Objetivo>    "+this.objetivo+"€");
		return this.ahorro;
	}
	
}
