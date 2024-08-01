// Escriba un programa que pida el año actual y un año cualquiera y
// que escriba cuántos años han pasado desde ese año o cuántos 
// años faltan para llegar a ese año.

package condicionales_propuestos;
import java.util.Scanner;

public class Contar_Anios_Desde_Hoy {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int anio_actual=0;   //Numero a
		int anio_intro=0;   //Numero b
		int anios_restantes=0;  //Restos de anios desde el actual
		System.out.println("COMPARADOR DE AÑOS");
		System.out.println("¿En que año estamos?");
		anio_actual= numeros.nextInt();
		System.out.println("Introduzca un nuevo año cualquiera:");
		anio_intro= numeros.nextInt();
		
		if(anio_actual<anio_intro)
		{
			anios_restantes=anio_intro-anio_actual;
			System.out.println("Faltan "+anios_restantes+" años para llegar");
		}
		
		if(anio_actual>anio_intro)
		{
			anios_restantes=anio_actual-anio_intro;
			System.out.println("Desde el "+anio_intro+" han pasado "+anios_restantes+" años");
		}
		
		if(anio_actual==anio_intro)
		{
			System.out.println("Los años son los mismos");
		}
	}
}
