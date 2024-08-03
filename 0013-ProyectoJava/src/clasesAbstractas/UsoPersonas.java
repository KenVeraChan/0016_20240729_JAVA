package clasesAbstractas;

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
		
		Jefes Josh= new Jefes("Josh Aneitor",new Date(654654),4800);
		Josh.setCargo("Director de I+D+I");
		System.out.println(Josh.getNombre());
		System.out.println(Josh.getDescripcion()+Josh.getCargo());
		
	}

}
