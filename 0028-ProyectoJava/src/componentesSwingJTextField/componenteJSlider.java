package componentesSwingJTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class componenteJSlider {

	public static void main(String[] args) {
		fondoJSlider resultado= new fondoJSlider();
		resultado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class fondoJSlider extends JFrame
{
	public fondoJSlider()
	{
		//LAMINA PRINCIPAL
		setBounds(500,200,370,211);
		setTitle("Ventana de JSlider");
		setResizable(false);
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("AREA DE JSlider");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS DEMAS LAMINAS
		add(new laminaJSlider(),BorderLayout.CENTER);    //SE INCLUYE LA LAMINA
		setVisible(true);
	}
}
class laminaJSlider extends JPanel implements ChangeListener
{
	JSlider ruleta= new JSlider();
	JTextArea resultado= new JTextArea("TEMPERATURA");
	private static int temperatura=0;
	public laminaJSlider()
	{
		setBackground(new Color(20,210,100));
		ruleta.setMaximum(60);
		ruleta.setMinimum(-20);
		ruleta.setMajorTickSpacing(10);
		ruleta.setMinorTickSpacing(5);
		ruleta.setOrientation(JSlider.HORIZONTAL);
		ruleta.setPaintLabels(true);
		ruleta.setPaintTicks(true);
		ruleta.setPaintTrack(true);
		ruleta.setPreferredSize(new Dimension(350,50));
		ruleta.addChangeListener(this);	//Al ser stateChanged listener, se detectará cambio al cambiar de estado, por eso no es accion	
		add(ruleta);
		resultado.setPreferredSize(new Dimension(350,50));	
		add(resultado);
	}
	public void stateChanged(ChangeEvent e) {
		temperatura=ruleta.getValue();
		if(temperatura>-30 && temperatura<0)
		{
			resultado.setText("Temperatura MUY FRIA: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(10,120,230));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
		}
		if(temperatura>=0 && temperatura<10)
		{
			resultado.setText("Temperatura FRIA: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(10,160,180));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
		}	
		if(temperatura>=10 && temperatura<20)
		{
			resultado.setText("Temperatura NORMAL: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(10,160,90));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
		}
		if(temperatura>=20 && temperatura<30)
		{
			resultado.setText("Temperatura CALIDA: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(90,160,40));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
		}
		if(temperatura>=30 && temperatura<40)
		{
			resultado.setText("Temperatura MUCHO CALOR: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(150,90,40));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
		}
		if(temperatura>=40 && temperatura<=60)
		{
			resultado.setText("Temperatura DEMASIADO CALOR: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(210,90,40));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
		}
	}
}