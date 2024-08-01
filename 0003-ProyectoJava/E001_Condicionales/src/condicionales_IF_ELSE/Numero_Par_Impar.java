// EJERCICIO 1
// Devolver si un numero es par o impar


package condicionales_IF_ELSE;
import java.util.Scanner;   //se hace la importación de la clase SCANNER para leer por teclado

public class Numero_Par_Impar {

	public static void main(String[] args) {
		Scanner resultado = new Scanner(System.in);  //preparación para leer por teclado
		int numero_introducido=0;

		System.out.println("Introduzca un número: ");
		numero_introducido=resultado.nextInt();
		if(numero_introducido%2==0)   //%: Es resto de la división sale entera
		{
			System.out.println("El número introducido "+numero_introducido+ " es PAR");
		}
		else
		{
			System.out.println("El número introducido "+numero_introducido+ " es IMPAR");
		}
	}

}
