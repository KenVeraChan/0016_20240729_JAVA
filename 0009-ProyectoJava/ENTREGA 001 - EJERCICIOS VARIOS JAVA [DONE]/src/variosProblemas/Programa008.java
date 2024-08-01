package variosProblemas;

public class Programa008 {

	private static String palabras[]= new String[3];
	private int i=0;
	private int contador=0;
	
	public Programa008()
	{
		
	}
	public void llenaVector(String palabra[])
	{
		contador=0;  //REINICIO
		//RCOMPARACION Y REVISION DEL VECTOR DE ENTRADA
		for(i=0;i<palabra.length;i++)
		{
			palabras[i]=palabra[i];
			for(int j=0;j<palabra.length;j++)
			{
				if(palabras[i].equals(palabra[j])==true && i!=j)
				{
					contador=contador+1;  //Se contabiliza el numero de palabras repetidas
				}
			}
		}
		if(contador>palabras.length)
		{
			contador=palabras.length;  //EL CONTADOR LLEGO AL MAXIMO
		}
	  System.out.println("Se han contabilizado: "+contador+" palabras iguales");
	}
}
