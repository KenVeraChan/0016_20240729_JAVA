package componentesSwingJTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class componenteJComboBox {

	public static void main(String[] args) {
		fondoComboBox resultado= new fondoComboBox();
		resultado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class fondoComboBox extends JFrame
{
	public fondoComboBox()
	{
		//LAMINA PRINCIPAL
		setBounds(500,200,370,211);
		setTitle("Ventana de JTextField");
		
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("AREA DE JComboBox");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS DEMAS LAMINAS
		add(new laminaComboBox(),BorderLayout.CENTER);    //SE INCLUYE LA LAMINA
		setVisible(true);
	}
}
class laminaComboBox extends JPanel implements ActionListener
{
	JComboBox desplegable= new JComboBox();
	public laminaComboBox()
	{
		setBackground(new Color(20,210,100));
		desplegable.addItem("Rasselin Wissangel Rousher");
		desplegable.addItem("Vitrea Horiz");
		desplegable.addItem("Emiliam Bastreriz");
		desplegable.addItem("Verduliz Sainz");
		desplegable.addItem("Veddina Henion");
		desplegable.addItem("Samira Savadez");
		desplegable.addItem("Shail Matsiz");
		desplegable.addItem("Christal Gedishen");
		desplegable.addItem("Jill Anherson");
		add(desplegable);
		desplegable.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent e) 
	{
		for(int i=0;i<desplegable.getItemCount();i++)  //Se hace el recorrido de los ITEMS completos para buscar
		{
			if(e.getSource().toString().contains((String)desplegable.getItemAt(i)))  //Se hace el casteado del ITEM
			{
				System.out.println("Elegida: "+desplegable.getItemAt(i));   //Se selecciona el ITEM marcado
			}
		}
	}
	
}