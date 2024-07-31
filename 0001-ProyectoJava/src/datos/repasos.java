package datos;

public class repasos {

	public static void main(String[] args) {
		System.out.printf("Hola Mundo");
		String nombre="Rasselín";
		String apellidos="Wissangel Rousher";
		int edad= 19;
		String profesion="Estudiante";
		objetoPersonas individuo= new objetoPersonas();
		individuo.setNombre(nombre);
		individuo.setApellidos(apellidos);
		individuo.setEdad(edad);
		individuo.setProfesion(profesion);
		objetoPersonas [] registro = new objetoPersonas[10];
		for(int puntero=1;puntero<10;puntero++)
		{
			registro[puntero]=individuo;
			System.out.println(registro[puntero].getNombre());
			System.out.println(registro[puntero].getApellidos());
			System.out.println(registro[puntero].getEdad());
			System.out.println(registro[puntero].getProfesion());
			System.out.println();
			System.out.println();
		}
		
		
		
	}

}
