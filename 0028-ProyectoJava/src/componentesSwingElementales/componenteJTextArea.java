package componentesSwingElementales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class componenteJTextArea {

	public static void main(String[] args) {
		fondoTextArea fondo = new fondoTextArea();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class fondoTextArea extends JFrame
{
	public fondoTextArea()
	{
		
		//LAMINA PRINCIPAL
		setBounds(500,200,370,211);
		setTitle("Ventana de JTextField");
		
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("AREA DE JTextArea");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS DEMAS LAMINAS
		add(new laminaTextArea(),BorderLayout.CENTER);    //SE INCLUYE LA LAMINA
		
		setVisible(true);
	}
}
class laminaTextArea extends JPanel implements ActionListener
{
	JTextArea cuadroTexto= new JTextArea("Hola Mundo",7,20);
	JScrollPane laminaScroll= new JScrollPane(cuadroTexto);
	JButton enviar= new JButton("ENVIAR");
	BorderLayout espacio= new BorderLayout();
	public laminaTextArea()
	{
		setBackground(new Color(80,200,120));
	    setLayout(espacio);
		cuadroTexto.setLineWrap(true);
		enviar.addActionListener(this);
		add(enviar,BorderLayout.SOUTH);
		add(laminaScroll,BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println(cuadroTexto.getText());
	}
}