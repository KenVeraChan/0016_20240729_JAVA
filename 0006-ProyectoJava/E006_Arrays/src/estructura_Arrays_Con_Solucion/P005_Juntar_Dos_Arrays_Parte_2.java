// EJERCICIO 5

// Dado los siguientes arrays, hacer un bloque de código que construya un array de la siguiente manera:
// char[] cars1 = new char[]{‘1′,’2′,’3′,’4′,’5′,’6’};
// char[] cars2 = new char[]{‘a’,’e’,’r’,’t’,’y’,’u’};
// El array resultado que se debe de construir es el siguiente:
// char[] result = new char[]{‘1′,’a’,’2′,’e’,’3′,’r’,’4′,’t’,’5′,’y’,’6′,’u’};

package estructura_Arrays_Con_Solucion;
public class P005_Juntar_Dos_Arrays_Parte_2 {
	public static void main(String[] args) {
		int puntero=0;  //Para recorrer cada uno de los vectores
		char cars1[] = new char[]{'1','2','3','4','5','6'};
		char cars2[] = new char[]{'a','e','r','t','y','u'};
	    char cars3[]= new char[12];
	    for(puntero=0;puntero<6;puntero++)
	    {
	    	cars3[puntero]=cars1[puntero];
	    }
    	for(puntero=0;puntero<6;puntero++)
    	{
    		cars3[puntero+6]=cars2[puntero];
    	}
	    puntero=0; //Se reinicia el puntero de recorrido
	    for(puntero=0;puntero<12;puntero++)
	    {
	    	System.out.print(cars3[puntero]+" ");
	    }	
	}
}
