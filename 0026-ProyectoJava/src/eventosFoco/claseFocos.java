package eventosFoco;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class claseFocos {

	public static void main(String[] args) {
		fondoFoco1 ventana1= new fondoFoco1();
		fondoFoco2 ventana2= new fondoFoco2();
		ventana1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}

class fondoFoco1 extends JFrame
{
	public fondoFoco1()
	{
	laminabotonera lamina= new laminabotonera();
	lamina.botonera1();
	add(lamina);
	lamina.laminaFoco();
	add(lamina);
	setBounds(200,300,300,300);
	setTitle("Ventana de Foco 1");
	setVisible(true);
	}
}

class fondoFoco2 extends JFrame
{
	public fondoFoco2()
	{
	laminabotonera lamina= new laminabotonera();
	lamina.botonera2();
	add(lamina);
	setBounds(600,300,300,300);
	setTitle("Ventana de Foco 2");
	setVisible(true);
	}
}
class laminabotonera extends JPanel
{
	public laminabotonera()
	{

	}
	public void botonera1()
	{
		Button boton1 = new Button("BOTON 1");
		boton1.setPreferredSize(new Dimension(80,30));
		boton1.setBackground(new Color(200,200,200));
		add(boton1);
		Button boton2 = new Button("BOTON 2");
		boton2.setPreferredSize(new Dimension(80,30));
		boton2.setBackground(new Color(200,200,200));
		add(boton2);
		Button boton3 = new Button("BOTON 3");
		boton3.setPreferredSize(new Dimension(80,30));
		boton3.setBackground(new Color(200,200,200));
		add(boton3);
		Button boton4 = new Button("BOTON 4");
		boton4.setPreferredSize(new Dimension(80,30));
		boton4.setBackground(new Color(200,200,200));
		add(boton4);
	}
	public void botonera2()
	{
		Button boton5 = new Button("BOTON 5");
		boton5.setPreferredSize(new Dimension(80,30));
		boton5.setBackground(new Color(200,200,200));
		add(boton5);
		Button boton6 = new Button("BOTON 6");
		boton6.setPreferredSize(new Dimension(80,30));
		boton6.setBackground(new Color(200,200,200));
		add(boton6);
		Button boton7 = new Button("BOTON 7");
		boton7.setPreferredSize(new Dimension(80,30));
		boton7.setBackground(new Color(200,200,200));
		add(boton7);
		Button boton8 = new Button("BOTON 8");
		boton8.setPreferredSize(new Dimension(80,30));
		boton8.setBackground(new Color(200,200,200));
		add(boton8);
	}
	public void laminaFoco()
	{
		JTextField campoTexto1= new JTextField();
		campoTexto1.setPreferredSize(new Dimension(180,20));
		add(campoTexto1);
		JTextField campoTexto2= new JTextField();
		campoTexto2.setPreferredSize(new Dimension(180,20));
		add(campoTexto2);
		EventoDeFoco foco= new EventoDeFoco();
		campoTexto1.addFocusListener(foco);
		campoTexto2.addFocusListener(foco);
	}
}
class EventoDeFoco implements FocusListener
{
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void focusLost(FocusEvent e) {
		System.out.println("El cuadro ha perdido el foco");
	}
}
