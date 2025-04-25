package eventosVentanas;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ventanas001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventanaAccionada ventana= new ventanaAccionada();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.addWindowListener(new ventanaEventos());
	}
}

class ventanaAccionada extends JFrame
{
	public ventanaAccionada()
	{
		setBounds(200,200,300,300);
		setTitle("Ventana Accionada");
		setVisible(true);
	}
}
class ventanaEventos implements WindowListener
{
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("la ventana ha sido cerraqwda");
	}
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("la ventana ha sido cerrada");
	}
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("la ventana ha sido modificada");
	}
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
