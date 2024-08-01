// EJERCICIO 5
// Con una letra que contiene un numero romano:
// I, V, X, L, C, D, M (incluso minúsculas) Decir a que numero corresponde

package condicionales_SWITCH_CASE;

import java.util.Scanner;

public class Numeros_Romanos {

	public static void main(String[] args) {
		Scanner letra= new Scanner(System.in);
		String numero_romano="";
		int numero_natural=0;
		System.out.println("Indique su estado civil");
		numero_romano= letra.nextLine();  //Peticion de String por teclado
		
		// Al ser la STRING una variable de tipo OBJETO tiene sus propios métodos de uso para
		// cadenas de caracteres que se comparan para verificar si son iguales
		// Se transforma a una variable numerica para la posterior asignación en el SWITCH
		
		if(numero_romano.equals("I") || numero_romano.equals("i"))
		{
			numero_natural=1;
		}
		if(numero_romano.equals("V") || numero_romano.equals("v"))
		{
			numero_natural=2;
		}
		if(numero_romano.equals("X") || numero_romano.equals("x"))
		{
			numero_natural=3;
		}
		if(numero_romano.equals("L") || numero_romano.equals("l"))
		{
			numero_natural=4;
		}
		if(numero_romano.equals("C") || numero_romano.equals("c"))
		{
			numero_natural=5;
		}
		if(numero_romano.equals("D") || numero_romano.equals("d"))
		{
			numero_natural=6;
		}
		if(numero_romano.equals("M") || numero_romano.equals("m"))
		{
			numero_natural=7;
		}
		
		switch(numero_natural)
		{
		case 1: System.out.println("La letra "+numero_romano+" es el número 1"); break;
		case 2: System.out.println("La letra "+numero_romano+" es el número 5"); break;
		case 3: System.out.println("La letra "+numero_romano+" es el número 10"); break;
		case 4: System.out.println("La letra "+numero_romano+" es el número 50"); break;
		case 5: System.out.println("La letra "+numero_romano+" es el número 100"); break;
		case 6: System.out.println("La letra "+numero_romano+" es el número 500"); break;
		case 7: System.out.println("La letra "+numero_romano+" es el número 1000"); break;
		default: System.out.println("Opción mal elegida"); break;
		}

	}

}
