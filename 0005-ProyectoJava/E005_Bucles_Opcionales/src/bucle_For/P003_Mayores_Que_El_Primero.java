// EJERCICIO 3
// Escriba un programa que pregunte cuántos números 
// se van a introducir, pida esos números, y muestre 
// un mensaje cada vez que un número no sea mayor que elprimero.

package bucle_For;
import java.util.Scanner;
public class P003_Mayores_Que_El_Primero {
	public static void main(String[] args) {
			Scanner numeros= new Scanner(System.in);
			int contabilidad=0;
			int puntero=0;
			int valor_1=0;
			int valor_2=0;
			int activador=0;   //Para no preguntar de nuevo por el primer valor
			while(contabilidad<=0)
			{
				System.out.println("Indique cuantos numeros va a introducir:");
				contabilidad=numeros.nextInt();
				if(contabilidad<=0)
				{
					System.out.println("¡Imposible!");
				}
			}
			for(puntero=2;puntero<=contabilidad;puntero++)
			{
				if(valor_2<=valor_1 && activador!=0)
				{
					System.out.println("¡El "+valor_2+" no es mayor que "+valor_1+"!");
					System.out.println("Introduzca un numero mayor que "+valor_1);
					valor_2=numeros.nextInt();
				}
				if(valor_2>valor_1 && activador!=0)
				{
					System.out.println("Introduzca un numero mayor que "+valor_1);
					valor_2=numeros.nextInt();
				}
				if(activador==0)     //Para el primer lanzamiento del programa
				{
				System.out.println("Introduzca un primer valor");
				valor_1=numeros.nextInt();
				System.out.println("Introduzca un numero mayor que "+valor_1);
				valor_2=numeros.nextInt();
				activador=activador+1;  //Se incrementa el valor del activador para que no vuelva a entrar al IF
				}	
			}
			if(valor_2<=valor_1)
			{
				System.out.println("¡El "+valor_2+" no es mayor que "+valor_1+"!");
			}	
			System.out.println("Gracias por su colaboracion");			
	}
}
