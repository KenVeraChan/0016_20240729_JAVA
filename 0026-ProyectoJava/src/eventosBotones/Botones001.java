package eventosBotones;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botones001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		escenarioFondo lamina = new escenarioFondo();
		 lamina.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class escenarioFondo extends JFrame
{
	public escenarioFondo() 
	{
		laminasDelanteras marco= new laminasDelanteras();
		setTitle("hola mundo");
		setBounds(100,100,400,400);
		add(marco);
		setVisible(true);
	}
}
class laminasDelanteras extends JPanel implements ActionListener
{
	JButton botonAzul= new JButton("Color Azul");
	JButton botonVerde= new JButton("Color Verde");
	JButton botonRojo= new JButton("Color Rojo");
	public laminasDelanteras()
	{
		Color fondo= new Color(10,150,50).darker();
		setBackground(fondo);

		botonAzul.setMinimumSize(new Dimension(20,20));
		botonAzul.setMaximumSize(new Dimension(200,200));
		botonAzul.setPreferredSize(new Dimension(200,30));
		add(botonAzul);
		botonAzul.addActionListener(this);
		
		botonVerde.setMinimumSize(new Dimension(20,20));
		botonVerde.setMaximumSize(new Dimension(200,200));
		botonVerde.setPreferredSize(new Dimension(200,30));
		add(botonVerde);
		botonVerde.addActionListener(this);
		
		botonRojo.setMinimumSize(new Dimension(20,20));
		botonRojo.setMaximumSize(new Dimension(200,200));
		botonRojo.setPreferredSize(new Dimension(200,30));
		add(botonRojo);
		botonRojo.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		/*
		 * EXPLICACION:
		 * 1) Lo que hace getSource es almacenar el objeto que ha generado el evento
		 * 2) toString convierte el objeto en una cadena de STRING
		 * 3) indexOf lo que hace buscar en la larga cadena del objeto el STRING de entre los paréntesis
		 *  si lo encuentra devuelve la posicion en la cadena del STRING buscado
		 *  si no lo encuentra devuelve un -1
		 * */
		if(e.getSource().toString().indexOf("Color Azul")>0)
		{
			setBackground(Color.BLUE);
		}
		if(e.getSource().toString().indexOf("Color Verde")>0)
		{
			setBackground(Color.GREEN);
		}
		if(e.getSource().toString().indexOf("Color Rojo")>0)
		{
			setBackground(Color.RED);
		}
	}
}









