package componentesSwingJTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class componenteJPopupMenu {

	public static void main(String[] args) {
		fondoMenuEmergente fondo= new fondoMenuEmergente();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class fondoMenuEmergente extends JFrame
{
	public fondoMenuEmergente()
	{
		setBounds(400,200,250,250);
		setTitle("Menus emergentes");
		setResizable(false);
		menuEmergente opciones= new menuEmergente();
		add(opciones);
		setVisible(true);
	}
}
class menuEmergente extends JPanel implements ActionListener
{
	JPopupMenu menu;
	public menuEmergente()
	{
		menu= new JPopupMenu("Menu emergente");
		JMenuItem opcion1= new JMenuItem();
		menu.add(opcion1);
		JMenuItem opcion2= new JMenuItem("VERDE");
		menu.add(opcion2);
		JMenuItem opcion3= new JMenuItem("AZUL");
		menu.add(opcion3);
		opcion1.addActionListener(this);
		opcion2.addActionListener(this);
		opcion3.addActionListener(new ActionListener()
			{
				//PARA EL CASO DEL COLOR VERDE, SE CREA UNA INSTANCIA DE UNA CLASE INTERNA ANÓNIMA
				public void actionPerformed(ActionEvent e) 
				{
					if(e.getSource().toString().contains("AZUL"))
					{
						setBackground(new Color(20,20,240));
					}
				}
			});
		setComponentPopupMenu(menu);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().contains("ROJO"))
		{
			setBackground(new Color(240,20,20));
			cambiaColor();
		}
		if(e.getSource().toString().contains("VERDE"))
		{
			setBackground(new Color(20,240,20));
		}
	}
	public void cambiaColor()
	{
		System.out.println("HOLA");
	}
}