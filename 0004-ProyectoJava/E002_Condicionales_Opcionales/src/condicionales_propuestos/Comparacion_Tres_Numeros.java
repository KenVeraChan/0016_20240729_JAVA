// Escriba un programa que pida tres números y que escriba si 
// son los tres iguales, si hay dos iguales o si son los tres distintos.

package condicionales_propuestos;
import java.util.Scanner;

public class Comparacion_Tres_Numeros {

	public static void main(String[] args) {
	     Scanner numeros= new Scanner(System.in);
	     double a=0.0;   //Numero a
	     double b=0.0;   //Numero b
	     double c=0.0;   //Numero c

	     System.out.println("COMPARADOR DE TRES NUMEROS");
	     System.out.println("Introduzca el primer numero:");
	     a= numeros.nextDouble();
	     System.out.println("Introduzca el segundo numero:");
	     b= numeros.nextDouble();
	     System.out.println("Introduzca el tercer numero:");
	     c= numeros.nextDouble();
	     if(a==b && a==c)
	     {
	         System.out.println("Los tres numeros son iguales");
	     }
	     if(a==b||a==c||b==c)
	     {
	         if (a==b)
	         {
	         System.out.println("Los numero "+a+" y "+b+" son iguales");
	         }
	         if (a==c)
	         {
	         System.out.println("Los numero "+a+" y "+c+" son iguales");
	         }
	         if (b==c)
	         {
	         System.out.println("Los numero "+b+" y "+c+" son iguales");
	         }
	     }
	     if(a!=b && a!=c && b!=c)
	     {
	     System.out.println("Todos los numeros son distintos");    
	     } 
		
		
	}

}
