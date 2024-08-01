// EJERCICIO 16
// Escriba un programa que muestre tres números al azar del 1 al 6

package bucle_While;

import java.util.Scanner;

public class P016_Numeros_Al_Azar_1_6 {
	public static void main(String[] args) {
		int numeros=0;
		int activador=0;
		int repeticion=0;  //Para repetir el azar de lanzamientos 3 veces
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
			numeros = (int) (Math.floor(Math.random()*6+1));
			System.out.print(" "+numeros+" ");
			repeticion=repeticion+1;
			}
			repeticion=0; //Para la siguiente sesion de sacar numeros al azar
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
