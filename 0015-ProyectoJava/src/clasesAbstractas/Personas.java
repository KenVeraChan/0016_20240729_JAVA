package clasesAbstractas;
import java.util.Date;

public abstract class Personas {
	
	private String nombre;
	
	public Personas(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return this.nombre;
	}
	public abstract String getDescripcion();
}

class Empleados extends Personas implements Comparable
{
	private double sueldo=0;
	private Date fechaAlta; 
	public Empleados(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta=fechaAlta;
		this.sueldo=sueldo;
	}

	public String getDescripcion() {
		return "El empleado: "+this.getNombre()+" tiene un sueldo de: "+this.sueldo+"�"+". Y entro a trabajar en: "+this.fechaAlta;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Empleados otroEmpleado=(Empleados)o; //Transformar un objeto con forma general a un objeto Empleados
		if(this.sueldo<otroEmpleado.sueldo) return -1;
		if(this.sueldo>otroEmpleado.sueldo) return 1;
		return 0;
	}
	
}
class Jefes extends Empleados
{

	private String cargo;
	public Jefes(String nombre, Date fechaAlta, double sueldo) {
		super(nombre, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	}
}
class Alumnos extends Personas
{
	private String asignaturasOptativas;
	private String aula;
	
	public Alumnos(String nombre, String asignaturasOptativas, String aula) {
		super(nombre);
		this.asignaturasOptativas=asignaturasOptativas;
		this.aula=aula;
		// TODO Auto-generated constructor stub
	}

	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El alumno: "+this.getNombre()+" est� en el aula: "+this.aula
				+ " y ha escogido la asignatura: "+this.asignaturasOptativas;
	}
	
}