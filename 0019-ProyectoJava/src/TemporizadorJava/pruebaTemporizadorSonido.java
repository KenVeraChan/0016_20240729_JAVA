package TemporizadorJava;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class pruebaTemporizadorSonido {

	public static void main(String[] args) {
		Reloj mireloj= new Reloj();
		mireloj.ejecutarTemporizador(3000,true);
		JOptionPane.showMessageDialog(null, "Pulsar aceptar para terminar");
	}
}
class Reloj{
	public void ejecutarTemporizador(int intervalo, boolean sonido) {
		Timer miTemporizador= new Timer(intervalo, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos: "+ahora);
				if(sonido)
				{
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});
		miTemporizador.start();
	}
}
