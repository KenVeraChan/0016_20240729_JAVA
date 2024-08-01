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

class Empleados extends Personas
{
	private double sueldo=0;
	private Date fechaAlta; 
	public Empleados(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta=fechaAlta;
		this.sueldo=sueldo;
	}

	public String getDescripcion() {
		return "El empleado: "+this.getNombre()+" tiene un sueldo de: "+this.sueldo+"€"+". Y entro a trabajar en: "+this.fechaAlta;
	}
	
}
