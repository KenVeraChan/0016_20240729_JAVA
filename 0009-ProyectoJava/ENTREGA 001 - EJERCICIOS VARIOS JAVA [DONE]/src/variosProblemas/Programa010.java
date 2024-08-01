package variosProblemas;
import java.util.Scanner;
public class Programa010 {

	Scanner personas= new Scanner(System.in);
	private static String delegados[]= new String[3];
	private static int puntos[]= new int[3];
	private int i=0;
	
	public Programa010()
	{
		
	}
	public void introDelegados()
	{
		//REGISTRO DE DELEGADOS
		for(i=0;i<delegados.length;i++)
		{
			if(i==0)
			{
				System.out.println("Introduzca el delegado "+i+" del grupo");
				delegados[i]=personas.nextLine().toLowerCase();	
			}
			if(i==1)
			{
				do {
				System.out.println("Introduzca el delegado "+i+" del grupo");
				delegados[i]=personas.nextLine().toLowerCase();
				}while(delegados[i].equals(delegados[i-1])==true);
			}
			if(i==2)
			{
				do {
				System.out.println("Introduzca el delegado "+i+" del grupo");
				delegados[i]=personas.nextLine().toLowerCase();
				}while(delegados[i].equals(delegados[i-1])==true || delegados[i].equals(delegados[i-2])==true);
			}
		}
	}
	public void introPuntos()
	{
		//REGISTRO DE PUNTOS
		int puntos_puntero;
		int semaforo=0;
		int contador=0;
		System.out.println("");
		do {
			puntos_puntero=0; //reinicia la variable
			semaforo=0;  //Se reinicia la variable
			for(i=0;i<delegados.length;i++)
			{
					System.out.println("Introduzca los puntos del delegado "+delegados[i]+" del grupo:");
					puntos_puntero=personas.nextInt();
					if(puntos_puntero<0)
					{
						semaforo=1;//NO EJECUTA LA SUMA
					}
					if(semaforo==0)
					{
						puntos[i]=puntos[i]+puntos_puntero;	
					}		
			}
			//MOSTRAR POR PANTALLA LOS PUNTOS
			System.out.println("");
			for(i=0;i<delegados.length;i++)
			{
					System.out.println("Puntos para "+delegados[i]+":"+puntos[i]);
			}
			contador=contador+1;
		}while(semaforo!=1);
		//MOSTRAR POR PANTALLA LOS PUNTOS FINALES
		System.out.println("");
		System.out.println("RESULTADOS");
		System.out.println("Se han realidado "+contador+" rondas y los resultados son:");
		for(i=0;i<delegados.length;i++)
		{
				System.out.println("Puntos para "+delegados[i]+":"+puntos[i]);
		}
		System.out.println("");
	}
}
