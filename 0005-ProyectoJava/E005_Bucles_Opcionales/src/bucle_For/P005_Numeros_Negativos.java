// EJERCICIO 5
// Escriba un programa que pregunte cuántos 
// números se van a introducir, pida esos números 
// y escriba cuántos negativos ha introducido.

package bucle_For;
import java.util.Scanner;
public class P005_Numeros_Negativos {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int contabilidad=0;
		int puntero=0;
		int valor=0;
		int contar=0;
		System.out.println("NUMEROS NEGATIVOS");
		while(contabilidad<=0)
		{
			System.out.println("Indique cuantos numeros va a introducir:");
			contabilidad=numeros.nextInt();
			if(contabilidad<=0)
			{
				System.out.println("¡Imposible!");
			}
		}
		for(puntero=1;puntero<=contabilidad;puntero++)
		{
			System.out.print("Introduzca el numero "+puntero+": ");
			valor=numeros.nextInt();
			System.out.println("");
			if(valor<=0)
			{
				contar=contar+1;
			}
		}
		if(contar==0)
		{
			System.out.println("No se ha escrito ningun numero negativo");
		}
		else
		{
		System.out.println("Ha escrito "+contar+" numeros negativos");
		}
	}
}
