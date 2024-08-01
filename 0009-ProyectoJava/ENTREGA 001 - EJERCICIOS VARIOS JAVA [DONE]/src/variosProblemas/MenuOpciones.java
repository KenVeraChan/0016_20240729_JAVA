package variosProblemas;
import java.util.Scanner;

public class MenuOpciones {
	public static void main(String[] args) {
		Scanner dato= new Scanner(System.in);
		MenuExpuesto opciones= new MenuExpuesto();
		int eleccion=0;   //Variable que sera la que elija la opcion de las 10 ofrecidas
		int elegir=0;     //Seguir o abandonar el programa
		do {
		opciones.OpcionesPropuestas();
		eleccion=dato.nextInt();
		opciones.setdecisiones(eleccion);
		elegir=opciones.geteleccion();
		}while(elegir!=0);
		System.out.println("Fin del programa!");
		dato.close();   //Se cierra la llamada a Scanner
	}
}
