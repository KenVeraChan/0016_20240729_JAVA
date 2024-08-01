// EJERCICIO 1
// Escriba un programa que pida dos números enteros y escriba qué 
// números son pares y cuáles impares desde el primero hasta el segundo.

package bucle_For;
import java.util.Scanner;
public class P001_Pares_Impares_Pedidos {
	public static void main(String[] args) {
		Scanner numero= new Scanner(System.in);
		int limite_superior=0;
		int limite_inferior=0;
		int puntero=0;
		
		System.out.println("Introduzca un numero entero");
		limite_inferior=numero.nextInt();
		System.out.println("Introduzca un numero superior a "+limite_inferior);
		limite_superior=numero.nextInt();
		
		if(limite_superior<limite_inferior)
		{
			System.out.println("Le he pedido un numero mayor que "+limite_inferior+"!");
		}
		else
		{
			for(puntero=limite_inferior;puntero<=limite_superior;puntero++)
			{
				if(puntero%2==0)
				{
					System.out.println("El numero "+puntero+" es PAR");
				}
				else
				{
					System.out.println("El numero "+puntero+" es IMPAR");
				}
			}
			System.out.println("fin");
		}
		numero.close();
	}
}
