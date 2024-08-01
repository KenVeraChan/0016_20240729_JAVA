// Escriba un programa que pida los coeficientes de una ecuaci�n 
// de primer grado (a x + b = 0) y escriba la soluci�n.
// Se recuerda que una ecuaci�n de primer grado puede no 
// tener soluci�n, tener una soluci�n �nica, o que todos los n�meros 
// sean soluci�n. Se recuerda que laf�rmula de las soluciones es x = -b / a

package condicionales_propuestos;
import java.util.Scanner;

public class Ecuacion_primer_grado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner numeros= new Scanner(System.in);
	     double a=0;   //No puede ser cero
	     double b=0;   //
	     double solucion=0.0;
	     
	     System.out.println("ECUACION DE PRIMER GRADO AX+B=0");
	     System.out.println("Introduzca el par�metro A:");
	     a= numeros.nextDouble();
	     System.out.println("Introduzca el par�metro B:");
	     b= numeros.nextDouble();
	     
	     if (a==0 && b==0)
	     {
	    	 System.out.println("La ecuaci�n: "+a+"X"+" + "+b+" =0  tiene infinitas soluciones");
	     }
	     if (a==0 && b!=0)
	     {
	    	 System.out.println("La ecuaci�n: "+a+"X"+" + "+b+" =0  no tiene solucion, no se puede dividir por 0");
	     }
	     if (a!=0 && b==0)   //String.format("%.2f", solucion) hace que se limite la cantidad de decimales
	     {
	    	 solucion=-b/a;
	    	 System.out.println("La ecuaci�n: "+a+"X"+" + "+b+" =0  tiene de solucion: "+String.format("%.2f", solucion));
	     }
	     if (a!=0 && b!=0)
	     {
	    	 solucion=-b/a;
	    	 System.out.println("La ecuaci�n: "+a+"X"+" + "+b+" =0  tiene de solucion: "+String.format("%.2f", solucion));
	     }
	}
}
