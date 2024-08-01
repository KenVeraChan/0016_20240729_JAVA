// EJERCICIO 5
// Hacer un programa que inicialice un vector de números con 
// valores aleatorios, y posterior ordene los elementos de menor a mayor.

package estructura_Arrays;
import java.util.Scanner;
public class P005_Vector_Aleatorios {

	public static void main(String[] args) {
        Scanner nota= new Scanner(System.in);
        int vector_enteros[]= new int[10];
        int puntero=0;
        int valor=0;
        // Fase de introduccion de palabras
        for(puntero=0;puntero<vector_enteros.length;puntero++)
        {
            valor=(int) (Math.floor(Math.random() * 99 + 1));
            vector_enteros[puntero]= valor;
            System.out.print(vector_enteros[puntero]+" ");
        }  
        // Ahora se ordenan
        System.out.println("");
        System.out.println("");
        int fila=0;
        int columna=0;
        int auxiliar=0;   
        for (fila = 0; fila < vector_enteros.length - 1; fila++) 
        {
            for (columna = 0; columna < vector_enteros.length - fila - 1; columna++) 
            {                                                              
                if (vector_enteros[columna + 1] < vector_enteros[columna]) 
                {   //Si descubre que el siguiente es menor que el anterior
                    //Se ejecuta una permutacion entre ambos valores del vector
                    //Mientras se va recorriendo el mismo
                    auxiliar = vector_enteros[columna + 1];
                    vector_enteros[columna + 1] = vector_enteros[columna];
                    vector_enteros[columna] = auxiliar;
                }
            }
        }
        //Ahora se sacara por pantalla el resultado
        for(puntero=0;puntero<vector_enteros.length;puntero++)
        {
            System.out.print(vector_enteros[puntero]+" ");
        }
	}
}
