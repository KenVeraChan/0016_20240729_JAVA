package eventosVentanas;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class ClaseEstadoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventanaEstado ventana= new ventanaEstado();
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.addWindowStateListener(new ventanaEventosEstado());
	}

}
class ventanaEstado extends JFrame
{
	public ventanaEstado()
	{
		setBounds(200,200,300,300);
		setTitle("Ventana Accionada Adaptada");
		setVisible(true);
	}
}

class ventanaEventosEstado implements WindowStateListener
{
	public void windowStateChanged(WindowEvent e) 
	{
		System.out.println("La ventana ha cambiado");
		System.out.println(e.getNewState());
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) System.out.println("Has maximizado la ventana");
		if(e.getNewState()==Frame.ICONIFIED) System.out.println("Has minimizado la ventana");
		else System.out.println("Has hecho un cambio sin especificar");
		
	}
}


