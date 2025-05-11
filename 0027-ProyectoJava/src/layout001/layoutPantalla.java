package layout001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class layoutPantalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoGlobal ventana= new MarcoGlobal();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoGlobal extends JFrame
{
	public MarcoGlobal()
	{
		setTitle("Practicas de Layout");
		setBounds(400,200,450,180);
		/*  EL CODIGO DEL LAYOUT, SERÍA EL MOSTRADO, PERO SE PUEDE SIMPLFICAR
		laminas nuevaLamina= new laminas();
		FlowLayout disposicion= new FlowLayout(FlowLayout.RIGHT);
		nuevaLamina.setLayout(disposicion);
		add(nuevaLamina);
		*/
		laminas0 fondoLamina= new laminas0();
		laminas1 nuevaLamina1= new laminas1();
		add(fondoLamina);
		add(nuevaLamina1,BorderLayout.NORTH);
		setVisible(true);
	}
}
class laminas0 extends JPanel
{
	public laminas0()
	{
		//PANEL PARA EL setLayout
		setBackground(new Color(20,220,160));
	}
}
class laminas1 extends JPanel implements ActionListener
{
	TextField pantalla = new TextField("Hola Mundo",30);

	public laminas1()
	{
		//PANEL PARA EL setLayout
		add(pantalla);
		//PANEL PARA EL BorderLayout
		setLayout(new BorderLayout());
		setBackground(new Color(20,220,160));
		JButton boton3 = new JButton("C");
		JButton boton5 = new JButton("=");
		add(boton3, BorderLayout.WEST);	
		add(boton5, BorderLayout.EAST);
		
		//NUMERO DE LA CALCULADORA	
		setLayout(new GridLayout(3,4,3,3));
		JButton cero= new JButton("0");
		cero.addActionListener(this);
		add(cero);
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton(","));
		add(new JButton("+/-"));
		setVisible(true);
		
		//OPERACIONES DE LA CALCULADOR
		GridLayout calculo = new GridLayout(1,5,2,2);	
		setLayout(calculo);
		add(new JButton("+"));
		add(new JButton("-"));
		add(new JButton("*"));
		add(new JButton("/"));
		add(new JButton("SQRT()"));
		
		setVisible(true);	
	}
	public void actionPerformed(ActionEvent e) {
		pantalla.setText("0");
	}
}