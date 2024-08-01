// EJERCICIO 14
// Amplíe el programa anterior de manera que cada jugador indique de forma 
// independiente si quiere tirar el dado de nuevo

package bucle_While;
import java.util.Scanner;
public class P014_Juego_Los_Veinte_Parte_4 {
	public static void main(String[] args) {
		String enterkey_jugador_1=""; //Se define como enterkey el INTRO
		String enterkey_jugador_2=""; //Se define como enterkey el INTRO
		int numeros_jugador_1=0;
		int numeros_jugador_2=0;
		int activado=0;    // Para diferenciar entre terminar sin tirar los dados o tirandolos
		int total_jugador_1=0;
		int total_jugador_2=0;
		int parada_p1=0;       // En el caso de que se vaya el jugador 1
		int parada_p2=0;       // En el caso de que se vaya el jugador 2
		Scanner letra= new Scanner(System.in);
		System.out.println("LOS 20 - PARTE 4");
		System.out.println("Pulse INTRO para lanzar el dado");
		System.out.println("Jugador 1:");
		enterkey_jugador_1=letra.nextLine();
		System.out.println("Jugador 2:");
		enterkey_jugador_2=letra.nextLine();
		while (enterkey_jugador_1.isEmpty()==true || enterkey_jugador_2.isEmpty()==true) 
		{
			activado=1;  //Se pone a valor 1 para afirmar que el dado se tiro al menos una vez
			System.out.println("LOS 20 - PARTE 4");
			// El generador de números aleatorios es de tipo DOUBLE, se pone (int) para convertir a tipo entero
			//Si ponía el numero 99 en donde generaba los números aleatorios, generaba números por encima de 100
			if(enterkey_jugador_1.isEmpty()==true && parada_p1==0) 
			{
				numeros_jugador_1 = (int) (Math.floor(Math.random()*6+1));
				total_jugador_1=total_jugador_1+numeros_jugador_1;
				System.out.println("Jugador 1 - Tirada: "+numeros_jugador_1+" - Suma: "+total_jugador_1);
			}
			if(enterkey_jugador_2.isEmpty()==true && parada_p2==0)
			{
				numeros_jugador_2 = (int) (Math.floor(Math.random()*6+1));
				total_jugador_2=total_jugador_2+numeros_jugador_2;
				System.out.println("Jugador 2 - Tirada: "+numeros_jugador_2+" - Suma: "+total_jugador_2);		
			}
			if(enterkey_jugador_1.isEmpty()==false || parada_p1==1) 
			{
				//No se le suma nada al respecto y mantiene su puntuacion anterior
				System.out.println("Jugador 1 - Suma: "+total_jugador_1);
				parada_p1=1;   //El jugador 1 deja la partida
			}
			if(enterkey_jugador_2.isEmpty()==false || parada_p2==1)
			{
				//No se le suma nada al respecto y mantiene su puntuacion anterior
				System.out.println("Jugador_2 - Suma: "+total_jugador_2);	
				parada_p2=1;   //El jugador 2 deja la partida
			}
			System.out.println("");
			System.out.println("Pulse intro para lanzar el dado. Pulse otra tecla e INTRO para terminar");
					if(parada_p1==0 && parada_p2==0)		
					{
						System.out.println("Jugador 1:");	
						enterkey_jugador_1=letra.nextLine();
						System.out.println("Jugador 2:");	
						enterkey_jugador_2=letra.nextLine();
					}
					if(parada_p1==1)
					{	
						System.out.println("Jugador 2:");	
						enterkey_jugador_2=letra.nextLine();
						if(enterkey_jugador_2.isEmpty()==false)
						{
							break;
						}
					}
					if(parada_p2==1)
					{
						System.out.println("Jugador 1:");	
						enterkey_jugador_1=letra.nextLine();
						if(enterkey_jugador_1.isEmpty()==false)
						{
							break;
						}
					}
		}		
		if(total_jugador_1>total_jugador_2)
		{
			System.out.println("Jugador 1 - Suma: "+total_jugador_1);
			System.out.println("Jugador 2 - Suma: "+total_jugador_2);
			System.out.println("Gana el jugador 1");
		}
		if(total_jugador_1<total_jugador_2)
		{
			System.out.println("Jugador 1 - Suma: "+total_jugador_1);
			System.out.println("Jugador 2 - Suma: "+total_jugador_2);
			System.out.println("Gana el jugador 2");
		}
		if(total_jugador_1==total_jugador_2 && activado==1)
		{   //Se pone activado a 1 para que se diferencie de no haber tirado el dado nunca
			System.out.println("Jugador 1 - Suma: "+total_jugador_1);
			System.out.println("Jugador 2 - Suma: "+total_jugador_2);
			System.out.println("Ambos jugadores quedan en empate!!!");
		}
		if(total_jugador_1==total_jugador_2 && activado==0)
		{   //Se pone activado a 1 para que se diferencie de no haber tirado el dado nunca
			System.out.println("No se ha lanzado ningun dado");
			System.out.println("Jugador 1 - Suma: "+total_jugador_1);
			System.out.println("Jugador 2 - Suma: "+total_jugador_2);
		}
		System.out.println("Fin del programa");
		letra.close();
	}
}
