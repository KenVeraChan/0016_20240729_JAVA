// Escriba un programa que pida dos n�meros enteros y 
// que escriba si el mayor es m�ltiplo del menor.

package condicionales_propuestos;
import java.util.Scanner;

public class Comparacion_Numeros_Multiplos {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int a=0;   //Numero a
		int b=0;   //Numero b
		System.out.println("COMPARADOR DE MULTIPLOS");
		System.out.println("Introduzca el primer numero:");
		a= numeros.nextInt();
		System.out.println("Introduzca el segundo numero:");
		b= numeros.nextInt();
		if(a<b)
		{
			if(b%a==0)
			{
				System.out.println("El n�mero " +b+" es M�LTIPLO del numero "+a);
			}
			else {
				System.out.println("El n�mero " +b+" es NO M�LTIPLO del numero "+a);
			}
		}
		if(a>b)
		{
			if(a%b==0)
			{
				System.out.println("El n�mero " +a+" es M�LTIPLO del numero "+b);
			}
			else {
				System.out.println("El n�mero " +a+" es NO M�LTIPLO del numero "+b);
			}	
		}
		if(a==b)
		{
			System.out.println("Los numeros son iguales y por naturaleza son m�ltiplos directamente");	
		}
	}

}
