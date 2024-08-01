// EJERCICIO 8
// Queremos guardar los nombres y la edades de los alumnos de un curso. 
// Realiza un programa que introduzca el nombre y la edad de cada alumno. 
// El proceso de lectura dedatos terminará cuando se introduzca como nombren
// asterisco (*) Al finalizar se mostrará los siguientes datos:
// Todos lo alumnos mayores de edad.
// Los alumnos mayores (los que tienen más edad)

package estructura_Arrays;
import java.util.Scanner;
public class P008_Registro_Alumnos {
	public static void main(String[] args) {
        Scanner palabra= new Scanner(System.in);
        String nombre_alumnos[]= new String[30];
        int edades_alumnos[]= new int[30];
        int puntero=0;
        String alumno="";
        int edad=0;
        int mas_edad=0;
        System.out.println("Introduzca lo que usted considera más edad para imprimir despues: ");
        mas_edad=palabra.nextInt();
        palabra.nextLine();
        while(alumno.equals("*")!=true)
        { 
        //Si el nombre introducido es nu asterisco se termina el programa
        System.out.println("Introduzca el nombre de un alumno: ");
        alumno=palabra.nextLine();
        System.out.println("Nombre: "+alumno);
         if(alumno.equals("*")!=true)
          {
             do
             {
                 System.out.println("Introduzca la edad de "+alumno+": ");
                 edad=palabra.nextInt();
             }while(edad<0);
             nombre_alumnos[puntero]=alumno;
             edades_alumnos[puntero]=edad;
            puntero=puntero+1;  //Para la siguiente celda para ocupar
          }
         if(alumno.equals("*")==true)
          {
        	 break;   //Sale del bucle para mostrar lo pedido
          }
        palabra.nextLine();   
        }
        System.out.println("Fin del registro");
        System.out.println("Lista de alumnos mayores de edad:");
        //Alumnos mayores de edad
        for(puntero=0;puntero<edades_alumnos.length;puntero++)
        {
        	if(edades_alumnos[puntero]>=18)
        	{
        		System.out.println("Nombre: "+nombre_alumnos[puntero]+" y edad: "+edades_alumnos[puntero]);
        	}
        }
    	System.out.println("");
    	System.out.println("Lista de alumnos mayores de "+mas_edad+":");
        // Alumnos mas mayores
        for(puntero=0;puntero<edades_alumnos.length;puntero++)
        {
        	if(edades_alumnos[puntero]>=mas_edad)
        	{
        		System.out.println("Nombre: "+nombre_alumnos[puntero]+" y edad: "+edades_alumnos[puntero]);
        	}
        }
	}
}
