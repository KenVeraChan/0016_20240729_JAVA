// EJERCICIO 5
// Escriba un programa que pida n�meros mientras no se 
// escriba un n�mero negativo. El programa terminar� 
// escribiendo la suma de los n�meros introducidos.

package bucle_While;
import java.util.Scanner;
public class P005_Suma_de_Numeros {
	public static void main(String[] args) {
	     Scanner numeros= new Scanner(System.in);
	     int numeros_positivos=0;
	     int nuevo_numero=0;
	     System.out.println("SUMA DE NUMEROS");
	     System.out.println("Introduzca un numero:");
	     numeros_positivos= numeros.nextInt();
	     while(nuevo_numero>=0)
	     {
	        System.out.println("Introduzca otro numero:");
	        nuevo_numero= numeros.nextInt();
	        if(nuevo_numero>=0)
	        {
	        numeros_positivos=numeros_positivos+nuevo_numero;    
	        }
	        else{
	            // no hace nada porque no se pueden sumar numeros negtivos al final
	        }   
	     }
	     numeros.close();
	     System.out.println("La suma de los numeros positivos introducidos es: "+ numeros_positivos);
	}
}
