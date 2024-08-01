// EJERCICIO 8
// Escriba un programa que pregunte cuantos números se van a 
// introducir, pida esos números (que puedan ser decimales) y 
// calcule su suma

package bucle_For;
import java.util.Scanner;
public class P008_Suma_Numeros_Intro {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int contador=0;   //Contador de numeros que se estan introduciendo
		int cifras=0;     //Cantidad de numeros que se van a meter
		double peticion=0.0; //numeros que se meten
		double resultado_final=0.0; //resultado de la suma de los numeros pedidos
		
		System.out.println("SUMA DE VALORES");
		while(cifras<=0)
		{
		System.out.println("Indique cuantos numeros quiere introducir: ");
		cifras=numeros.nextInt();
		}
		for(contador=1;contador<=cifras;contador++)
		{
			System.out.println("Escriba el numero "+contador+": ");
			peticion=numeros.nextDouble();
			resultado_final=resultado_final+peticion;
		}
		System.out.println("La suma total de los numeros introducidos es: "+String.format("%.2f", resultado_final));
		numeros.close();
	}
}
