// EJERCICIO 3
// Calcular la suma de los números pares comprendidos entre 10 y 50

package bucle_Do_While;
public class Calculo_Suma_Pares {
	public static void main(String[] args) {
	     int suma=10;
	     int resultado=0;
		 do {
			 resultado=resultado+suma;
			 suma=suma+2;
			 System.out.println(suma+"     "+resultado);
		 }while(suma<50);  //No se puede poner igual que 50 porque entraría una vez más al bucle
		 System.out.println("La suma es: "+resultado);
	}
}
