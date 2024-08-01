// Mejore el programa anterior haciendo que cuando 
// la diferencia sea exactamente un año, escriba la frase en singular

package condicionales_propuestos;
import java.util.Scanner;

public class Contar_Anios_Desde_Hoy_1_Anio {

	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int anio_actual=0;   //Numero a
		int anio_intro=0;   //Numero b
		int anios_restantes=0;  //Restos de anios desde el actual
		System.out.println("COMPARADOR DE AÑOS - VER SI HAY 1 AÑO DE DIFERENCIA");
		System.out.println("¿En que año estamos?");
		anio_actual= numeros.nextInt();
		System.out.println("Introduzca un nuevo año cualquiera:");
		anio_intro= numeros.nextInt();
		
		if(anio_actual<anio_intro)
		{
			anios_restantes=anio_intro-anio_actual;
			if(anios_restantes==1)
			{
				System.out.println("Falta "+anios_restantes+" año para llegar");
			}	
			if(anios_restantes>1)
			{
				System.out.println("Faltan "+anios_restantes+" años para llegar");
			}
		}		
		if(anio_actual>anio_intro)
		{
			anios_restantes=anio_actual-anio_intro;
			if(anios_restantes==1)
			{
				System.out.println("Ha pasado "+anios_restantes+" año desde entonces");
			}	
			if(anios_restantes>1)
			{
				System.out.println("Han pasado "+anios_restantes+" años desde entonces");
			}
		}	
		if(anio_actual==anio_intro)
		{
			System.out.println("Los años son los mismos");
		}
	}
}
