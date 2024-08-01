// EJERCICIO 7
// Escriba un programa que pida primero dos números enteros (mínimo y máximo) 
// y que después pida números enteros situados entre ellos. El programa 
// terminarácuando se escriba un número que no esté comprendido entre los 
// dos valores iniciales. El programa termina escribiendo la cantidad de 
// números escritos.

package bucle_While;
import java.util.Scanner;
public class P007_Numeros_Entre_Dos_Valores {

	public static void main(String[] args) {
	     Scanner numeros= new Scanner(System.in);
	     int numeros_positivos=0;
	     double nuevo_numero=0;
	     double limite_inferior=0;
	     double limite_superior=0;
	     System.out.println("ENTRE DOS VALORES");
	     System.out.println("Introduzca un numero:");
	     limite_inferior= numeros.nextDouble();
	     System.out.println("Introduzca un numero superior a "+limite_inferior+" :");
	     limite_superior= numeros.nextDouble();
	     while(limite_superior<=limite_inferior)
	     {    //Hace comparacion entre esos dos numeros como intervalo
	       System.out.println("El numero debe ser mayor que "+limite_inferior+". Intentelo de nuevo:");
	       limite_superior= numeros.nextDouble();
	     }
	     //Despues de tener preparado el intervalo se procede a la recogida de datos
	     System.out.println("Introduzca un numero:");
	     nuevo_numero= numeros.nextDouble();
	     while(nuevo_numero<limite_superior && nuevo_numero>limite_inferior)
	     {

	        if(nuevo_numero<limite_superior && nuevo_numero>limite_inferior)
	        {     
	            numeros_positivos=numeros_positivos+1;
	            System.out.println("Introduzca un numero:");
	            nuevo_numero= numeros.nextDouble();
	              //Hace la comprobacion de numeros introducidos y si esta fuera del 
	              // intervalo, no entra en este IF aunque luego el WHILE finalice
	              // despues de ser detectado antes
	        }
	     }
	     numeros.close();
	     System.out.println("El cantiada de numero introducidos entre: "+limite_inferior+" y "+limite_superior+" es: "+numeros_positivos);
	}
}
