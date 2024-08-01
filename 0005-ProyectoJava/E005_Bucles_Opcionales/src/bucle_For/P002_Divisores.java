// EJERCICIO 2
// Escriba un programa que pida un número entero 
// mayor que cero y que escriba sus divisores.

package bucle_For;

import java.util.Scanner;

public class P002_Divisores {
	public static void main(String[] args) {
		Scanner numero= new Scanner(System.in);
		int dividendo=0;
		int numeros=0;
		int puntero=1;
		int contador=0;    //Conador de divisibilidad, si es 2 es primo sino no
		while(dividendo<=1)
		{
		System.out.println("DIVISORES");
		System.out.println("Introduzca un numero entero mayor que 1: ");
		dividendo= numero.nextInt();
		}
		System.out.println("Descomposicion en factores: ");
		//Se extrae la forma de dividir el numero entre los primos que haya
		
		numeros=1;
		while(numeros<=dividendo)  //Se pone el valor del dividendo para tener un numero de parada
		{
				if(dividendo%numeros==0)
				{
					//Saca por pantalla los divisores del numero introducido
					System.out.print(" "+numeros+" ");
				}
			numeros=numeros+1;
		}
	     numero.close();
	}

}
