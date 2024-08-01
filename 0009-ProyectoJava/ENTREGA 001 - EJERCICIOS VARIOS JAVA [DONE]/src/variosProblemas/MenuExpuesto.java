package variosProblemas;
import java.util.Scanner;

public class MenuExpuesto {

	private static int decisiones=0;
	private int eleccion=0;
	Scanner recibeDato= new Scanner(System.in);
	public MenuExpuesto()
	{
		
	}
	public void OpcionesPropuestas()
	{
		System.out.println("");
		System.out.println("");
		System.out.println("_________________________________________________________________");
		System.out.println("__________ ELEGIR UNA OPCION DE LAS 10 QUE SE PROPONEN __________");
		System.out.println("_________________________________________________________________");
		System.out.println("");
		System.out.println("1)  Programa para pedir por teclado el lado de un cuadrado");
		System.out.println("    y nos retorne el área por la terminal.");
		System.out.println("");
		System.out.println("2)  Programa para pedir por teclado dos notas y devuelva por");
		System.out.println("    la terminal la suma y el producto de las dos.");
		System.out.println("");
		System.out.println("3)  Programa para pedir dos números positivos y nos indique si");
		System.out.println("    es múltiplo de dos, de tres o de cinco.");
		System.out.println("");
		System.out.println("4)  Programa para pedir 10 números y nos imprima la suma de");
		System.out.println("    todos los números introducidos.");
		System.out.println("");
		System.out.println("5)  Programa para pedir solo números hasta que pongamos un 0, y en ese");
		System.out.println("    caso se termine el programa imprimiendo la suma de todos los números.");
		System.out.println("");
		System.out.println("6)  Programa para pedir números hasta que introduzcamos un 0, y nos muestre");
		System.out.println("    al final el número mas alto, el más pequeño y la media de todos los números introducidos.");
		System.out.println("");
		System.out.println("7)  Programa para pedir un numero de asteriscos horizontales y los verticales");
		System.out.println("    y los represente en la terminal.");
		System.out.println("");
		System.out.println("8)  Programa para pedir tres palabras y nos indique el numero de palabras diferentes o cuantas son iguales.");
		System.out.println("    El proceso se repetirá hasta que una de las palabras sea salir.");
		System.out.println("");
		System.out.println("9)  Programa para pedir que simule una hucha. El programa solicitará primero una cantidad,");
		System.out.println("    que será la cantidad de dinero que queremos ahorrar.");
		System.out.println("    A continuación, el programa solicitará una y otra vez las cantidades que se irán ahorrando,");
		System.out.println("    hasta que el total ahorrado iguale o supere al objetivo.");
		System.out.println("    No permitiendo que se escriban cantidades negativas.");
		System.out.println("");
		System.out.println("10) Sistema de delegados. Programa que pida tres nombres diferentes por la terminal.");
		System.out.println("    Una vez introducidos los tres, nos pide que puntuemos en diferentes rondas de");
		System.out.println("    forma acumulativa diferentes puntos a cada uno.");
		System.out.println("    El programa finalizara cuando se introduzca un numero negativo en cualquiera de los");
		System.out.println("    y nos dará el resultado final, ordenando la impresión de los nombres de mayor a menor");
		System.out.println("    indicando el número de rondas.");
		System.out.println("");
		System.out.println("Elegir opcion...");
		System.out.println("");
	}
	public int geteleccion()
	{
		System.out.println("Indique si desea continuar con el programa o abandonar(SEGUIR=1 y ABANDONAR=0):");
		eleccion=recibeDato.nextInt();
		return this.eleccion;
	}
	public void setdecisiones(int OpcionElegida)
	{	
		decisiones=OpcionElegida;
		switch(decisiones)
		{
		case 1:
		{
			Programa001 area= new Programa001();
			double lado=0;
			//Programa que pida por teclado la base y la altura de un cuadrado y nos retorne el área por la terminal.
			System.out.println("Introduzca la magnitud del lado del cuadrado:");
			lado=recibeDato.nextDouble();
			area.setPrograma001(lado);
			break;
		}
		case 2:
		{   //Programa que pida por teclado dos notas y nos retorne por la terminal la suma y el producto de las dos
			Programa002 calificacion=new Programa002();
			double notas1=0;
			double notas2=0;
			System.out.println("Introduzca la primera de las notas");
			notas1=recibeDato.nextDouble();
			System.out.println("Introduzca la segunda de las notas");
			notas2=recibeDato.nextDouble();
			calificacion.setCalificaciones(notas1,notas2);
			System.out.println("La suma de las calificaciones es: "+calificacion.getSuma(notas1, notas2)+" y el producto es de: "+calificacion.getProducto(notas1, notas2));
			break;
		}
		case 3:
		{   //Programa que nos pida dos números positivos y nos indique si es si es múltiplo de dos, de tres o de cinco.
			Programa003 mutiplo=new Programa003();
			int num1=0;
			int num2=0;
				do {
				System.out.println("Introduzca el primer numero positivo");
				num1=recibeDato.nextInt();
				}while(num1<=0);
				System.out.println("");
				do {
				System.out.println("Introduzca el segundo numero positivo");
				num2=recibeDato.nextInt();
				}while(num2<=0);
				System.out.println("");
			 mutiplo.setnumeros(num1,num2);
			break;
		}
		case 4:
		{   //Programa que nos pida 10 números y nos imprima la suma de todos los números introducidos.
				Programa004 datos= new Programa004();
				datos.daresultado();		
			break;
		}
		case 5:
		{   //Modifica el programa anterior para que solo deje de pedir números hasta que pongamos un 0, y en ese caso se termine el programa imprimiendo la suma de todos los números.
			    Programa004 datos= new Programa004();
			    datos.daresultadoNuevo();
			break;
		}
		case 6:
		{   //Programa que nos pida números hasta que introduzcamos un 0, y nos muestre al final el número mas alto, el más pequeño y la media de todos los números introducidos.
			    Programa004 datos= new Programa004();
			    datos.darMinMaxMedia();
			break;
		}
		case 7:
		{   //Programa que nos pida un numero de asteriscos horizontales y los verticales y los represente en la terminal
			Programa007 asteriscos= new Programa007();
			int num1=0;
			int num2=0;
				do {
				System.out.println("Introduzca el numero de FILAS de asteriscos");
				num1=recibeDato.nextInt();
				}while(num1<=0);
				System.out.println("");
				do {
				System.out.println("Introduzca el numero de COLUMNAS de asteriscos");
				num2=recibeDato.nextInt();
				}while(num2<=0);
			asteriscos.setFilaColumna(num1, num2);
			break;
		}
		case 8:
		{   //Programa que nos pida tres palabras y nos indique el numero de palabras diferentes o cuantas son iguales. El proceso se repetirá hasta que una de las palabras sea salir.
			Programa008 envio= new Programa008();
			String palabras[]= new String[3];
			recibeDato.nextLine();
			for(int i=0;i<palabras.length;i++)
			{
				System.out.println("Introduzca la palabra "+i+" del vector");
				palabras[i]=recibeDato.nextLine();
			}
			envio.llenaVector(palabras);
			break;
		}
		case 9:
		{   //Escriba un programa que simule una hucha. El programa solicitará primero 
			//una cantidad, que será la cantidad de dinero que queremos ahorrar. 
			//A continuación, el programa solicitará una y otra vez las cantidades que 
			//se irán ahorrando, hasta que el total ahorrado iguale o supere al objetivo. 
			//No permitiendo que se escriban cantidades negativas.
			Programa009 dinero= new Programa009();
			double ahorro=0;
			double objetivo=0;
			double ingreso=0;
			do {
				System.out.println("Introduzca el ahorro que lleva en la hucha");
				ahorro=recibeDato.nextDouble();
				System.out.println("Introduzca el nuevo objetivo de dinero deseado");
				objetivo=recibeDato.nextDouble();
			}while(objetivo<=0 || ahorro<=0);
			dinero.setaHucha(ahorro,0, objetivo);
			dinero.setObjetivo(objetivo);
			do {
					do {
					System.out.println("");
					System.out.println("Introduzca el nuevo ingreso para el ahorro (Ahorro>0)");
					ingreso=recibeDato.nextDouble();
					}while(ingreso<=0);
				ahorro=dinero.ingreso(ingreso);
				objetivo=dinero.getObjetivo();
			}while(ingreso<=0 || ahorro<objetivo);
			System.out.println("");
			break;
		}
		case 10:
		{   //Sistema de delegados. Programa que pida tres nombres diferentes por la terminal. 
			//Una vez introducidos los tres, nos pide que puntuemos en diferentes rondas de forma acumulativa diferentes
			//puntos a cada uno.
			//El programa finalizara cuando se introduzca un numero negativo en cualquiera de 
			//los nombres y nos dará el resultado final, ordenando la impresión de los nombres 
			//de mayor a menor e indicando el número de rondas.
			Programa010 deleg= new Programa010();
			deleg.introDelegados();
			deleg.introPuntos();
			break;
		}
		default:
		{
			System.out.println("No es una opción contemplada en el menú. Reelija de nuevo!");
			break;
		}
		
		}
	}
}
