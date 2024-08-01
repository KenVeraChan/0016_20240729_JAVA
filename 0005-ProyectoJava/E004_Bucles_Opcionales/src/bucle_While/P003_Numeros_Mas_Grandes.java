// EJERCICIO 3
// Escriba un programa que pida números enteros mientras 
// sean cada vez más grandes. Termina si se introduce uno menor

package bucle_While;
import java.util.Scanner;
public class P003_Numeros_Mas_Grandes {

	public static void main(String[] args) {
		int numero_1=0;
		int numero_2=0;
		Scanner numeros= new Scanner(System.in);
		System.out.println("NUMEROS CADA VEZ MAS GRANDES");
		System.out.println("Introduzca un numero: ");
		numero_1= numeros.nextInt();
		System.out.println("Introduzca un numero mayor que: "+numero_1);
		numero_2= numeros.nextInt();    //Para que se cumpla el primer ciclo
		while(numero_1<=numero_2)
		{
		numero_1=numero_2;   //Se iguala para superar el nuevo numero
		System.out.println("Introduzca un numero mayor que: "+numero_1);
		numero_2= numeros.nextInt();
		}
		System.out.println("El numero "+numero_2+" no es mayor que el numero "+numero_1);
	     numeros.close();
	}

}
