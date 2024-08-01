// EJERCICIO 4
// Programa que declare un vector de diez elementos enteros y pida 
// números para rellenarlo hasta que se llene el vector o se introduzca 
// un número negativo. Entonces sedebe imprimir el vector 
// (sólo los elementos introducidos).

package estructura_Arrays;
import java.util.Scanner;
public class P004_Vector_Enteros {

	public static void main(String[] args) {
        Scanner nota= new Scanner(System.in);
        int vector_enteros[]= new int[10];
        int puntero=0;
        int valor=0;
        // Fase de introduccion de palabras
        for(puntero=0;puntero<vector_enteros.length;puntero++)
        {
            System.out.println("Introduzca un numero");
            valor= nota.nextInt();
            if(valor<0)
            {
                break; //Termina el bucle
            }
            else
            {
             vector_enteros[puntero]=valor;
            }
        }
        //Fase de mosrar los valores que s ehabian introducido
        for(puntero=0;puntero<vector_enteros.length;puntero++)
        {
            if(vector_enteros[puntero]!=0)
            {     //Solo imprime los valores introducidos no el resto del vector
                System.out.print(vector_enteros[puntero]+" ");   
            }
        }
	}
}
