// EJERCICIO 2
// Calcular la potencia de 2 elevado a 8


package bucle_While;

import java.util.Scanner;
public class Calculo_Potencia {

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
	    while(potencia>0)
	    {
	        resultado=resultado*base;
	        potencia=potencia-1;
	    }
	    System.out.println("La base: "+base+", elevada a la potencia: "+potencia_2+", da como resultado: "+resultado);
	}
}
