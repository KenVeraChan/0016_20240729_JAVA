// EJERCICIO 9
// Dado los dos siguientes arrays, crear un bloque de código 
// que me sume las Componentes de ambos arrays de la siguiente manera:
// Array1 12
// 0 5
// Array2 34
// 5 8
// Resultado Resultado (1+3)(2+4) —> 4 6 (0+5) (5+8) 5 13
// Los arrays son los siguientes:
// int[][] matriz1 = new int[][]{ {1,2}, {0,5} };
// int[][] matriz2 = new int[][]{ {3,4}, {5,8} };

package estructura_Arrays_Con_Solucion;
public class P009_Suma_Arrays {
	public static void main(String[] args) {
		int[][] matriz1 = new int[][]{ {1,2}, {0,5} };
		int[][] matriz2 = new int[][]{ {3,4}, {5,8} };
		int[][] matriz3 = new int[2][2];
		int fila=0;
		int columna=0;
		// Procedimiento para sumar
		for(fila=0;fila<matriz1.length;fila++)
		{
			for(columna=0;columna<matriz1[fila].length;columna++)  //Se añade la fila para que el metodo length afecte a columna
			{
				matriz3[fila][columna]=matriz1[fila][columna]+matriz2[fila][columna];
			}
		}
		// Procedimiento para mostrar
		for(fila=0;fila<matriz1.length;fila++)
		{
			for(columna=0;columna<matriz1[fila].length;columna++)  //Se añade la fila para que el metodo length afecte a columna
			{
				System.out.print(" "+matriz1[fila][columna]+" ");
			}
		  System.out.println(" ");
		}
		  System.out.println(" + ");
		for(fila=0;fila<matriz1.length;fila++)
		{
			for(columna=0;columna<matriz1[fila].length;columna++)  //Se añade la fila para que el metodo length afecte a columna
			{
				System.out.print(" "+matriz2[fila][columna]+" ");
			}
		  System.out.println(" ");
		}
		  System.out.println(" = ");
		for(fila=0;fila<matriz1.length;fila++)
		{
			for(columna=0;columna<matriz1[fila].length;columna++)  //Se añade la fila para que el metodo length afecte a columna
			{
				System.out.print(" "+matriz3[fila][columna]+" ");
			}
		  System.out.println(" ");
		}
	}
}
