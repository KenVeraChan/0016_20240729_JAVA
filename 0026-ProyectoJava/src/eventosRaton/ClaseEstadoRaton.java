package eventosRaton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class ClaseEstadoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fondo base= new fondo();
		base.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//base.addMouseListener(new EventosDeRaton());
		base.addMouseListener(new EventoUnicoRaton());
	}
}
class fondo extends JFrame
{
	public fondo()
	{
		setBounds(500,200,400,400);
		setTitle("Ventana de Ratón");
		setVisible(true);
	}
}
class EventosDeRaton implements MouseListener
{
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click y soltado");	
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("Has presionado");	
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("Has soltado");	
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("Has entrado");			
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("Has salido");	
	}
}
/*CON CLASE ADAPTADORA PARA NO IMPLEMENTAR TODOS LOS METODOS*/
class EventoUnicoRaton extends MouseAdapter
{
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
		System.out.println("COORDENADA X: "+e.getX());
		System.out.println("COORDENADA Y: "+e.getY());
		System.out.println("(X,Y)="+"("+e.getX()+","+e.getY()+")");
	}
}
