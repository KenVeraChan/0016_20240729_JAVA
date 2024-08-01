// EJERCICIO 4 
// Escriba un programa que pida la cantidad de números positivos 
// que se tienen que escribir y a continuación pida números hasta 
// que se haya escrito la cantidad denúmeros positivos indicada.

package bucle_While;

import java.util.Scanner;

public class P004_Numeros_Positivos {

	public static void main(String[] args) {
		int numeros_positivos=0;
		int numero=0;     // Numeros introducidos
		int contador=1;   //Va contando cuantos numeros positivos se van metiendo
		int contador_numeros_positivos=0;
		int contador_numeros_negativos=0;
		int total=0;
		Scanner numeros= new Scanner(System.in);
		System.out.println("NUMEROS POSITIVOS");
		System.out.println("Introduzca la cantidad de numeros positivos que se quieren introducir: ");
		numeros_positivos= numeros.nextInt();
		while(numeros_positivos<=0)
		{
			System.out.println("La cantidad debe ser mayor que 0. Intentelo de nuevo: ");
			numeros_positivos= numeros.nextInt();
		}
		while(contador<=numeros_positivos)
		{
			System.out.println("Introduzca un numero positivo: ");
			numero= numeros.nextInt();
			while(numero<=0)     //Se repetira este bucle hasta que meta numeros positivos
			{
				System.out.println("El numero introducido debe ser mayor que 0. Intentelo de nuevo ");
				numero= numeros.nextInt();
				contador_numeros_negativos=contador_numeros_negativos+1;
			}
			contador_numeros_positivos=contador_numeros_positivos+1;
		  contador=contador+1;
		}
		total=contador_numeros_positivos+contador_numeros_negativos;
		System.out.println("Ha escrito "+total+" numeros, "+contador_numeros_positivos+" son numeros positivos");
	     numeros.close();
	}
}
