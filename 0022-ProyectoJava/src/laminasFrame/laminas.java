package laminasFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class laminas {

	public static void main(String[] args) {
		MarcoTexto miMarco= new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame
{
	//Marco base de la aplicación
	public MarcoTexto()
	{
		//PROPIEDDES DE LA VENTANA
		setBounds(400,200,600,350);
		setTitle("Escritura en JFrame");
		//ICONO DE VENTANA
		Toolkit miSistem= Toolkit.getDefaultToolkit();
		Image miIcono= miSistem.getImage("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0022-ProyectoJava/images/java.png");
		setIconImage(miIcono);
		setVisible(true);
		//LAMINAS INCLUIDAS: TEXTO, OBJETOS ETC...
		PrimerPanel milamina= new PrimerPanel();
		add(milamina);

	}
}
class PrimerPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  //Llamar al método de paintComponent de la clase padre que es quien pinta componentes
		g.drawString("Primer Panel",20,20);
	}
}




