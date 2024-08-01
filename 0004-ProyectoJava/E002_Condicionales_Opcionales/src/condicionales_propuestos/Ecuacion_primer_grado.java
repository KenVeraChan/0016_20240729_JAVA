// Escriba un programa que pida los coeficientes de una ecuación 
// de primer grado (a x + b = 0) y escriba la solución.
// Se recuerda que una ecuación de primer grado puede no 
// tener solución, tener una solución única, o que todos los números 
// sean solución. Se recuerda que lafórmula de las soluciones es x = -b / a

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
	     System.out.println("Introduzca el parámetro A:");
	     a= numeros.nextDouble();
	     System.out.println("Introduzca el parámetro B:");
	     b= numeros.nextDouble();
	     
	     if (a==0 && b==0)
	     {
	    	 System.out.println("La ecuación: "+a+"X"+" + "+b+" =0  tiene infinitas soluciones");
	     }
	     if (a==0 && b!=0)
	     {
	    	 System.out.println("La ecuación: "+a+"X"+" + "+b+" =0  no tiene solucion, no se puede dividir por 0");
	     }
	     if (a!=0 && b==0)   //String.format("%.2f", solucion) hace que se limite la cantidad de decimales
	     {
	    	 solucion=-b/a;
	    	 System.out.println("La ecuación: "+a+"X"+" + "+b+" =0  tiene de solucion: "+String.format("%.2f", solucion));
	     }
	     if (a!=0 && b!=0)
	     {
	    	 solucion=-b/a;
	    	 System.out.println("La ecuación: "+a+"X"+" + "+b+" =0  tiene de solucion: "+String.format("%.2f", solucion));
	     }
	}
}
