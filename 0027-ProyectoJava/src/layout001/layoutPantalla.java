package layout001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.GridLayout;
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
		setBounds(400,200,450,450);
		/*  EL CODIGO DEL LAYOUT, SERÍA EL MOSTRADO, PERO SE PUEDE SIMPLFICAR
		laminas nuevaLamina= new laminas();
		FlowLayout disposicion= new FlowLayout(FlowLayout.RIGHT);
		nuevaLamina.setLayout(disposicion);
		add(nuevaLamina);
		*/
		laminas0 fondoLamina= new laminas0();
		laminas1 nuevaLamina1= new laminas1();
		laminas2 nuevaLamina2= new laminas2();
		add(fondoLamina);
		add(nuevaLamina1,BorderLayout.NORTH);
		add(nuevaLamina2,BorderLayout.SOUTH);
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
class laminas1 extends JPanel
{
	public laminas1()
	{
		//PANEL PARA EL setLayout
	}
}
class laminas2 extends JPanel
{
	public laminas2()
	{
		//PANEL PARA EL BorderLayout
		setLayout(new BorderLayout());
		setBackground(new Color(20,220,160));
		JButton boton3 = new JButton("C");
		JButton boton5 = new JButton("=");
		botonesNumeros calculadora= new botonesNumeros();
		botonesOperaciones operaciones= new botonesOperaciones();
		add(operaciones,BorderLayout.NORTH);
		add(boton3, BorderLayout.WEST);	
		add(boton5, BorderLayout.EAST);
		add(calculadora);
	}
}
class botonesNumeros extends JPanel
{
	public botonesNumeros()
	{
		GridLayout calculo = new GridLayout(3,4,2,2);	
		setLayout(calculo);
		add(new JButton("0"));
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
	}
}
class botonesOperaciones extends JPanel
{
	public botonesOperaciones()
	{
		GridLayout calculo = new GridLayout(1,5,2,2);	
		setLayout(calculo);
		add(new JButton("+"));
		add(new JButton("-"));
		add(new JButton("*"));
		add(new JButton("/"));
		add(new JButton("SQRT()"));
		setVisible(true);
	}
}