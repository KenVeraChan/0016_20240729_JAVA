package coleccionesInicio;

import java.util.*;

public class ClienteBancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cliente cliente1= new cliente("Rasselin Wissangel Rousher","0001",40000);
		cliente cliente2= new cliente("Vitrea Horiz","0002",50000);
		cliente cliente3= new cliente("Emiliam Bastreriz","0003",30000);
		cliente cliente4= new cliente("Verduliz Sainz","0004",20000);
		cliente cliente5= new cliente("Veddina Henion","0005",10000);
		
		//Se construye la coleccion
		Set<cliente> clientesDelBando= new HashSet<cliente>();
		clientesDelBando.add(cliente1);
		clientesDelBando.add(cliente2);
		clientesDelBando.add(cliente3);
		clientesDelBando.add(cliente4);
		clientesDelBando.add(cliente5);
		
		//Se recorre con un bucle for each
		for (cliente cliente : clientesDelBando) 
		{
			System.out.println(cliente.getNombre()+" "+cliente.getnCuenta()+" "+cliente.getSaldo());
		}
	}

}
