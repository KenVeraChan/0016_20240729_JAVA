// EJERCICIO 4
// Escribir el factorial del numero 15

package bucle_For;

public class Calculo_Factorial_Quince {

	public static void main(String[] args) {
		// Se pone long porque INT no alcanza a calcular el factorial de 15 por el numero grande
        long factorial=15;    //Para probar otro numero simplemente cambiar el valor de factorial
        long resultado=1;
        int numero=0;
		
        for(numero=0;numero<15;numero++)   //Y cambiar aqui el numero de alcance al elegido antes
        {
		resultado=resultado*(factorial-numero);
        }
        System.out.println("El factorial de 15 es: "+resultado);
	}
}
