package excepcionesJava002;

import java.util.Scanner;
import java.util.*;
public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Qu� deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		if (decision==1){	
			try {   //Captura el m�todo que se intenta ejecutar sin provocar errores
			   pedirDatos();
			   } catch (InputMismatchException e) {
				   System.out.println("El dato introducido no es un n�mero entero.");
				   e.printStackTrace(); // Imprime la traza del error
				   
			   }
		}else{	
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
		System.out.println("Hemos terminado");
	}
	static void pedirDatos() throws InputMismatchException 
	{			
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introduce tu nombre, por favor");
	String nombre_usuario=entrada.nextLine();
	System.out.println("Introduce edad, por favor");
	int edad=entrada.nextInt();		
	System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");		
		entrada.close();
	}	
}

