package componentesSwingElementales;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class componenteJRadioButton {

	public static void main(String[] args) {
		fondoLamina fondo= new fondoLamina();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class fondoLamina extends JFrame
{
	public fondoLamina()
	{
		setBounds(400,250,350,200);
		setTitle("Practica de JRadioButton");
		setResizable(false);
		//Se establece la cabecera de la aplicacion
	    JLabel header = new JLabel("AREA DE JRadioButton");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
		add(new laminaOperativa());
		setVisible(true);
	}
}
class laminaOperativa extends JPanel implements ActionListener
{
    JTextArea texto= new JTextArea("Hola Mundo");
    JRadioButton opcion1= new JRadioButton("RasselinWR",false);
    JRadioButton opcion2= new JRadioButton("VitreaH",false);
    JRadioButton opcion3= new JRadioButton("EmiliamB",false);
    JRadioButton opcion4= new JRadioButton("VerdulizS",false);
	public laminaOperativa()
	{
		setBackground(new Color(20,210,100));
        GridBagLayout redGrid = new GridBagLayout();
        GridBagConstraints casillas = new GridBagConstraints();
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setLayout(redGrid);
        
        //COMPONENTES
        texto.setPreferredSize(new Dimension(318,20));
        casillas.gridheight=1;  //El area del texto ocupa 1 fila
        casillas.gridwidth=4;   //El area del texto ocupa 3 columnas
        casillas.gridx=0;       //El area del texto empieza en la columna 0
        casillas.gridy=0;       //El area del texto empiieza en la fila 0
        casillas.ipady=5;
        add(texto,casillas);
        
        //OPCION 1
        casillas.gridheight=1;  //El area del texto ocupa 1 fila
        casillas.gridwidth=1;   //El area del texto ocupa 1 columnas
        casillas.gridx=0;       //El area del texto empieza en la columna 0
        casillas.gridy=1;       //El area del texto empiieza en la fila 1
        add(opcion1,casillas);
        opcion1.addActionListener(this);
        
        //OPCION 2
        casillas.gridheight=1;  //El area del texto ocupa 1 fila
        casillas.gridwidth=1;   //El area del texto ocupa 1 columnas
        casillas.gridx=1;       //El area del texto empieza en la columna 1
        casillas.gridy=1;       //El area del texto empiieza en la fila 1
        add(opcion2,casillas);
        opcion2.addActionListener(this);
        
        //OPCION 3
        casillas.gridheight=1;  //El area del texto ocupa 1 fila
        casillas.gridwidth=1;   //El area del texto ocupa 1 columnas
        casillas.gridx=2;       //El area del texto empieza en la columna 2
        casillas.gridy=1;       //El area del texto empiieza en la fila 1
        add(opcion3,casillas);
        opcion3.addActionListener(this);
        
        //OPCION 4
        casillas.gridheight=1;  //El area del texto ocupa 1 fila
        casillas.gridwidth=1;   //El area del texto ocupa 1 columnas
        casillas.gridx=3;       //El area del texto empieza en la columna 2
        casillas.gridy=1;       //El area del texto empiieza en la fila 1
        add(opcion4,casillas); 
        opcion4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().contains("RasselinWR"))
		{
			//SI SE ACTIVA LA OPCION 1
			opcion2.setSelected(false);
			opcion3.setSelected(false);
			opcion4.setSelected(false);
			texto.setText(opcion1.getText().toString());
		}
		if(e.getSource().toString().contains("VitreaH"))
		{
			//SI SE ACTIVA LA OPCION 2
			opcion1.setSelected(false);
			opcion3.setSelected(false);
			opcion4.setSelected(false);
			texto.setText(opcion2.getText().toString());
		}
		if(e.getSource().toString().contains("EmiliamB"))
		{
			//SI SE ACTIVA LA OPCION 3
			opcion1.setSelected(false);
			opcion2.setSelected(false);
			opcion4.setSelected(false);
			texto.setText(opcion3.getText().toString());
		}
		if(e.getSource().toString().contains("VerdulizS"))
		{
			//SI SE ACTIVA LA OPCION 4
			opcion1.setSelected(false);
			opcion2.setSelected(false);
			opcion3.setSelected(false);
			texto.setText(opcion4.getText().toString());
		}
	}
}
