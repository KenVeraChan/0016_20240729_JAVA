// EJERCICIO 1
// Realizar un programa que defina un vector llamado “vector_numeros” 
// de 10 enteros, a continuación lo inicialice con valores aleatorios 
// (del 1 al 10) y posteriormente muestreen pantalla cada elemento del 
// vector junto con su cuadrado y su cubo.

package estructura_Arrays;
public class P001_Aleatorios_Cuadrado_Cubo {
	public static void main(String[] args) {
        int vector_numeros[]= new int[10];
        int puntero=0;
        for(puntero=0;puntero<10;puntero++)
        {
            vector_numeros[puntero]=(int)Math.floor(Math.random()*10+1);
            System.out.print(vector_numeros[puntero]+" ");
            System.out.print(vector_numeros[puntero]*vector_numeros[puntero]+" ");
            System.out.print(vector_numeros[puntero]*vector_numeros[puntero]*vector_numeros[puntero]+" ");
            System.out.println("");
        }
	}
}
