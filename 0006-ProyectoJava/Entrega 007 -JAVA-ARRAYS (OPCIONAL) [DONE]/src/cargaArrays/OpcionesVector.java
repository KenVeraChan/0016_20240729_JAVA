package cargaArrays;
import java.util.Scanner;
public class OpcionesVector {

	private int numOpcion=0;
	private int tamVector=0;
	private static int inicio=0;
	Scanner lectura= new Scanner(System.in);
	
	public OpcionesVector() 
	{
		//Constructor por defecto
	}
	public int getnumOpcion() 
	{
		salidaPreguntas();
		System.out.println("");
		do {
			this.numOpcion=lectura.nextInt();
			System.out.println("Su eleccion ha sido: "+this.numOpcion);
			
			if(this.numOpcion<0 || this.numOpcion>17)
			{
				System.out.println("");
				System.out.println("NO ha introducido una opci�n correcta: ");
				System.out.println("Vuelva a introducir una opci�n CORRECTA!");
				System.out.println("");
			}
		}while(this.numOpcion<0 || this.numOpcion>17);
		return this.numOpcion;
	}
	
	public int gettamVector() 
	{
		if(inicio==0)
		{
			do{
			System.out.println("");
			System.out.println("Introduzca el tama�o del vector de STRINGS [0<longitud<20]");
			System.out.println("");
			this.tamVector=lectura.nextInt();

				if(this.tamVector<0 || this.tamVector>20)
				{
					System.out.println("");
					System.out.println("NO ha introducido un tama�o correcto: "+ this.tamVector);
					System.out.println("");
				}
			}while(this.tamVector<=0);
		inicio+=1;  //Aumenta el valor de tamVector
		}
		if(inicio>0)
		{
			//No hace nada porque solo lo hace en la primera ejecuci�n
		}
		return this.tamVector;
	}
	public void settamVector(int tamVector) 
	{
		this.tamVector=tamVector;
	}

	public void salidaPreguntas()
	{
		System.out.println("");
		System.out.println("Selecciona una opci�n");
		System.out.println("----------------------");
		System.out.println("1. LLenar el Array");
		System.out.println("2. LLenar el Array sin duplicados");
		System.out.println("3. LLenar el Array uno a uno (inserar un solo nombre, despues del ultimo insertado)");
		System.out.println("4. Cambia todas una letra en todo el array por la que le indiquemos.");
		System.out.println("5. Quita todos los espacios que tenga una palabra al principio y/o al final");
		System.out.println("6. Imprimir lista original");
		System.out.println("7. Remplazar un nombre dandole la posici�n");
		System.out.println("8. Imprimir toda la lista en mayusculas");
		System.out.println("9. Imprimir toda la lista en minusculas");
		System.out.println("10. Cambia un nombre que te doy por otro que tambien te doy");
		System.out.println("11. dame la posici�n de un nombre que te indico");
		System.out.println("12. Vacia el array poniendo una cadena vacia en cada posici�n");
		System.out.println("13. Te doy un nombre y una posici�n y la remplazas en el array");
		System.out.println("14. Escribe una palabra formada de la primera letra de cada una que tenemos en el array");
		System.out.println("15. Cambia el tama�o del array");
		System.out.println("16. Dime el n�mero de caracteres que tiene una palabra si te doy su posici�n");
		System.out.println("17. Cuantos elementos tengo en el Array");
		System.out.println("0. Salir");
		System.out.println("");
	}
}