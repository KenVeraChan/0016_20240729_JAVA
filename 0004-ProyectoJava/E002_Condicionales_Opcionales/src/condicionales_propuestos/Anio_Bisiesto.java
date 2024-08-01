//Escriba un programa que pida un anio y diga si es bisiesto o no
// Se recuerda que los años bisiestos son múltiplos de 4, pero los 
// múltiplos de 100 no lo son, aunque los múltiplos de 400 sí.

package condicionales_propuestos;

import java.util.Scanner;
public class Anio_Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner numeros= new Scanner(System.in);
	     int anio=0;   //Anio

	     System.out.println("DECIR SI ES ANIO BISIESTO O NO");
	     System.out.println("Introduzca el ANIO:");
	     anio= numeros.nextInt();
	    if((anio%4==0 || anio%400==0)&& anio%100!=0)
	    {
	        System.out.println("El anio " +anio+" SI es bisiesto, porque es múltiplo de 4 pero no de 100");
	    }
	    if (anio%400!=0 && anio%100==0)
	    {
	        System.out.println("El anio " +anio+" NO es bisiesto, porque es multiplo de 100 pero no de 400");
	    }
	    if (anio%4!=0 && anio%100==0)
	    {
	        System.out.println("El anio " +anio+" NO es bisiesto, porque es multiplo de 100 pero no de 4");
	    }
	    if (anio%400==0)
	    {
	        System.out.println("El anio " +anio+" SI es bisiesto, porque es multiplo de 400");
	    }
	}

}
