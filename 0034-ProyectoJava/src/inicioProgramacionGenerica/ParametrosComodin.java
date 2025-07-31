package inicioProgramacionGenerica;

public class ParametrosComodin {
	private static final Double numeroPi= 3.141659;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CARGA DE DATOS QUE LUEGO SE SOLICITARAN
		EmpleadoEmpresa Josh = new EmpleadoEmpresa("Josh Aneitor",43,3200);
		JefeEmpresa William= new JefeEmpresa("William Wissangel",45,5400,1200);
		//FORMA 1
		//EmpleadoEmpresa Empleado15082004;
		//JefeEmpresa Vitrea= new JefeEmpresa("Vitrea Horiz",21,1200);
		
		//Empleado15082004=Vitrea;  //Jefe almacenado en la clase tipo empleado
		
		//FORMA 2
		//VariosTipos<EmpleadoEmpresa> Empleado15082004 = new VariosTipos<EmpleadoEmpresa>();
		//VariosTipos<JefeEmpresa> Vitrea= new VariosTipos<JefeEmpresa>();
		//VariosTipos.imprimirTrabajador(Vitrea);
		
		//FORMA 3 - CLASE GENERICA COMPUESTA
		VariosTiposGeneral<Double,EmpleadoEmpresa,JefeEmpresa> general= new VariosTiposGeneral<Double,EmpleadoEmpresa,JefeEmpresa>(numeroPi,Josh,William);
		System.out.println("El empleado: "+general.obtenerElementoT().getDatosUsuario()+".\nFue contratado por: "+general.obtenerElementoU().getDatosUsuario()+".\nNo cree en el número PI cuyo valor es: "+general.obtenerElementoN().doubleValue());
	}
}
class VariosTiposGeneral<N,T,U>
{
	private N dato1;
	private T dato2;
	private U dato3;
	
	public VariosTiposGeneral(N dato1, T dato2, U dato3)
	{
		this.dato1=dato1;
		this.dato2=dato2;
		this.dato3=dato3;
	}
	public N obtenerElementoN()
	{
		return dato1;
	}
	public T obtenerElementoT()
	{
		return dato2;
	}
	public U obtenerElementoU()
	{
		return dato3;
	}
}

class VariosTipos<T>
{
	private T primero;
	public VariosTipos()
	{
		primero=null;
	}
	public static void imprimirTrabajador(VariosTipos<? extends EmpleadoEmpresa> e)
	{
		//Para usar el nombre de la clase sin querer usar una creacion de instancia
		EmpleadoEmpresa primero=e.getPrimero();
		System.out.println(primero);
	}
	public void setPrimero(T nuevoValor)
	{
		primero=nuevoValor;
	}
	public T getPrimero()
	{
		return primero;
	}
}

class EmpleadoEmpresa
{
    private String nombre;
    private int edad;
    private double salario;
	
	public EmpleadoEmpresa(String nombre, int edad, double salario)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	public String getDatosUsuario()
	{
		return "El empleado: "+this.nombre+" tiene: "+this.edad+" años y cobra: "+this.salario+" Euros";
	}
	public String getNombre()
	{
		return this.nombre;
	}
}
class JefeEmpresa extends EmpleadoEmpresa
{
	private int incentivo;
	
	public JefeEmpresa(String nombre,int edad, double salario,int incentivo)
	{
		//Super de la llamada la clase padre en su constructor
		super(nombre, edad, salario);
		this.incentivo=incentivo;
	}
	public double incentivo(double inc)
	{
		return inc;
	}
	public String getNombre()
	{
		return super.getNombre();
	}
}

