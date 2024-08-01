// Escriba un programa que pida dos números enteros y 
// que calcule su división, escribiendo si la división es exacta o no.

package condicionales_propuestos;
import java.util.Scanner;

public class Numeros_Enteros_Division {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int dividendo=0;
		int divisor=0;
		int cociente=0;
		int resto=0;
		System.out.println("DIVISIÓN NUMEROS ENTEROS");
		System.out.println("Introduzca el numero dividendo:");
		dividendo= numeros.nextInt();
		do {  //Se mete en un bucle porque no puede introducirse 0 como factor que divide
		System.out.println("Introduzca el numero divisor (distinto de 0):");
		divisor= numeros.nextInt();
		}while(divisor==0);	
		cociente=dividendo/divisor;
		resto=dividendo%divisor;
		System.out.println("Dividendo introducido: "+dividendo);
		System.out.println("Divisor introducido: "+divisor);
		if(resto==0)
		{
			System.out.println("La división ES EXACTA");
			System.out.println("");	
		}
		else
		{
			System.out.println("La división NO ES EXACTA");
			System.out.println("");	
		}
		System.out.println("Cociente obtenido: "+cociente);
		System.out.println("Resto obtenido: "+resto);
	}
}
