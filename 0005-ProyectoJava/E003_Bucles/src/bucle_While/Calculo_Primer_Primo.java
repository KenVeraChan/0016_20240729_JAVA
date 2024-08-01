// EJERCICIO 4
// Encontrar el primer número primo a partir de 198

package bucle_While;

public class Calculo_Primer_Primo {

	public static void main(String[] args) {
		int n=1;
		int contador=1;
		
		while(contador<204)
		{
			//Busca todos los numeros primos 
			if(n>7 && n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0)
			{
				if(n>198)
				{
					//Imprime el primer numero primo que encuentre que sea superior a 198
					System.out.println(n);	
					break;  //Finaliza el bucle completo y tras devolver el primer numero primo superior a 198
				}
				n=n+1;
				contador=contador+1;
			}
			if(n>3 && n<=7 && n%2!=0 && n%3!=0)
			{
				contador=contador+1;
			}
			n=n+1;
		}
	}

}
