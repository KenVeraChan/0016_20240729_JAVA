// EJERCICIO 10
// Mejore el programa anterior haciendo que 
// el programa escriba la suma realizada

package bucle_For;
import java.util.Scanner;
public class P010_Suma_Entre_Valores_Parte_2 {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int total=0;
		int puntero=0;
		int valor_1=0;
		int valor_2=0;
		System.out.println("Indique el valor del primer numero: ");
		valor_1=numeros.nextInt();
		System.out.println("Indique el valor del segundo numero, mayor que el primero: ");
		while(valor_2<valor_1)
		{
			valor_2=numeros.nextInt();
			if(valor_2<valor_1)
			{
				System.out.println("Le he pedido un numero mayor que el "+valor_1+". Intentelo de nuevo: ");
			}
		}
		for(puntero=valor_1;puntero<=valor_2;puntero++)
		{
			total=total+puntero;
		}
		System.out.println("La suma total de los numeros entre el "+valor_1+" y el "+valor_2+" es: "+total);
		//Ahora se hara la suma de los elementos que salga por pantalla
		// NOTA: PARA CREAR LAS SIGUIENTES LINEAS DE CODIGO NO LEI LA NOTA DE SUGERENCIA QUE VENIA CON EL PROBLEMA PROPUESTO :-)
		String linea_suma="";   //Se considerara un STRING para poder mostrar la linea de la suma
		linea_suma=" "+valor_1;
		for(puntero=valor_1+1;puntero<=valor_2;puntero++)
		{
			linea_suma=linea_suma+" + "+puntero;
		}
		System.out.println(linea_suma+" = "+total);
		numeros.close();
	}

}
