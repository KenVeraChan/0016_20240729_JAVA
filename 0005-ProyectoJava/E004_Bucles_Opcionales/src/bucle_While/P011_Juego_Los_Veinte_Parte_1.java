// EJERCICIO 11

// En este apartado se pretende escribir un programa que simule 
// un juego similar al juego de cartas «
// Las siete y media
// «. En vez de pedir cartas, los jugadores tiraránunos dados 
// cuantas veces quieran y el valor límite es el 20 (gana el que 
// obtiene la puntuación más alta sin superar el límite).

package bucle_While;
import java.util.Scanner;
public class P011_Juego_Los_Veinte_Parte_1 {
	public static void main(String[] args) {
		int numeros=0;
		int activador=0;
		Scanner letra= new Scanner(System.in);
		String enterkey = "";   //Se define como enterkey el INTRO
		System.out.println("LOS 20 - PARTE 1");
		System.out.println("Pulse INTRO para lanzar el dado");
		enterkey=letra.nextLine();
		while (enterkey.isEmpty()) 
			{		
			activador=1; //Para señalar que se tiro el dado por primera vez
			System.out.println("LOS 20 - PARTE 1");
			// El generador de números aleatorios es de tipo DOUBLE, se pone (int) para convertir a tipo entero
			//Si ponía el numero 99 en donde generaba los números aleatorios, generaba números por encima de 100
			numeros = (int) (Math.floor(Math.random()*6+1));
			System.out.println("Tirada: "+numeros);
			System.out.println("");
			System.out.println("Pulse intro para lanzar el dado. Pulse otra tecla e INTRO para terminar");
			enterkey=letra.nextLine();
			}
		if(activador==0)
		{
			System.out.println("No se lanzo el dado ninguna vez");
		}
		System.out.println("Fin del programa");
		letra.close();
	}
}
