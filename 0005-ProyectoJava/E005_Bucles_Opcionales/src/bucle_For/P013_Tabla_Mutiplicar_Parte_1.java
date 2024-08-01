// EJERCICIO 13
// Escriba un programa que genere una multiplicación 
// de dos números del 2 al 10 al azar, pregunte por el 
// resultado y diga si se ha dado la respuesta correcta.

package bucle_For;
import java.util.Scanner;
public class P013_Tabla_Mutiplicar_Parte_1 {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int cifra_1=(int) (Math.floor(Math.random()*10+1));
		int cifra_2=(int) (Math.floor(Math.random()*10+1));
		int resultado=0; //Resultado de la operacion
		int resultado_real=0;
		System.out.println("TABLA DE MUTIPLICAR");
		System.out.print("¿Cuanto es "+cifra_1+" x "+cifra_2+"? ");
		resultado=numeros.nextInt();
		resultado_real=cifra_1*cifra_2;
		if(resultado==resultado_real)
			{
			System.out.println("Respuesta CORRECTA");
			}
		else 
			{
			System.out.println("Respuesta INCORRECTA");
			}
		numeros.close();
	}
}
