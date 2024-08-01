package variosProblemas;
import java.util.Scanner;
public class Programa004 {

	Scanner dato=new Scanner(System.in);
	private int i=0;
	private double vector[]= new double[10];
	private double vector_inf[]=new double[100];
	private double resultado=0;
	private static int semaforo=0;
	
	public Programa004()
	{
		
	}
	public void daresultado()
	{
		for(i=0;i<vector.length;i++)
		{
		System.out.println("Introduzca el valor: "+i+"/10");
		vector[i]=dato.nextDouble();
		resultado=resultado+vector[i];
		}	
		System.out.println("La suma de los 10 elementos del vector es: "+String.format("%.2f",resultado));
	}
	public void daresultadoNuevo()
	{
		for(i=0;i<vector.length;i++)
		{
			if(semaforo==0)
			{
				System.out.println("Introduzca el valor: "+i+"/10");
				vector[i]=dato.nextDouble();
				resultado=resultado+vector[i];	
			}
			if(vector[i]==0)
			{
				semaforo=1;
			}
		}	
		System.out.println("La suma de los 10 elementos del vector es: "+String.format("%.2f",resultado));
	}
	public void darMinMaxMedia()
	{
		semaforo=0;     //SE REINICIA EL VALOR DEL SEMAFORO
		double contador=0;
		double media=0;
		for(i=0;i<vector_inf.length;i++)
		{
			if(semaforo==0)
			{
				System.out.println("Introduzca el valor: "+i);
				vector_inf[i]=dato.nextDouble();
				resultado=resultado+vector_inf[i];	
				contador=contador+1;
			}
			if(vector_inf[i]==0)
			{
				semaforo=1;
			}
		}
		//CALCULO MEDIA
		media=resultado/contador;
		//CALCULO MAXIMO Y MINIMO
		double puntero_max=0;
		double puntero_min=0;
		for(i=0;i<vector_inf.length;i++)
		{
			if(vector_inf[i]!=0)
			{
				if(i==0)
				{
					puntero_max=vector_inf[i];
					puntero_min=vector_inf[i];
				}
				else
				{
					if(puntero_min>vector_inf[i])
					{
						puntero_min=vector_inf[i];
					}
					if(puntero_max<vector_inf[i])
					{
						puntero_max=vector_inf[i];
					}
				}
			}
			else
			{
				//NO HACE NADA
			}
		}
		System.out.println("La media de los elementos introducidos es: "+String.format("%.2f",media));
		System.out.println("El maximo de los elementos introducidos es: "+puntero_max);
		System.out.println("El minimo de los elementos introducidos es: "+puntero_min);
	}
}
