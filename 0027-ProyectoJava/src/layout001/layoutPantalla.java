package layout001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
		setBounds(300,200,600,300);
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
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setBackground(new Color(20,220,160));
		JButton boton1 = new JButton("ENVIAR");
		JButton boton2 = new JButton("CANCELAR");
		add(boton1);
		add(boton2);
	}
}
class laminas2 extends JPanel
{
	public laminas2()
	{
		//PANEL PARA EL BorderLayout
		setLayout(new BorderLayout());
		setBackground(new Color(20,220,160));
		JButton boton3 = new JButton("EJECUTAR");
		JButton boton4 = new JButton("COMPRAR");
		JButton boton5 = new JButton("VENDER");
		add(boton3, BorderLayout.WEST);	
		add(boton4, BorderLayout.CENTER);
		add(boton5, BorderLayout.EAST);
	}
}