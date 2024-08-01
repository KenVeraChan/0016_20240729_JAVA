// EJERCCIO 8
// Dado el siguiente array de números, crear un bloque de código 
// que sume por un lado solo los números pares y devuelva el 
// resultado y por otro solo los impares y tambiénpinte el resultado
// int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};

package estructura_Arrays_Con_Solucion;
public class P008_Suma_Pares_Impares {
	public static void main(String[] args) {
		int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
		int puntero=0;
		int suma_pares=0;
		int suma_impares=0;
		for(puntero=0;puntero<numeros.length;puntero++)
		{
			if(numeros[puntero]%2==0)
			{
				suma_pares=suma_pares+numeros[puntero];
			}
			else
			{
				suma_impares=suma_impares+numeros[puntero];
			}
		}
		System.out.println("La suma de los numeros pares es: "+suma_pares);
		System.out.println("La suma de los numeros impares es: "+suma_impares);
	}
}
