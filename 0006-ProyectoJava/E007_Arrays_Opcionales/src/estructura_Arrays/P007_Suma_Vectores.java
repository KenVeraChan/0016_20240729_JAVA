// EJERCICIO 7
// Programa que declare tres vectores ‘vector1’, ‘vector2’ y ‘vector3’ 
// de cinco enteros cada uno, pida valores para ‘vector1’ y ‘vector2’ y 
// calcule vector3=vector1+vector2.

package estructura_Arrays;
import java.util.Scanner;
public class P007_Suma_Vectores {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int vector_1[]= new int[5];
		int vector_2[]= new int[5];
		int vector_3[]= new int[5];
		int valor_1=0;
		int valor_2=0;
		int puntero=0;
		for(puntero=0;puntero<vector_1.length;puntero++)
		{
			System.out.println("Introduzca un valor para el VECTOR 1: ");
			valor_1=numeros.nextInt();
			System.out.println("Introduzca un valor para el VECTOR 2: ");
			valor_2=numeros.nextInt();
			vector_1[puntero]=valor_1;
			vector_2[puntero]=valor_2;
			vector_3[puntero]=valor_1+valor_2;
		}
		System.out.println("");
		for(puntero=0;puntero<vector_1.length;puntero++)
		{
			System.out.print(vector_1[puntero]+" + "+vector_2[puntero]+" = "+vector_3[puntero]);
			System.out.println("");
		}
	}
}
