// EJERCICIO 2
// Comparar dos n�meros y decir cu�l es el mayor

package condicionales_IF_ELSE;
import java.util.Scanner;   //se hace la importaci�n de la clase SCANNER para leer por teclado

public class Comparacion_Dos_numeros {

	public static void main(String[] args) {
		Scanner resultado = new Scanner(System.in);  //preparaci�n para leer por teclado
		
		//Declaracion de variables
		
		int numero_introducido_1=0;
		int numero_introducido_2=0;

		System.out.println("Introduzca un primer n�mero: ");
		numero_introducido_1=resultado.nextInt();
		System.out.println("Introduzca un segundo n�mero: ");
		numero_introducido_2=resultado.nextInt();
		
		//Procesamiento de lo pedido en el programa
		
		if(numero_introducido_1<numero_introducido_2)
		{
			System.out.println("El numero: "+numero_introducido_2 +" es el mayor");
		}
		else if(numero_introducido_1>numero_introducido_2)
		{
			System.out.println("El numero: "+numero_introducido_1 +" es el mayor");
		}
		else if(numero_introducido_1==numero_introducido_2)
		{
			System.out.println("Los numeros son iguales");
		}
	}

}
