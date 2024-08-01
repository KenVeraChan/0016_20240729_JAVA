// EJERCICIO 18
// Amplíe el programa anterior, haciendo que el programa entregue premios y lleve la cuenta del resultado.
// Inicialmente, el jugador empieza con una moneda.
// En cada tirada, al jugador se le cobra una moneda.
// En cada tirada, el programa muestra tres números al azar del 1 al 6.
// Si los tres números son distintos, el jugador no gana nada (es decir, pierde la moneda que apostó).
// Si salen dos números iguales, el jugador gana dos monedas (es decir, gana en total una moneda).
// Si salen tres números iguales, el jugador gana cinco monedas (es decir, gana en total cuatro monedas).
// El número de monedas puede hacerse negativo.
// Tras cada tirada, el jugador indica si quiere seguir jugando o no.

package bucle_While;
import java.util.Scanner;
public class P018_Apuestas {

	public static void main(String[] args) {
		int numeros=0;
		int activador=0;
		int repeticion=0;  //Para repetir el azar de lanzamientos 3 veces
		int auxiliar_1=0;  //para las comparativas
		int auxiliar_2=0;
		int auxiliar_3=0;
		int monedas=1;
		int parada=0;    //Para diferenciar de 3 iguales del resto de iguales
		Scanner letra= new Scanner(System.in);
		String enterkey = "";   //Se define como enterkey el INTRO
		System.out.println("NUMEROS AL AZAR - PARTE 2");
		System.out.println("Pulse INTRO para jugar");
		System.out.println("Empiezas la partida con una moneda");
		enterkey=letra.nextLine();
		while (enterkey.isEmpty()) 
		{		
			activador=1; //Para señalar que se tiro el dado por primera vez
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
						monedas=monedas+4;
						System.out.println("Enhorabuena!, ha ganado 5 moneda(s)!, ahora tiene "+monedas+" monedas!");						
						System.out.println("");
						parada=1;
					}
					if(auxiliar_1==auxiliar_2 && parada==0)
					{
						System.out.println("");
						monedas=monedas+1;
						System.out.println("Enhorabuena!, ha ganado 2 moneda(s)!, ahora tiene "+monedas+" monedas!");	
						System.out.println("");
					}
					if(auxiliar_1==auxiliar_3 && parada==0)
					{
						System.out.println("");
						monedas=monedas+1;
						System.out.println("Enhorabuena!, ha ganado 2 moneda(s)!, ahora tiene "+monedas+" monedas!");	
						System.out.println("");
					}
					if(auxiliar_2==auxiliar_3 && parada==0)
					{
						System.out.println("");
						monedas=monedas+1;
						System.out.println("Enhorabuena!, ha ganado 2 moneda(s)!, ahora tiene "+monedas+" monedas!");	
						System.out.println("");
					}
					if(auxiliar_1!=auxiliar_3 && auxiliar_2!=auxiliar_3 && auxiliar_1!=auxiliar_2 && parada==0)
					{
						System.out.println("");
						monedas=monedas-1;
						System.out.println("No ha ganado nada!, ahora tiene "+monedas+" monedas!");	
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
