package componentesSwingJTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class componenteJSpinner {

	public static void main(String[] args) {
		fondoJSpinner resultado= new fondoJSpinner();
		resultado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class fondoJSpinner extends JFrame
{
	public fondoJSpinner()
	{
		//LAMINA PRINCIPAL
		setBounds(500,200,370,211);
		setTitle("Ventana de JSpinner");
		setResizable(false);
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());

	    JLabel header = new JLabel("AREA DE JSpinner");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS DEMAS LAMINAS
		add(new laminaJSpinner(),BorderLayout.CENTER);    //SE INCLUYE LA LAMINA
		setVisible(true);
	}
}
class laminaJSpinner extends JPanel implements ChangeListener
{
	JSpinner ruleta= new JSpinner();
	JSpinner ruletaCambiante= new JSpinner();
	JTextArea resultado= new JTextArea("TEMPERATURA");
	private static String datos[]= new String[30];
	private static int temperatura=0;
	public laminaJSpinner()
	{
		setBackground(new Color(20,210,100));

		ruleta.setPreferredSize(new Dimension(50,20));
		ruletaCambiante.setPreferredSize(new Dimension(220,20));
		ruleta.addChangeListener(this);	//Al ser stateChanged listener, se detectará cambio al cambiar de estado, por eso no es accion	
		add(ruleta);
		add(ruletaCambiante);
		resultado.setPreferredSize(new Dimension(350,50));	
		add(resultado);
	}
	public void stateChanged(ChangeEvent e) {
		temperatura=(int)ruleta.getValue();   //Se ha casteado para que devuelva un numero entero
		if(temperatura>-30 && temperatura<0)
		{
			resultado.setText("Temperatura MUY FRIA: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(10,120,230));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
				//Saca los meses del anio
				datos[0]="Enero";
				datos[1]="Febrero";
				datos[2]="Marzo";
				datos[3]="Abril";
				datos[4]="Mayo";
				datos[5]="Junio";
				datos[6]="Julio";
				datos[7]="Agosto";
				datos[8]="Septiembre";
				datos[9]="Octubre";
				datos[10]="Noviembre";
				datos[11]="Diciembre";			
				//Se fija el modelo que es una invocación al modelo de lista Spinner con los datos metidos por matriz
				ruletaCambiante.setModel(new SpinnerListModel(datos));
		}
		if(temperatura>=0 && temperatura<10)
		{
			resultado.setText("Temperatura FRIA: "+ruleta.getValue()+" ºC");
			this.setBackground(new Color(10,160,180));  //El THIS hace referencia a la propia clase JPanel invocada al inicio
			//Saca los meses del anio
				datos[0]="Rasselin Wissangel Rousher";
				datos[1]="Vitrea Horiz";
				datos[2]="Emiliam Bastreriz";
				datos[3]="Verduliz Sainz";
				datos[4]="Veddina Henion";
				datos[5]="Samira Savadez";
				datos[6]="Shail Matsiz";
				datos[7]="Christal Gedishen";
				datos[8]="Jill Anherson";
				datos[9]="William Wissangel";
				datos[10]="Sharyllín Rousher";
				datos[11]="Shiao Teleras";			
				//Se fija el modelo que es una invocación al modelo de lista Spinner con los datos metidos por matriz
				ruletaCambiante.setModel(new SpinnerListModel(datos));
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