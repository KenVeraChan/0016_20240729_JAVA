package eventosMutiples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class eventosVariosVariasFuentesUnOyente {

	public static void main(String[] args) {
		ventana fondo= new ventana();
		fondo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class ventana extends JFrame
{
	public ventana()
	{
		laminas botonera= new laminas();
		setBounds(400,300,400,300);
		setTitle("Ventana de eventos multiples");
		add(botonera);
		setVisible(true);
	}
}
class laminas extends JPanel
{
	public laminas()
	{
		/*JButton botonAzul= new JButton("AZUL");
		JButton botonVerde= new JButton("VERDE");
		JButton botonRojo= new JButton("ROJO");
		add(botonAzul);
		add(botonVerde);
		add(botonRojo);
		setBackground(new Color(10,50,80));
		*/
		/*ASIGNACION DE ACCIONES A BOTONES*/
		EventoColorFondo colorAzul= new EventoColorFondo("Azul",Color.BLUE);
		EventoColorFondo colorRojo= new EventoColorFondo("Rojo",Color.RED);
		EventoColorFondo colorVerde= new EventoColorFondo("Verde",Color.GREEN);
		add(new JButton(colorAzul));
		add(new JButton(colorRojo));
		add(new JButton(colorVerde));
		
		/*ASIGNACION DE ACCIONES A TECLADO*/
		InputMap mapaEntrada= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl A");  /*FUENTE TECLADO*/
		KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");  /*FUENTE TECLADO*/
		KeyStroke teclaVerde=KeyStroke.getKeyStroke("ctrl V"); /*FUENTE TECLADO*/
		mapaEntrada.put(teclaAzul, "fondo azul");
		mapaEntrada.put(teclaRojo, "fondo rojo");
		mapaEntrada.put(teclaVerde, "fondo verde");
		ActionMap mapaAccion= getActionMap();
		mapaAccion.put("fondo azul", colorAzul);
		mapaAccion.put("fondo rojo", colorRojo);
		mapaAccion.put("fondo verde", colorVerde);
	}
	/*CLASE INTERNA*/
	private class EventoColorFondo extends AbstractAction
	{
		public EventoColorFondo(String nombre, Color color_fondo)
		{
			putValue(Action.NAME,nombre);
			putValue("color_fondo_JPanel",color_fondo);
			putValue(Action.SHORT_DESCRIPTION,"Pone la lamina o JPanel de color: "+nombre);
		}
		public void actionPerformed(ActionEvent e) 
		{
			Color c=(Color)getValue("color_fondo_JPanel");  /*Como devuelve un objeto almacenado en color se hace el casting a color*/
			setBackground(c);
			System.out.println("El boton pulsado es: "+getValue(Action.NAME));
			System.out.println("La descripción es: "+getValue(Action.SHORT_DESCRIPTION));
		}
	}
}
