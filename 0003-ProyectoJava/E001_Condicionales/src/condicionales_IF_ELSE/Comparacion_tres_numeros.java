// EJERCICIO 3
// Comparar tres números y decir cuál es el mayor

package condicionales_IF_ELSE;
import java.util.Scanner;

public class Comparacion_tres_numeros {

	public static void main(String[] args) {
		Scanner resultado= new Scanner(System.in);

		//Declaracion de variables
		
		int numero_introducido_1=0;
		int numero_introducido_2=0;
		int numero_introducido_3=0;
		
		//Procesamiento de lo pedido en el programa

		System.out.println("Introduzca un primer número: ");
		numero_introducido_1=resultado.nextInt();
		System.out.println("Introduzca un segundo número: ");
		numero_introducido_2=resultado.nextInt();
		System.out.println("Introduzca un tercer número: ");
		numero_introducido_3=resultado.nextInt();
		System.out.println("");
		
		if(numero_introducido_1>numero_introducido_2 && numero_introducido_1>numero_introducido_3)
		{
				System.out.println("El mayor es el: "+numero_introducido_1);
				System.out.println("");
		}
		if(numero_introducido_2>numero_introducido_1 && numero_introducido_2>numero_introducido_3)
		{
				System.out.println("El mayor es el: "+numero_introducido_2);	
				System.out.println("");
		}
		if(numero_introducido_3>numero_introducido_1 && numero_introducido_3>numero_introducido_2)
		{
				System.out.println("El mayor es el: "+numero_introducido_3);
				System.out.println("");
		}
		if(numero_introducido_3==numero_introducido_1 || numero_introducido_3==numero_introducido_2 || numero_introducido_1==numero_introducido_2)
			{
			System.out.println("Han metido al menos dos numeros que son igules, no vale así");	
			System.out.println("");
			}
	}

}
