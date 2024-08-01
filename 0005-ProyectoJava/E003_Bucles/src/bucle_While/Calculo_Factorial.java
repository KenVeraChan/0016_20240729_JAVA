// EJERCICIO 1
// Calcular el factorial de 25

package bucle_While;
import java.util.Scanner;
public class Calculo_Factorial {

	public static void main(String[] args) {
	    Scanner numeros= new Scanner(System.in);
	    int factorial=1;
	    int numero=0;
	    double resultado=1;
	    System.out.println("Introduzca un numero para sacar su factorial");
	    factorial= numeros.nextInt();
	    
	    while(numero<factorial)
	    {
	        resultado=resultado*(factorial-numero);
	        numero=numero+1;
	    }
	    System.out.println("El factorial del numero "+ factorial+" es: "+resultado);
	    }
}
