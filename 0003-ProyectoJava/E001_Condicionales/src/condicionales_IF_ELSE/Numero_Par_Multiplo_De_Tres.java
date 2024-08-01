// EJERCICIO 5
// Ver si un n�mero es par y m�ltiplo de 3 y que saque mensajes del tipo: Es par y m�ltiplo de 3
// Es impar y m�ltiplo de 3
// No es m�ltiplo de 3 pero es par No es ni par ni m�ltiplo de 3

package condicionales_IF_ELSE;
import java.util.Scanner;

public class Numero_Par_Multiplo_De_Tres {

	public static void main(String[] args) {
		Scanner resultado= new Scanner(System.in);
		
		//Declaracion de variables
		int numero=0;
		
		//Proceso de ejecucion
		System.out.println("Introduzca un n�mero, para ver si es par y m�ltiplo de 3: ");
		numero= resultado.nextInt();
		
		//Que sea par implica que ser� divisible entre 2 con resto 0
		//Que sea m�ltiplo de 3 implica, adem�s, que ser� divisible entre 3 con resto 0
		if(numero%2==0 && numero%3==0)
		{
			System.out.println("El n�mero " + numero +" es par y m�ltiplo de 3");
		}
		if(numero%2!=0 && numero%3==0)
		{
			System.out.println("El n�mero " + numero +" es impar y m�ltiplo de 3");
		}
		if(numero%2==0 && numero%3!=0)
		{
			System.out.println("El n�mero " + numero +" es par pero NO m�ltiplo de 3");
		}
		if(numero%2!=0 && numero%3!=0)
		{
			System.out.println("El n�mero " + numero +" es impar pero NO m�ltiplo de 3");
		}
	}

}
