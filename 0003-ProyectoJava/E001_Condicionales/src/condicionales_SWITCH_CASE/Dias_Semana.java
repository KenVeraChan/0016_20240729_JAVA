// EJERCICIO 1
// Con un n�mero del 1 al 7 decir a que d�a de la semana corresponde

package condicionales_SWITCH_CASE;
import java.util.Scanner;


public class Dias_Semana {

	public static void main(String[] args) {
		Scanner dia_semana= new Scanner(System.in);
		int dia=0;
		do {
		System.out.println("");
		System.out.println("Introduzca un n�mero para decir el d�a de la semana");
		dia= dia_semana.nextInt();
		System.out.println("");
		}while(dia<0 || dia>7);
		switch(dia)
		{
			case 1: System.out.println("El d�a "+dia+" es Lunes"); break;
			case 2: System.out.println("El d�a "+dia+" es Martes"); break;
			case 3: System.out.println("El d�a "+dia+" es Mi�rcoles"); break;
			case 4: System.out.println("El d�a "+dia+" es Jueves"); break;
			case 5: System.out.println("El d�a "+dia+" es Viernes"); break;
			case 6: System.out.println("El d�a "+dia+" es S�bado"); break;
			case 7: System.out.println("El d�a "+dia+" es Domingo"); break;
			default: break;
		}
	}

}
