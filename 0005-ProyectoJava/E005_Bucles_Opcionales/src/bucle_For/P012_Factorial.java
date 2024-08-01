// EJERCICIO 12
// Escriba un programa que pida un número entero 
// mayor que cero y calcule su factorial.

package bucle_For;
import java.util.Scanner;
public class P012_Factorial {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int contador=0;
		int aux=0;
		int factorial=1;
		while(contador<=0)
		{
			System.out.println("FACTORIAL DE UN NUMERO");
			System.out.println("Indique un numero mayor que cero: ");
			contador=numeros.nextInt();
			if(contador<=0)
			{
				System.out.println("Es imposible!!!");
			}
		}
		for(aux=1;aux<=contador;aux++)
		{
			factorial=factorial*aux;
		}
		System.out.println("El factorial del numero "+contador+" es: "+factorial);
		numeros.close();
	}
}
