package eventosVentanas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class ClaseAdaptadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventanaAccionadaAdaptada ventana= new ventanaAccionadaAdaptada();
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.addWindowListener(new ventanaEventosAdaptada());
	}

}
class ventanaAccionadaAdaptada extends JFrame
{
	public ventanaAccionadaAdaptada()
	{
		setBounds(200,200,300,300);
		setTitle("Ventana Accionada Adaptada");
		setVisible(true);
	}
}

class ventanaEventosAdaptada extends WindowAdapter
{
	public void windowClosed(WindowEvent e)
	{
		System.out.println("Gracias por trabajar en la APP");
	}
}




