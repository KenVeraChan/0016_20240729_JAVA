package variosProblemas;

public class Programa007 {

	private int fila=0;
	private int columna=0;
	
	public Programa007() 
	{
		
	}
	public void setFilaColumna(int fila,int columna)
	{
		this.fila=fila;
		this.columna=columna;
		asteriscos(this.fila,this.columna);
	}
	public void asteriscos(int fila,int columna)
	{
		System.out.println("Matriz resultante de ASTERISCOS");
		System.out.println("");
		for(int i=0;i<fila;i++)
		{
			for(int j=0;j<columna;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
