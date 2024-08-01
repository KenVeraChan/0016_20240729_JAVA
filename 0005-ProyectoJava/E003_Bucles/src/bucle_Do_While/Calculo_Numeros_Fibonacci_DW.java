// EJERCICIO 2
// Resolver la serie de Fibonacci con do-while

package bucle_Do_While;

import java.util.Scanner;

public class Calculo_Numeros_Fibonacci_DW {

	public static void main(String[] args) {
		int n=0;
		int contador=0;
		int anterior=1;
		int anterior_al_anterior=0;
		int siguiente=0;
		Scanner numeros= new Scanner(System.in);
		System.out.println("Introduzca los numeros que se quieren sacar de la serie: ");
		contador= numeros.nextInt();
		System.out.println(anterior);
		do
		{
			siguiente=anterior_al_anterior+anterior;
			System.out.println(siguiente);
			anterior_al_anterior=anterior;
			anterior=siguiente;
			n=n+1;
		}while(n<contador);

	}

}
