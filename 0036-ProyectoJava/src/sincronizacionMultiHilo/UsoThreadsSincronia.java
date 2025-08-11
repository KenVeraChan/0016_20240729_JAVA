package sincronizacionMultiHilo;

public class UsoThreadsSincronia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SincronizacionThreadsUno hilo1= new SincronizacionThreadsUno();
		SincronizacionThreadsDos hilo2= new SincronizacionThreadsDos(hilo1);
		hilo1.start();   //Hilo puede iniciarse cuando quiera
		hilo2.start();   //Hilo obligado a iniciarse tras el hilo1
		System.out.println("Hemos terminado!");   //Hilo va por libre
	}

}

class SincronizacionThreadsUno extends Thread
{
	public void run()
	{
		for (int i=0; i<20;i++)
		{
			//Ejecución de una tarea
			System.out.println("Ejecutando thread: "+getName());
			try {
				sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class SincronizacionThreadsDos extends Thread
{
	private Thread hilo;
	
	public SincronizacionThreadsDos(Thread hilo)
	{
		this.hilo=hilo;
	}
	
	public void run()
	{
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0; i<20;i++)
		{
			//Ejecución de una tarea
			System.out.println("Ejecutando thread: "+getName());
			try {
				sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}