package componentesSwingAvanzadas;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class componenteJBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fondoLaminaBox fondo= new fondoLaminaBox();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fondo.setVisible(true);
	}

}
class fondoLaminaBox extends JFrame
{
	public fondoLaminaBox()
	{
		setBounds(400,300,250,250);
		setTitle("Disposiciones avanzas de caja");
		setResizable(false);
		
		//PRIMER BOX //
		JLabel nUsuario= new JLabel("Nombre:");
		JTextField cUsuario= new JTextField(10);
		cUsuario.setMaximumSize(cUsuario.getPreferredSize());
		Box cajaUsuario= Box.createHorizontalBox();  //Cuando son metodos estáticos no es necesario instanciar
		cajaUsuario.add(nUsuario);
		cajaUsuario.add(Box.createHorizontalStrut(10));
		cajaUsuario.add(cUsuario);
		
		//SEGUNDO BOX //
		JLabel nPassword= new JLabel("Contraseña:");
		JTextField cPassword= new JTextField(10);
		cPassword.setMaximumSize(cPassword.getPreferredSize());
		Box cajaPassword= Box.createHorizontalBox();  //Cuando son metodos estáticos no es necesario instanciar
		cajaPassword.add(nPassword);
		cajaPassword.add(Box.createHorizontalStrut(10));
		cajaPassword.add(cPassword);
		
		//TERCER BOX //
		JButton enviar= new JButton("ENVIAR");
		JButton cancelar= new JButton("CANCELAR");
		Box cajaBotones= Box.createHorizontalBox();
		cajaBotones.add(enviar);
		cajaBotones.add(Box.createGlue());
		cajaBotones.add(cancelar);
		
		//CAJAS COMPLETAS //
		Box cajaVertical= Box.createVerticalBox();
		cajaVertical.add(cajaUsuario);
		cajaVertical.add(cajaPassword);
		cajaVertical.add(cajaBotones);
		add(cajaVertical);
	}
}