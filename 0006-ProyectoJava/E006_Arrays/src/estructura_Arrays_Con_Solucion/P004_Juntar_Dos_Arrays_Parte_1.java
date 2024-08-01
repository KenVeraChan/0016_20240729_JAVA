// EJERCICIO 4
// Crear un bloque de código que recorra los siguientes arrays y me cree otro que contenga las componentes de ambos dos. Los arrays son los siguientes:
// int[] array1 = new int[]{1,2,3,4,5};
// int[] array2 = new int[]{334,23,4}; El array resultado es el siguiente:
// int[] array3 = new int[]{1,2,3,4,5,334,23,4};

package estructura_Arrays_Con_Solucion;

public class P004_Juntar_Dos_Arrays_Parte_1 {
	public static void main(String[] args) {
		int puntero=0;  //Para recorrer cada uno de los vectores
		int array1[] = new int[]{1,2,3,4,5};
		int array2[] = new int[]{334,23,4};
	    int array3[]= new int[8];
	    for(puntero=0;puntero<array1.length;puntero++)
	    {
	    	array3[puntero]=array1[puntero];
	    }
    	for(puntero=0;puntero<array2.length;puntero++)
    	{
    		array3[puntero+5]=array2[puntero];
    	}
	    puntero=0; //Se reinicia el puntero de recorrido
	    for(puntero=0;puntero<array3.length;puntero++)
	    {
	    	System.out.print(array3[puntero]+" ");
	    }	
	}
}
