package variosProblemas;

public class Programa003 {

	private int n1=0;
	private int n2=0;
	
	public Programa003()
	{
		
	}
	public void setnumeros(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		getmutiplicidad();
	}
	public void getmutiplicidad()
	{
		//DIVISIBILIDAD ENTRE 2
		if(this.n1%2==0 && this.n2%2==0)
		{     //DIVISIBLE ENTRE 2
			System.out.println("El numero: "+n1+" y el numero: "+n2+" son divisibles entre 2");
		}
		if(this.n1%2!=0 && this.n2%2==0)
		{     //DIVISIBLE ENTRE 2
			System.out.println("El numero: "+n1+" no es divisible entre 2 pero el numero: "+n2+" si");
		}
		if(this.n1%2==0 && this.n2%2!=0)
		{     //DIVISIBLE ENTRE 2
			System.out.println("El numero: "+n1+" es divisible entre 2 pero el numero: "+n2+" no");
		}
		if(this.n1%2!=0 && this.n2%2!=0)
		{     //DIVISIBLE ENTRE 2
			System.out.println("Los numeros: "+n1+" y "+n2+" no son divisibles entre 2");
		}
		
		//DIVISIBILIDAD ENTRE 3
		if(this.n1%3==0 && this.n2%3==0)
		{     //DIVISIBLE ENTRE 3
			System.out.println("El numero: "+n1+" y el numero: "+n2+" son divisibles entre 3");
		}
		if(this.n1%3!=0 && this.n2%3==0)
		{     //DIVISIBLE ENTRE 3
			System.out.println("El numero: "+n1+" no es divisible entre 3 pero el numero: "+n2+" si");
		}
		if(this.n1%3==0 && this.n2%3!=0)
		{     //DIVISIBLE ENTRE 3
			System.out.println("El numero: "+n1+" es divisible entre 3 pero el numero: "+n2+" no");
		}
		if(this.n1%3!=0 && this.n2%3!=0)
		{     //DIVISIBLE ENTRE 3
			System.out.println("Los numeros: "+n1+" y "+n2+" no son divisibles entre 3");
		}
		
		//DIVISIBILIDAD ENTRE 5
		if(this.n1%5==0 && this.n2%5==0)
		{     //DIVISIBLE ENTRE 5
			System.out.println("El numero: "+n1+" y el numero: "+n2+" son divisibles entre 5");
		}
		if(this.n1%5!=0 && this.n2%5==0)
		{     //DIVISIBLE ENTRE 5
			System.out.println("El numero: "+n1+" no es divisible entre 5 pero el numero: "+n2+" si");
		}
		if(this.n1%5==0 && this.n2%5!=0)
		{     //DIVISIBLE ENTRE 5
			System.out.println("El numero: "+n1+" es divisible entre 5 pero el numero: "+n2+" no");
		}
		if(this.n1%5!=0 && this.n2%5!=0)
		{     //DIVISIBLE ENTRE 5
			System.out.println("Los numeros: "+n1+" y "+n2+" no son divisibles entre 5");
		}
		System.out.println("");

	}
}
