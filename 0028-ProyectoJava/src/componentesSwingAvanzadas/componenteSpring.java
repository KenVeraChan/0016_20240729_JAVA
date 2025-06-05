package componentesSwingAvanzadas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class componenteSpring {

	public static void main(String[] args) {
		fondoSpring fondo= new fondoSpring();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fondo.setVisible(true);
	}

}
class fondoSpring extends JFrame
{
	public fondoSpring()
	{
		setBounds(400,300,400,250);
		setTitle("Disposiciones Muelle (Spring)");
		//setResizable(false);
		laminaMuelle muelle= new laminaMuelle();
		add(muelle);
	}
}
class laminaMuelle extends JPanel
{
	public laminaMuelle()
	{
		JButton aceptar= new JButton("ACEPTAR");
		JButton cancelar= new JButton("CANCELAR");
		JButton volver= new JButton("VOLVER");
		
		//PARA AUMENTAR SEPARACION ENTRE BOTONES //
		SpringLayout miLayout= new SpringLayout();
		setLayout(miLayout);
		
		add(aceptar);
		add(cancelar);
		add(volver);
		Spring miMuelle= Spring.constant(0,10,100);
		miLayout.putConstraint(SpringLayout.WEST,aceptar,miMuelle,SpringLayout.WEST,this);
		miLayout.putConstraint(SpringLayout.WEST,cancelar,miMuelle,SpringLayout.EAST,aceptar);
		miLayout.putConstraint(SpringLayout.WEST,volver,miMuelle,SpringLayout.EAST,cancelar);
		miLayout.putConstraint(SpringLayout.EAST,this,miMuelle,SpringLayout.EAST,volver);
	}
}

