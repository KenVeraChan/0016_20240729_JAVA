// EJERCICIO 15
// Amplíe el programa anterior haciendo que el programa lleve 
// la cuenta de las respuestas correctas e incorrectas e indique 
// la nota correspondiente. Si la nota esigual o mayor que 9, el 
// programa felicitará al usuario por el resultado.

package bucle_For;
import java.util.Scanner;
public class P015_Tabla_Multiplicar_Parte_3 {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int cifra_1=0;
		int cifra_2=0;
		int resultado=0; //Resultado de la operacion
		int resultado_real=0;
		int contador=0;		// Cuenta las veces que se repetiras las operaciones
		int puntero=0;		//El que ira recorriendo el FOR
		double correctas=0.0;    // Respuestas correctas extraido como nota final
		System.out.println("TABLA DE MUTIPLICAR");
		while(contador<=0)
		{
			System.out.println("Indique cuantas veces desea sacar las mutiplicaciones:");
			contador=numeros.nextInt();
			if(contador<=0) 
			{
				System.out.println("Imposible. El numero de preguntas debe ser al menos 1 vez");
			}
		}
		for(puntero=0;puntero<contador;puntero++)
		{
			cifra_1=(int) (Math.floor(Math.random()*10+1));  //Se generan los numeros
			cifra_2=(int) (Math.floor(Math.random()*10+1));
			System.out.print("¿Cuanto es "+cifra_1+" x "+cifra_2+"? ");
			resultado=numeros.nextInt();
			resultado_real=cifra_1*cifra_2;
			if(resultado==resultado_real)
				{
				System.out.println("");
				System.out.println("Respuesta CORRECTA");
				System.out.println("");
				correctas=correctas+1;
				}
			else 
				{
				System.out.println("");
				System.out.println("Respuesta INCORRECTA");
				System.out.println("");
				}
		}
		System.out.println("Ha respondido "+correctas+" preguntas correctamente");
		correctas=(correctas/contador)*10;
		if(correctas>=9)
		{
			System.out.println("Ha obtenido una nota de: "+correctas);
			System.out.println("Muchas felicidades!!!");
		}
		if(correctas<9)
		{
			System.out.println("Ha obtenido una nota de: "+correctas);
		}
		numeros.close();
	}
}
