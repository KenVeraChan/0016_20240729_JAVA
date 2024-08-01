// EJERCICIO 3
// Calcular los 25 primeros números primos, NO DEL 1 AL 25
package bucle_While;

public class Calculo_Numeros_Primos {
	public static void main(String[] args) {
		int n=1;
		int contador=1;
		System.out.println("2");    //Por defecto no se ponen estos números aqui
		System.out.println("3");    //Pues luego son condicion de primos para los siguientes
		while(contador<24)
		{
			if(n>7 && n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0)
			{
				System.out.println(n);
				n=n+1;
				contador=contador+1;
			}
			if(n>3 && n<=7 && n%2!=0 && n%3!=0)
			{
				System.out.println(n);
				contador=contador+1;
			}
			n=n+1;
		}
	}
}
