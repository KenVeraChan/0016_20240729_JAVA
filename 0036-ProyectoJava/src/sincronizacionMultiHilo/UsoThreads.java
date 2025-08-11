package sincronizacionMultiHilo;


public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SincronizacionThreads hilo1= new SincronizacionThreads();
		SincronizacionThreads hilo2= new SincronizacionThreads();

		hilo1.start();
		hilo2.start();
	}
}
class SincronizacionThreads extends Thread
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

