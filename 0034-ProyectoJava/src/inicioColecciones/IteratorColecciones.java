package inicioColecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empleados Rasselin= new empleados("Rasselin Wissangel Rousher",20,"Sfer4D_Corporation@outlook.com");
		empleados Vitrea= new empleados("Vitrea Horiz",21,"vitrea_horiz_19@yahoo.es");
		empleados Emiliam= new empleados("Emiliam Bastreriz",20,"emiliambastreriz@gmail.com");
		empleados Verduliz= new empleados("Verduliz Sainz",20,"verdulizsainz@medigraria.org");
		empleados Veddina= new empleados("Veddina Henion",22,"veddina_henion@outlook.com");
		empleados Samira= new empleados("Samira Savadez",22,"samirita@yahoo.es");
		empleados Shail= new empleados("Shail Matsiz",23,"shailMatsiz@gmail.com");
		empleados Christal= new empleados("Christal Gedishen",22,"christal@gmail.com");
		empleados Jill= new empleados("Jill Anherson",21,"jillAn@gmail.com");
		
		
		ArrayList<empleados> enterprise= new ArrayList<empleados>();  //Declaracion de la Coleccion 
		enterprise.add(Rasselin);
		enterprise.add(Vitrea);
		enterprise.add(Emiliam);
		enterprise.add(Verduliz);
		enterprise.add(Veddina);
		enterprise.add(Samira);
		enterprise.add(Shail);
		enterprise.add(Christal);
		enterprise.add(Jill);
		Iterator<empleados> iteradorEmpleados= enterprise.iterator(); //Declaracion del iterador que recorrera el ArrayList
		while(iteradorEmpleados.hasNext()) System.out.println(iteradorEmpleados.next().getNombre());
	}
}
