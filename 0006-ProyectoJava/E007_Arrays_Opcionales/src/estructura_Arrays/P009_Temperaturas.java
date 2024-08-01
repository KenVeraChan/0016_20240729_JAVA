// EJERCICIO 9
// Queremos guardar la temperatura mínima y máxima de 5 días. 
// Realiza un programa que de la siguiente información:
// La temperatura media de cada día
// Los días con menos temperatura
// Se lee una temperatura por teclado y se muestran los días cuya 
// temperatura máxima coincide con ella. Si no existe ningún día 
// se muestra un mensaje de información.

package estructura_Arrays;
import java.util.Random;
import java.util.Scanner;
public class P009_Temperaturas {
	public static void main(String[] args) {
		Scanner medidas= new Scanner(System.in);
		Random rnd= new Random();
		String dias_semana[]= new String[5];
		String partes_dias[]= new String[3];
		double temperaturas[][]= new double[3][5];
		double temp[]=new double[5];  //Medida de temeperaturas para la media
		int fila=0;    //Puntero que ira recorriendo los vectores
		int columna=0;  //Puntero secundario para el array bidimensional
		double aux[]=new double[3];  //Vector de temperaturas minimas
		double temp_in=0.0;

		// Llenado de vector dias semana con los nombres de los dias
		for(fila=0;fila<dias_semana.length;fila++)
		{
			switch(fila)
			{
			case 0: 
				dias_semana[fila]="Lunes";	
			break;
			case 1: 
				dias_semana[fila]="Martes";	
			break;
			case 2: 
				dias_semana[fila]="Miercoles";	
			break;
			case 3: 
				dias_semana[fila]="Jueves";	
			break;
			case 4: 
				dias_semana[fila]="Viernes";	
			break;
			default: 
				// No hace nada	
			break;
			}
		}
		//Llenado con las partes de un dia
		for(fila=0;fila<partes_dias.length;fila++)
		{
			switch(fila)
			{
			case 0: 
				partes_dias[fila]="maniana";	
			break;
			case 1: 
				partes_dias[fila]="tarde";	
			break;
			case 2: 
				partes_dias[fila]="noche";	
			break;
			default: 
				// No hace nada	
			break;
			}
		}		
		// Extraccion de datos
		for(fila=0;fila<temperaturas.length;fila++)
		{
			for(columna=0;columna<temperaturas[fila].length;columna++)
			{
				switch(columna)
				{
				case 0:
					temperaturas[fila][columna]=rnd.nextDouble()*55+(-10);                    // Math.floor(Math.random()*45+(-20));
				break;
				case 1:
					temperaturas[fila][columna]=rnd.nextDouble()*55+(-10);                    // Math.floor(Math.random()*45+(-20));Math.floor(Math.random()*45+(-20));
				break;
				case 2:
					temperaturas[fila][columna]=rnd.nextDouble()*55+(-10);                   // Math.floor(Math.random()*45+(-20));Math.floor(Math.random()*45+(-20));
				break;
				case 3:
					temperaturas[fila][columna]=rnd.nextDouble()*55+(-10);                    // Math.floor(Math.random()*45+(-20));rnd.nextDouble();                    // Math.floor(Math.random()*45+(-20));Math.floor(Math.random()*45+(-20));
				break;
				case 4:
					temperaturas[fila][columna]=rnd.nextDouble()*55+(-10);                    // Math.floor(Math.random()*45+(-20));rnd.nextDouble();                    // Math.floor(Math.random()*45+(-20));Math.floor(Math.random()*45+(-20));
				break;
				default:
					  //No hace nada
				break;	
				}
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		// Exposicion de datos y puesta en tabla
		// Extraccion de datos
		for(fila=0;fila<dias_semana.length;fila++)
		{
			System.out.print("  "+dias_semana[fila]+"   ");
		}
		System.out.println(" ");
		for(fila=0;fila<temperaturas.length;fila++)
		{
			for(columna=0;columna<temperaturas[fila].length;columna++)
			{
				if(columna<2)    //Esto es para la interfaz de la muestra de la tabla
				{
				System.out.print("  "+String.format("%2.2f", temperaturas[fila][columna])+"    ");
				}
				if(columna>=2 && columna<3)
				{
				System.out.print("    "+String.format("%2.2f", temperaturas[fila][columna])+"  ");
				}
				if(columna>=3 && columna<4)
				{
				System.out.print("    "+String.format("%2.2f", temperaturas[fila][columna])+"  ");
				}
				if(columna>=4)
				{
				System.out.print("     "+String.format("%2.2f", temperaturas[fila][columna])+"         "+partes_dias[fila]);
				}
			}
			System.out.println("");
		}
		//Extraccion de las temepraturas medias y la mayor de todas ellas durante el dia correspondiente
		System.out.println("");
		for(columna=0;columna<5;columna++)
		{
			for(fila=0;fila<3;fila++)
			{
			temp[columna]=temp[columna]+temperaturas[fila][columna];
			}
			temp[columna]=temp[columna]/3;
		}
			System.out.println("Temperaturas MEDIAS por dia: ");
			System.out.println("");
			for(fila=0;fila<dias_semana.length;fila++)
			{
			 System.out.print("  "+dias_semana[fila]+"   ");
			}
			System.out.println("");
			for(fila=0;fila<temp.length;fila++)
			{
			 System.out.print(String.format("%2.2f",temp[fila])+"        ");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("TEMPERATURAS SEMANALES");
			System.out.println(" Minima || Maxima  ");
			System.out.println("");
			//PARA SACAR EL MINIMO
			int puntero=0;
			int punt=0;
			int semaforo=0;
			fila=0;
			for(columna=0;columna<5;columna++)
			{
			    for(puntero=0;puntero<3;puntero++)
			    {
			    aux[puntero]=temperaturas[fila+puntero][columna];    
			    }
			    if(aux[0]<aux[1] && aux[0]<aux[2])
			    {
			     System.out.print(String.format("%3.2f",aux[0])+"       ");   
			     	if(aux[1]<aux[2])
			     	{
					     System.out.println(String.format("%3.2f",aux[2])+"       ");
					     if(semaforo!=1)
					     {
					     temp[punt]=aux[2];   //Extraccion vector maximo
					     semaforo=1;   //Semaforo para que no guarde otros datos innecesarios
					     }
			     	}
			     	if(aux[1]>aux[2])
			     	{
					     System.out.println(String.format("%3.2f",aux[1])+"       ");
					     if(semaforo!=1)
					     {
					     temp[punt]=aux[1];
					     semaforo=1;
					     }
			     	}
			    }
			    if(aux[1]<aux[0] && aux[1]<aux[2])
			    {
			     System.out.print(String.format("%3.2f",aux[1])+"       "); 
			     	if(aux[0]<aux[2])
			     	{
					     System.out.println(String.format("%3.2f",aux[2])+"       ");
					     if(semaforo!=1)
					     {
					     temp[punt]=aux[2];
					     semaforo=1;
					     }
			     	}
			     	if(aux[0]>aux[2])
			     	{
					     System.out.println(String.format("%3.2f",aux[0])+"       ");	
					     if(semaforo!=1)
					     {
					     temp[punt]=aux[0];
					     semaforo=1;
					     }
			     	}
			    }
                if(aux[2]<aux[1] && aux[2]<aux[0])
			    {
			     System.out.print(String.format("%3.2f",aux[2])+"       "); 
			     	if(aux[1]<aux[0])
			     	{
					     System.out.println(String.format("%3.2f",aux[0])+"       ");	
					     if(semaforo!=1)
					     {
					     temp[punt]=aux[0];
					     semaforo=1;
					     }
			     	}
			     	if(aux[1]>aux[0])
			     	{
					     System.out.println(String.format("%3.2f",aux[1])+"       ");	
					     if(semaforo!=1)
					     {
					     temp[punt]=aux[1];
					     semaforo=1;
					     }
			     	}
			    }
               semaforo=0;
               punt=punt+1;
			}
			semaforo=0;
			System.out.println("");
			System.out.println("Introduzca una temperatura: " );
			temp_in=medidas.nextDouble();
			for(puntero=0;puntero<5;puntero++)
			{
				if(temp_in>=0.99*temp[puntero] && temp_in<=1.01*temp[puntero] && semaforo!=1)
				{				
				System.out.println("Su temperatura esta cerca de maxima registrada el "+dias_semana[puntero]);
				semaforo=1;
				}
				if((temp_in<0.99*temp[puntero] || temp_in>=1.01*temp[puntero]) && semaforo!=1)
				{
				System.out.println("Su temperatura no se haya dentro del rango de máximas registradas en la semana.");
				semaforo=1;
				}
			}
	}
}
