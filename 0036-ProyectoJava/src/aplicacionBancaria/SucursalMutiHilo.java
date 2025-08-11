package aplicacionBancaria;

public class SucursalMutiHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MEOTOD 3 DE LA REALIZACION DEL EJERCICIO 
		//Apertura de 100 cuentas corrientes
		//Cada cuenta con un saldo inicial de 2000 EUROS
		//Saldo total en el banco de 200.000 EUROS
		//Se realizarán transferencias de forma infinita
		
		//Propuesta de creación de 100 hilos
		//Arrays de objetos
		//Clase genérica para el array de objetos
		
		creacionHilos sucursales= new creacionHilos();  //SE CREA
	    sucursales.start();  //SE INICIA
	}
}
class creacionHilos extends Thread
{	
    private int min = 0;
    private int max = 99;
    private int transferencia = 500; //De momento la transferencia entre cuentas sera de valor constante
	private static int randomIntEntrada=0;
	private static int randomIntSalida=0;
	entidadBancaria transacciones;
	public void run()
	{
	    transacciones= new entidadBancaria();   //SOLO SE INSTANCIA UNA VEZ
		while(true)
		{
		 // Generar un entero aleatorio entre 1 y 10 (incluyendo 1 y 10)
		    randomIntEntrada = (int) (Math.random() * (this.max - this.min + 1)) + this.min;
		    randomIntSalida = (int) (Math.random() * (this.max - this.min + 1)) + this.min;
			transacciones.transferencia(randomIntSalida, randomIntEntrada, transferencia);
	     //transacciones.transferencia((int)currentThread().toString().charAt(7), randomIntEntrada, transferencia)
		}
	}
}
class entidadBancaria
{
	private final double cuentasBancarias[];
	private int cuentaOrigen=0;
	private int cuentaDestino=0;
	private double transferencia=0;
	private static double total=0; 
	
	public entidadBancaria()
	{
		this.cuentasBancarias = new double[100];
		for(int i=0;i<this.cuentasBancarias.length;i++)
		{
			cuentasBancarias[i]=2000;   //Saldo inicial de todas las cuentas bancarias
		}
	}
	public void transferencia(int cuentaOrigen, int cuentaDestino, int transferencia)
	{
		this.cuentaOrigen=cuentaOrigen;
		this.cuentaDestino=cuentaDestino;
		this.transferencia=transferencia;
		impresoPantalla();
	}
	public void impresoPantalla()
	{
	//PROCESO DE TRANSFERENCIA
		if(cuentasBancarias[this.cuentaOrigen]<this.transferencia)
		{
			//No se ejecuta la transferencia
		}
		else
		{
			cuentasBancarias[this.cuentaOrigen]=cuentasBancarias[this.cuentaOrigen]-this.transferencia;
			cuentasBancarias[this.cuentaDestino]=cuentasBancarias[this.cuentaDestino]+this.transferencia;
		//IMPRESO POR PANTALLA
			System.out.println("");
			System.out.println("Cuenta Origen: "+this.cuentaOrigen+" tiene de saldo: "+cuentasBancarias[this.cuentaOrigen]);
			System.out.println("Cuenta destino: "+this.cuentaDestino+" tiene de saldo: "+cuentasBancarias[this.cuentaDestino]);
			System.out.println("Valor de la transferencia: "+this.transferencia);
		//VALOR DE TODAS LAS CUENTAS
			for(int i=0;i<this.cuentasBancarias.length;i++)
			{
				total=total+this.cuentasBancarias[i];
			}
			System.out.println("El valor del total en el banco es de : "+total);
			System.out.println("");
			total=0; //Se reinicia la variable
		}
	}
}

