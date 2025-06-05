package componentesSwingElementales;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class componenteJMenu {

	public static void main(String[] args) {
		fondoJMenu resultado= new fondoJMenu();
		resultado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class fondoJMenu extends JFrame
{
	JMenuBar barraMenu= new JMenuBar();   //Barra del menu en donde iran las opciones
	JMenu opcionGuardar;  //Opciones de la misma barra menu: guardar del nivel 1
	JMenu opcionCargar;   //Opciones de la misma barra menu: cargar del nivel 1
	JMenu opcionEnviar;   //Opciones de la misma barra menu: enviar del nivel 1
	JMenu opcionSalir;    //Opciones de la misma barra menu: salir del nivel 1
	JMenu MenuNube;  //Opciones secundarias de las opciones principales: nube, del nivel 2 desplegable
	JMenuItem itemMenuLocal;  //Opciones secundarias de las opciones principales: local
	JMenuItem itemMenuServidorEmpresa; //Opciones secundarias de las opciones principales: servidor empresa
	//Submenu que generará las opciones terciarias del desplegable secundario
	JMenuItem OpcionSfer4D;     //Opcion terciaria del desplegable secundario de GUARDAR del nivel 3
	JMenuItem opcionTecheimer;  //Opcion terciaria del desplegable secundario de GUARDAR del nivel 3
	
	public fondoJMenu()
	{
		//LAMINA PRINCIPAL
		setBounds(500,200,370,211);
		setTitle("Ventana de JMenu");
		setResizable(false);
		//SE INCLUYE EL FONDO
	    setLayout(new BorderLayout());
	    JLabel header = new JLabel("AREA DE JMenu");
	    header.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setFont(new Font("Serif", Font.PLAIN, 24));
	    add(header, BorderLayout.NORTH);
	    
	    //SE INCLUYEN LAS OPCIONES DEL JMENU
		    barraMenu.setPreferredSize(new Dimension(210,20));
		    opcionGuardar=new JMenu("GUARDAR");
		    opcionCargar=new JMenu("CARGAR");
			opcionEnviar=new JMenu("ENVIAR");
			opcionSalir= new JMenu("SALIR");
			barraMenu.add(opcionGuardar);
			barraMenu.add(opcionCargar);
			barraMenu.add(opcionEnviar);
			barraMenu.add(opcionSalir);
			add(barraMenu);
		
		//Subnivel 2 de desplegables
			MenuNube= new JMenu("NUBE");
			itemMenuLocal= new JMenuItem("LOCAL");
			itemMenuServidorEmpresa= new JMenuItem("SERVIDOR EMPRESA");
			opcionGuardar.add(MenuNube);
			opcionGuardar.add(itemMenuLocal);
			opcionGuardar.add(itemMenuServidorEmpresa);
			
		//Subnivel 3 de items finales
			OpcionSfer4D= new JMenuItem("SFER4D");
			opcionTecheimer= new JMenuItem("TECHEIMER");
			MenuNube.add(OpcionSfer4D);
			MenuNube.add(opcionTecheimer);
			setVisible(true);
		
		//A continuacion se meteran las opciones terciarias desplegadas de las secundarias
		
	}
}
