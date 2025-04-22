package interfacesGraficas;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujandoEnJFrame {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Marco nuevaVentana= new Marco();
		nuevaVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marco extends JFrame
{
	private static int puntero=0;
	public Marco()
	{
		setBounds(300,200,800,450);
		laminaDibujo lamina= new laminaDibujo();
		add(lamina);
		setVisible(true);
	}
}
class laminaDibujo extends JPanel
{
	private static int desplazamiento=0;
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);  /*Llamada a paintComponent desde la clase padre JPanel*/
		for(desplazamiento=0;desplazamiento<5;desplazamiento++)
		{
			g.drawRect(20+130*desplazamiento, 20, 125, 75);
		}
		Graphics2D g2= (Graphics2D)g;  /*Casting de transformación del objeto g en un objeto Graphics 2D almacenado en g2*/
		
		/*TRAZADO DEL RECTANGULO*/
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		float midash[]= {10.5f};
		BasicStroke milapiz = new BasicStroke(5,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,100,midash,2);
		Color colorido= new Color(120,120,120);
		g2.setPaint(colorido);
		g2.setStroke(milapiz);
		g2.draw(rectangulo);
		
		/*TRAZADO DE UNA CURVA CUÁDRICA*/
		QuadCurve2D parabola= new QuadCurve2D.Double();
		parabola.setCurve(120, 120, 200, 360, 280, 120);
		g2.draw(parabola);
	}
}








