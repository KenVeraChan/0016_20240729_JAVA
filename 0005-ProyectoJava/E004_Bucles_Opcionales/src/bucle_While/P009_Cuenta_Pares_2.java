// EJERCICIO 9
// Mejore la usabilidad del programa anterior haciendo que 
// la pregunta se repita si el usuario no contesta S, s, N o n.

package bucle_While;
import java.util.Scanner;
public class P009_Cuenta_Pares_2 {

	public static void main(String[] args) {
	     Scanner numeros= new Scanner(System.in);
	     int pares=0;
	     int contador=0;
	     String respuesta="s";
	     int activador=1;
	     System.out.println("CUENTA PARES");
	     while(activador!=2)
	     {
	    	 if(activador==1)
	    	 {
	    	 		System.out.println("Introduzca un numero PAR:");
	    	        pares= numeros.nextInt();
				         while(pares%2!=0)
				         {
				         System.out.println("El "+pares+" No es un numero par. Intentelo de nuevo:");
				         pares= numeros.nextInt();
				         activador=0; 
						         if(pares%2==0)
						         {   //En el caso que el usuario deje de insistir en meter impares 
						        	 // se contabilizara ese nuevo nuevo par metido
							         contador=contador+1;
							         activador=0;
						         }
				         }
				         if(pares%2==0)
				         {  
				         contador=contador+1;
				         activador=0;
			    		 respuesta=numeros.nextLine();  //Limpieza de Buffer 
				         }
	    	 }
	    	 if(activador==0)
	    	 {  
		         System.out.println("Quiere introducir otro numero par: (S/N)");
			     respuesta= numeros.nextLine();  //Recogida de la respuesta 
			     
			     if(respuesta.equals("s")==true || respuesta.equals("S")==true)
			     {
			    	 activador=1;
			     }
			     if(respuesta.equals("n")==true || respuesta.equals("N")==true)
			     {
			    	 activador=2;   //Termina el programa
			     }
			     if(respuesta.equals("s")==false && respuesta.equals("S")==false && respuesta.equals("n")==false && respuesta.equals("N")==false)
			     {
			    	 activador=0;
			     }
	    	 }
	    }
	     numeros.close();
	     System.out.println("Ha escrito: "+contador+" numeros pares.");
	}
}
