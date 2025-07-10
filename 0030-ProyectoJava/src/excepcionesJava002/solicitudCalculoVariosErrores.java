package excepcionesJava002;

import java.text.Format;

import javax.swing.JOptionPane;

public class solicitudCalculoVariosErrores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operacionDivision division = new operacionDivision();
	}

}

class operacionDivision
{
	private static double numero1;
	private static double numero2;
	public operacionDivision()
	{
		ejecutarDivision();
	}
	public void ejecutarDivision()
	{
		try {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer numero"));
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo numero"));
			double resultado = numero1/numero2;
			System.out.println("El resultado de la division es: " + resultado);
		} catch (NumberFormatException e) {
			System.out.println("Error: Entrada no valida. Por favor, introduce numeros validos.");
		} catch (ArithmeticException e) {
			System.out.println("Error: Division por cero no permitida.");
		}
	}
	
}