// EJERCICIO 13
// Amplíe el programa anterior creando dos jugadores que tiran sus dados simultáneamente. 
// El programa declarará ganador al jugador que haya obtenido más puntos.

package bucle_While;
import java.util.Scanner;
public class P013_Juego_Los_Veinte_Parte_3 {

	public static void main(String[] args) {
		String enterkey=""; //Se define como enterkey el INTRO
		int numeros_jugador_1=0;
		int numeros_jugador_2=0;
		int activado=0;
		int total_jugador_1=0;
		int total_jugador_2=0;
		Scanner letra= new Scanner(System.in);
		System.out.println("LOS 20 - PARTE 3");
		System.out.println("Pulse INTRO para lanzar el dado");
		enterkey=letra.nextLine();		
		while (enterkey.isEmpty()) 
		{
			activado=1;  //Se pone a valor 1 para afirmar que el dado se tiro al menos una vez
			System.out.println("LOS 20 - PARTE 3");
			// El generador de números aleatorios es de tipo DOUBLE, se pone (int) para convertir a tipo entero
			//Si ponía el numero 99 en donde generaba los números aleatorios, generaba números por encima de 100
			numeros_jugador_1 = (int) (Math.floor(Math.random()*6+1));
			total_jugador_1=total_jugador_1+numeros_jugador_1;
			numeros_jugador_2 = (int) (Math.floor(Math.random()*6+1));
			total_jugador_2=total_jugador_2+numeros_jugador_2;
			System.out.println("Tirada: "+numeros_jugador_1+" - Suma: "+total_jugador_1);
			System.out.println("Tirada: "+numeros_jugador_2+" - Suma: "+total_jugador_2);
			System.out.println("");
			System.out.println("");
			System.out.println("Pulse intro para lanzar el dado. Pulse otra tecla e INTRO para terminar");
			enterkey=letra.nextLine();
		}
		if(activado==0)
		{
		System.out.println("No se ha lanzado ningun dado");
		}
		if(total_jugador_1>total_jugador_2)
		{
			System.out.println("Gana el jugador 1");
		}
		if(total_jugador_1<total_jugador_2)
		{
			System.out.println("Gana el jugador 2");
		}
		if(total_jugador_1==total_jugador_2)
		{
			System.out.println("Ambos jugadores quedan en empate!!!");
		}
		System.out.println("Fin del programa");
		letra.close();
	}
}
