package interfacesGraficasJFrame;
import javax.swing.*;

public class PrimerJFrame {
	public static void main(String[] args) {
			MiFrame miventana= new MiFrame();

	}

}
class MiFrame extends JFrame
{
	public MiFrame()
	{
		//Inicialmente la ventana o JFrame: tiene 0 px de alto y ancho y es invisible
		setSize(400, 400);
		setLocation(150, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); //Siempre al final esta sentencia
	}
}

