// EJERCICIO 7
// Hallar todas las tablas de multiplicar con for anidados

package bucle_For;
import java.util.Scanner;

public class Tablas_de_Multiplicar {
	public static void main(String[] args) {
		Scanner tablas= new Scanner(System.in);
		int tab=0;
		int i=0;    //Puntero de desplazamiento filas por tabla
		int j=0;    //Puntero de desplazamiento tablas
		System.out.println("Introduzca las tablas de mutiplicar que desea mostrar: ");
		tab= tablas.nextInt();
		for(i=1;i<=tab;i++)   //Con este bucle cambia de tabla
		{
			for(j=0;j<=12;j++)    //Con este bucle saca la tabla
			{
				System.out.println(j+"x"+i+"="+j*i);
			}
			System.out.println("");
		}
	}

}
