// EJERCICIO 5
// Hallar 2 elevado a 8

package bucle_For;
import java.util.Scanner;
public class Calculo_Potencia_dos {

	public static void main(String[] args) {
	    Scanner numeros= new Scanner(System.in);
	    int base=1;
	    int potencia=1;
	    int resultado=1;
	    int potencia_2=1;
	    System.out.println("Introduzca un numero que sera la base");
	    base= numeros.nextInt();
	    System.out.println("Introduzca un numero que sera su potencia");
	    potencia= numeros.nextInt();
	    potencia_2=potencia;
	    for(potencia=potencia_2;potencia>0;potencia--)
	    {
	      resultado=resultado*base;
	    }
	    System.out.println("La base: "+base+", elevada a la potencia: "+potencia_2+", da como resultado: "+resultado);
	}

}
