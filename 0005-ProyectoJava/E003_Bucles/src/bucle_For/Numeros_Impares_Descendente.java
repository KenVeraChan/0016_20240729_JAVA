// EJERCICIO 6
// Hallar los números impares menores de 30 y que aparezcan en orden descendente

package bucle_For;
public class Numeros_Impares_Descendente {
	public static void main(String[] args) {
	   int impares=30;
	   for(impares=30;impares>0;impares--)
	   {
		   impares=impares-1;   //Se añade esto para poder restar dos veces no una
		   System.out.println(impares);
	   }
	}
}
