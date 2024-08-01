// EJERCICIO 6
// Crea un programa que pida un número al usuario un número de 
// mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) 
// y el nombre del mes. Debes usar unvector. Para simplificarlo 
// vamos a suponer que febrero tiene 28 días.

package estructura_Arrays;
import java.util.Scanner;
public class P006_Vector_Meses_Dias {

	public static void main(String[] args) {
        Scanner meses= new Scanner(System.in);
        String vector_meses[]= new String[13];
        int vector_dias[]= new int[13];
        int fila=0;
        int puntero=0;
        int numero_mes=8;
        // Fase de introduccion de datos en el vector para prepararlo
        for(fila=1;fila<vector_meses.length-1;fila++)
        {
            switch(fila)
            {
                case 1: 
                    vector_meses[fila]="Enero";
                    break;
                case 2: 
                    vector_meses[fila]="Febrero";
                    break;
                case 3: 
                    vector_meses[fila]="Marzo";
                    break;
                case 4: 
                    vector_meses[fila]="Abril";
                    break; 
                case 5: 
                    vector_meses[fila]="Mayo";
                    break;
                case 6: 
                    vector_meses[fila]="Junio";
                    break;
                case 7: 
                    vector_meses[fila]="Julio";
                    break;
                case 8: 
                    vector_meses[fila]="Agosto";
                    break;
                case 9: 
                    vector_meses[fila]="Septiembre";
                    break;
                case 10: 
                    vector_meses[fila]="Octubre";
                    break;
                case 11: 
                    vector_meses[fila]="Noviembre";
                    break;
                case 12: 
                    vector_meses[fila]="Diciembre";
                    break;
                default:
                    break;
            }
         }
           //Dias del mes
        for(fila=1;fila<vector_dias.length-1;fila++)
        {
            switch(fila)
            {
                case 1: 
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    vector_dias[fila]=31;
                    break;
                case 2: 
                    vector_dias[fila]=28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    vector_dias[fila]=30;
                    break; 
                default:
                    break;
            }
		}
        do{
        System.out.println("Indique el numero de un mes para sacar sus dias: ");
        numero_mes=meses.nextInt();
        }while(numero_mes<1 || numero_mes>12);
        
        for(puntero=1;puntero<vector_dias.length-1;puntero++)
        {
        	if(puntero==numero_mes)
        	{
        		System.out.println("El numero: "+numero_mes+" corresponde con el mes: "+vector_meses[puntero]+" y tiene: "+vector_dias[puntero]+" dias");
        	}
        }
	}
}
