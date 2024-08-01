// EJERCICIO 12
// Amplíe el programa anterior, haciendo que 
// el programa muestre la suma de los números anteriores.

package bucle_While;
import java.util.Scanner;
public class P012_Juego_Los_Veinte_Parte_2 {
	public static void main(String[] args) {
		String enterkey = "";   //Se define como enterkey el INTRO
		int numeros=0;
		int total=0;
		int activador=0;
		Scanner letra= new Scanner(System.in);
		System.out.println("LOS 20 - PARTE 2");
		System.out.println("Pulse INTRO para lanzar el dado");
		enterkey=letra.nextLine();		
		while (enterkey.isEmpty()) 
		{
			activador=1;  //Para afirmar que el dado se tiro la primera vez 
			System.out.println("LOS 20 - PARTE 2");
			// El generador de números aleatorios es de tipo DOUBLE, se pone (int) para convertir a tipo entero
			//Si ponía el numero 99 en donde generaba los números aleatorios, generaba números por encima de 100
			numeros = (int) (Math.floor(Math.random()*6+1));
			total=total+numeros;
			System.out.println("Tirada: "+numeros+" - Suma: "+total);
			System.out.println("");
			System.out.println("");
			System.out.println("Pulse intro para lanzar el dado. Pulse otra tecla e INTRO para terminar");
			enterkey=letra.nextLine();
		}
		if(activador==0)
		{
			System.out.println("No se tiro el dado ninguna vez");
		}
		System.out.println("Fin del programa");
		letra.close();
	}
}
