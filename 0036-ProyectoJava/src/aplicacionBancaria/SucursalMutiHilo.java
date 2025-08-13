package aplicacionBancaria;

import java.util.concurrent.locks.*;

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
		entidadBancaria miBanco= new entidadBancaria();
		for(int i=0;i<100;i++)
		{
			creacionHilos sucursales= new creacionHilos(miBanco,i,2000);  //SE CREA
			Thread hilo= new Thread(sucursales);
			hilo.start();     //Se INICIA
		}
	}
}
class creacionHilos implements Runnable
{	
	private int randomIntSalida=0;
	private entidadBancaria mibanco;
	private double cantidadMaxima=0;
	
	public creacionHilos(entidadBancaria miBanco, int cuentaOrigen, double cantidadMaxima)
	{
		this.mibanco=miBanco;
		this.randomIntSalida=cuentaOrigen;
		this.cantidadMaxima=cantidadMaxima;
	}
	
	public void run()
	{
		while(true)
		{
			double transferencia = Math.random()*this.cantidadMaxima; //De momento la transferencia entre cuentas sera de valor constante
		 // Generar un entero aleatorio entre 1 y 10 (incluyendo 1 y 10)
		    int randomIntEntrada = (int) (Math.random()*100);
		    this.mibanco.transferencia(this.randomIntSalida, randomIntEntrada, transferencia);
		    try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class entidadBancaria
{
	private Lock bloqueaBanco= new ReentrantLock();    //Encapsulacion de interfaz Lock
	private Condition saldoSuficiente;   //Encapsulacion de interfaz Condition
	
	private final double cuentasBancarias[];
	
	public entidadBancaria()
	{
		this.cuentasBancarias = new double[100];
		for(int i=0;i<this.cuentasBancarias.length;i++)
		{
			cuentasBancarias[i]=2000;   //Saldo inicial de todas las cuentas bancarias
		}
		saldoSuficiente= bloqueaBanco.newCondition();
	}
	public void transferencia(int cuentaOrigen, int cuentaDestino, double transferencia)
	{
		bloqueaBanco.lock();
		try {
			//PROCESO DE TRANSFERENCIA
				//if(cuentasBancarias[cuentaOrigen]<transferencia)
				//{
				//	//No se ejecuta la transferencia
				//}
				while(cuentasBancarias[cuentaOrigen]<transferencia) saldoSuficiente.await();
				if(cuentasBancarias[cuentaOrigen]>transferencia)
				{
					cuentasBancarias[cuentaOrigen]-=transferencia;
					cuentasBancarias[cuentaDestino]+=transferencia;
				//IMPRESO POR PANTALLA
					System.out.println("");
					System.out.println("Cuenta Origen: "+cuentaOrigen+" tiene de saldo: "+String.format("%.2f",cuentasBancarias[cuentaOrigen]));
					System.out.println("Cuenta destino: "+cuentaDestino+" tiene de saldo: "+String.format("%.2f",cuentasBancarias[cuentaDestino]));
		
					System.out.println("Valor de la transferencia: "+String.format("%.2f",transferencia));
		
					System.out.println("El valor del total en el banco es de : "+getSaldoTotal(cuentasBancarias));
					System.out.println("");
				}
				saldoSuficiente.signalAll();  //Todos los hilos que han pasado por este punto despiertan a los que se quedaron dormidos al no cumplirse con la sentencia
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				bloqueaBanco.unlock();
			}
	}	
	public String getSaldoTotal(double[] cuentasBancarias)
	{
		//VALOR DE TODAS LAS CUENTAS
		double total=0;   //Se reinicia el valor
		for(int i=0;i<cuentasBancarias.length;i++)
		{
			total=total+cuentasBancarias[i];
		}
		return String.format("%.2f",total);
	
	}
}
