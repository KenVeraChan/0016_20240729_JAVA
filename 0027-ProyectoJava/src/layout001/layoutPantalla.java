package layout001;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		setBounds(400,200,160,250);
		setResizable(false);
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
		setBackground(new Color(20,120,160));
	}
}
class laminas1 extends JPanel implements ActionListener
{
	private static int numero=0;
	private static String sentencia="";
	private static int comprobante=0;
	private static String caracter="";
	TextField pantalla = new TextField("Hola Mundo",13);
	public laminas1()
	{
		//PANEL PARA EL setLayout
		//PANEL PARA EL BorderLayout
		setBackground(new Color(20,220,160));
		botonera();
	}
	public void botonera()
	{
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setLayout(gridbag);
        
        //COMPONENTES
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 0; // El área de texto empieza en la fila cero
        c.gridwidth = 3; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
		add(pantalla,c);
       
        //CERO
		JButton cero= new JButton("0");
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 1; // El área de texto empieza en la fila uno
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        cero.setSize(10, 5);
        add(cero, c);
		cero.addActionListener(this);

        //UNO
		JButton uno= new JButton("1");
        c.gridx = 1; // El área de texto empieza en la columna uno.
        c.gridy = 1; // El área de texto empieza en la fila uno
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(uno, c);
		uno.addActionListener(this);

        //DOS
		JButton dos= new JButton("2");
        c.gridx = 2; // El área de texto empieza en la columna dos.
        c.gridy = 1; // El área de texto empieza en la fila uno
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(dos, c);
		dos.addActionListener(this);

        //TRES
		JButton tres= new JButton("3");
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 2; // El área de texto empieza en la fila dos
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(tres, c);
		tres.addActionListener(this);

        //CUATRO
		JButton cuatro= new JButton("4");
        c.gridx = 1; // El área de texto empieza en la columna uno.
        c.gridy = 2; // El área de texto empieza en la fila dos
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(cuatro, c);
		cuatro.addActionListener(this);

        //CINCO
		JButton cinco= new JButton("5");
        c.gridx = 2; // El área de texto empieza en la columna dos.
        c.gridy = 2; // El área de texto empieza en la fila dos
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(cinco, c);
		cinco.addActionListener(this);

        //SEIS
		JButton seis= new JButton("6");
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 3; // El área de texto empieza en la fila tres
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(seis, c);
		seis.addActionListener(this);

        //SIETE
		JButton siete= new JButton("7");
        c.gridx = 1; // El área de texto empieza en la columna uno.
        c.gridy = 3; // El área de texto empieza en la fila tres
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(siete, c);
		siete.addActionListener(this);

        //OCHO
		JButton ocho= new JButton("8");
        c.gridx = 2; // El área de texto empieza en la columna dos.
        c.gridy = 3; // El área de texto empieza en la fila tres
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(ocho, c);
		ocho.addActionListener(this);

        //NUEVE
		JButton nueve= new JButton("9");
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 4; // El área de texto empieza en la fila cuatro
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(nueve, c);
		nueve.addActionListener(this);

        //SIGNO COMA
		JButton coma= new JButton(",");
        c.gridx = 1; // El área de texto empieza en la columna uno.
        c.gridy = 4; // El área de texto empieza en la fila cuatro
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        coma.setPreferredSize(new Dimension(40,25));
        add(coma, c);
		coma.addActionListener(this);

        //SIGNO SUMA
		JButton suma= new JButton("+");
        c.gridx = 2; // El área de texto empieza en la columna dos.
        c.gridy = 4; // El área de texto empieza en la fila cuatro
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(suma, c);
		suma.addActionListener(this);

        //SIGNO RESTA
		JButton resta= new JButton("-");
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 5; // El área de texto empieza en la fila cinco
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(resta, c);
		resta.addActionListener(this);

        //SIGNO MULTIPLICACION
		JButton multiplicacion= new JButton("*");
        c.gridx = 1; // El área de texto empieza en la columna uno.
        c.gridy = 5; // El área de texto empieza en la fila cinco
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(multiplicacion, c);
		multiplicacion.addActionListener(this);

        //SIGNO DIVISION
		JButton division= new JButton("/");
        c.gridx = 2; // El área de texto empieza en la columna dos.
        c.gridy = 5; // El área de texto empieza en la fila cinco
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(division, c);
		division.addActionListener(this);

        //SIGNO RAIZ
		JButton raiz= new JButton("R");
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 6; // El área de texto empieza en la fila seis
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(raiz, c);
		raiz.addActionListener(this);
		
        //SIGNO BORRAR
		JButton borrar= new JButton("C");
        c.gridx = 1; // El área de texto empieza en la columna uno.
        c.gridy = 6; // El área de texto empieza en la fila seis
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(borrar, c);
		borrar.addActionListener(this);
		
        //SIGNO IGUAL
		JButton igual= new JButton("=");
        c.gridx = 2; // El área de texto empieza en la columna dos.
        c.gridy = 6; // El área de texto empieza en la fila seis
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(igual, c);
		igual.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals(",") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("+") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("-") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("*") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("/") ||
			e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6).equals("R"))
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