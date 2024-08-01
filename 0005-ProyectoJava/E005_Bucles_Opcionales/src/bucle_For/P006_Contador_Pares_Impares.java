// EJERCICIO 6
// Escriba un programa que pregunte cuántos 
// números se van a introducir, pida esos números, y 
// diga al final cuántos han sido pares y cuantos impares

package bucle_For;
import java.util.Scanner;
public class P006_Contador_Pares_Impares {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int contabilidad=0;
		int puntero=0;
		int valor=0;
		int contar_pares=0;
		int contar_impares=0;
		System.out.println("NUMEROS NEGATIVOS");
		while(contabilidad<=0)
		{
			System.out.println("Indique cuantos numeros va a introducir:");
			contabilidad=numeros.nextInt();
			if(contabilidad<=0)
			{
				System.out.println("¡Imposible!");
			}
		}
		for(puntero=1;puntero<=contabilidad;puntero++)
		{
			System.out.print("Introduzca el numero "+puntero+": ");
			valor=numeros.nextInt();
			System.out.println("");
			if(valor%2==0)
			{
				contar_pares=contar_pares+1;
			}
			if(valor%2!=0)
			{
				contar_impares=contar_impares+1;
			}
		}
		if(contar_pares==0)
		{
			System.out.println("No se ha escrito ningun numero PAR");
		}
		if(contar_impares==0)
		{
			System.out.println("No se ha escrito ningun numero IMPAR");
		}
		System.out.println("Ha escrito "+contar_pares+" numeros PARES");
		System.out.println("Ha escrito "+contar_impares+" numeros IMPARES");
	  numeros.close();
	}
}
