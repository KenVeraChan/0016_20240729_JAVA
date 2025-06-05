package componentesSwingElementales;
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

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
		setBounds(500,200,270,150);
		setTitle("Ventana de JTextField");
		
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("AREA DE LOGIN");
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
        
        //COMPONENTES
        texto= new JLabel("USER: ",JLabel.LEFT);
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 0; // El área de texto empieza en la fila cero
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add (texto, c);
		CuadroTexto = new JTextField(10);
        c.gridx = 2; // El área de texto empieza en la columna tres.
        c.gridy = 0; // El área de texto empieza en la fila cero
        c.gridwidth = 2; // El área de texto ocupa dos columnas.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(CuadroTexto, c);
        
        //Añadiremos un oyente para el cuadro de texto 
        //Guardado en la avariable objeto el miDocumento del JextField declarado antes
        Document miDocumento= CuadroTexto.getDocument();     //Se ha declarado la interfz guardada en miDocumento y se la ha asignado a un objeto JTextField llamando al metodo getDocument
        miDocumento.addDocumentListener(new EscuchaTexto());
        
		textoReceptor= new JLabel("PASSWORD: ",JLabel.LEFT);
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 1; // El área de texto empieza en la fila uno
        c.gridwidth = 1; // El área de texto ocupa una columna.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(textoReceptor, c);
		CuadroReceptor = new JTextField(10);
        c.gridx = 2; // El área de texto empieza en la columna tres.
        c.gridy = 1; // El área de texto empieza en la fila uno
        c.gridwidth = 2; // El área de texto ocupa dos columnas.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(CuadroReceptor, c);
		botonSacarTexto= new JButton("SEND");
		botonSacarTexto.setPreferredSize(new Dimension(190,20));
        c.gridx = 0; // El área de texto empieza en la columna cero.
        c.gridy = 3; // El área de texto empieza en la fila cuatro
        c.gridwidth = 4; // El área de texto ocupa cuatro columnas.
        c.gridheight = 1; // El área de texto ocupa una fila.
        add(botonSacarTexto, c);
		botonSacarTexto.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("El texto escrito es: "+CuadroTexto.getText());
		CuadroReceptor.setText(CuadroTexto.getText());
	}
	private class EscuchaTexto implements DocumentListener
	{
		//Clase interna privada para habilitar el proceso de la llamada y el oyente en el JTextField creado mas arriba 

		public void insertUpdate(DocumentEvent e) {
			System.out.println("Has escrito algo, termina de hacerlo");
		}
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Has borrado algo");
		}
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub	
		}
	}
}

