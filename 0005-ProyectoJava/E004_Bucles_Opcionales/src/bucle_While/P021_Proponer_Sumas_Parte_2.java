// EJERCICIO 21
// Amplíe el programa anterior, haciendo que el programa pida 
// cuántas operaciones se deben acertar para terminar el programa. 
// Al terminar, el programa indicarácuántos intentos han sido necesarios.

package bucle_While;
import java.util.Scanner;
public class P021_Proponer_Sumas_Parte_2 {
	public static void main(String[] args) {
		int sumando_1=0;
		int sumando_2=0;
		int resultado=0;  //Total de la suma
		int contador=0;   //Cuenta el numero de aciertos acumulados, si supera 5 se termina el programa
		int limite=0;     //Limite es un numero que se iguala a contador al principio para sacar el valor final
		int intentos=1;   //Indica el numero de intentos que han sido necearios para poder llegar a las sumas exigidas
		Scanner letra= new Scanner(System.in);
		String enterkey = "";   //Se define como enterkey el INTRO
		System.out.println("OPERACIONES");
		System.out.println("Pulse INTRO para empezar");
		System.out.println("Indique cuantas sumas son necesarias para terminar el programa");
		contador=letra.nextInt();
		limite=contador;
		enterkey=letra.nextLine();
		while (contador>0) 
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
				contador=contador-1;
				System.out.println("Ha acertado "+limite+ " operaciones en "+intentos+" intentos totales");
			 }
			if(resultado!=sumando_1+sumando_2)
			 {
				System.out.println("La respuesta es INCORRECTA!!!");	
				System.out.println("");
			 }	
			intentos=intentos+1; //Cuenta los intentos necesarios para acertar las sumas exigidas
		}
		System.out.println("Fin del programa");
		letra.close();
	}
}
