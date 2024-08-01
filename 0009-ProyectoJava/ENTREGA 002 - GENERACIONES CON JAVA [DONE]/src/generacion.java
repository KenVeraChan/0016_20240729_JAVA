
public class generacion {

	private static long anio=0;
	private static int numContador[]=new int[6];   //VECTOR DE GENERACIONES
	private static int comprobado=0;     //comprueba si ha llegado a 10 alguna de las celdas
	private static int i=0;              //puntero del vector
	private static int semaforo=0;       //es un valor para que no entre dos veces en el switch por la inchorencia
	
	public generacion()
	{
		//No hace nada
	}
	public void setanio(long anios)
	{
		anio=anios;
			if(anio<1930 || anio>2025)
			{
				//NO HACE NADA
			}
			if(anio>=2010 && anio<=2025)
			{   //GENERACION ALPHA
				System.out.println("----- GENERACION ALPHA -----");
				System.out.println("Nativos digitales al 100%");
				System.out.println("Son predilectos Hijos de padres Millenials y Centennials mas veteranos");
				numContador[0]++;
				System.out.println("Veces preguntadas por esta generacion: "+numContador[0]);
				System.out.println("");
			}
			if(anio>=1994 && anio<=2009)
			{   //GENERACION Z
				System.out.println("----- GENERACION Z -----");
				System.out.println("Infancia directa a Internet");
				System.out.println("Son irrverentes. Hijos de padres Baby Boomers y Generacion X");
				numContador[1]++;
				System.out.println("Veces preguntadas por esta generacion: "+numContador[1]);
				System.out.println("");
			}
			if(anio>=1980 && anio<=1993)
			{   //GENERACION Y
				System.out.println("----- GENERACION Y -----");
				System.out.println("Inicio de Internet y digitalizacion");
				System.out.println("Son intransigentes. Hijos de padres Baby boomers y Generacion X mas veteranos");
				numContador[2]++;
				System.out.println("Veces preguntadas por esta generacion: "+numContador[2]);
				System.out.println("");
			}
			if(anio>=1964 && anio<=1979)
			{   //GENERACION X
				System.out.println("----- GENERACION X -----");
				System.out.println("Tecnologia analoga y evolucion a la digitalizacion");
				System.out.println("Son inconformistas y van mas alla por la obsesion por el exito");
				numContador[3]++;
				System.out.println("Veces preguntadas por esta generacion: "+numContador[3]);
				System.out.println("");
			}
			if(anio>=1950 && anio<=1963)
			{   //GENERACION BABY BOOMERS
				System.out.println("----- GENERACION BABY BOOMERS -----");
				System.out.println("Epoca de Paz y Libertad");
				System.out.println("Son ambiciosos motivados a los logros personales y laborales");
				numContador[4]++;
				System.out.println("Veces preguntadas por esta generacion: "+numContador[4]);
				System.out.println("");
			}
			if(anio>=1930 && anio<=1949)
			{   //GENERACION SILENCIOSA Y TRADICIONAL
				System.out.println("----- GENERACION SILENCIOSA Y TRADICIONAL -----");
				System.out.println("Guerras entre paises");
				System.out.println("Son austeros saludables y energicos. Leales con superiores y buscan mas alla de ser reconocidos por el trabajo duro");
				numContador[5]++;
				System.out.println("Veces preguntadas por esta generacion: "+numContador[5]);
				System.out.println("");
			}
			
	}
	public int [] getnumContador()
	{
		return numContador;
	}	
	public int comprobante()
	{
	 for(i=0;i<getnumContador().length;i++)
	 {
		 if(getnumContador()[i]==10 && semaforo==0)
		 {
			 switch(i)
			 {
			 case 0: 
			 {
				 System.out.println("Ha preguntado ya 10 veces por la GENERACION ALPHA");
				 comprobado=1;
				 break;
			 }
			 case 1: 
			 {
				 System.out.println("Ha preguntado ya 10 veces por la GENERACION Z");
				 comprobado=1;
				 break;
			 }
			 case 2: 
			 {
				 System.out.println("Ha preguntado ya 10 veces por la GENERACION Y");
				 comprobado=1;
				 break;
			 }
			 case 3: 
			 {
				 System.out.println("Ha preguntado ya 10 veces por la GENERACION X");
				 comprobado=1;
				 break;
			 }
			 case 4: 
			 {
				 System.out.println("Ha preguntado ya 10 veces por la GENERACION BOOMERS");
				 comprobado=1;
				 break;
			 }
			 case 5: 
			 {
				 System.out.println("Ha preguntado ya 10 veces por la GENERACION SILENCIOSA Y TRADICIONAL");
				 comprobado=1;
				 break;
			 }
			 default:
				 break;
			 }
			 semaforo=1; //Para que no vuelva a entrar en el SWITCH
		 }
	   }
		return comprobado;
	}
}
