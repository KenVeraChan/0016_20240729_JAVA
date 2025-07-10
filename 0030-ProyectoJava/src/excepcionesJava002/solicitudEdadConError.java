package excepcionesJava002;

import java.io.IOException;

import javax.swing.JOptionPane;

public class solicitudEdadConError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solicitarEdad edad= new solicitarEdad();
	
	}

}

class solicitarEdad
{
	private String edad="";
	private int edadNumero=0;
	public solicitarEdad()
	{
		int numero=0;
		do {
		numero=convierteEdad(JOptionPane.showInputDialog("Introduce tu edad"),numero);
		}while(numero==0);
	}
	public int convierteEdad(String edadNum,int numero) throws NumberFormatException
	{
		this.edad=edadNum;
		try {
		this.edadNumero= Integer.parseInt(edadNum)+1; 
		System.out.println("Edad el proximo año sera: " +this.edadNumero);
		numero=1; // Salir del bucle
		System.out.println("");
		}catch(NumberFormatException error) {
			System.out.println("El error es: "+error.getMessage());
		numero=0; // Continuar el bucle
		System.out.println("");
		}
		return numero;
    }
}

/*
class solicitarEdad
{
	private String edad="";
	private int edadNumero=0;
	public solicitarEdad()
	{
		int numero=0;
		do {
		numero=convierteEdad(JOptionPane.showInputDialog("Introduce tu edad"),numero);
		}while(numero==0);
	}
	public int convierteEdad(String edadNum,int numero) throws IOException
	{
		this.edad=edadNum;

		this.edadNumero= Integer.parseInt(edadNum)+1; 
		System.out.println("Edad el proximo año sera: " +this.edadNumero);
		System.out.println("");

		return numero;
    }
}
*/