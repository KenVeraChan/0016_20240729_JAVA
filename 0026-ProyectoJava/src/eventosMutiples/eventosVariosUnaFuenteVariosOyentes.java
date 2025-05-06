package eventosMutiples;

import javax.swing.JFrame;

public class eventosVariosUnaFuenteVariosOyentes {

	public static void main(String[] args) {
		ventanas ventana1= new  ventanas(50,200,1);
		ventanas ventana2= new  ventanas(350,200,2);
		ventanas ventana3= new  ventanas(650,200,3);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanas ventana4 = new ventanas(0,0,0);
		ventana4.ventanaGeneral();
	}
}
class ventanas extends JFrame
{
	public ventanas(int x, int y,int orden)
	{
		setTitle("Ventana Oyente "+orden);
		setBounds(x,y,300,300);
		setVisible(true);
	}
	public void ventanaGeneral()
	{
		setTitle("Ventana General");
		setBounds(950,200,300,300);
		setVisible(true);
	}
}
