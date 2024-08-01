// Escriba un programa que pregunte primero si se quiere calcular 
// el área de un triángulo o la de un círculo. Si se contesta que 
// se quiere calcular el área de untriángulo (escribiendo T o t), 
// el programa tiene que pedir entonces la base y la altura y escribir 
// el área. Si se contesta que se quiere calcular el área de un 
// círculo(escribiendo C o c), el programa tiene que pedir entonces 
// el radio y escribir el área.
// Se recuerda que el área de un triángulo es base por altura dividido por 
// 2 y que el área de un círculo es Pi (aproximadamente 3,141592) por el 
// radio al cuadrado. Nota: Utilice como valor de pi el valor 3.141592.

package condicionales_propuestos;
import java.util.Scanner;

public class Areas_Triangulo_Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numeros= new Scanner(System.in);
		Double base=0.0;
		Double altura=0.0;
		Double radio=0.0;
		Double pi=3.141592;
		Double area_triangulo=0.0;
		Double area_circulo=0.0;
		int contador=0;
		String eleccion="";
		
		System.out.println("");
		System.out.println("CALCULO DE AREAS");
		System.out.println("Elegir el tipo de area que se quiere hallar");
		System.out.println("Area del Triangulo (t/T) o Area del Circulo (c/C)");
		System.out.println("");
		eleccion= numeros.nextLine();   //Para pedir un caracter por teclado se emplea nextLine()

		if (eleccion.equals("t")==true || eleccion.equals("T")==true)
		{
		  System.out.println("");
		  System.out.println("AREA TRIANGULO");
		  System.out.println("Indique la medida de la BASE");
		  base= numeros.nextDouble();
		  System.out.println("Indique la medida de la ALTURA");
		  altura= numeros.nextDouble();
		  area_triangulo=(base*altura)/2;
		  System.out.println("El area del triangulo es de : "+String.format("%.3f", area_triangulo));
		}
		if (eleccion.equals("c")==true || eleccion.equals("C")==true)
		{
		  System.out.println("");
		  System.out.println("AREA CIRCULO");
		  System.out.println("Indique la medida del RADIO");
		  radio= numeros.nextDouble();
		  area_circulo=pi*radio*radio;
		  System.out.println("El area del triangulo es de : "+String.format("%.3f", area_circulo));
		}

		if(eleccion.equals("t")==false && eleccion.equals("T")==false && eleccion.equals("c")==false && eleccion.equals("C")==false)
		{
			System.out.println("No se ha elegido ninguna opcion");
		}
	}
}
