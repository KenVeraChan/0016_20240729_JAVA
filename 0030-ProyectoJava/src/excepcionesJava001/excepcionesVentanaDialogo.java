package excepcionesJava001;

import javax.swing.JOptionPane;

public class excepcionesVentanaDialogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dato = 0; // Inicializamos la variable dato para evitar errores de compilación
		String mensaje="";
		try 
		{
			dato=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero"));
		}
		catch(NumberFormatException e) 
		{
			JOptionPane.showMessageDialog(null, "El dato introducido no es un número entero", "Error", JOptionPane.ERROR_MESSAGE);
			System.out.println("El tipo de error cometido es: "+e.getClass().getName());
			mensaje= e.getMessage();
			System.out.println("El dato introducido es: "+e.getMessage());
		}
		finally
		{
			JOptionPane.showMessageDialog(null, ("El dato introducido por el usuario es el siguiente: "+mensaje), "ERROR DE INTRODUCCION DATOS", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}



