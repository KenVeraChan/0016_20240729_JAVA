// EJERCICIO 1
// Escribir los 10 primeros números (ascendente y descendente)

package bucle_For;

public class Diez_Primeros_Numeros {

	public static void main(String[] args) {
		int i=1;
		System.out.println("Ascendente:");
		System.out.println("");
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("");
		System.out.println("Descendente:");
		System.out.println("");
		for(i=10;i>0;i--)
		{
			System.out.println(i);
		}
	}
}
