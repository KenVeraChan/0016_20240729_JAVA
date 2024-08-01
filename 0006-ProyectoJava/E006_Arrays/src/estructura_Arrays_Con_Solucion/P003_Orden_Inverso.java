// EJERCICIO 3
// Crear un bucle que pinte por consola todas las 
// componentes de un array en orden inverso a como 
// están guardadas en el array

package estructura_Arrays_Con_Solucion;
import java.util.Scanner;
public class P003_Orden_Inverso {
	public static void main(String[] args) {
		int enteros[]= new int[10];
		Scanner numeros= new Scanner(System.in);
		int puntero=0;
		//Se llenara el vector con numeros enteros aleatorios
		System.out.println("SENTIDO DIRECTO");
		for(puntero=0;puntero<10;puntero++)
			{
				enteros[puntero]=(int)Math.floor(Math.random()*99+1);
				System.out.print(enteros[puntero]+" ");
			}
		System.out.println("");
		System.out.println("");
		//Ahora se imprimiran los numeros en sentido inverso
		System.out.println("SENTIDO INVERSO");
		for(puntero=9;puntero>=0;puntero--)
		{
			System.out.print(enteros[puntero]+" ");
		}
		numeros.close();
	}

}
