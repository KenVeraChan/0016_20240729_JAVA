// EJERCICIO 9
// Hallar la lista de los números primos hasta el 100

package bucle_For;

public class Lista_Primos {

	public static void main(String[] args) {
		int numeros=0;
		int puntero=1;
		int contador=0;    //Conador de divisibilidad, si es 2 es primo sino no
		for(numeros=0;numeros<=100;numeros++)
		{
			for(puntero=1;puntero<=100;puntero++)
			{
				if(numeros%puntero==0)
				{
					contador=contador+1;
					// Cuenta hasta 2, si lo supera o se queda corto, no es PRIMO, pero si es 2 si lo sera
				}
			}
			if (contador==2)     //Se pone aqui fuera para no repetir la salida dentro del for anidado
			{
				System.out.println(numeros);
			}
			contador=0;   //Reinicia la variable para el siguiente numero
		}
	}

}
