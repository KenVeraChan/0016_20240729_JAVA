package layout001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
		setBounds(400,200,450,150);
		setResizable(false);
		/*  EL CODIGO DEL LAYOUT, SERÍA EL MOSTRADO, PERO SE PUEDE SIMPLFICAR
		laminas nuevaLamina= new laminas();
		FlowLayout disposicion= new FlowLayout(FlowLayout.RIGHT);
		nuevaLamina.setLayout(disposicion);
		add(nuevaLamina);
		*/
		laminas0 fondoLamina= new laminas0();
		laminas1 nuevaLamina1= new laminas1();
		add(fondoLamina);
		add(nuevaLamina1);
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
	private static int numero=0;
	private static String sentencia="";
	private static int comprobante=0;
	private static String caracter="";
	TextField pantalla = new TextField("Hola Mundo",40);
	public laminas1()
	{
		//PANEL PARA EL setLayout
		//PANEL PARA EL BorderLayout
		setLayout(new BorderLayout());
		setBackground(new Color(20,220,160));
		JButton boton3 = new JButton("C");
		JButton boton5 = new JButton("=");
		botonera();
		add(pantalla,BorderLayout.NORTH);
		add(boton3, BorderLayout.WEST);	
		add(boton5, BorderLayout.EAST);

	}
	public void botonera()
	{
		FlowLayout instrumental= new FlowLayout();
		setLayout(instrumental);
		JButton cero= new JButton("0");
		JButton uno= new JButton("1");
		JButton dos= new JButton("2");
		JButton tres= new JButton("3");
		JButton cuatro= new JButton("4");
		JButton cinco= new JButton("5");
		JButton seis= new JButton("6");
		JButton siete= new JButton("7");
		JButton ocho= new JButton("8");
		JButton nueve= new JButton("9");
		JButton coma= new JButton(",");
		JButton signo= new JButton("signo");
		JButton suma= new JButton("+");
		JButton resta= new JButton("-");
		JButton producto= new JButton("*");
		JButton cociente= new JButton("/");
		JButton raiz= new JButton("raiz");
		cero.addActionListener(this);
		uno.addActionListener(this);
		dos.addActionListener(this);
		tres.addActionListener(this);
		cuatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		siete.addActionListener(this);
		ocho.addActionListener(this);
		nueve.addActionListener(this);
		coma.addActionListener(this);
		signo.addActionListener(this);
		suma.addActionListener(this);
		resta.addActionListener(this);
		producto.addActionListener(this);
		cociente.addActionListener(this);
		raiz.addActionListener(this);
		add(cero);
		add(uno);
		add(dos);
		add(tres);
		add(cuatro);
		add(cinco);
		add(seis);
		add(siete);
		add(ocho);
		add(nueve);
		add(coma);
		add(signo);
		add(suma);
		add(resta);
		add(producto);
		add(cociente);
		add(raiz);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals(",") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("+") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("-") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("*") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("/") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("r") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("s"))
		{
			caracter=e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6);
			sentencia=sentencia+caracter;
			pantalla.setText(sentencia);
		}
		else
		{
		  comprobante=Integer.parseInt(e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6));
	  		if(comprobante>=0 && comprobante<10)
		  	{
		  		if(sentencia=="" && numero!=1 && comprobante==0)
				{
					numero=1;
					sentencia=sentencia+comprobante;
					pantalla.setText(sentencia);
				}
				if(numero!=1)
				{
					sentencia=sentencia+comprobante;
					pantalla.setText(sentencia);
				}
		  	}	
		}
	}
}