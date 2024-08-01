// Escriba un programa que pida primero un número par y a 
// continuación un numero impar (positivos o negativos). 
// En cada petición, si el valor no es correcto semostrará un aviso.

package condicionales_propuestos;
import java.util.Scanner;

public class Par_Impar_Parte_4 {

	public static void main(String[] args) {
        Scanner numeros= new Scanner(System.in);
        int contador=0;
        int numero_impar=0;
        int numero_par=0;
        contador=contador+1;
    do{
		System.out.println("");
        System.out.println("PAR E IMPAR 4");
        System.out.println("");
        System.out.println("Introduzca un numero par, positivo o negativo");
        numero_par=numeros.nextInt();
        if(numero_par%2!=0)  //Comprobacion de que no es par
        {
            System.out.println("No ha escrito un numero par correctamente");
            System.out.println("");
            System.out.println("Introduzca un numero impar, positivo o negativo");
            numero_impar=numeros.nextInt();
            if(numero_impar%2==0 && numero_par%2!=0)  //En el caso de que no sea impar pero si par
            {
                System.out.println("No ha escrito un numero impar correctamente");
                System.out.println("Ejecute el programa de nuevo para reintentarlo");
                System.out.println("");
            }  //(Caso de que si que sea impar)
        }
        
        if(numero_par%2==0)  //Comprobacion de que no es par
        {
            System.out.println("Introduzca un numero impar, positivo o negativo");
            numero_impar=numeros.nextInt();
            if(numero_impar%2==0 && numero_par%2==0)  //En el caso de que no sea impar pero si par
            {
                System.out.println("No ha escrito un numero impar correctamente");
                System.out.println("Ejecute el programa de nuevo para reintentarlo");
                System.out.println("");
            }  //(Caso de que si que sea impar)
            else if(numero_impar%2!=0 && numero_par%2==0)  //En el caso de que sea impar y par
            {
                System.out.println("Gracias por su colaboracion");
                System.out.println("");
            }
        }
     contador=contador+1;
     }while(contador<4);
	}
}
