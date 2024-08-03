package interfacesGraficasJFrame;
import javax.swing.*;

public class PrimerJFrame {

	public static void main(String[] args) {
		JFrame miventana= new JFrame();
		//Inicialmente la ventana o JFrame: tiene 0 px de alto y ancho y es invisible
		miventana.setSize(400, 400);
		miventana.setLocation(250, 250);
		miventana.setDefaultCloseOperation(3);
		miventana.setVisible(true); //Siempre al final esta sentencia
	}

}
