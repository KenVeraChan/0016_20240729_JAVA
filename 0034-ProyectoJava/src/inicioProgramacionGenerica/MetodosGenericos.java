package inicioProgramacionGenerica;

import java.util.List;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombresPersonas[]= {"Rasselin","Vitrea","Emiliam","Verduliz"};
		System.out.println(ExaminaArrays.getElementos(nombresPersonas));
		System.out.println(ExaminaArrays.getMenor(nombresPersonas));
		System.out.println("");
		ExaminaArraysNoEstatico matrizNecesaria= new ExaminaArraysNoEstatico();
		System.out.println(matrizNecesaria.getElementoNoEstatico(nombresPersonas));
		empleados Veddina = new empleados("Veddina","Henion",22);
		empleados Samira= new empleados("Samira","Savadez",23);
		empleados Shail= new empleados("Shail","Matsiz",21);
		empleados Christal= new empleados("Christal","Gedishen",22);
		empleados Jill= new empleados("Jill","Anherson",22);
		empleados empresa[]= {Veddina,Samira,Shail,Christal,Jill};
		System.out.println("La matriz de objetos empleados tiene: "+ ExaminaArrays.getElementos(empresa));
		System.out.println("");
		System.out.println("La matriz de objetos empleados tiene (metodo no estatico):"+matrizNecesaria.getElementoNoEstatico(empresa));
	}

}

class ExaminaArrays
{
	public static <T> String getElementos(T[]elArray)
	{
		return "El array tiene "+elArray.length+" elementos.";
	}
	public static <T extends Comparable> T getMenor(T[]elArray)
	{
		T objetoMenor=elArray[0];
		for (int i=1;i<elArray.length;i++)
		{
			if(objetoMenor.compareTo(elArray[i])>0)
			{
				objetoMenor=elArray[i];
			}
		}
		return objetoMenor;
	}
}
class ExaminaArraysNoEstatico
{
	public ExaminaArraysNoEstatico()
	{
		
	}
	public <T> String getElementoNoEstatico(T[]elArrayNoEstatico)
	{
		return "El array no estatico tiene "+elArrayNoEstatico.length+" elementos.";
	}
}
class empleados
{
	private String nombre="";
	private String apellidos="";
	private int edad=0;
	public empleados(String nombre, String apellidos,int edad)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	public void identidad()
	{
		System.out.println("La persona es: "+this.nombre+" sus appellidos son: "+this.apellidos+" y su edad es: "+this.edad);
	}
}
