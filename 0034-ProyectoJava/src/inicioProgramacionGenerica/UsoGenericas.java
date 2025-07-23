package inicioProgramacionGenerica;

public class UsoGenericas {

	public static void main(String[] args) {
		// CREACION DE CLASE GENERICA
		ClasesGenericas<String> miObjeto1= new ClasesGenericas<String>();
		//Con SET Y GET la clase genérica se adapta al tipo de STRING que se quiere guardar enviar
		//GENERICA PORQUE SI AQUI SE ADAPTA AL OBJETO DE TIPO STRING, SE PUEDE ADAPTAR A CUALQUIER OTRO OBJETO
		//ADAPTADO A LA CLASE STRING
		miObjeto1.setObjeto("Rasselin Wissangel Rousher");
		System.out.println(miObjeto1.getObjeto());
		//ADAPTADO A LA CLASE persona
		ClasesGenericas<persona> miObjeto2 = new ClasesGenericas<persona>();
		persona ella = new persona("Vitrea Horiz");
		miObjeto2.setObjeto(ella);
		System.out.println("Ella es: "+miObjeto2.getObjeto().getNombre());
	}

}

class persona
{
	private String nombre;
	public persona(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}