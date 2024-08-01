// EJERCICIO 4
// Con una letra que contiene la variable estado decir el estado civil de la persona

package condicionales_SWITCH_CASE;
import java.util.Scanner;

public class Estado_Civil_Persona {

	public static void main(String[] args) {
		Scanner identidad= new Scanner(System.in);
		String estado="";
		int estado_civil=0;
		System.out.println("Indique su estado civil");
		estado= identidad.nextLine();  //Peticion de String por teclado
		
		// Al ser la STRING una variable de tipo OBJETO tiene sus propios métodos de uso para
		// cadenas de caracteres que se comparan para verificar si son iguales
		// Se transforma a una variable numerica para la posterior asignación en el SWITCH
		
		if(estado.equals("C") || estado.equals("c"))
		{
			estado_civil=1;
		}
		if(estado.equals("S") || estado.equals("s"))
		{
			estado_civil=2;
		}
		if(estado.equals("D") || estado.equals("d"))
		{
			estado_civil=3;
		}
		if(estado.equals("V") || estado.equals("v"))
		{
			estado_civil=4;
		}
		if(estado.equals("X") || estado.equals("x"))
		{
			estado_civil=5;
		}
		if(estado.equals("U") || estado.equals("u"))
		{
			estado_civil=6;
		}
		
		switch(estado_civil)
		{
		case 1: System.out.println("Su estado es CASADO/A"); break;
		case 2: System.out.println("Su estado es SOLTERO/A"); break;
		case 3: System.out.println("Su estado es DIVORCIADO/A"); break;
		case 4: System.out.println("Su estado es VIUDO/A"); break;
		case 5: System.out.println("Su estado es SEPARADO/A"); break;
		case 6: System.out.println("Su estado es UNIÓN DE HECHO"); break;
		default: System.out.println("Opción mal elegida"); break;
		}
	}

}
