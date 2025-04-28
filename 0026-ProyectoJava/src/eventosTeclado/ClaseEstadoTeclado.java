package eventosTeclado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class ClaseEstadoTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoDefinido ventana= new marcoDefinido();
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.addKeyListener(new eventoTeclado());
	}

}
class marcoDefinido extends JFrame
{
	public marcoDefinido()
	{
		setBounds(400,200,400,400);
		setTitle("Ventana de eventos Teclado");
		setVisible(true);
	}
}
class eventoTeclado implements KeyListener
{
	public void keyTyped(KeyEvent e) {
		System.out.println("Has de pulsado y dejado de pulsar una tecla. Tecla: " +e.getKeyChar());		
	}
	public void keyPressed(KeyEvent e) {
		//System.out.println("Has pulsado una tecla");
		
	}
	public void keyReleased(KeyEvent e) {
		//System.out.println("Has dejado de pulsar una tecla");				
	}
}
