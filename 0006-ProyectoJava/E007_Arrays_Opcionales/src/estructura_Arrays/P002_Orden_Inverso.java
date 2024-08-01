// EJERCICIO 2
// Crear un vector de 5 elementos de cadenas de caracteres, inicializa 
// el vector con datos leídos por el teclado. Copia los elementos del 
// vector en otro vector pero en ordeninverso, y muéstralo por la pantalla.

package estructura_Arrays;
import java.util.Scanner;
public class P002_Orden_Inverso {

	public static void main(String[] args) {
        Scanner palabra= new Scanner(System.in);
        String vector_palabras[]= new String[5];
        String vector_inverso[]= new String[5];
        int puntero=0;
        int puntero_inverso=0; //Para poder recorrerlo en sentido inverso
        String word="";
        // Fase de introduccion de palabras
        for(puntero=0;puntero<vector_palabras.length;puntero++)
        {
            System.out.println("Introduzca una palabra");
            word= palabra.nextLine();
            vector_palabras[puntero]=word;
        }
        puntero_inverso=vector_inverso.length-1;   //Parte del final
        // Fase de copiado en orden inverso
        for(puntero=0;puntero<vector_palabras.length;puntero++)
        {
            vector_inverso[puntero_inverso]=vector_palabras[puntero];
            puntero_inverso=puntero_inverso-1;
        }
        // Fase de sacar por pantalla en orden inverso las palabras
        System.out.println("");
        System.out.println("Secuencia en orden inverso");
        System.out.println("");
        for(puntero=0;puntero<vector_palabras.length;puntero++)
        {
            System.out.print(vector_inverso[puntero]+" ");
        }
	}
}
