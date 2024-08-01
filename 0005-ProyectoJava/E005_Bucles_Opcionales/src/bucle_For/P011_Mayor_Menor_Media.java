// EJERCICIO 11
// Escriba un programa que pregunte cuántos números se van a 
// introducir, pida esos números, y escriba el mayor, el menor 
// y la media aritmética. Se recuerda que la media aritmética de 
// un conjunto de valores es la suma de esos valores dividida por 
// la cantidad de valores.

package bucle_For;
import java.util.Scanner;
public class P011_Mayor_Menor_Media {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
			double maximo=0.0;      //Pivotes que iran alcanzando el valor del minimo y maximo
			double minimo=0.0;
			double aux=0.0;
			int pivote=0;
			int contador=0;    //Cantidad de numeros que se iran introduciendo
			double media=0.0;
			while(contador<=0)
			{
				System.out.println("MAYOR MENOR Y MEDIA ARITMETICA");
				System.out.println("Indique la cantidad de numeros que quiere introducir: ");
				contador=numeros.nextInt();
				if(contador<=0)
				{
					System.out.println("Es imposible!!!");
				}
			}
			for(pivote=0;pivote<contador;pivote++)
			{
				System.out.println("Escriba el numero "+pivote+":");
				aux=numeros.nextDouble();
				if(aux<minimo && aux<maximo)
				{
					minimo=aux;    //Siempre que sea menor que el maximo y minimo, se pondrá el minimo
				}
				if(aux>maximo)
				{
					if(pivote==0)
					{
						minimo=aux;   //Para comenzar con el ciclo
					}
				    maximo=aux;       //El maixmo hereda el valor que tenia el aux	
				}
				//Recibe el numero siguiente
				media=media+aux;	
			}
			media=media/contador;
			System.out.println("El MAYOR de los numeros es: "+maximo);
			System.out.println("El MENOR de los numeros es: "+minimo);
			System.out.println("La media aritmetica de los numeros es: "+String.format("%.2f", media));
		numeros.close();
	}
}
