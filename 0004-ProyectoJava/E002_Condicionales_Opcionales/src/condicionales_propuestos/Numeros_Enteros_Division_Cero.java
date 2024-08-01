// Mejore el programa anterior haciendo que tenga en 
// cuenta que no se puede dividir por cero:

package condicionales_propuestos;
import java.util.Scanner;

public class Numeros_Enteros_Division_Cero {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int dividendo=0;
		int divisor=0;
		int cociente=0;
		int resto=0;
		System.out.println("DIVISIÓN NUMEROS ENTEROS - DIVISION POR CERO");
		System.out.println("Introduzca el numero dividendo:");
		dividendo= numeros.nextInt();
		System.out.println("Introduzca el numero divisor (distinto de 0):");
		divisor= numeros.nextInt();
		
		if(divisor!=0)  //Detecta si el divisor introducido es cero o no
		{
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
		if(divisor==0)   //En caso de ser cero el divisor se sale del programa
		{
           System.out.println("No se puede dividir por cero");
		}

	}

}
