// EJERCICIO 5
// Un numero es perfecto cuando todos sus divisores sumados 
// dan el mismo numero Ejemplo: 6 = 1 + 2 + 3; luego 6 es un numero perfecto
// Mostrar los números perfectos hasta el 100

package bucle_While;
public class Numeros_Perfectos {
	public static void main(String[] args) {
    // Se va a realizar la corespondiente division de numeros para 
    // emplear el bucle do while, comprobando con otro while la divisibilidad 
      int n=1;
      int divisibles=1;
      int contador=0;
      while(divisibles<100)  //Solo pedía hasta el 100
      {
          n=1;  //Se reinicia el valor de n
          contador=0; //Se reinicia el valor de contador
          while(n<divisibles)
          {
              if(divisibles%n==0)
              {
                 contador=contador+n;     
              }
            n=n+1;
          }
          if(contador==divisibles)
          {
              System.out.println("El numero: "+contador+" es perfecto");
          }
       divisibles=divisibles+1;
      }
	}
}
