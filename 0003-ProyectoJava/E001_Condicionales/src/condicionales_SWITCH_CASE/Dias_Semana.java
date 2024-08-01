// EJERCICIO 1
// Con un número del 1 al 7 decir a que día de la semana corresponde

package condicionales_SWITCH_CASE;
import java.util.Scanner;


public class Dias_Semana {

	public static void main(String[] args) {
		Scanner dia_semana= new Scanner(System.in);
		int dia=0;
		do {
		System.out.println("");
		System.out.println("Introduzca un número para decir el día de la semana");
		dia= dia_semana.nextInt();
		System.out.println("");
		}while(dia<0 || dia>7);
		switch(dia)
		{
			case 1: System.out.println("El día "+dia+" es Lunes"); break;
			case 2: System.out.println("El día "+dia+" es Martes"); break;
			case 3: System.out.println("El día "+dia+" es Miércoles"); break;
			case 4: System.out.println("El día "+dia+" es Jueves"); break;
			case 5: System.out.println("El día "+dia+" es Viernes"); break;
			case 6: System.out.println("El día "+dia+" es Sábado"); break;
			case 7: System.out.println("El día "+dia+" es Domingo"); break;
			default: break;
		}
	}

}
