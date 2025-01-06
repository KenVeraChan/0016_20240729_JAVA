package frameSegundaParte;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameSegunda {

	public static void main(String[] args) {
		MiFrameSegundo ventanaPrimera = new MiFrameSegundo();
	}

}

class MiFrameSegundo extends JFrame
{
	public MiFrameSegundo()
	{
		//Zona de la configuración de la ventana
		setBounds(600,150,450,450);
		setTitle("Primera Página SFER4D-Corporation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Zona de la configuración del icono de la ventana
		Toolkit miSistem= Toolkit.getDefaultToolkit();
		Image miIcono= miSistem.getImage("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0021-ProyectoJava/images/java.png");
		setIconImage(miIcono);
		setVisible(true);
	}
}
