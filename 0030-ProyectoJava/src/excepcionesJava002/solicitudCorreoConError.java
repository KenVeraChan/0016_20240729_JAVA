package excepcionesJava002;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class solicitudCorreoConError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solicitarCorreo edad= new solicitarCorreo();

	}

}
class solicitarCorreo
{
	private String correo="";
	public solicitarCorreo()
	{
			try {
				correo=detectaCorreo(JOptionPane.showInputDialog("Introduce tu correo"));
			} catch (LongitudMailErronea e) {
				// TODO Auto-generated catch block
				System.out.println("El error es demasidado corto ");
			}
			System.out.println("El correo electronico es: "+this.correo);
	}
	public String detectaCorreo(String cadenaTexto) throws LongitudMailErronea
	{
		if(cadenaTexto.length()<=3)
		{
			LongitudMailErronea error= new LongitudMailErronea("Mail con menos de 3 caracteres");
			throw error;
		}
		return cadenaTexto;
    }
}

/*CLASE QUE GESTIONA LAS EXCEPCIONES PROPIAS*/
class LongitudMailErronea extends Exception {
	public LongitudMailErronea( ) 
	{
		//PRIMER CONSTRUCTOR
	}
	public LongitudMailErronea(String mensajeError) 
	{
		//SEGUNDO CONSTRUCTOR
		super(mensajeError);
	}
}