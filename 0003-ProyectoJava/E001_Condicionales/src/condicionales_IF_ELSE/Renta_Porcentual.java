// EJERCICIO 4
// Hallar una renta de C x r x t / 1200
// Si el tiempo es <=24 meses –> 5% Si el tiempo es <=60 meses –> 8% Si el tiempo es >60 meses –> 10%

package condicionales_IF_ELSE;
import java.util.Scanner;

public class Renta_Porcentual {

	public static void main(String[] args) {
		Scanner resultado = new Scanner(System.in);  //preparación para leer por teclado

	Double capital_inicial=0.0; 
	Double renta=0.0;
	int meses=0;
	System.out.println("Introduzca su capital inicial: ");
	capital_inicial= resultado.nextDouble();  //Lee por teclado un valor de tipo Double
	System.out.println("");
	System.out.println("Introduzca los meses: ");
	meses= resultado.nextInt();  //Lee por teclado un valor de tipo Double	
	
		if(meses<=24)
		{
			//Renta con un 5% que es multiplicarlo por 0.05
			renta=(capital_inicial*meses*5)/1200;
			System.out.println("Su renta será de: "+renta+"€");
		}
		if(meses>24 && meses<=60)
		{
			//Renta con un 8% que es multiplicarlo por 0.08
			renta=(capital_inicial*meses*8)/1200;
			System.out.println("Su renta será de: "+renta+"€");
		}
		if(meses>60)
		{
			//Renta con un 10% que es multiplicarlo por 0.1
			renta=(capital_inicial*meses*10)/1200;
			System.out.println("Su renta será de: "+renta+"€");
		}
	}

}
