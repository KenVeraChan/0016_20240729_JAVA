// Escriba un programa que pida dos números y que conteste 
// cuál es el menor y cuál el mayor o que escriba que son iguales.

package condicionales_propuestos;
import java.util.Scanner;

public class Dos_Numeros_Comparacion {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		double a=0.0;   //Numero a
		double b=0.0;   //Numero b
		System.out.println("COMPARADOR DE DOS NUMEROS");
		System.out.println("Introduzca el primer numero:");
		a= numeros.nextDouble();
		System.out.println("Introduzca el segundo numero:");
		b= numeros.nextDouble();
		if(a<b)
		{
		System.out.println("El número " +a+" es MENOR que el numero "+b);
		}
		if(a>b)
		{
		System.out.println("El número " +a+" es MAYOR que el numero "+b);	
		}
		if(a==b)
		{
			System.out.println("El número " +a+" es IGUAL que el numero "+b);	
		}
	}
}
