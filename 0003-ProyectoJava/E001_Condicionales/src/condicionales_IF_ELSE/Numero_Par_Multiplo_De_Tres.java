// EJERCICIO 5
// Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo: Es par y múltiplo de 3
// Es impar y múltiplo de 3
// No es múltiplo de 3 pero es par No es ni par ni múltiplo de 3

package condicionales_IF_ELSE;
import java.util.Scanner;

public class Numero_Par_Multiplo_De_Tres {

	public static void main(String[] args) {
		Scanner resultado= new Scanner(System.in);
		
		//Declaracion de variables
		int numero=0;
		
		//Proceso de ejecucion
		System.out.println("Introduzca un número, para ver si es par y múltiplo de 3: ");
		numero= resultado.nextInt();
		
		//Que sea par implica que será divisible entre 2 con resto 0
		//Que sea múltiplo de 3 implica, además, que será divisible entre 3 con resto 0
		if(numero%2==0 && numero%3==0)
		{
			System.out.println("El número " + numero +" es par y múltiplo de 3");
		}
		if(numero%2!=0 && numero%3==0)
		{
			System.out.println("El número " + numero +" es impar y múltiplo de 3");
		}
		if(numero%2==0 && numero%3!=0)
		{
			System.out.println("El número " + numero +" es par pero NO múltiplo de 3");
		}
		if(numero%2!=0 && numero%3!=0)
		{
			System.out.println("El número " + numero +" es impar pero NO múltiplo de 3");
		}
	}

}
