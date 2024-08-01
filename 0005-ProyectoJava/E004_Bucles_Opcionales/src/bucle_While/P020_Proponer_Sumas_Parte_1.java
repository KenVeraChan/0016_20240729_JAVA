// EJERCICIO 20
// Escriba un programa que proponga sumas de números positivos (dos números 
// entre 1 y 100) al usuario y compruebe la respuesta. El programa continuará 
// hastaque se acierten cinco sumas.

package bucle_While;
import java.util.Scanner;
public class P020_Proponer_Sumas_Parte_1 {
	public static void main(String[] args) {
		int sumando_1=0;
		int sumando_2=0;
		int resultado=0;  //Total de la suma
		int contador=0;   //Cuenta el numero de aciertos acumulados, si supera 5 se termina el programa
		Scanner letra= new Scanner(System.in);
		String enterkey = "";   //Se define como enterkey el INTRO
		System.out.println("OPERACIONES");
		System.out.println("Pulse INTRO para empezar");
		enterkey=letra.nextLine();
		while (enterkey.isEmpty()) 
		{		
			sumando_1 = (int) (Math.floor(Math.random()*100+1));
			sumando_2 = (int) (Math.floor(Math.random()*100+1));
			System.out.println("Escriba el resultado de las siguientes operaciones: ");
			System.out.print("  "+sumando_1+" "+"+"+" "+sumando_2+" = ");
			resultado=letra.nextInt();
			if(resultado==sumando_1+sumando_2)
			 {
				System.out.println("La respuesta es CORRECTA!!!");	
				System.out.println("");
				contador=contador+1;
				if(contador==5)
				{
					break;   //El programa termina tras comprobar que se han realizado bien 5 sumas
				}
			 }
			if(resultado!=sumando_1+sumando_2)
			 {
				System.out.println("La respuesta es INCORRECTA!!!");	
				System.out.println("");
			 }
			letra.nextLine();   //Borrado de Buffer
			System.out.println("Pulse intro para volver a jugar. Pulse otra tecla e INTRO para terminar");
			enterkey=letra.nextLine();			
		}
		System.out.println("Fin del programa");
		letra.close();
	}

}
