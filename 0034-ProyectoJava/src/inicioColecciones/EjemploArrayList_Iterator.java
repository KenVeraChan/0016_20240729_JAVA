package inicioColecciones;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class EjemploArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// En este ejercicio se trata de crear una aplicación que pida introducir 
		// números enteros por consola y que los vaya almacenando en un ArrayList. 
		// Cuando se introduce el número 0, el programa deja de pedir números e imprime 
		// en consola 3 cálculos:

		// La suma de los números introducidos
		//	La media de los números introducidos
		//	Cuántos números se han introducido que son superiores a la media.
		int numeroDefinitivo=0;
		recoleccionNumeros numeros=null; //Se inicializa a null porque no se ha utilizado en este punto
		peticiones seleccionPeticiones= new peticiones();
		ArrayList<recoleccionNumeros> listaNumeros= new ArrayList<recoleccionNumeros>();
		do {
		String cadenaNumero= JOptionPane.showInputDialog("Introduzca un numero entero");
			try {
				numeroDefinitivo=transformaNumero(cadenaNumero);
				listaNumeros.add(new recoleccionNumeros(numeroDefinitivo));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Era una cadena de caracteres o un numero decimal. No valido");
				numeroDefinitivo=-1;
			}
		}while(numeroDefinitivo!=0);

		System.out.println("");
		System.out.println("");
		System.out.println("La SUMA de los numeros de la lista es: "+seleccionPeticiones.SumaElementos(numeros,listaNumeros));
		System.out.println("La MEDIA de los numeros de la lista es: "+String.format("%.2f",seleccionPeticiones.MediaElementos(numeros, listaNumeros)));
		seleccionPeticiones.ContabilidadElementos(numeros, listaNumeros);
	}
	public static int transformaNumero(String cadena) throws NumberFormatException
	{
		int numero= Integer.parseInt(cadena);
    		return numero;
	}
}
class recoleccionNumeros
{
	private int casillero;
	public recoleccionNumeros(int numero)
	{
		this.casillero=numero;
	}
	public int getCasillero()
	{
		return this.casillero;
	}
}
class peticiones
{
	private static int numero=0;
	private static int suma=0;
	private static int i=1;
	private static double media=0.0;
	private static String texto="";
	private static int contabilidad=0;
	
	public peticiones()
	{
		
	}
	public int SumaElementos(recoleccionNumeros recoleccionNumeros,ArrayList<recoleccionNumeros> lista)
	{
		//SUMA DE LOS NÚMEROS INTRODUCIDOS
		for(recoleccionNumeros enteros:lista)
		{
			numero=enteros.getCasillero();
			if(numero>0)
			{
				suma=suma+numero;
				i++;
			}
		}
		return suma;
	}
	public double MediaElementos(recoleccionNumeros recoleccionNumeros,ArrayList<recoleccionNumeros> lista)
	{
		//PRIMERO SUMA DE LOS NÚMEROS INTRODUCIDOS
		for(recoleccionNumeros enteros:lista)
		{
			numero=enteros.getCasillero();
			suma=suma+numero;
			i++;
		}
		//SEGUNDO CALCULAR LA MEDIA
		texto=Integer.toString(suma);
		media=Double.parseDouble(texto);
		media=media/(i-2);
		return media;
	}
	public void ContabilidadElementos(recoleccionNumeros recoleccionNumeros,ArrayList<recoleccionNumeros> lista)
	{
		//PRIMERO SE CALCULA LA MEDIA
		for(recoleccionNumeros enteros:lista)
		{
			numero=enteros.getCasillero();
			suma=suma+numero;
			i++;
		}
		//SEGUNDO CALCULAR LA MEDIA
		texto=Integer.toString(suma);
		media=Double.parseDouble(texto);
		media=media/(i-2);
		//SE CONTABILIZA CON UN BUCLE FOR PARA CONTAR LOS QUE CUMPLAN QUE SON MAYORES QUE LA MEDIA
		i=1;
		for(recoleccionNumeros enteros:lista)
		{
			if(enteros.getCasillero()>0)
			{
				if(enteros.getCasillero()>media)
				{
					System.out.println(i+") El numero: "+enteros.getCasillero()+" es MAYOR que la MEDIA");
					i++;
					contabilidad++;  //se incrementa en uno la cantidad de numeros mayores que la media
				}
				else
				{
					System.out.println(i+") El numero: "+enteros.getCasillero()+" es MENOR o IGUAL que la MEDIA");
					i++;
				}
			}
		}
		System.out.println("El total de numeros que son MAYORES que la MEDIA son: "+contabilidad);
	}
}
