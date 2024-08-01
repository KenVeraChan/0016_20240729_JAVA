// EJERCICIO 1
// Escriba un programa que pida dos números enteros. 
// El programa pedirá de nuevo el segundo número mientras 
// no sea mayor que el primero. El programaterminará 
// escribiendo los dos números.

package bucle_While;
import java.util.Scanner;
public class P001_Dos_numeros_Enteros {
	public static void main(String[] args) {
		int numero_1=0;
		int numero_2=0;
		Scanner numeros= new Scanner(System.in);
		System.out.println("NUMERO MAYOR");
		System.out.println("Introduzca un numero: ");
		numero_1= numeros.nextInt();
		while(numero_2<=numero_1)
		{
		System.out.println("Introduzca un segundo numero: ");
		numero_2= numeros.nextInt();			
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
