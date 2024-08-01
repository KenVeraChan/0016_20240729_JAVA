// Escriba un programa que pida primero un número par y a 
// continuación un numero impar (positivos o negativos). 
// En caso de que uno o los dos valores no seancorrectos, 
// se mostrarán uno o dos avisos.

package condicionales_propuestos;
import java.util.Scanner;

public class Par_Impar_Parte_3 {

	public static void main(String[] args) {
        Scanner numeros= new Scanner(System.in);
        int contador=0;
        int numero_impar=0;
        int numero_par=0;
        contador=contador+1;
    do{
		System.out.println("");
        System.out.println("PAR E IMPAR 3");
        System.out.println("");
        System.out.println("Introduzca un numero par, positivo o negativo");
        numero_par=numeros.nextInt();
        System.out.println("Introduzca un numero impar, positivo o negativo");
        numero_impar=numeros.nextInt();
        if(numero_par%2!=0 && numero_impar%2!=0)  
        {   //Comprobacion de: NO PAR PERO SI IMPAR 
            System.out.println("No ha escrito el numero par correctamente");
            System.out.println("Ejecute de nuevo el programa!");
            System.out.println("");
        }
        if(numero_par%2!=0 && numero_impar%2==0)  
        {   //Comprobacion de: NO PAR Y NO IMPAR 
            System.out.println("No ha escrito ni el numero par ni el impar correctamente");
            System.out.println("Ejecute de nuevo el programa!");
            System.out.println("");
        }
        if(numero_par%2==0 && numero_impar%2!=0)  
        {   //Comprobacion de: SI PAR y SI IMPAR 
            System.out.println("Gracias por su colaboración!");
            System.out.println("");
        }
        if(numero_par%2==0 && numero_impar%2==0)  
        {   //Comprobacion de: SI PAR PERO NO IMPAR 
            System.out.println("No ha escrito el numero impar correctamente");
            System.out.println("Ejecute de nuevo el programa!");
            System.out.println("");
        }
     contador=contador+1;
     }while(contador<4);

	}

}
