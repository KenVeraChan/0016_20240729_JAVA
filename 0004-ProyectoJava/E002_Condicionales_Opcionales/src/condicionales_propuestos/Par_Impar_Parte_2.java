// Escriba un programa que pida primero un n�mero par (positivo o negativo) 
// y si el valor no es correcto, muestre un aviso. 
// Si el valor es correcto, pedir� un n�meroimpar (positivo o negativo) 
// y si el valor no es correcto, mostrar� un aviso.

package condicionales_propuestos;
import java.util.Scanner;

public class Par_Impar_Parte_2 {

	public static void main(String[] args) {
        Scanner numeros= new Scanner(System.in);
        int contador=0;
        int numero_impar=0;
        int numero_par=0;
        contador=contador+1;
    do{
		System.out.println("");
        System.out.println("PAR E IMPAR 2");
        System.out.println("");
        System.out.println("Introduzca un numero par, positivo o negativo");
        numero_par=numeros.nextInt();
        if(numero_par%2!=0)  //Comprobacion de que no es par
        {
            System.out.println("No ha escrito un numero par correctamente");
            System.out.println("");
            System.out.println("Ejecute de nuevo el programa!");
            System.out.println("");
        }
        else{  //Caso de que si lo sea
            System.out.println("Introduzca un numero impar, positivo o negativo");
            numero_impar=numeros.nextInt();
            if(numero_impar%2==0)  //En el caso de que no sea impar
            {
                System.out.println("No ha escrito un numero impar correctamente");
                System.out.println("");
            }  //(Caso de que si que sea impar)
            else
            {
                System.out.println("Gracias por su colaboracion");
                System.out.println("");
            }
        }
     contador=contador+1;
     }while(contador<4);
	}

}
