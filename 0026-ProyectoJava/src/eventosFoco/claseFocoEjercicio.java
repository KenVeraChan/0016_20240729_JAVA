package eventosFoco;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class claseFocoEjercicio {

	public static void main(String[] args) {
		zonaTrabajo ventana= new zonaTrabajo();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class zonaTrabajo extends JFrame
{
	public zonaTrabajo()
	{
		plantilla plantillaBase= new plantilla();
		setBounds(400,200,400,400);
		setTitle("Ventana de Login");
		add(plantillaBase);
		setVisible(true);
	}
}
class plantilla extends JPanel
{
	public plantilla()
	{
		/*CAJAS DE CAMPOS DE TEXTO*/
		TextField usuario= new TextField("",30);
		TextField contrasenia= new TextField("",30);
		TextField email= new TextField("",30);
		setBackground(new Color(200,100,50));
		add(new Label("Usuario: ",Label.LEFT));
		add(usuario);
		add(new Label("Contraseña: ",Label.LEFT));
		add(contrasenia);
		add(new Label("Email: ",Label.LEFT));
		add(email);
		
		/*BOTONES DE INTERACCION*/
		JButton botonAceptar= new JButton("Enviar");
		JButton botonCancelar= new JButton("Cancelar");
		botonAceptar.setBackground(new Color(150,100,180));
		botonAceptar.setPreferredSize(new Dimension(200,30));
		botonCancelar.setBackground(new Color(150,100,180));
		botonCancelar.setPreferredSize(new Dimension(200,30));
		add(botonAceptar);
		add(botonCancelar);
		
		/*PREPARANDO OYENTES DE ACCION*/
		botonAceptar.addActionListener(new llamadasBotones());
		botonCancelar.addActionListener(new llamadasBotones());
	}
}
class llamadasBotones implements ActionListener
{
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().toString().indexOf("Enviar")>0)
		{
			System.out.println("Se han enviado los datos del usuario");
		}
		if(e.getSource().toString().indexOf("Cancelar")>0)
		{
			System.out.println("Se ha cancelado la operación");
			
		}
	}
}









