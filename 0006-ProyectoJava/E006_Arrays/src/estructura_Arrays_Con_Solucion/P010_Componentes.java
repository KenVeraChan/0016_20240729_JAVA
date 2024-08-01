// EJERCICIO 10
// Dado la siguiente matriz, crear un bloque de código que 
// me pinte sus componentes de la siguiente manera:
// {3 4 5 78} {000 0} {1 1 1 1} {6 6 6 -1}
// El array bidimensional es el siguiente: int[][] numeros = new int[][]{ {3, 4, 5, 78},
// {0, 0, 0, 0}, {1, 1, 1, 1}, {6, 6, 6, -1} };

package estructura_Arrays_Con_Solucion;
public class P010_Componentes {
	public static void main(String[] args) {
		int[][] numeros = new int[][]{ {3, 4, 5, 78},{0, 0, 0, 0}, {1, 1, 1, 1}, {6, 6, 6, -1} };
		int fila=0;
		int columna=0;
		String linea="";
		for(fila=0;fila<numeros.length;fila++)
		{
			linea=linea+"{";
			for(columna=0;columna<numeros[fila].length;columna++)
			{
				if(columna==numeros[fila].length-1)
				{
					linea=linea+" "+numeros[fila][columna]+"";	
				}
				if(columna!=numeros[fila].length-1)
				{
					linea=linea+" "+numeros[fila][columna]+", ";	
				}
			}
			linea=linea+"}, ";
		}
		System.out.println(linea+" es la salida esperada");
	}
}
