package cargaArrays;
import java.util.Arrays;
import java.util.Scanner;

public class EleccionMenu {

	private int opcionElegida;
	private String letra="";
	private static int i=0; //Puntero de recorrido
	private static int j=0; //Puntero de revision
	private static int semaforo=0; //
	private static int contador=0;
	private static int llenado=0;    //comprueba cuantos elementos hay ya en el vector
	Scanner celdas = new Scanner(System.in);
	OpcionesVector opciones= new OpcionesVector();
	vectoresOscilantes vecLon= new vectoresOscilantes();
	
	public EleccionMenu()
	{
		//No hace nada
	}
	public void gestorOpciones(String vector[], int opcionElegida)
	{
		this.opcionElegida=opcionElegida;
		String palabra="";           //Palabra que se hallara en el vector
		String palabraBuscada="";    //Palabra que se reemplazara en el vector
		int indiceBuscado=0;         //Indice del elemento buscado para el vector

		switch(this.opcionElegida)
		{
			case 1:
			{	// 1) LLENAR EL ARRAY CON DUPLICADOS SI SE QUIERE
				//PARTE 1: COMPROBAR LA CANTIDAD DE ELEMTENTOS QUE YA TENIA EL VECTOR
				llenado=0;
				for(j=0;j<vector.length;j++)
				{
					if(vector[j].equals("")==false)
					{
						llenado=llenado+1;
					}
				}
				if(llenado==vector.length)
				{
					System.out.println("El vector esta lleno, no se pueden meter mas elementos!");
				}
				else
				{
					//PARTE 2: INTRODUCIR SEGUN EL LLENADO Y EL TAMAÑO DEL VECTOR 
					do {
					System.out.println("Introduzca el numero de elementos que quiere meter:"+" (Maximo: "+(vector.length-llenado)+")");
					contador=celdas.nextInt();
					}while(contador<0 || contador>vector.length-llenado);
					celdas.nextLine();
					for(i=llenado;i<llenado+contador;i++)
					{
							semaforo=0; //Se reinicia 
							System.out.println("Introduzca el elemento "+(i+1)+" del vector");
							palabra=celdas.nextLine();
						    vector[i]=palabra;
					}
				}
			   break;
			}
			case 2:
			{	// 2) LLENAR EL ARRAY SIN DUPLICADOS
				//PARTE 1: COMPROBAR LA CANTIDAD DE ELEMTENTOS QUE YA TENIA EL VECTOR
				llenado=0;
				for(j=0;j<vector.length;j++)
				{
					if(vector[j].equals("")==false)
					{
						llenado=llenado+1;
					}
				}
				if(llenado==vector.length)
				{
					System.out.println("El vector esta lleno, no se pueden meter mas elementos!");
				}
				else
				{
					//PARTE 2: INTRODUCIR SEGUN EL LLENADO Y EL TAMAÑO DEL VECTOR 
					do {
					System.out.println("Introduzca el numero de elementos que quiere meter:"+" (Maximo: "+(vector.length-llenado)+")");
					contador=celdas.nextInt();
					}while(contador<0 || contador>vector.length-llenado);
					celdas.nextLine();
					for(i=llenado;i<llenado+contador;i++)
					{
						do {
							semaforo=0; //Se reinicia 
							System.out.println("Introduzca el elemento "+(i+1)+" del vector: ");
							palabra=celdas.nextLine();
								for(j=0;j<vector.length;j++)
								{
									if(palabra.equals(vector[j])==true)
									{    //Comprueba si hay algun elemento del vector repetido con el dato entrante
										System.out.println("");
										System.out.println("La palabra que pretende introducir ya esta en el vector!");
										System.out.println("");
										semaforo=1;
									}
								}
						}while(semaforo==1);
						if(semaforo==0)
						{
						   vector[i]=palabra;
						}
					}
				}
				break;
			}
			case 3:
			{	// 3) LLENAR EL ARRAY UNO A UNO: INSERTAR UN SOLO NOMBRE DESPUES DEL ULTIMO INSERTADO
				semaforo=0;  //Se reinicia el valor del semaforo	
				llenado=0;   //Se reinicia el valor
				for(i=0;i<vector.length;i++)
				{
				   if(vector[i].equals("")==true && semaforo==0)
				   {
						System.out.println("Introduzca el elemento "+(i+1)+" del vector");
						vector[i]=celdas.nextLine();
						semaforo=1; /* SI LOGRA ENTRAR EN ESTE IF, SUPONE EL HABER PODIDO AGREGAR UN ELEMENTO MAS AL VECTOR */
				   }
				}
				   if(semaforo==0)  /*SUPONE QUE EL VECTOR ESTA COMPLETO Y NO HAY HUECOS VACIOS EN EL MISMO */
				   {				   
					   System.out.println("El vector esta completo, no se pueden meter nuevos elementos");
					   semaforo=1;  //ACTIVADA EL AVISO, SE ANULA 
				   }
				break;
			}
			case 4:
			{	//Cambia todas una letra en todo el array por la que le indiquemos
				//Parte 1: Se solicita la letra
				do{
				System.out.println("Introduzca una letra para cambiarla en todo el vector: (A-Z o a-z)");
				letra=celdas.nextLine();
				}while(letra.equals(".")==true || letra.equals(",")==true || letra.equals("-")==true || letra.equals(" ")==true);
				//Parte 2:
				for(i=0;i<vector.length;i++)
				{
					if(vector[i].equals("")==false)
					{
						StringBuilder v= new StringBuilder(vector[i]);
						for(j=0;j<v.length();j++)
						{
							semaforo=0;   //SI ENTRA EN UN IF NO ENTRARA EN EL OTRO
							if(v.charAt(j)==' ' && semaforo==0)
							{
							v.replace(j, j+1," ");   //Los espacios no se reemplazan, asi que pasa al siguiente caracter
							semaforo=1;
							}
							if(v.charAt(j)!=' ' && semaforo==0)
							{
							v.replace(j, j+1,letra);   //Reemplazamos la letra en todas las letras ya existentes
							semaforo=1;
							}
						}
						vector[i]=v.toString();     //Se mete en el vector el reemplazo ejecutado
					}
				}
				System.out.println("Letra puesta: "+letra);
				break;
			}
			case 5:
			{	//Quita todos los espacios que tenga una palabra al principio y/o al final
				for(i=0;i<vector.length;i++)
				{
					if(vector[i].equals("")==false)
					{
						StringBuilder v= new StringBuilder(vector[i]);
						for(j=0;j<v.length();j++)
						{
							semaforo=0;   //SI ENTRA EN UN IF NO ENTRARA EN EL OTRO
							if(v.charAt(j)==' ' && semaforo==0)
							{
							v.replace(j, j+1,"");   //Los espacios no se reemplazan, asi que pasa al siguiente caracter
							semaforo=1;
							}
							if(v.charAt(j)!=' ' && semaforo==0)
							{
							//No hacen nada porque es busqueda de espacios en blanco
							semaforo=1;
							}
						}
						vector[i]=v.toString();     //Se mete en el vector el reemplazo ejecutado
					}
				}
				break;
			}
			case 6:
			{	// 6) IMPRIMIR LISTA ORIGINAL
				for(i=0;i<vector.length;i++)
				{
					System.out.println((i+1)+") "+vector[i]);
				}
				break;
			}
			case 7:
			{	//Remplazar un nombre dandole la posición
				//Parte 1: Definir el tamaño del vector implicado
				llenado=0;   //Reiniciando la variable
				contador=0;  //Reiniciando la variable
				for(i=0;i<vector.length;i++)
				{
					llenado++;
				}
				System.out.println("Indique el índice del vector, cuya palabra quiere cambiar [0-"+(llenado-1)+"]");
				contador=celdas.nextInt();
				System.out.println("Indique la palabra que quiere introducir en la "+llenado+" celda");
				celdas.nextLine();
				palabra=celdas.nextLine();
				vector[contador]=palabra;
				break;
			}
			case 8:
			{	//Imprimir toda la lista en mayusculas
				for(i=0;i<vector.length;i++)
				{
				    //Convertir en mayusculas todos las palabras
					System.out.println((i+1)+") "+vector[i].toUpperCase());
				}
				break;
			}
			case 9:
			{	///Imprimir toda la lista en minusculas
				for(i=0;i<vector.length;i++)
				{
				    //Convertir en mayusculas todos las palabras
					System.out.println((i+1)+") "+vector[i].toLowerCase());
				}
				break;
			}
			case 10:
			{	//Cambia un nombre que te doy por otro que tambien te doy
				//Parte 1: Busqueda de la palabra introducida
				System.out.println("Introducir el nombre para BUSCARLO en el vector");
				palabra=celdas.nextLine();
				System.out.println("Introducir el nombre para CAMBIARLO en el vector");
				palabraBuscada=celdas.nextLine();
				System.out.println("Iniciando la busqueda...");
				//Parte 2: hacer la busqueda
				contador=0;  //Reiniciando la variable para saber si se ha encontrado la palabra
					for(i=0;i<vector.length;i++)
					{
						if(vector[i].equals(palabra)==true)
						{
							vector[i]=palabraBuscada;
							contador=1;    //Se pone a 1 porque se ha encontrado sino sigue en 0
						}
					}
					if(contador==0)
					{
						System.out.println("No se ha encontrado la palabra buscada. No hubo reemplazo");
					}
					else 
					{
						System.out.println("Reempleazo ejecutado correctamente");
					}
				break;
			}
			case 11:
			{	//Decir la posicion de un nombre introducido
				//Parte 1: Busqueda de la palabra introducida
				System.out.println("Introducir el nombre para BUSCARLO en el vector");
				palabra=celdas.nextLine();
				System.out.println("Iniciando la busqueda...");
				//Parte 2: hacer la busqueda
				contador=0;  //Reiniciando la variable para saber si se ha encontrado la palabra
					for(i=0;i<vector.length;i++)
					{
						if(vector[i].equals(palabra)==true)
						{
							System.out.println("Encontrado en posicion: "+i);
							contador=1;    //Se pone a 1 porque se ha encontrado sino sigue en 0
						}
					}
					if(contador==0)
					{
						System.out.println("No se ha encontrado la palabra buscada. No existe!");
					}
				break;
			}
			case 12:
			{	//Vacia el array poniendo una cadena vacia en cada posición
				for(i=0;i<vector.length;i++)
				{
						vector[i]= "";
				}
				System.out.println("Vector borrado");
				break;
			}
			case 13:
			{	//Te doy un nombre y una posición y la remplazas en el array
				//Parte 1: Contar las celdas que se tienen en el vector
				llenado=0;   //Reiniciando la variable
				contador=0;  //Reiniciando la variable
				for(i=0;i<vector.length;i++)
				{
					llenado++;
				}
				do {
					System.out.println("Indique el índice del vector, cuya palabra quiere cambiar [0-"+(llenado-1)+"]");
					contador=celdas.nextInt();
				}while(contador<0 || contador>llenado);
				//Parte 2: Pedir palabra para introducir
				celdas.nextLine();   //Vacio del buffer
				System.out.println("Introducir la palabra para meter en el vector");
				palabra=celdas.nextLine();
				//Parte 3: Hacer el reemplazo
				for(i=0;i<vector.length;i++)
				{
					if(i==contador)
					{
						vector[i]=palabra;
					}
				}
				break;
			}
			case 14:
			{	//Escribe una palabra formada de la primera letra de cada una que tenemos en el array
				System.out.println("Se va a proceder a formar una palabra con las priemras letras de cada una");
				System.out.println("Mostraremos el vector completo para que se contemple el proceso");
				//Parte 1: Mostramos el vector
				for(i=0;i<vector.length;i++)
				{
					System.out.println(i+") "+vector[i]);
				}
				System.out.println("");
				//Parte 2: Sacamos las letras de las iniciales de cada uno
				for(i=0;i<vector.length;i++)
				{
					palabra=palabra+vector[i].charAt(0);
				}
				System.out.println("La palabra formada es: "+palabra);
				break;
			}
			case 15:
			{	//Cambia el tamaño del array
				//Parte 1: Se contabilizan las celdas que hay en total
				contador=0;
				for(j=0;j<vector.length;j++)
				{
						contador=contador+1;
				}
				//Parte 2: Nuevas celdas que se quieren meter
				llenado=0;    //Recoge el tamaño del vector
				do{
					System.out.println("Introduzca la cantidad de nuevas celdas que quiere meter al Vector:");
					llenado=celdas.nextInt();
				}while(llenado<0 || llenado>20);
				opciones.settamVector(llenado);    //Envia el nuevo tamaño del vector	
				
				//Parte 3: Actualizar el vector
				vector= Arrays.copyOf(vector, vector.length + llenado);
				System.out.println("");
				for(int i=0;i<vector.length;i++)
				{
					if(vector[i]==null)
					{
					vector[i]="";
					}
					System.out.println((i+1)+")"+vector[i]);  //SE RELLENA DE ESPACIOS VACIOS PARA PREPARAR EL VECTOR
				}	
				vecLon.setvectoresOscilantes(vector);
				break;
			}
			case 16:
			{	//Dime el número de caracteres que tiene una palabra si te doy su posición
				System.out.println("Indique el indice [0"+(vector.length-1)+"] para sacar número de caracteres");
				indiceBuscado=celdas.nextInt();  //Recoge el indice
				for(i=0;i<vector.length;i++)
				{
					if(i==indiceBuscado)
					{
						System.out.println("La frase: <"+vector[i]+"> tiene una longitud de: "+vector[i].length()+" caracteres.");
					}
				}
				break;
			}
			case 17:
			{	//Cuantos elementos tengo en el Array
				int espaciosOcupados=0;
				int espaciosVacios=0;
				for(i=0;i<vector.length;i++)
				{
					if(vector[i].equals("")==false)
					{
						espaciosOcupados++;
					}
					if(vector[i].equals("")==true)
					{
						espaciosVacios++;
					}
				}
				System.out.println("Lugares ocupados: "+espaciosOcupados);
				System.out.println("Lugares vacios: "+espaciosVacios);
				System.out.println("Tamaño del vector: "+(espaciosOcupados+espaciosVacios));
				break;
			}
			default:
			{
				//NO HACE NADA PORQUE NO EXISTEN MAS OPCIONES
				break;
			}
		}
	}
}
