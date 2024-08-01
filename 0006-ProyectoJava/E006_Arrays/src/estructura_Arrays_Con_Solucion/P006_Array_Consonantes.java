// EJERCICIO 6
// Dado el siguiente array, crear un bloque de código que pinte, SOLO, las consonantes que existan en dicho array
// char[] letras = new char[]{‘2′,’f’,’f’,’u’,’u’,’g’,’h’,’i’,’4′};

package estructura_Arrays_Con_Solucion;
public class P006_Array_Consonantes {
	public static void main(String[] args) { 
		char[] letras = new char[]{'2','f','f','u','u','g','h','i','4'};
		int puntero=0;		//Es un puntero que recorre el vector
		for(puntero=0;puntero<letras.length;puntero++)
		{
			if(letras[puntero]!='a' && letras[puntero]!='e' && letras[puntero]!='i' && letras[puntero]!='o' && letras[puntero]!='u' && letras[puntero]!='2' && letras[puntero]!='4' )
			{
				System.out.print(letras[puntero]);	
			}
		}
	}
}
