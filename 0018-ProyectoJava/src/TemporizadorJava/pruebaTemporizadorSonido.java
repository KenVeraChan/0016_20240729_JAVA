package TemporizadorJava;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class pruebaTemporizadorSonido {

	public static void main(String[] args) {
		Reloj mireloj= new Reloj(3000,true);
		mireloj.ejecutarTemporizador();
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para terminar");
	}

}

class Reloj{
	private int intervalo;
	private boolean sonido;
	
	public Reloj (int intervalo, boolean sonido)
	{
		this.intervalo=intervalo;
		this.sonido=sonido;
	}
	public void ejecutarTemporizador() {
		ActionListener oyente= new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos: "+ahora);
				if(sonido)
				{
					Toolkit.getDefaultToolkit().beep();
				}
			}
		};
		Timer miTemporizador= new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	/*
	private class DameLaHora implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos: "+ahora);
			if(sonido)
			{
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	*/
}
