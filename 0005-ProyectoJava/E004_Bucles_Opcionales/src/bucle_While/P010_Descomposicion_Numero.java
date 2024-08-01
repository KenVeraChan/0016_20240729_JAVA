// EJERCICIO 10
// Escriba un programa que calcule la descomposición en factores primos de un número.

package bucle_While;
import java.util.Scanner;
public class P010_Descomposicion_Numero {
	public static void main(String[] args) {
		Scanner numero= new Scanner(System.in);
		int dividendo=0;
		int numeros=0;
		int puntero=1;
		int contador=0;    //Conador de divisibilidad, si es 2 es primo sino no
		while(dividendo<=1)
		{
		System.out.println("DESCOMPOSICION DE NUMEROS PRIMOS");
		System.out.println("Introduzca un numero entero mayor que 1: ");
		dividendo= numero.nextInt();
		}
		System.out.println("Descomposicion en numeros primos: ");
		//Se extrae la forma de dividir el numero entre los primos que haya
		
		numeros=0;
		while(numeros<=dividendo)  //Se pone el valor del dividendo para tener un numero de parada
		{
			puntero=1; //Reinicia el valor
			while(puntero<=dividendo)
			{
				if(numeros%puntero==0)
				{
					contador=contador+1;
					// Cuenta hasta 2, si lo supera o se queda corto, no es PRIMO, pero si es 2 si lo sera
				}
			  puntero=puntero+1;
			}
			if (contador==2)     //Se pone aqui fuera para no repetir la salida dentro del for anidado
			{
				//Aqui se programa si puede dividirse con resto cero, en cuyo caso se
				// se sacara por pantalla ya que es un numero primo incluido en su divisibilidad
				if(dividendo%numeros==0)
				{
					int auxiliar=0;  //Se mete una variable auxiliar para sacar sus factores
					auxiliar=dividendo;    //Sin cambiar el valor del dividendo
					while(auxiliar%numeros==0)
					{	
						auxiliar=auxiliar/numeros;
						//Saca por pantalla los divisores del numero introducido
						System.out.print(" "+numeros+" ");
					}
				}
			}
			contador=0;   //Reinicia la variable para el siguiente numero
			
			numeros=numeros+1;
		}
	     numero.close();
	}
}
