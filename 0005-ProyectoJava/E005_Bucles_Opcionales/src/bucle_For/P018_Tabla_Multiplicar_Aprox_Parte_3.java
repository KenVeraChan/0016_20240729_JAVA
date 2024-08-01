// EJERCICIO 18
// Amplíe el programa anterior haciendo que el programa lleve 
// la cuenta de las respuestas correctas e incorrectas e indique 
// la nota correspondiente. Si la nota esigual o mayor que 9, el 
// programa felicitará al usuario por el resultado.

package bucle_For;
import java.util.Scanner;
public class P018_Tabla_Multiplicar_Aprox_Parte_3 {
	public static void main(String[] args) {
		Scanner numeros= new Scanner(System.in);
		int cifra_1=0;
		int cifra_2=0;
		double resultado=0; //Resultado de la operacion
		double resultado_real=0;
		int puntero=0;   //contador que ira incrementandose para cumplir con las veces que se dijo las multiplicaciones
		int contador=0;  //Dira cuantas veces se haran las multiplicaciones
		double puntos=0.0;   //Se contabilizaran los puntos que se han acumulado
		System.out.println("TABLA DE MUTIPLICAR");
		//Primero que se diga cuantas veces se haran las multiplicaciones
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
			cifra_1=(int) (Math.floor(Math.random()*11+99));  //Se generan los numeros
			cifra_2=(int) (Math.floor(Math.random()*11+99));
			System.out.print("¿Cuanto es "+cifra_1+" x "+cifra_2+"? ");
			resultado=numeros.nextInt();
			resultado_real=cifra_1*cifra_2;
			//Resultado exacto
			if(resultado==resultado_real)
				{
				System.out.println("");
				System.out.println("Respuesta CORRECTA");
				System.out.println("");
				puntos=puntos+1;  //Por el resultado exacto
				}
			//Resultado incorrecto y se tienen que ver la cercania de la solucion dada
			//Aproximacion del 10% que significa que este dentro del intervalo:
			//Por debajo del valor exacto en un 10%
			//Por encima del valor exacto en un 10%
			if(resultado>=0.9*resultado_real && resultado<=1.1*resultado_real && resultado!=resultado_real)
				{
				System.out.println("");
				System.out.println("Ha fallado por menos del 10%!");
				System.out.println("La respuesta correcta es: "+resultado_real);
				System.out.println("");
				puntos=puntos+0.66;
				}
			//Aproximacion del 30% que significa que este dentro del intervalo:
			//Por debajo del valor exacto en un 30%
			//Por encima del valor exacto en un 30%
			//Pero para evitar fallos de interpretacion: se condiciona que sea superior al rango 10% 
			//entorno al valor exacto
			if((resultado>=0.7*resultado_real && resultado<0.9*resultado_real && resultado!=resultado_real)||(resultado>1.1*resultado_real && resultado<=1.3*resultado_real && resultado!=resultado_real))
			{
			System.out.println("");
			System.out.println("Ha fallado por menos del 30%!");
			System.out.println("La respuesta correcta es: "+resultado_real);
			System.out.println("");
			puntos=puntos+0.33;
			}
			//Caso de que se aleje mas alla del 30% por encima y por debajo del valor exacto
			if((resultado<0.7*resultado_real || resultado>1.3*resultado_real) && resultado!=resultado_real)
			{
			System.out.println("");
			System.out.println("Ha fallado por mas del 30%!");
			System.out.println("La respuesta correcta es: "+resultado_real);
			System.out.println("");
			// No se suma nada de puntos por haberse alejado mas del porcentaje del 30%
			}
		}
		//Area de contabilizacion de puntos
		puntos=(puntos/contador)*10;   //Calculo de nota
		System.out.println("Ha obtenido una nota de: "+String.format("%.2f", puntos));
		if(puntos>=9)
		{
			System.out.println("Enhorabuena por el resultado!!!");
		}
		numeros.close();
	}
}
