package clasesAbstractas;

import java.util.Arrays;
import java.util.Date;

public class UsoPersonas {

	public static void main(String[] args) {

		Empleados Rasselin = new Empleados("Rasselin",new Date(5465454),2500);
		System.out.println(Rasselin.getNombre());
		System.out.println(Rasselin.getDescripcion());
		
		Jefes William = new Jefes("William",new Date(654546),3500);
		System.out.println(William.getNombre());
		System.out.println(William.getDescripcion());
		
		Alumnos Sharyllin= new Alumnos("Sharyllin","Dibujo","Aula 5");
		System.out.println(Sharyllin.getNombre());
		System.out.println(Sharyllin.getDescripcion());
		
		//uso de API externa para ordenar un ARRAY DE OBJETOS
		Empleados SFER4D[]= new Empleados[5];
		SFER4D[0]= new Empleados("Rasselin",new Date(4020220),8000);
		SFER4D[1]= new Empleados("Vitrea",new Date(3021034),9000);
		SFER4D[2]= new Empleados("Emiliam",new Date(23923931),3000);
		SFER4D[3]= new Empleados("Verduliz",new Date(4020220),2000);
		SFER4D[4]= new Empleados("Veddina",new Date(4020220),4000);
		
		Arrays.sort(SFER4D);
		for(int i=0; i<SFER4D.length;i++)
		{
			System.out.println(SFER4D[i].getDescripcion());
		}		
	}
}
