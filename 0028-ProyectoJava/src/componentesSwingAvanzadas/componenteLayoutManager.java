package componentesSwingAvanzadas;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class componenteLayoutManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		laminaFondo fondo= new laminaFondo();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fondo.setVisible(true);
	}

}
class laminaFondo extends JFrame
{
	public laminaFondo()
	{
		setBounds(400,300,450,250);
		setTitle("Componente Layout Manager");
		setResizable(false);
		laminaDisposicionLibre lamina= new laminaDisposicionLibre();
		add(lamina);
	}
}
class laminaDisposicionLibre extends JPanel
{
	public laminaDisposicionLibre()
	{
		setLayout(new disColumnas());
		JLabel nombre= new JLabel("NOMBRE: ");
		JLabel apellido= new JLabel("APELLIDO: ");
		JLabel telefono= new JLabel("TELEFONO: ");
		JTextField cajaNombre= new JTextField();
		JTextField cajaApellido= new JTextField();
		JTextField cajaTelefono= new JTextField();
		
		add(nombre);
		add(cajaNombre);
		add(apellido);
		add(cajaApellido);
		add(telefono);
		add(cajaTelefono);
	}
}

class disColumnas implements LayoutManager
{
	private int x=20;  //Coordenadas iniciales en X
	private int y=20;  //Coordenadas iniciales en Y
	//Layout Manager permite organizar las disposiciones en la manera que se quiera, columnas, filas ...

	public void addLayoutComponent(String name, Component comp) {

	}
	public void removeLayoutComponent(Component comp) {

	}
	public Dimension preferredLayoutSize(Container parent) {
		return null;
	}
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}
	public void layoutContainer(Container parent) {
		int n=parent.getComponentCount();  //Cuenta cuantos componentes se tienen: JButton, JTextField, JLabel etc...
		int d=parent.getWidth();
		System.out.println(d);
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				Component c=parent.getComponent(i);   //Primer componente guardado en una variable componente en cada bucle
				c.setBounds(x, y, 100, 20);   //Coloca el componente C creado y guardado segun el setBounds impuesto
				x+=100;   //Incrementar el valor de X en 100 unidades mas
			}
			else 
			{				
				Component c=parent.getComponent(i);   //Primer componente guardado en una variable componente en cada bucle
				c.setBounds(x, y, 100, 20);   //Coloca el componente C creado y guardado segun el setBounds impuesto
				x=20;      //Se reinicia la variable X para colocarla en la siguiente fila
				y+=40;    //Se baja una fila en la variable Y
			}
		}
	}
}

