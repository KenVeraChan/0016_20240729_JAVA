// EJERCICIO 1
// Crear un bloque de código que pinte las vocales y solo 
// las vocales que existen en un array de caracteres. 
// El programa debe de ir comprobando, con un bucle, 
//paradeterminar si cada carácter del array es o no una vocal.

package estructura_Arrays_Con_Solucion;
import java.util.Scanner;
public class P001_Pintar_Vocales {
	public static void main(String[] args) {
		int contador=0;
		String letra="";
		Scanner palabra= new Scanner(System.in);
		String cadenas [] = new String[10];   //Se crea el vector de string
	
		System.out.println("Introduzca caracteres diferentes al azar.");
		while(contador<10)
		{
			System.out.println("Introduzca el caracter "+(contador+1)+":");
			letra= palabra.nextLine();		
			cadenas[contador]=letra;
			contador=contador+1;
		}
		System.out.println("La cadena de catacteres que ha introducido es:");
		for(contador=0;contador<10;contador++)
		{
			System.out.print(" "+cadenas[contador]+" ");
		}
				
		//Ahora se sacaran por pantalla aquellas que sean vocales
		System.out.println("");
		System.out.println("Las vocales que contiene la cadena de caracteres son:");
		for(contador=0;contador<10;contador++)
		{
			if(cadenas[contador].equals("A") || cadenas[contador].equals("a")|| cadenas[contador].equals("E") || cadenas[contador].equals("e") || cadenas[contador].equals("I") || cadenas[contador].equals("i") || cadenas[contador].equals("O") || cadenas[contador].equals("o") || cadenas[contador].equals("U") || cadenas[contador].equals("u"))
			{
				System.out.print(cadenas[contador]+" ");
			}
		}
	}
}
