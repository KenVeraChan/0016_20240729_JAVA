package colorTextoAnonimClass;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class laminasAnonimClass {

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
		add(new JPanel() {    //Sin necesidad de crear una nueva clase para la LAMINA
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);  //Llamar al método de paintComponent de la clase padre que es quien pinta componentes
				g.setFont(new Font("Verdana",Font.BOLD,30));  //Se evita crear instancia FONT
				g.setColor(new Color(155,8,255));  //Se evita crear instancia COLOR llama al paintComponent para agregar el color
				g.drawString("Primer Panel",40,40); //Se llama al paintComponent para meter texto
			}
		});
	}
}