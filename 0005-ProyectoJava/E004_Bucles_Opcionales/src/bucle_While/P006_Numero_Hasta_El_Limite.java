// EJERCICIO 6
// Escriba un programa que pida un valor límite positivo y a 
// continuación pida números hasta que la suma de los números 
// introducidos supere el límite inicial.

package bucle_While;
import java.util.Scanner;

public class P006_Numero_Hasta_El_Limite {
	public static void main(String[] args) {
	     Scanner numeros= new Scanner(System.in);
	     double numeros_positivos=0;
	     double nuevo_numero=0;
	     double limite=0;
	     System.out.println("HASTA EL LIMITE");
	     System.out.println("Introduzca el valor del limite:");
	     limite= numeros.nextDouble();
	     while(limite<=0)
	     {
	       System.out.println("El limite debe ser mayor que 0. Intentelo de nuevo:");
	       limite= numeros.nextDouble();
	     }
	     while(numeros_positivos<limite)
	     {
	        System.out.println("Introduzca un numero:");
	        nuevo_numero= numeros.nextDouble();
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
