package componentesSwing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class componenteJTextField {

	public static void main(String[] args) {
		fondoVentana fondo = new fondoVentana();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class fondoVentana extends JFrame
{
	public fondoVentana()
	{
		
		//LAMINA PRINCIPAL
		setBounds(400,300,400,400);
		setTitle("Ventana de JTextField");
		
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("Informacion");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS DEMAS LAMINAS
		add(new laminaPrimera(),BorderLayout.CENTER);    //SE INCLUYE LA LAMINA
		
		setVisible(true);
	}
}
class laminaPrimera extends JPanel implements ActionListener
{
	JTextField CuadroTexto;
	JTextField CuadroReceptor;
	JLabel texto;
	JLabel textoReceptor;
	JButton botonSacarTexto;
	public laminaPrimera()
	{
		setBackground(new Color(80,200,120));
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setLayout(gridbag);
        c.gridwidth = 1;
        c.gridheight=1;
        c.weightx = 1;
        c.weighty = 1;
        
        //COMPONENTES
        texto= new JLabel("Escribir un texto: ");
        c.gridx = 0;
        c.gridy = 0;
        add(texto, c);
		CuadroTexto = new JTextField(20);
        c.gridx = 1;
        c.gridy = 0;
        add(CuadroTexto, c);
		textoReceptor= new JLabel("Texto aparece aquí: ");
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth=50;
        add(textoReceptor, c);
		CuadroReceptor = new JTextField(20);
        c.gridx = 1;
        c.gridy = 2;
        add(CuadroReceptor, c);
		botonSacarTexto= new JButton("Extrae Texto");
		botonSacarTexto.setPreferredSize(new Dimension(200,20));
        c.gridx = 0;
        c.gridy = 3;
        add(botonSacarTexto, c);
		botonSacarTexto.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("El texto escrito es: "+CuadroTexto.getText());
		CuadroReceptor.setText(CuadroTexto.getText());
	}
}
