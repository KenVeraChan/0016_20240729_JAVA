// EJERCICIO 2
// Con una nota calificarlo de suspenso, aprobado, …etc.

package condicionales_SWITCH_CASE;
import java.util.Scanner;

public class Calificaciones_Numeradas {

	public static void main(String[] args) {
		Scanner calificacion= new Scanner(System.in);
		int nota_obtenida=0;
		do {
		System.out.println("Introduzca su nota obtenida:");
		nota_obtenida= calificacion.nextInt();
		}while(nota_obtenida<0 || nota_obtenida>10);
		
		switch(nota_obtenida)
		{
		//Se pueden poner cases sin argumento pues todo depende del break incluido en el último
		case 1:
		case 2:
		case 3:
		case 4:
			{
			System.out.println("Su nota es de SUSPENSO");
			break;
			}
		case 5:
		case 6:
			System.out.println("Su nota es de APROBADO");
			break;
		case 7:
		case 8:
			System.out.println("Su nota es de NOTABLE");
			break;
		case 9:
			System.out.println("Su nota es de SOBRESALIENTE");
			break;
		case 10:
			System.out.println("Su nota es de MATRICULA DE HONOR");
			break;
		default:
			break;
		}
	}
}
