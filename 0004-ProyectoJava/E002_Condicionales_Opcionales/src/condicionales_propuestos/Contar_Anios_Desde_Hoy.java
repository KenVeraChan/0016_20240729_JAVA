// Escriba un programa que pida el a�o actual y un a�o cualquiera y
// que escriba cu�ntos a�os han pasado desde ese a�o o cu�ntos 
// a�os faltan para llegar a ese a�o.

package condicionales_propuestos;
import java.util.Scanner;

public class Contar_Anios_Desde_Hoy {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int anio_actual=0;   //Numero a
		int anio_intro=0;   //Numero b
		int anios_restantes=0;  //Restos de anios desde el actual
		System.out.println("COMPARADOR DE A�OS");
		System.out.println("�En que a�o estamos?");
		anio_actual= numeros.nextInt();
		System.out.println("Introduzca un nuevo a�o cualquiera:");
		anio_intro= numeros.nextInt();
		
		if(anio_actual<anio_intro)
		{
			anios_restantes=anio_intro-anio_actual;
			System.out.println("Faltan "+anios_restantes+" a�os para llegar");
		}
		
		if(anio_actual>anio_intro)
		{
			anios_restantes=anio_actual-anio_intro;
			System.out.println("Desde el "+anio_intro+" han pasado "+anios_restantes+" a�os");
		}
		
		if(anio_actual==anio_intro)
		{
			System.out.println("Los a�os son los mismos");
		}
	}
}
