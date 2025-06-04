package componentesSwingJTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class componenteJToolBar {

	public static void main(String[] args) {
		fondoLaminaBarraHerr fondo= new fondoLaminaBarraHerr();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class fondoLaminaBarraHerr extends JFrame
{
	public fondoLaminaBarraHerr()
	{
		setBounds(400,200,400,400);
		setTitle("Barra herramientas colores");
		setResizable(false);

		laminaBarrHerr barra= new laminaBarrHerr();
		add(barra);
		setVisible(true);
	}
}
class laminaBarrHerr extends JPanel implements ActionListener
{
	JToolBar barraHerramientas;
	JButton rojo;
	JButton verde;
	JButton azul;
	JButton amarillo;
	JButton negro;
	JButton naranja;

	public laminaBarrHerr()
	{
		barraHerramientas= new JToolBar("Barra de colores");
		rojo= new JButton("ROJO");
		verde= new JButton("VERDE");
		azul= new JButton("AZUL");
		amarillo= new JButton("AMARILLO");
		negro= new JButton("NEGRO");
		naranja= new JButton("NARANJA");
		barraHerramientas.add(rojo);
		barraHerramientas.add(verde);
		barraHerramientas.add(azul);
		barraHerramientas.add(amarillo);
		barraHerramientas.add(negro);
		barraHerramientas.add(naranja);
		
		//ACCIONES JBUTTON
		rojo.addActionListener(this);
		verde.addActionListener(this);
		azul.addActionListener(this);
		amarillo.addActionListener(this);
		negro.addActionListener(this);
		naranja.addActionListener(this);
		add(barraHerramientas);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().contains("ROJO"))
		{
			setBackground(new Color(240,20,20));
		}
		if(e.getSource().toString().contains("VERDE"))
		{
			setBackground(new Color(20,240,20));
		}
		if(e.getSource().toString().contains("AZUL"))
		{
			setBackground(new Color(20,20,240));
		}
		if(e.getSource().toString().contains("AMARILLO"))
		{
			setBackground(new Color(255,255,0));
		}
		if(e.getSource().toString().contains("NEGRO"))
		{
			setBackground(new Color(0,0,0));
		}
		if(e.getSource().toString().contains("NARANJA"))
		{
			setBackground(new Color(255,171,0));
		}
	}
}
