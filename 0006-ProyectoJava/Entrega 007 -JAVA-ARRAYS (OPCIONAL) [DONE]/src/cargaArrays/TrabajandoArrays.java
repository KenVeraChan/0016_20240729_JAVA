package cargaArrays;

public class TrabajandoArrays {
	public static void main(String[] args) {
		OpcionesVector Arreglo= new OpcionesVector();
		EleccionMenu menuOp= new EleccionMenu();
		vectoresOscilantes vecLon= new vectoresOscilantes();
		int sizeVector=0;
		int eleccion=0;
		// 1) GESTION TAMANIO DEL VECTOR
		sizeVector=Arreglo.gettamVector();  //Genera el vector
		// 2) GESTION OPCIONES DEL MENU CON EL VECTOR YA CREADO
		String vector[]= new String[sizeVector];
		vecLon.setvectoresOscilantes(vector);
		for(int i=0;i<vector.length;i++)
			{
				vector[i]="";  //SE RELLENA DE ESPACIOS VACIOS PARA PREPARAR EL VECTOR
			}
		do {
			eleccion=Arreglo.getnumOpcion();
			menuOp.gestorOpciones(vecLon.getvectoresOscilantes(),eleccion);  //ENVIA LOS DATOS NECESARIOS	
	    }while(eleccion!=0);
		System.out.println("Fin del Programa!");
	}
}

