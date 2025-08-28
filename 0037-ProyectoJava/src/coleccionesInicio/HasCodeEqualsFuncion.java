package coleccionesInicio;

public class HasCodeEqualsFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		objetosLibros libro1= new objetosLibros("Java SE","Rasselin Wissangel Rousher",120);
		objetosLibros libro2= new objetosLibros("Java SE","Rasselin Wissangel Rousher",120);
		
		libro1=libro2; //Esto hace que ambos objetos apunten al mismo HASHCODE
		if(libro1.equals(libro2))
		{
			System.out.println("los libros son iguales");
		}
		else
		{
			System.out.println("No son iguales");
		}
		System.out.println("El HASHCODE del libro 1 es: "+libro1.hashCode());
		System.out.println("El HASHCODE del libro 2 es: "+libro2.hashCode());
	}
}
