// EJERCICIO 3
// Con varias estructuras switch … case ver si un número es divisible por 2,3 o por 5

package condicionales_SWITCH_CASE;
import java.util.Scanner;

public class Divisibilidad_2_3_5 {

	public static void main(String[] args) {
		Scanner divisible = new Scanner(System.in);
		int detector=0;
		int numero_intro=0;
		
		do {
			System.out.println("");
			System.out.println("Introduzca un numero para comprobar su divisibilidad");
			numero_intro= divisible.nextInt();
			System.out.println("");
		}while(numero_intro<0);  //Si mete un numero negativo se repite el bucle
		
		if(numero_intro%2==0 && numero_intro%3==0 && numero_intro%5==0)
		{
			detector=1;
		}
		if(numero_intro%2==0 && numero_intro%3==0 && numero_intro%5!=0)
		{
			detector=2;
		}
		if(numero_intro%2==0 && numero_intro%3!=0 && numero_intro%5==0)
		{
			detector=3;
		}
		if(numero_intro%2==0 && numero_intro%3!=0 && numero_intro%5!=0)
		{
			detector=4;
		}
		if(numero_intro%2!=0 && numero_intro%3==0 && numero_intro%5==0)
		{
			detector=5;
		}
		if(numero_intro%2!=0 && numero_intro%3==0 && numero_intro%5!=0)
		{
			detector=6;
		}
		if(numero_intro%2!=0 && numero_intro%3!=0 && numero_intro%5==0)
		{
			detector=7;
		}
		if(numero_intro%2!=0 && numero_intro%3!=0 && numero_intro%5!=0)
		{
			detector=8;
		}
		
		switch(detector)
		{
		case 1: System.out.println(numero_intro+" es divisible entre 2 3 y 5"); break;
		case 2: System.out.println(+numero_intro+" es divisible entre 2 3 y pero NO 5"); break;
		case 3: System.out.println(+numero_intro+" es divisible entre 2 y 5 pero NO 3"); break;
		case 4: System.out.println(+numero_intro+" es divisible entre 2 pero NO 3 ni 5"); break;
		case 5: System.out.println(+numero_intro+" es divisible entre 3 y 5 pero NO 2"); break;
		case 6: System.out.println(+numero_intro+" es divisible entre 3 pero NO 2 ni 5"); break;
		case 7: System.out.println(+numero_intro+" es divisible entre 5 pero NO 2 ni 3"); break;
		case 8: System.out.println(+numero_intro+" NO es divisible entre NINGUNO"); break;
		default: break;
		}
	}

}
