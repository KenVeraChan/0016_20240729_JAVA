// EJERCICIO 8
// Escriba un programa que pida números pares mientras el usuario indique 
// que quiere seguir introduciendo números. Para indicar que quiere 
// seguir escribiendonúmeros, el usuario deberá contestar S o s a la pregunta.

package bucle_While;
import java.util.Scanner;
public class P008_Cuenta_Pares_1 {
	public static void main(String[] args) {
	     Scanner numeros= new Scanner(System.in);
	     int pares=0;
	     int contador=0;
	     String respuesta="s";
	     System.out.println("CUENTA PARES");
	     while(respuesta.equals("s")==true || respuesta.equals("S")==true)
	     {
	        System.out.println("Introduzca un numero PAR:");
	        pares= numeros.nextInt();
	         if(pares%2!=0)
	         {
	         System.out.println(pares+" No es un numero par. Intentelo de nuevo:");
	         pares= numeros.nextInt();
	         }
	         if(pares%2==0)
	         {  
	         contador=contador+1;
	         }
		     numeros.nextLine();  //Recogida de la respuesta 
	         System.out.println("Quiere introducir otro numero par: (S/N)");
		     respuesta= numeros.nextLine();  //Recogida de la respuesta 
	    }
	     numeros.close();
	     System.out.println("Ha escrito: "+contador+" numeros pares.");
	}
}
