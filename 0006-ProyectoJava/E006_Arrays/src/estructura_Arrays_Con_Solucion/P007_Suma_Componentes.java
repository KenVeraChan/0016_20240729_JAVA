// EJERCICIO 7

// Dado el siguiente array crear un bloque de código que sume 
// todas las componentes del array, para ello hacer uso de un 
// bucle que vaya obteniendo todos los valores delarray
// float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};

package estructura_Arrays_Con_Solucion;
public class P007_Suma_Componentes {
	public static void main(String[] args) {
		float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
		int puntero=0;
		float suma=0F;
		for(puntero=0;puntero<decimales.length;puntero++)
		{
			suma=suma+decimales[puntero];
		}
		System.out.println("La suma es: "+suma);
	}

}
