// EJERCICIO HUNDIR LA FLOTA
// Los barcos que se colocarán serán de las siguientes características
// Un barco de 4 casillas de longitud
// Un barco de 3 casillas de longitud
// Un barco de 2 casillas de longitud
// letra M: Mar
// letra B: Barco de 4 casillas
// letra V: Velero de 3 casillas
// letra P: Pesquero de 2 casillas
// letra X: Barco de cualquier tipo alcanzado

package P001_Juego_HF;
import java.util.Scanner;
public class hundir_la_flota {
	public static void main(String[] args) {
		String cuadro[][] = new String[5][5];
		String cuadro_usuario[][]= new String[5][5];
		Scanner pivotes= new Scanner(System.in);
		int f[]= new int[2];
		int c[]= new int[2];
		int fila=0;		//Fila de los Arrays
		int columna=0;  //Columna de los Arrays
		int direccion=0; //Direccion hacia donde se dibujara el barco
		int contador=0; //Longitud del barco
		int barco_dos=0;  //Variable para colocar aleatoriamente el barco de dos unidades, pesquero
		int semaforo=0;   //Si es cero es luz verde y si es uno es luz roja
		System.out.println("");
		//Colocacion del barco de mayor tamanio: el de 4 casillas de longitud
		f[0]=(int) (Math.floor(Math.random()*5+0));     //Se genera la fila donde aparece
		c[0]=(int) (Math.floor(Math.random()*5+0));  //Se genera la columna en donde aparece
		direccion=(int) (Math.random() * 2 + 1);  //Se genera la columna en donde aparece
		barco_dos=(int) (Math.random() * 6 + 0);  //Contador hasta la colocacion del pesquero de 2 unidades
		//Se rellena la matriz de letras de M correspondiente al espacio ocupado por el MAR
		for (fila=0;fila<cuadro.length;fila++)
		{
			for(columna=0;columna<cuadro[fila].length;columna++) 
			{
				cuadro[fila][columna]="M";
			}
			System.out.println("");
		}
		//Se procede a la colocacion de letras de B correspondientes a espacios ocupados por BARCOS
		// CUADRANTE SUPERIOR IZQUIERDO
		if(f[0]<=1 && c[0]<=1)
		{
		  //SE GENERAN NUMEROS EN EL CUDRANTE OPUESTO: CUADRANTE INFERIOR DERECHO
		  // GENERADOR: int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M)); (Valor entre M y N, ambos incluidos)
			f[1]=(int) (Math.floor(Math.random()*2+3));  //Se genera la fila donde aparece
			c[1]=(int) (Math.floor(Math.random()*2+3));  //Se genera la columna en donde aparece
			f[2]=(int) (Math.floor(Math.random()*2+3));  //Se genera la fila donde aparece
			c[2]=(int) (Math.floor(Math.random()*2+3));  //Se genera la columna en donde aparece
			if(direccion==1)
			{  //Direccion ESTE	
				for(columna=c[0];columna<=4;columna++)
				{
					if(contador<4)
					{
						cuadro[f[0]][columna]="B";
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el OESTE
						cuadro[f[1]][c[1]-contador]="V";
					}
					contador=contador+1;
				}
			}
			if(direccion==2)
			{  //Direccion SUR
				for(fila=f[0];fila<=4;fila++)
				{
					if(contador<4)
					{
						cuadro[fila][c[0]]="B";	
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el NORTE
						cuadro[f[1]-contador][c[1]]="V";
					}
					contador=contador+1;
				}
			}
		}
		//Se procede a la colocacion de letras de B correspondientes a espacios ocupados por BARCOS
		// CUADRANTE SUPERIOR DERECHO
		if((f[0]<=1) && (c[0]>=3 && c[0]<=4))
		{
		  //SE GENERAN NUMEROS EN EL CUDRANTE OPUESTO: CUADRANTE INFERIOR DERECHO
		  // GENERADOR: int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M)); (Valor entre M y N, ambos incluidos)
			f[1]=(int) (Math.floor(Math.random()*2+3));     //Se genera la fila donde aparece
			c[1]=(int) (Math.floor(Math.random()*2+0));  //Se genera la columna en donde aparece
			if(direccion==1)
			{  //Direccion OESTE	
				for(columna=c[0];columna>=0;columna--)
				{
					if(contador<4)
					{
						cuadro[f[0]][columna]="B";
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el ESTE
						cuadro[f[1]][c[1]+contador]="V";
					}
					contador=contador+1;
				}
			}
			if(direccion==2)
			{  //Direccion SUR
				for(fila=f[0];fila<=4;fila++)
				{
					if(contador<4)
					{
						cuadro[fila][c[0]]="B";	
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el NORTE
						cuadro[f[1]-contador][c[1]]="V";
					}
					contador=contador+1;
				}
			}
		}		
		//Se procede a la colocacion de letras de B correspondientes a espacios ocupados por BARCOS
		// CUADRANTE INFERIOR DERECHO
		if((f[0]>=3 && f[0]<=4) && (c[0]>=3 && c[0]<=4))
		{
		  //SE GENERAN NUMEROS EN EL CUDRANTE OPUESTO: CUADRANTE INFERIOR DERECHO
		  // GENERADOR: int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M)); (Valor entre M y N, ambos incluidos)
			f[1]=(int) (Math.floor(Math.random()*2+0));     //Se genera la fila donde aparece
			c[1]=(int) (Math.floor(Math.random()*2+0));  //Se genera la columna en donde aparece
			if(direccion==1)
			{  //Direccion OESTE	
				for(columna=c[0];columna>=0;columna--)
				{
					if(contador<4)
					{
						cuadro[f[0]][columna]="B";
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el ESTE
						cuadro[f[1]][c[1]+contador]="V";
					}
					contador=contador+1;
				}
			}
			if(direccion==2)
			{  //Direccion NORTE
				for(fila=f[0];fila>=0;fila--)
				{
					if(contador<4)
					{
						cuadro[fila][c[0]]="B";	
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el SUR
						cuadro[f[1]+contador][c[1]]="V";
					}
					contador=contador+1;
				}
			}
		}		
		//Se procede a la colocacion de letras de B correspondientes a espacios ocupados por BARCOS
		// CUADRANTE INFERIOR IZQUIERDO
		if((f[0]>=3 && f[0]<=4) && (c[0]>=0 && c[0]<=1))
		{
		  //SE GENERAN NUMEROS EN EL CUDRANTE OPUESTO: CUADRANTE INFERIOR DERECHO
		  // GENERADOR: int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M)); (Valor entre M y N, ambos incluidos)
			f[1]=(int) (Math.floor(Math.random()*2+0));     //Se genera la fila donde aparece
			c[1]=(int) (Math.floor(Math.random()*2+3));  //Se genera la columna en donde aparece
			if(direccion==1)
			{  //Direccion ESTE	
				for(columna=c[0];columna<=4;columna++)
				{
					if(contador<4)
					{
						cuadro[f[0]][columna]="B";
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el OESTE
						cuadro[f[1]][c[1]-contador]="V";
					}
					contador=contador+1;
				}
			}
			if(direccion==2)
			{  //Direccion NORTE
				for(fila=f[0];fila>=0;fila--)
				{
					if(contador<4)
					{
						cuadro[fila][c[0]]="B";	
					}
					if (contador<3)
					{   // Colocacion de los dos barcos de 3 unidades 
						//Hacia el SUR
						cuadro[f[1]+contador][c[1]]="V";
					}
					contador=contador+1;
				}
			}
		}
		//Se procede a la colocacion de letras de B correspondientes a espacios ocupados por BARCOS
		// SI 0<=f<2 y c=2 posicion NORTE a SUR en horizontal
		if(c[0]==2)
		{
			f[0]=0;  //Para simplificar la colocacion en toda la columna sin parametrizar tanto
		  //SE GENERAN NUMEROS EN EL CUDRANTE OPUESTO: CUADRANTE INFERIOR DERECHO
		  // GENERADOR: int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M)); (Valor entre M y N, ambos incluidos)
			f[1]=0;	 
			 if(direccion==1)
				{  //Una casilla mas al SUR
				 c[1]=(int) (Math.floor(Math.random()*2+0));  //Barco de 3 unidades a la izquierda
					for(fila=f[0]+1;fila<=4;fila++)
					{
						if(contador<4)
						{
							cuadro[fila][c[0]]="B";
						}
						if (contador<3)
						{   // Colocacion de los dos barcos de 3 unidades 
							//Hacia el SUR tambien
							cuadro[f[1]+contador][c[1]]="V";
						}
						contador=contador+1;
					}
				}
				if(direccion==2)
				{  //Casilla NORMAL
				c[1]=(int) (Math.floor(Math.random()*2+3));  //Barco de 3 unidades a la derecha
					for(fila=f[0];fila<=4;fila++)
					{
						if(contador<4)
						{
							cuadro[fila][c[0]]="B";
						}
						if (contador<3)
						{   // Colocacion de los dos barcos de 3 unidades 
							//Hacia el SUR tambien
							cuadro[f[1]+contador][c[1]]="V";
						}
						contador=contador+1;
					}
				}
		}		
		//Se procede a la colocacion de letras de B correspondientes a espacios ocupados por BARCOS
		// SI f=2 y 0<=c<4 posicion OESTE a ESTE en horizontal
		if(f[0]==2)
		{
			c[0]=0;  //Para simplificar la colocacion en toda la columna sin parametrizar tanto
		  // GENERADOR: int valorEntero = (int) (Math.floor(Math.random()*(N-M+1)+M)); (Valor entre M y N, ambos incluidos)
			c[1]=0;
				if(direccion==1)
				{  //Una casilla mas al ESTE
				f[1]=(int) (Math.floor(Math.random()*2+0));  //Barco de 3 unidades encima
					for(columna=c[0]+1;columna<=4;columna++)
					{
						if(contador<4)
						{
							cuadro[f[0]][columna]="B";
						}
						if (contador<3)
						{   // Colocacion de los dos barcos de 3 unidades 
							//Hacia el ESTE tambien
							cuadro[f[1]][c[1]+contador]="V";
						}
						contador=contador+1;
					}
				}
				if(direccion==2)
				{  //Una casilla mas al ESTE
				f[1]=(int) (Math.floor(Math.random()*2+3));  //Barco de 3 unidades encima
					for(columna=c[0];columna<=4;columna++)
					{
						if(contador<4)
						{
							cuadro[f[0]][columna]="B";
						}
						if (contador<3)
						{   // Colocacion de los dos barcos de 3 unidades 
							//Hacia el ESTE tambien
							cuadro[f[1]][c[1]+contador]="V";
						}
						contador=contador+1;
					}
				}
		}		
		
		//COLOCACION DEL BARCO DE DOS UNIDADES: PESQUERO
		contador=0;   //Reinicio de la variable de contaje
		for (fila=0;fila<cuadro.length;fila++)
		{
			for(columna=0;columna<cuadro[fila].length;columna++) 
			{
				if(cuadro[fila][columna].equals("M")==true && contador>barco_dos && semaforo==0)
				{
				  //Si no encuentra letras de B y V, el contador supera la casilla buscada y además el semaforo esta abierto
				  if(fila!=0 && semaforo==0)
				  {
				     if(cuadro[fila][columna].equals("M")==true && cuadro[fila-1][columna].equals("M")==true)
				     {
					    //HACIA EL NORTE: Colocacion del barco pesquero. No puede ser FILA 0 porque no puede subir hacia arriba
					    cuadro[fila][columna]="P";
					    cuadro[fila-1][columna]="P";
				     }
				  }
				  if(columna!=4 && semaforo==0) 
				  {
					 if(cuadro[fila][columna].equals("M")==true && cuadro[fila][columna+1].equals("M")==true)
					  {
						  //HACIA EL ESTE: Colocacion del barco pesquero. No puede ser COLUMNA 4 porque no puede subir hacia la derecha
						  cuadro[fila][columna]="P";
						  cuadro[fila][columna+1]="P";
					  }
			  	  }
				  if(fila!=4 && semaforo==0)
				  {
					  if(cuadro[fila][columna].equals("M")==true && cuadro[fila+1][columna].equals("M")==true)
					  {
						  //HACIA EL SUR: Colocacion del barco pesquero. No puede ser FILA 4 porque no puede bajar hacia abajo
						  cuadro[fila][columna]="P";
						  cuadro[fila+1][columna]="P";
					  }
			  	  }
				  if(columna!=0 && semaforo==0)
				  {
					  if(cuadro[fila][columna].equals("M")==true && cuadro[fila][columna-1].equals("M")==true)
					  {
						  //HACIA EL OESTE: Colocacion del barco pesquero. No puede ser COLUMNA 4 porque no puede subir hacia la izquierda
						  cuadro[fila][columna]="P";
						  cuadro[fila][columna-1]="P";
					  }
			  	  }			
				  semaforo=1;   //Se cierra el semaforo
				}
				contador=contador+1;
			}
			System.out.println("");
		}
		
		//AHORA SE PROGRAMA LA COLOCACION DE LOS BARCOS POR PARTE DEL USUARIO
		System.out.println("");
		direccion=0; //Se reinicia la variable de direccion
		semaforo=0;  //Vuelve a estar en verde para el siguiente proceso
		int coordenada_X[]=new int[4];
		int coordenada_Y[]=new int[4];
		int tamanio_barco=4;
		
		//SE INICIALIZA LA MATRIZ DE AGUA CON "M"
		for (fila=0;fila<cuadro_usuario.length;fila++)
		{
			for(columna=0;columna<cuadro_usuario[fila].length;columna++) 
			{
				cuadro_usuario[fila][columna]="M";
			}
		}
			do {
				for(contador=0;contador<tamanio_barco;contador++)
				{
				// COORDENADA X
				System.out.println("Indique la coordenada X del barco de " + tamanio_barco+" unidades:");
				coordenada_X[contador]= pivotes.nextInt();
				
				// COORDENADA Y 
				System.out.println("Indique la coordenada Y del barco de " + tamanio_barco+" unidades:");
				coordenada_Y[contador]= pivotes.nextInt();
				//Se coloca en la matriz
					if (tamanio_barco==4)
					{
					cuadro_usuario[coordenada_X[contador]][coordenada_Y[contador]]="B";
					}
					if (tamanio_barco==3)
					{
					cuadro_usuario[coordenada_X[contador]][coordenada_Y[contador]]="V";
					}
					if (tamanio_barco==2)
					{
					cuadro_usuario[coordenada_X[contador]][coordenada_Y[contador]]="P";
					}
				}
				tamanio_barco=tamanio_barco-1;
			}while(tamanio_barco>1);
			
			//Se muestra el mapa con los tres barcos colocados automaticamente por la maquina
			System.out.println("  ------- LEYENDA DE BARCOS COLOCADOS -----");
			System.out.println("  ---- B: BARCAZA, BARCO DE 4 UNIDADES ----");
			System.out.println("  ---- V: VELERO, BARCO DE 3 UNIDADES -----");
			System.out.println("  ---- P: PESQUERO, BARCO DE 2 UNIDADES ---");
			System.out.println("");
			System.out.println("  -------- TABLERO DE LA MAQUINA ---------");
			System.out.println("");
			for (fila=0;fila<cuadro.length;fila++)
			{
				for(columna=0;columna<cuadro[fila].length;columna++) 
				{
					System.out.print("  "+cuadro[fila][columna]+"  ");
				}
				System.out.println("");
			}
			
			// SE GRAFICA LA COLOCACION DE LOS BARCOS DEL USUARIO
			//Se muestra el mapa con los tres barcos colocados automaticamente por la maquina
			System.out.println("");
			System.out.println("  ----------- TABLERO DEL USUARIO ----------");
			System.out.println("");
			for (fila=0;fila<cuadro_usuario.length;fila++)
			{
				for(columna=0;columna<cuadro_usuario[fila].length;columna++) 
				{
					System.out.print("  "+cuadro_usuario[fila][columna]+"  ");
				}
				System.out.println("");
			}	
			System.out.println("");
			System.out.println("------- COMIENZA EL JUEGO -------");
			System.out.println("------- LEYENDA DEL JUEGO -------");
			System.out.println("Letra X: Barco alcanzado o agua alcanzada");         
			System.out.println("Para abandonar la partida introducir coordenadas (-1,-1)");
			System.out.println("Suerte!");
			System.out.println("");
			semaforo=(int) (Math.random() * 2 + 0);    //Generador de numeros del 0 al 1
			fila=0;     //Se inicializa
			columna=0;  //Se inicializa
			if(semaforo==0)
			{
				System.out.println("COMIENZA LA MAQUINA JUGANDO");	
			}
			if(semaforo==1)
			{
				System.out.println("COMIENZA EL USUARIO JUGANDO");	
			}
				int ciclo=0;   //Para que no cambie el semaforo dentro de un mismo ciclo
				int flota[]= new int[15];   
				//Es un vector para identificar que barcos aun siguen sin hundir
				//Y la otra mitad del vector es para no sacar el mismo mensaje cuando se haya hundido un mismo barco
				//Se inicializa el vector de flota
				for(ciclo=0;ciclo<flota.length;ciclo++)
				{
					flota[ciclo]=0;
				}
				ciclo=0;
				//Para ver si algunas casillas ya han salido se empleará la matriz anterior para comprobar si hay letras "X" puestas
				int aviso=0; // esta variable obliga a sacar ora casilla cuando ya haya salido una anterior a la actual
				//Se inicializan los vectores
			while(fila>=0 && columna>=0 && semaforo!=2)
			{
					if(semaforo==0)
					{
					//TURNO DE LA MAQUINA
					System.out.println("TURNO DE LA MAQUINA");

					do {
						fila=(int) (Math.floor(Math.random()*5+0));     //Se genera la fila donde aparece
						columna=(int) (Math.floor(Math.random()*5+0));  //Se genera la columna en donde aparece
						//Primero se comprueba en el vector de casillas de la maquina si ya habia salido esa casilla
						//se comprueba fila y columna al mismo tiempo
							if(cuadro_usuario[fila][columna].equals("X")==true)
							{
								aviso=0;
							}
							else
							{
								aviso=1;
							}
					}while(aviso==0);
					
						semaforo=0; //Se devuelve el valor del SEMAFORO 
						//CASO DE QUE LA MAQUINA DAÑE LA FLOTA DEL USUARIO
						if(cuadro_usuario[fila][columna].equals("B")==true)
						{
							System.out.println("BARCAZA alcanzada:");
							cuadro_usuario[fila][columna]="X";
						}
						if(cuadro_usuario[fila][columna].equals("V")==true)
						{
							System.out.println("VELERO alcanzado:");
							cuadro_usuario[fila][columna]="X";	
						}
						if(cuadro_usuario[fila][columna].equals("P")==true)
						{
							System.out.println("PESQUERO alcanzado:");
							cuadro_usuario[fila][columna]="X";	
						}
						//CASO DE QUE LA MAQUINA NO DAÑE NINGUN BARCO DISPARANDO AL MAR
						if(cuadro_usuario[fila][columna].equals("M")==true)
						{
							System.out.println("AGUA alcanzada. Sin efecto alguno!");
							cuadro_usuario[fila][columna]="X";	
						}
					}
					if(semaforo==1)
					{
					System.out.println("TURNO DEL USUARIO");
					System.out.println("Introduzca la coordenada X:");
					fila=pivotes.nextInt();
					System.out.println("Introduzca la coordenada Y:");
					columna=pivotes.nextInt();
						if(fila==-1 && columna==-1)
						{
							break;   //Sale del programa al decidir, el usuario, terminar la partida.
						}
						//CASO DE QUE EL USUARIO DAÑE LA FLOTA DE LA MAQUINA
						if(cuadro[fila][columna].equals("B")==true)
						{
							System.out.println("BARCAZA alcanzada:");
							cuadro[fila][columna]="X";
						}
						if(cuadro[fila][columna].equals("V")==true)
						{
							System.out.println("VELERO alcanzado:");
							cuadro[fila][columna]="X";	
						}
						if(cuadro[fila][columna].equals("P")==true)
						{
							System.out.println("PESQUERO alcanzado:");
							cuadro[fila][columna]="X";	
						}
						if(cuadro[fila][columna].equals("M")==true)
						{
							System.out.println("AGUA alcanzada. Sin efecto alguno!");
							cuadro[fila][columna]="X";	
						}
					}
					//GESTION DE TURNOS PARA EL CICLO SIGUIENTE
					if(semaforo==0 && ciclo==0)
					{
					  //UNA VEZ QUE TERMINA LA MAQUINA SE LE DA PERMISO AL USUARIO A SEGUIR
					  semaforo=1;
					  ciclo=1;
					}
					if(semaforo==1 && ciclo==0)
					{
					  //UNA VEZ QUE TERMINA EL USUARIO SE LE DA PERMISO A LA MAQUINA A SEGUIR
					  semaforo=0;
					  ciclo=1;
					}
					//SE MUESTRA COMO VA QUEDANDO LA PARTIDA EN CADA JUGADA
					System.out.println("");
					System.out.println("  -------- TABLERO DE LA MAQUINA ---------");
					System.out.println("");
					for (fila=0;fila<cuadro.length;fila++)
					{
						for(columna=0;columna<cuadro[fila].length;columna++) 
						{
							System.out.print("  "+cuadro[fila][columna]+"  ");
						}
						System.out.println("");
					}
					
					// SE GRAFICA LA COLOCACION DE LOS BARCOS DEL USUARIO
					//Se muestra el mapa con los tres barcos colocados automaticamente por la maquina
					System.out.println("");
					System.out.println("  ----------- TABLERO DEL USUARIO ----------");
					System.out.println("");
					for (fila=0;fila<cuadro_usuario.length;fila++)
					{
						for(columna=0;columna<cuadro_usuario[fila].length;columna++) 
						{
							System.out.print("  "+cuadro_usuario[fila][columna]+"  ");
						}
						System.out.println("");
					}	
					System.out.println("");
					
					/////////////////////////////////////////////////////////////////
					
					//SE COMPRUEBAN AMBOS TABLEROS SI SE HAN HUNDIDO TODAS LAS FLOTAS
					//TABLERO DEL USUARIO
					direccion=0;   //contador de deteccion de barcos pendientes de hundir
					for (fila=0;fila<cuadro_usuario.length;fila++)
					{
						for(columna=0;columna<cuadro_usuario[fila].length;columna++) 
						{
							if(cuadro_usuario[fila][columna].equals("B")==true)
							{
							  flota[0]=flota[0]+1;  //BARCAZA SIN HUNDIR	
							}
							if(cuadro_usuario[fila][columna].equals("V")==true)
							{
							  flota[1]=flota[1]+1;  //VELERO SIN HUNDIR	
							}
							if(cuadro_usuario[fila][columna].equals("P")==true)
							{
							  flota[2]=flota[2]+1;  //PESQUERO SIN HUNDIR	
							}
						}
					}
					//TABLERO DE LA MAQUINA
					for (fila=0;fila<cuadro.length;fila++)
					{
						for(columna=0;columna<cuadro[fila].length;columna++) 
						{
							if(cuadro[fila][columna].equals("B")==true)
							{
							  flota[3]=flota[3]+1;  //BARCAZA SIN HUNDIR	
							}
							if(cuadro[fila][columna].equals("V")==true)
							{
							  flota[4]=flota[4]+1;  //VELERO SIN HUNDIR	
							}
							if(cuadro[fila][columna].equals("P")==true)
							{
							  flota[5]=flota[5]+1;  //PESQUERO SIN HUNDIR	
							}
						}
					}
					// REGISTRO DE BARCOS POSIBLEMENTE HUNDIDOS
						if(flota[0]==0 && flota[6]==0)
						{
							System.out.println("Ten cuidado, has perdido la BARCAZA");
							flota[6]=1;  //Si se detecta que ya no hay BARCAZA DEL USUARIO
						}
						if(flota[1]==0 && flota[7]==0)
						{
							System.out.println("Ten cuidado, has perdido el VELERO");
							flota[7]=1;  //Si se detecta que ya no hay VELERO DEL USUARIO
						}
						if(flota[2]==0 && flota[8]==0)
						{
							System.out.println("Ten cuidado, has perdido el PESQUERO");
							flota[8]=1;  //Si se detecta que ya no hay PESQUERO DEL USUARIO
						}
						if(flota[3]==0 && flota[9]==0)
						{
							System.out.println("En horabuena, has hundido la BARCAZA de la MAQUINA");
							flota[9]=1;  //Si se detecta que ya no hay BARCAZA DE LA MAQUINA
						}
						if(flota[4]==0 && flota[10]==0)
						{
							System.out.println("En horabuena, has hundido el VELERO de la MAQUINA");
							 flota[10]=1;  //Si se detecta que ya no hay VELERO DE LA MAQUINA
						}
						if(flota[5]==0 && flota[11]==0)
						{
							System.out.println("En horabuena, has hundido el PESQUERO de la MAQUINA");
							flota[11]=1;  //Si se detecta que ya no hay PESQUERO DE LA MAQUINA
						}
					// GESTION DE BARCOS HUNDIDOS Y POSIBLEMENTE, FIN DE PARTIDA POR HUNDIDOS
						if(flota[0]==0 && flota[1]==0 && flota[2]==0)
						{
							System.out.println("La MAQUINA te ha derrotado hundiendo tus barcos. Has perdido");
							semaforo=2;    //Se termina el bucle
						}
						if(flota[3]==0 && flota[4]==0 && flota[5]==0)
						{
							System.out.println("La MAQUINA ha perdido. Has ganado!!!");
							semaforo=2;   //Se termina el bucle	
						}
					fila=0;
					columna=0;
					//Se inicializa el vector de flota
					for(ciclo=0;ciclo<6;ciclo++)
					{     //No todo el vector porque desde el 6 en adelante estan los detectores de barcos hundidos
						  //Para que los mensajes de hundidos no salgan de nuevo
						flota[ciclo]=0;
					}
					ciclo=0;     //Una vez terminado el ciclo de ejecucion regresa con valor 0
			}
			System.out.println("Fin del juego!!!");
	}
}