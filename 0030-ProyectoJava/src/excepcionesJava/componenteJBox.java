package excepcionesJava;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class componenteJBox {

	public static void main(String[] args) {
		laminaFondo Lamina= new laminaFondo();
		Lamina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class laminaFondo extends JFrame
{
	public laminaFondo()
	{
		setBounds(100, 100, 500, 300);
		setTitle("Excepciones Java - Imagen cargada");
		add(new panelFondo());
		setVisible(true);
	}
}
class panelFondo extends JPanel
{
	private BufferedImage imagen;
	public panelFondo()
	{
		try {
			imagen= ImageIO.read(new File("src/excepcionesJava/trainStation.png"));
		}catch (IOException e) {
			System.out.println("Error al cargar la imagen: " + e.getMessage());
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//ERROR NO CONDICIONADA POR ESO SERIA UN ERROR DE TIPO RUNTIME
		if(imagen == null) 
		{	//SOLO EN EL CASO DE QUE NO SE HAYA CARGADO LA IMAGEN
			System.out.println("La imagen no se ha cargado correctamente.");
			return;
		}
		else
		{
		int alturaImagen= imagen.getHeight(this);
		int anchoImagen= imagen.getWidth(this);
		g.drawImage(imagen, 0, 0, anchoImagen, alturaImagen, this);
		}
	}
}