package layout001;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class layoutPantalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoGlobal ventana= new MarcoGlobal();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoGlobal extends JFrame
{
	public MarcoGlobal()
	{
		setTitle("Practicas de Layout");
		setBounds(400,200,250,250);
		setResizable(false);
		laminas0 fondoLamina= new laminas0();
		laminas1 nuevaLamina1= new laminas1();
		add(fondoLamina);
		add(nuevaLamina1);
		setVisible(true);
	}
}
class laminas0 extends JPanel
{
	public laminas0()
	{
		//PANEL PARA EL setLayout
		setBackground(new Color(20,120,160));
	}
}
class laminas1 extends JPanel implements ActionListener
{
	private static int numero=0;
	private static String sentencia="";
	private static int comprobante=0;
	private static String caracter;
	private static int semaforoComa=0;
	private static String resultadoIntermedio="";
	private static String signo="";
	private static int registro=0;
	private static double  resultadoOperacion=0.0;
	TextField pantalla = new TextField("Hola Mundo",13);
	public laminas1()
	{
		//PANEL PARA EL setLayout
		//PANEL PARA EL BorderLayout
		setBackground(new Color(20,210,120));
		botonera();
	}
	public void botonera()
	{
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        setFont(new Font("SansSerif", Font.PLAIN, 18));
        setLayout(gridbag);
        
        //COMPONENTES
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 0; // El �rea de texto empieza en la fila cero
        c.gridwidth = 3; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
		add(pantalla,c);
       
        //CERO
		JButton cero= new JButton("0");
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 1; // El �rea de texto empieza en la fila uno
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        cero.setPreferredSize(new Dimension(60,30));
        add(cero, c);
		cero.addActionListener(this);

        //UNO
		JButton uno= new JButton("1");
        c.gridx = 1; // El �rea de texto empieza en la columna uno.
        c.gridy = 1; // El �rea de texto empieza en la fila uno
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        uno.setPreferredSize(new Dimension(60,30));
        add(uno, c);
		uno.addActionListener(this);

        //DOS
		JButton dos= new JButton("2");
        c.gridx = 2; // El �rea de texto empieza en la columna dos.
        c.gridy = 1; // El �rea de texto empieza en la fila uno
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        dos.setPreferredSize(new Dimension(60,30));
        add(dos, c);
		dos.addActionListener(this);

        //TRES
		JButton tres= new JButton("3");
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 2; // El �rea de texto empieza en la fila dos
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        tres.setPreferredSize(new Dimension(60,30));
        add(tres, c);
		tres.addActionListener(this);

        //CUATRO
		JButton cuatro= new JButton("4");
        c.gridx = 1; // El �rea de texto empieza en la columna uno.
        c.gridy = 2; // El �rea de texto empieza en la fila dos
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        cuatro.setPreferredSize(new Dimension(60,30));
        add(cuatro, c);
		cuatro.addActionListener(this);

        //CINCO
		JButton cinco= new JButton("5");
        c.gridx = 2; // El �rea de texto empieza en la columna dos.
        c.gridy = 2; // El �rea de texto empieza en la fila dos
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        cinco.setPreferredSize(new Dimension(60,30));
        add(cinco, c);
		cinco.addActionListener(this);

        //SEIS
		JButton seis= new JButton("6");
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 3; // El �rea de texto empieza en la fila tres
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        seis.setPreferredSize(new Dimension(60,30));
        add(seis, c);
		seis.addActionListener(this);

        //SIETE
		JButton siete= new JButton("7");
        c.gridx = 1; // El �rea de texto empieza en la columna uno.
        c.gridy = 3; // El �rea de texto empieza en la fila tres
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        siete.setPreferredSize(new Dimension(60,30));
        add(siete, c);
		siete.addActionListener(this);

        //OCHO
		JButton ocho= new JButton("8");
        c.gridx = 2; // El �rea de texto empieza en la columna dos.
        c.gridy = 3; // El �rea de texto empieza en la fila tres
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        ocho.setPreferredSize(new Dimension(60,30));
        add(ocho, c);
		ocho.addActionListener(this);

        //NUEVE
		JButton nueve= new JButton("9");
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 4; // El �rea de texto empieza en la fila cuatro
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        nueve.setPreferredSize(new Dimension(60,30));
        add(nueve, c);
		nueve.addActionListener(this);

        //SIGNO COMA
		JButton coma= new JButton(".");   //Para operaciones con DOUBLE el signo ortografico "." viene mejor que el ","
        c.gridx = 1; // El �rea de texto empieza en la columna uno.
        c.gridy = 4; // El �rea de texto empieza en la fila cuatro
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        coma.setPreferredSize(new Dimension(60,30));
        add(coma, c);
		coma.addActionListener(this);

        //SIGNO SUMA
		JButton suma= new JButton("+");
        c.gridx = 2; // El �rea de texto empieza en la columna dos.
        c.gridy = 4; // El �rea de texto empieza en la fila cuatro
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        suma.setPreferredSize(new Dimension(60,30));
        add(suma, c);
		suma.addActionListener(this);

        //SIGNO RESTA
		JButton resta= new JButton("-");
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 5; // El �rea de texto empieza en la fila cinco
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        resta.setPreferredSize(new Dimension(60,30));
        add(resta, c);
		resta.addActionListener(this);

        //SIGNO MULTIPLICACION
		JButton multiplicacion= new JButton("*");
        c.gridx = 1; // El �rea de texto empieza en la columna uno.
        c.gridy = 5; // El �rea de texto empieza en la fila cinco
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        multiplicacion.setPreferredSize(new Dimension(60,30));
        add(multiplicacion, c);
		multiplicacion.addActionListener(this);

        //SIGNO DIVISION
		JButton division= new JButton("/");
        c.gridx = 2; // El �rea de texto empieza en la columna dos.
        c.gridy = 5; // El �rea de texto empieza en la fila cinco
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        division.setPreferredSize(new Dimension(60,30));
        add(division, c);
		division.addActionListener(this);

        //SIGNO RAIZ
		JButton raiz= new JButton("R");
        c.gridx = 0; // El �rea de texto empieza en la columna cero.
        c.gridy = 6; // El �rea de texto empieza en la fila seis
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        raiz.setPreferredSize(new Dimension(60,30));
        add(raiz, c);
		raiz.addActionListener(this);
		
        //SIGNO BORRAR
		JButton borrar= new JButton("C");
        c.gridx = 1; // El �rea de texto empieza en la columna uno.
        c.gridy = 6; // El �rea de texto empieza en la fila seis
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        borrar.setPreferredSize(new Dimension(60,30));
        add(borrar, c);
		borrar.addActionListener(this);
		
        //SIGNO IGUAL
		JButton igual= new JButton("=");
        c.gridx = 2; // El �rea de texto empieza en la columna dos.
        c.gridy = 6; // El �rea de texto empieza en la fila seis
        c.gridwidth = 1; // El �rea de texto ocupa una columna.
        c.gridheight = 1; // El �rea de texto ocupa una fila.
        igual.setPreferredSize(new Dimension(60,30));
        add(igual, c);
		igual.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		//SE EXTRAE EL CARACTER PULSADO
		caracter=e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5,e.getSource().toString().indexOf("text=")+6);
		//SE PROCECE CON LAS CONDICIONALES
		if(caracter.equals(".") && semaforoComa==0)
			{
			//SIGNO DE LA COMA
			sentencia=sentencia.concat(caracter);
			pantalla.setText(sentencia);
			semaforoComa=1;   //Se activa el semaforo para decir que no se podrán poner mas comas
			}
		if(caracter.equals("C"))
			{
			//ACCIONAMIENTO DE BORRADO DE LA PANTALLA DE LA CALCULADORA
			sentencia="";
			pantalla.setText(sentencia);
			semaforoComa=0;   //Se activa el semaforo para decir que no se podrán poner mas comas
			numero=0;         //Se reactiva para volver a poner el signo coma
			}
		if(caracter.equals("+") || caracter.equals("-") || caracter.equals("*") || caracter.equals("/") || caracter.equals("R")|| caracter.equals("="))
			{
			   if(caracter.equals(""))
			   {
				   //NO HACE NADA PORQUE NO HABÍA NINGUN NUMERO ESCRITO PREVIAMENTE
			   }
			   if(!caracter.equals("") || caracter.equals("+") || caracter.equals("-") || caracter.equals("*") || caracter.equals("/"))
			   {
					if(registro==0)
					{
						resultadoIntermedio=sentencia;
						signo=caracter;  //SE GUARDA EL TIPO DE SIGNO
						sentencia="";     //SE BORRA PARA INICIAR DE NUEVO LA RECOGIDA DE DATOS
						pantalla.setText("");
						registro=1;    //SE EVITA QUE SE META OTRO SIGNO TRAS LA INTRODUCCION DEL SEGUNDO NUMERO
						semaforoComa=0;  //AL INCLUIR LA OPERACION SE PERMITE ACTIVAR DE NUEVO LA INCLUSION DE LA COMA PARA EL SIGUIENTE NUMERO
					}
					else
					{
						//NO HACE NADA PORQUE NO SE PUEDE HACER UNA SEGUNDA OPERACION SIN HABERLE DADO AL IGUAL
					}
			   }
			   if(caracter.equals("="))
			   {
				   if(signo.equals("+"))
				   {
					   registro=0;  //SE DESACTIVA PARA TRABAJAR CON LA SIGUIENTE OPERACION
					   //EN EL CASO DE QUE SEA UNA SUMA  
					   resultadoOperacion=resultadoOperacion+Double.parseDouble(resultadoIntermedio)+Double.parseDouble(sentencia);
					   pantalla.setText(Double.toString(resultadoOperacion));
					   sentencia="0.0";   //SE REINICIA EL VALOR PORQUE YA FUE USADO   
				   }
				   if(signo.equals("-"))
				   {
					   registro=0;  //SE DESACTIVA PARA TRABAJAR CON LA SIGUIENTE OPERACION
					   //EN EL CASO DE QUE SEA UNA SUMA  
					   resultadoOperacion=resultadoOperacion+Double.parseDouble(resultadoIntermedio)-Double.parseDouble(sentencia);
					   pantalla.setText(Double.toString(resultadoOperacion));
					   sentencia="0.0";   //SE REINICIA EL VALOR PORQUE YA FUE USADO   
				   }
				   if(signo.equals("*"))
				   {
					   registro=0;  //SE DESACTIVA PARA TRABAJAR CON LA SIGUIENTE OPERACION
					   //EN EL CASO DE QUE SEA UNA SUMA  
					   resultadoOperacion=(resultadoOperacion+Double.parseDouble(resultadoIntermedio))*Double.parseDouble(sentencia);
					   pantalla.setText(Double.toString(resultadoOperacion));
					   sentencia="0.0";   //SE REINICIA EL VALOR PORQUE YA FUE USADO   
				   }
				   if(signo.equals("/"))
				   {
					   registro=0;  //SE DESACTIVA PARA TRABAJAR CON LA SIGUIENTE OPERACION
					   //EN EL CASO DE QUE SEA UNA SUMA  
					   resultadoOperacion=resultadoOperacion+Double.parseDouble(resultadoIntermedio)/Double.parseDouble(sentencia);
					   pantalla.setText(Double.toString(resultadoOperacion));
					   sentencia="0.0";   //SE REINICIA EL VALOR PORQUE YA FUE USADO   
				   }
				   if(signo.equals("R"))
				   {
					   registro=0;  //SE DESACTIVA PARA TRABAJAR CON LA SIGUIENTE OPERACION
					   //EN EL CASO DE QUE SEA UNA SUMA  
					   resultadoOperacion=Math.sqrt(Double.parseDouble(resultadoIntermedio));
					   pantalla.setText(Double.toString(resultadoOperacion));
					   sentencia="0.0";   //SE REINICIA EL VALOR PORQUE YA FUE USADO   
				   }
			   }
			}
		if(caracter.equals("1") || caracter.equals("2") ||caracter.equals("3") ||caracter.equals("4") ||caracter.equals("5") ||caracter.equals("6") ||caracter.equals("7") ||caracter.equals("8") ||caracter.equals("9") ||caracter.equals("0"))
			{
			 int resul=0;
			  comprobante=Integer.parseInt(caracter);

			  for(int i=0;i<sentencia.length();i++)
			  {
				  if(sentencia.charAt(i)=='0' && sentencia.charAt(i)!=',')
					  {
					  	resul=resul+1;  //Se cuenta la cantidad de 0 que hay sin haberle incluido una coma
					  }
			  }
			  if(resul==sentencia.length() && sentencia!="")
			  {
				  //NUMERO DE CEROS ENCONTADOS ANTES DE UNA COMA 
			  }
			  else
			  {
				sentencia=sentencia+comprobante;
				pantalla.setText(sentencia);
			  }
	    	}
     }
}
