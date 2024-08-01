// EJERCICIO 7
// Escriba un programa que pida un número entero mayor que 1 
// y que escriba si el número es un número primo o no.

package bucle_For;
import java.util.Scanner;
public class P007_Detector_Numero_Primo {

	public static void main(String[] args) {
		Scanner primo= new Scanner(System.in);
		int numeros=0;
		int puntero=1;
		int contador=0;    //Conador de divisibilidad, si es 2 es primo sino no
		System.out.println("NUMERO PRIMO");
			while(numeros<=0)
			{
				System.out.println("Introduzca un numero, mayor que 1, para ver si es primo o no");
				numeros=primo.nextInt();
			}
		for(puntero=1;puntero<=numeros;puntero++)
		{
			if(numeros%puntero==0)
			{
				contador=contador+1;   //Porque SOLO los numeros PRIMOS son divisibles entre 1 y si mismo, por eso si llega a 2 es primo
			}
		}
		if(contador==2)
		{
			System.out.println("El numero "+numeros+" SI es PRIMO");
		}
		else
		{
			System.out.println("El numero "+numeros+" NO es PRIMO");
		}
		primo.close();
	}
}
