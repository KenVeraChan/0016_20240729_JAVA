// EJERCICIO 2
// Crear un bloque de código que lea las componentes de un 
// array de enteros y me pinte cuales con pares, cuales 
// impares y cuales con múltiplos de tres. Para este 
// ejercicio utilizar un bucle que recorra el array y 
// utilizar el operador %.

package estructura_Arrays_Con_Solucion;
import java.util.Scanner;
public class P002_Pares_Impares_Multiplos_3 {
	public static void main(String[] args) {
		int enteros[]= new int[10];
		Scanner numeros= new Scanner(System.in);
		int puntero=0;
		for(puntero=0;puntero<10;puntero++)
			{
				enteros[puntero]=(int)Math.floor(Math.random()*99+1);
				System.out.print(enteros[puntero]+" ");
			}	
		System.out.println("");
		System.out.println("");
		for(puntero=0;puntero<10;puntero++)
		{
			if(enteros[puntero]%2==0)  //Es un numero PAR
			{
				System.out.println(" "+enteros[puntero]+ "  es PAR");
			}
			if(enteros[puntero]%3==0)  //Es un numero PAR
			{
				System.out.println(" "+enteros[puntero]+ "  es MULTIPLO DE 3");
			}
			if(enteros[puntero]%2!=0)  //Es un numero PAR
			{
				System.out.println(" "+enteros[puntero]+ "  es IMPAR");
			}
		}
		numeros.close();
	}
}
