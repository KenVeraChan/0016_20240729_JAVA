// Escriba un programa que pida dos n�meros y que conteste 
// cu�l es el menor y cu�l el mayor o que escriba que son iguales.

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
		System.out.println("El n�mero " +a+" es MENOR que el numero "+b);
		}
		if(a>b)
		{
		System.out.println("El n�mero " +a+" es MAYOR que el numero "+b);	
		}
		if(a==b)
		{
			System.out.println("El n�mero " +a+" es IGUAL que el numero "+b);	
		}
	}
}
