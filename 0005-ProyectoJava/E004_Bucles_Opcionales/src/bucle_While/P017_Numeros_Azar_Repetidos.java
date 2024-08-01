// EJERCICIO 17
// Amplíe el programa anterior, haciendo que el programa 
// indique si hay dos o tres números iguales.

package bucle_While;
import java.util.Scanner;
public class P017_Numeros_Azar_Repetidos {
	public static void main(String[] args) {
		int numeros=0;
		int activador=0;
		int repeticion=0;  //Para repetir el azar de lanzamientos 3 veces
		int auxiliar_1=0;  //para las comparativas
		int auxiliar_2=0;
		int auxiliar_3=0;
		int parada=0;    //Para diferenciar de 3 iguales del resto de iguales
		Scanner letra= new Scanner(System.in);
		String enterkey = "";   //Se define como enterkey el INTRO
		System.out.println("NUMEROS AL AZAR - PARTE 1");
		System.out.println("Pulse INTRO para jugar");
		enterkey=letra.nextLine();
		while (enterkey.isEmpty()) 
		{		
			activador=1; //Para señalar que se tiro el dado por primera vez
			System.out.println("NUMEROS AL AZAR - PARTE 1");
			// El generador de números aleatorios es de tipo DOUBLE, se pone (int) para convertir a tipo entero
			//Si ponía el numero 99 en donde generaba los números aleatorios, generaba números por encima de 100
			System.out.print("Tirada: ");
			while(repeticion<3)
			{
				if(repeticion==0)
				{
					numeros = (int) (Math.floor(Math.random()*6+1));
					auxiliar_1=numeros;
				}
				if(repeticion==1)
				{
					numeros = (int) (Math.floor(Math.random()*6+1));
					auxiliar_2=numeros;
				}
				if(repeticion==2)
				{
					numeros = (int) (Math.floor(Math.random()*6+1));
					auxiliar_3=numeros;
				}	
			repeticion=repeticion+1;		
			}
			System.out.print(" "+auxiliar_1+" "+auxiliar_2+" "+auxiliar_3);
					if(auxiliar_1==auxiliar_2 && auxiliar_1==auxiliar_3)
					{
						System.out.println("");
						System.out.println("Los tres numeros son iguales");
						System.out.println("");
						parada=1;
					}
					if(auxiliar_1==auxiliar_2 && parada==0)
					{
						System.out.println("");
						System.out.println("Hay dos numeros que son iguales");
						System.out.println("");
					}
					if(auxiliar_1==auxiliar_3 && parada==0)
					{
						System.out.println("");
						System.out.println("Hay dos numeros que son iguales");
						System.out.println("");
					}
					if(auxiliar_2==auxiliar_3 && parada==0)
					{
						System.out.println("");
						System.out.println("Hay dos numeros que son iguales");
						System.out.println("");
					}
			repeticion=0; //Para la siguiente sesion de sacar numeros al azar
			parada=0;   //Reinicio de variable
			System.out.println("");
			System.out.println("Pulse intro para volver a jugar. Pulse otra tecla e INTRO para terminar");
			enterkey=letra.nextLine();
		}
		if(activador==0)
		{
			System.out.println("No se decidio sacar numeros al azar del 1 al 6");
		}
		System.out.println("Fin del programa");
		letra.close();
	}
}
