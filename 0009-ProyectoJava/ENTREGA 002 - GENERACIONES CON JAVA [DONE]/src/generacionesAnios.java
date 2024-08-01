import java.util.Scanner;

public class generacionesAnios {
	public static void main(String[] args) {
		generacion edades= new generacion();
		Scanner peticion= new Scanner(System.in);
		long anio=0;   //Si se introduce el año 0 sale del programa
		int semaforo=0;  //predice si llegado a diez veces preguntado sale o no del do while
		do {
			System.out.println("");
			System.out.println("Introduzca un año para decir la generacion a la que pertenece:");
			System.out.println("");
			anio=peticion.nextLong();			
			edades.setanio(anio);   //Se le envia el anio
			semaforo=edades.comprobante();
		}while(anio!=0 && semaforo!=1);
		System.out.println("Fin del programa");
	}
}
