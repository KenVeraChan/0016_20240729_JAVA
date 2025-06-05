package componentesSwingElementales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
class laminaCheckBox extends JPanel implements ActionListener
{
	JLabel enunciado1= new JLabel("Cursiva");
	JLabel enunciado2= new JLabel("Negrita");
	JCheckBox cambioLetra1 = new JCheckBox("Negrita");
	JCheckBox cambioLetra2 = new JCheckBox("Cursiva");
	JTextArea espacioTrabajo= new JTextArea("Hola Mundo",4,12);
	BorderLayout orden= new BorderLayout();
	JScrollPane scrolleado;
	private static int negrita=0;  //Para el conteo de las pulsaciones
	private static int cursiva=0;   //Para el conteo de las pulsaciones
	public laminaCheckBox()
	{
		setLayout(orden);   //Impone el Layout
		setBackground(new Color(80,200,120));
		add(new JScrollPane(espacioTrabajo),BorderLayout.CENTER);
		enunciado1.setName("Label1");
		enunciado2.setName("Label2");
		add(enunciado1,BorderLayout.EAST);
		add(enunciado2,BorderLayout.WEST);
		add(cambioLetra1,BorderLayout.EAST);
		add(cambioLetra2,BorderLayout.WEST);
		cambioLetra1.addActionListener(this);
		cambioLetra2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().contains("Cursiva"))
		{
			cursiva++;  //Se ha activado la cursiva una vez mas
			if(cursiva%2!=0)
			{
				//Se ha pulsado el checkbox de poner en cursiva
				System.out.println("SE PULSO CURSIVA");
				espacioTrabajo.setFont(new Font("Cursiva", Font.ITALIC, 12));
			}
			else 
			{
				//Modo inactivo de checkbox lo devuelve a su fuente inicial
				//Se ha pulsado el checkbox de NO poner en Negrita
				System.out.println("SE PULSO PARA QUITAR NEGRITA");
				espacioTrabajo.setFont(new Font("Normal", Font.PLAIN, 12));  //Es el tipo y tamanio de fuente por defecto
			}
		}
		if(e.getSource().toString().contains("Negrita"))
		{
			negrita++; //Se ha activado la cursiva una vez mas
			if(negrita%2!=0)
			{
				//Modo activo de checkbox
				//Se ha pulsado el checkbox de poner en Negrita
				System.out.println("SE PULSO NEGRITA");
				espacioTrabajo.setFont(new Font("Negrita", Font.BOLD, 12));
			}
			else 
			{
				//Modo inactivo de checkbox lo devuelve a su fuente inicial
				//Se ha pulsado el checkbox de NO poner en Negrita
				System.out.println("SE PULSO PARA QUITAR NEGRITA");
				espacioTrabajo.setFont(new Font("Normal", Font.PLAIN, 12));  //Es el tipo y tamanio de fuente por defecto
			}
		}
	}
}