// EJERCICIO 3
// Se quiere realizar un programa que lea por teclado las 5 notas 
// obtenidas por un alumno (comprendidas entre 0 y 10). A continuación 
// debe mostrar todas las notas, la notamedia, la nota más alta que ha sacado y la menor.

package estructura_Arrays;
import java.util.Scanner;
public class P003_Calificaciones_Alumno {

	public static void main(String[] args) {
        Scanner nota= new Scanner(System.in);
        double vector_notas[]= new double[5];
        int puntero=0;
        double calificacion=0.0;
        // Fase de introduccion de palabras
        for(puntero=0;puntero<vector_notas.length;puntero++)
        {
            System.out.println("Introduzca una calificacion");
            calificacion= nota.nextDouble();
            vector_notas[puntero]=calificacion;
        }
        // Fase de sacar lo pedido
        System.out.println("");
        double mayor=0;    //Variables que iran permutandose hasta dar
        double menor=0;    // con los valores mayor y menor
        for(puntero=0;puntero<vector_notas.length;puntero++)
        {
            if(puntero==0)
            {
                mayor=vector_notas[puntero];
                menor=vector_notas[puntero];
            }
            else
            {
                if(mayor<vector_notas[puntero])
                {
                    mayor=vector_notas[puntero];
                }
                if(menor>vector_notas[puntero])
                {
                   menor=vector_notas[puntero]; 
                }
            }
        }
        //Ahora se procesa nota media y las notas totales
        //Y se sacaran por pantalla
        double suma=0.0;
        System.out.println("Las nortas son: ");
        for(puntero=0;puntero<vector_notas.length;puntero++)
        {
            System.out.println(vector_notas[puntero]);
            suma=suma+vector_notas[puntero];
        }
        suma=suma/vector_notas.length;
        System.out.println("Media: "+suma);
        System.out.println("El mayor es: "+mayor+" y el menor es: "+menor);
	}
}
