// EJERCICIO 9
// Escriba un programa que pida dos números enteros y 
// escriba la suma de todos los enteros desde el 
// primer número hasta el segundo.

package bucle_For;
import java.util.Scanner;
public class P009_Suma_Entre_Valores_Parte_1 {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int total=0;
		int puntero=0;
		int valor_1=0;
		int valor_2=0;
		System.out.println("Indique el valor del primer numero: ");
		valor_1=numeros.nextInt();
		System.out.println("Indique el valor del segundo numero, mayor que el primero: ");
		while(valor_2<valor_1)
		{
			valor_2=numeros.nextInt();
			if(valor_2<valor_1)
			{
				System.out.println("Le he pedido un numero mayor que el "+valor_1+". Intentelo de nuevo: ");
			}
		}
		for(puntero=valor_1;puntero<=valor_2;puntero++)
		{
			total=total+puntero;
		}
		System.out.println("La suma total de los numeros entre el "+valor_1+" y el "+valor_2+" es: "+total);
		numeros.close();
	}
}
