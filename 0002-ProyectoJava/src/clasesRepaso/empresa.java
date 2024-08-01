package clasesRepaso;
import javax.swing.JOptionPane;

public class empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String departamentoOP="";
		jefesEmpresa departamentos= new jefesEmpresa(null);
		departamentoOP=JOptionPane.showInputDialog("Introduzca el departamento al que pertenece!");
		departamentos.setDepartamento(departamentoOP);
		System.out.println("El departamento al que pertenece es: "+departamentos.getDepartamento());
		
		//CASTING DOWNCASTING O IMPLICITO
		empleadosEmpresa William= new jefesEmpresa(null);
		jefesEmpresa Jefe= (jefesEmpresa)William;
		Jefe.setNombre("William");
		
		//CASTING UPCASTING O EXPLICITO
		jefesEmpresa Sharyllin= (jefesEmpresa) new empleadosEmpresa();
		Sharyllin.setEdad(33);
	
	}

}
