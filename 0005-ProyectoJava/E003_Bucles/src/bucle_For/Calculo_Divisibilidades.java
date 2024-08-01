// EJERCICIO 8
// Con los 20 primeros números decir con cada uno por cual 
// es divisible: ejemplo: 1 –> es divisible por 1
// 2 –> es divisible por 1 es divisible por 2 …

package bucle_For;
public class Calculo_Divisibilidades {
	public static void main(String[] args) {
			int numeros=0;
			int puntero=1;
			for(numeros=0;numeros<=20;numeros++)
			{
				for(puntero=1;puntero<=20;puntero++)
				{
					if(numeros%puntero==0)
					{
						System.out.println(numeros+" es divisible entre "+puntero);
					}
				}
				System.out.println("");
				System.out.println("");
			}
	}
}
