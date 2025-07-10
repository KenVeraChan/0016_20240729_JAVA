package debbugersEclipse;

import javax.swing.JOptionPane;

public class Debbuergs {

	public static void main(String[] args) {
		peticionNumeroyMatriz nuevo= new peticionNumeroyMatriz();
	}

}
class peticionNumeroyMatriz
{;
	private static int semaforo=0;
	public peticionNumeroyMatriz()
	{
		do {
			int tamMatriz=0;
				try {
					tamMatriz= devuelveTam();
					semaforo=1;  //Prosigue con el programa
				}catch(NumberFormatException error) {
					System.out.println("No es un numero entero esperado. Es texto STRING");
					semaforo=0;  //No deja seguir
				}
			try {
				if(semaforo==1)
				{
				pantalla(tamMatriz);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Hubo fallo de conversion de un numero FLOAT o DOUBLE a INT");
				semaforo=0;  //no deja seguir
			}
		}while(semaforo==0);
	}
	public int devuelveTam() throws NumberFormatException
	{
		int numero=0;
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz: "));
		return numero;
	}
	public void pantalla (int tamMatriz) throws Exception
	{
		int datos[]= new int[tamMatriz];
		for (int i=0; i<datos.length;i++)
		{
			datos[i]= (int) Math.floor(Math.random()*100);
		}
		for(int i=0;i<datos.length;i++)
		{
			System.out.println("Dato "+i+" es: "+datos[i]);
		}
	}
}
