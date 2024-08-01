// EJERCICIO 6
// Se va a subir el sueldo a los empleados de la siguiente manera: Los que cobren < 15000 se les aumenta el 15%
// Los que cobren >= 15000 aumento del 12% además:
// Si son mujeres tienen un 2% adicional
// Si tienen hijos tienen un 1% adicional por hijo


package condicionales_IF_ELSE;
import java.util.Scanner;

public class Sueldos_Empleados {

	public static void main(String[] args) {

		//Declaracion variables
		Scanner pivote= new Scanner(System.in);
		
		double salario=0;
		int genero=0;
		int hijos=0;
		
		//Ejecucion del programa
		
		System.out.println("Introduzca su cobro anual: ");
		salario= pivote.nextDouble();
		
		do {
		System.out.println("");
		System.out.println("Indique su genero: ");
		System.out.println("Mujer  --> 0");
		System.out.println("Hombre --> 1");
		System.out.println("Otros  --> 2");
		System.out.println("");
		genero=pivote.nextInt();
		}while(genero<0 || genero>2);
		
		System.out.println("Indique la cantidad de hijos que tiene");
		hijos=pivote.nextInt();
		
		System.out.println("Según lo que ha indicado, sus datos son:");
		System.out.println("Salario anual: " + salario);
		if(genero==0)
		{
			System.out.println("Usted es: Mujer");
		}
		if(genero==1)
		{
			System.out.println("Usted es: Hombre");
		}
		if(genero==2)
		{
			System.out.println("Usted tiene otro género");
		}

		System.out.println("Usted tiene: "+hijos+" hijos");
		
		//Procedimiento
		//Si cobran menos de 15.000€
		// Se emplea la sentencia: String.format("%.2f",salario) para limitar los decimales del Salario
		
		if(salario<15000 && genero==0)
		{
			salario=salario*1.15+salario*0.02+salario*0.01*hijos;
			System.out.println("Su nuevo salario será: "+String.format("%.2f",salario)+"€");			
		}
		if(salario<15000 && genero>0)
		{
			salario=salario*1.15+salario*0.01*hijos;
			System.out.println("Su nuevo salario será: "+String.format("%.2f",salario)+"€");			
		}
		
		//Si cobran más de 15.000€
		
		if(salario>=15000 && genero==0)
		{
			salario=salario*1.12+salario*0.02+salario*0.01*hijos;
			System.out.println("Su nuevo salario será: "+String.format("%.2f",salario)+"€");			
		}
		if(salario>=15000 && genero>0)
		{
			salario=salario*1.12+salario*0.01*hijos;
			System.out.println("Su nuevo salario será: "+String.format("%.2f",salario)+"€");			
		}
	}
}
