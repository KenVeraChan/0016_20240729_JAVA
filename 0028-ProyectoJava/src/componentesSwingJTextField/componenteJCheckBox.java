package componentesSwingJTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class componenteJCheckBox {

	public static void main(String[] args) {
		fondoCheckBox fondo = new fondoCheckBox();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}

}
class fondoCheckBox extends JFrame
{
	public fondoCheckBox()
	{
		
		//LAMINA PRINCIPAL
		setBounds(500,200,370,211);
		setTitle("Ventana de JTextField");
		
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("AREA DE JCheckBox");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS DEMAS LAMINAS
		add(new laminaCheckBox(),BorderLayout.CENTER);    //SE INCLUYE LA LAMINA
		
		setVisible(true);
	}
}
class laminaCheckBox extends JPanel 
{
	public laminaCheckBox()
	{
		setBackground(new Color(80,200,120));
		JCheckBox chequeado = new JCheckBox();
	}
}