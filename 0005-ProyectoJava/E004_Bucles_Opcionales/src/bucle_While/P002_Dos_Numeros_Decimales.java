// EJERCICIO 2
// Escriba un programa que pida números decimales 
// mientras el usuario escriba número mayores que el primero.

package bucle_While;
import java.util.Scanner;
public class P002_Dos_Numeros_Decimales {

	public static void main(String[] args) {
		double numero_1=0.0;   //Unicamente hay que cambiar el tipo de INT a DOUBLE
		double numero_2=0.0;
		Scanner numeros= new Scanner(System.in);
		System.out.println("NUMEROS MAYORES");
		System.out.println("Introduzca un numero: ");
		numero_1= numeros.nextDouble();
		while(numero_2<=numero_1)
		{
		System.out.println("Introduzca un segundo numero: ");
		numero_2= numeros.nextDouble();			
			if(numero_2==numero_1)
			{
			System.out.println("El numero "+numero_2+ " es igual que el numero "+numero_1+" intentelo de nuevo");
			}
			if(numero_2<numero_1)
			{
			System.out.println("El numero "+numero_2+ " no es mayor que el numero "+numero_1+" intentelo de nuevo");
			}
		}
		System.out.println("Los numeros introducidos son: "+numero_1+" y el "+numero_2);
	     numeros.close();
	}

}
