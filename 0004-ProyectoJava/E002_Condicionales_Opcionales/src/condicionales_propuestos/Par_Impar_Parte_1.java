// Escriba un programa que pida primero un número par 
// y luego un número impar (positivos o negativos). 
// En caso de que uno o los dos valores no sea correcto, semostrará un único aviso.

package condicionales_propuestos;
import java.util.Scanner;

public class Par_Impar_Parte_1 {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int numero_impar=0;
		int numero_par=0;
		int contador_intentos=0;
		contador_intentos=contador_intentos+1;  //Para comenzar a contar desde 1
		
		do {
			System.out.println("");
			System.out.println("PAR E IMPAR 1");
			System.out.println("");
			System.out.println("Introduzca un numero par, puede ser positivo o negativo");
			numero_par= numeros.nextInt();
			System.out.println("Introduzca un numero impar, puede ser positivo o negativo");
			numero_impar= numeros.nextInt();
			
			if(numero_par%2==0 && numero_impar%2!=0)
			{     // Comprueba que se cumple con lo pedido de que los numeros intro es par e impar
				System.out.println("");
				System.out.println("Gracias por su colaboración");
				System.out.println("");
				contador_intentos=contador_intentos+1;
			}
			else
			{
				System.out.println("");
				System.out.println("Uno o los dos numeros introducidos no son correctos");
				System.out.println("");
				contador_intentos=contador_intentos+1;
			}
		}while(contador_intentos<4); //El programa se repetirá tres veces y luego saldrá
		System.out.println("Ejecute de nuevo el programa para volver a intentarlo.");
	}
}
