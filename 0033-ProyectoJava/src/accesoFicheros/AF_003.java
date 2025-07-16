package accesoFicheros;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AF_003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) PREGUNTAR QUÉ NOMBRE DE LA CARPETA QUE SE CREARÁ
		//2) PREGUTNAR POR EL NOMBRE DEL ARCHIVO SE QUIERE CREAR
		//3) JAVA CREARÁ UN FICHERO TXT AUTOMATICAMENTE CON EL NOMBRE DADO EN EL PUNTO ANTERIOR
		//4) ESCRIBIRÁ DENTRO DEL FICHERO ANTERIOR UNA FRASE LA QUE EL USUARIO QUIERA 
		//5) TODO CON JOptionpane
		//6) PEDIR SI SE QUIERE QUE HACER PARA BORRAR UN FICHERO O DIRECTORIO
		escenarioOpciones escena= new escenarioOpciones();
		escena.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class escenarioOpciones extends JFrame
{
	public escenarioOpciones()
	{
	setBounds(400,200,460,180);
	setTitle("MENU GESTIÓN DE FICHEROS Y DIRECTORIOS");
	panelOpciones tablero= new panelOpciones();
	add(tablero);
	setVisible(true);
	}
}
class panelOpciones extends JPanel implements ActionListener
{
	private static String mensaje="";
	public panelOpciones()
	{
		setBackground(new Color(4,81,6));
		//BOTON DE CREAR DIRECTORIO
		JButton crearDirectorio= new JButton("CREAR DIRECTORIO");
		crearDirectorio.setPreferredSize(new Dimension(250,20));
		crearDirectorio.addActionListener(this);
		add(crearDirectorio);
		//BOTON DE CREAR FICHERO
		JButton crearFichero= new JButton("CREAR FICHERO");
		crearFichero.setPreferredSize(new Dimension(250,20));
		crearFichero.addActionListener(this);
		add(crearFichero);
		//BOTON DE ESCRIBIR EN FICHERO
		JButton escribirEnFichero= new JButton("ESCRIBIR EN FICHERO");
		escribirEnFichero.setPreferredSize(new Dimension(250,20));
		escribirEnFichero.addActionListener(this);
		add(escribirEnFichero);
		//BOTON DE BORRAR FICHERO
		JButton borrarFichero= new JButton("BORRAR FICHERO");
		borrarFichero.setPreferredSize(new Dimension(250,20));
		borrarFichero.addActionListener(this);
		add(borrarFichero);
		//BOTON DE BORRAR DIRECTORIO
		JButton borrarDirectorio= new JButton("BORRAR FICHERO");
		borrarDirectorio.setPreferredSize(new Dimension(250,20));
		borrarDirectorio.addActionListener(this);
		add(borrarDirectorio);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().toString().contains("CREAR DIRECTORIO"))
		{
			//CREA UN NUEVO DIRECTORIO NUEVO
			cargaPanelControl(1);
		}
		if(e.getSource().toString().contains("CREAR FICHERO"))
		{
			//CREA UN NUEVO FICHERO NUEVO
			cargaPanelControl(2);
		}
		if(e.getSource().toString().contains("ESCRIBIR EN FICHERO"))
		{
			//ESCRIBIR EN UN FICHERO
			cargaPanelControl(3);
		}
		else {
			System.out.println("ELIGIO OTRA COSA");
		}
	}
	public void cargaPanelControl(int controlEleccion)
	{
		switch(controlEleccion)
		{
			case 1:
			{
				//CREA UN NUEVO DIRECTORIO
				mensaje= JOptionPane.showInputDialog("INDIQUE EL NOMBRE DEL DIRECTORIO");
				if(mensaje==null)
				{
					System.out.println("OPERACION DE CREAR DIRECTORIO, CANCELADA!");
				}
				else
				{
					//C:\Users\Sfer4\Desktop\AVANCES\0016_20240729_JAVA\0033-ProyectoJava\directorioDocumentos
					File crearDirectorio= new File("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+mensaje);
					crearDirectorio.mkdir();
					System.out.println("ELIGIO CREAR DIRECTORIO");
					System.out.println("DIRECTORIO CREADO! CON EL NOMBRE: "+mensaje);
				}
				break;
			}
			case 2:
			{
				//CREA UN NUEVO FICHERO
				mensaje= JOptionPane.showInputDialog("INDIQUE EL NOMBRE DEL FICHERO");
				if(mensaje==null)
				{
					System.out.println("OPERACION DE CREAR FICHERO, CANCELADA!");
				}
				else
				{
					//C:\Users\Sfer4\Desktop\AVANCES\0016_20240729_JAVA\0033-ProyectoJava\directorioDocumentos
					File crearFichero= new File("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+mensaje+".txt");
					try {
						if(crearFichero.exists())
						{
							System.out.println("No se ha creado el fichero porque ya existía!");
						}
						else
						{
							crearFichero.createNewFile();
							System.out.println("ELIGIO CREAR FICHERO");
							System.out.println("FICHERO CREADO! CON EL NOMBRE: "+mensaje);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("No se ha podido crear el fichero debido a: "+e.getCause());
					}
				}
				break;
			}
			case 3:
			{
			//ESCRIBE EN UN FICHERO
				//C:\Users\Sfer4\Desktop\AVANCES\0016_20240729_JAVA\0033-ProyectoJava\directorioDocumentos
				mensaje= JOptionPane.showInputDialog("INDIQUE EL NOMBRE DEL FICHERO PARA ESCRIBIR");
				if(mensaje==null)
				{
					System.out.println("Operación de escritura cancelada al no haber nombre del fichero adjunto");
				}
				else
				{
					try {
						File fichero= new File("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+mensaje+".txt");
						String lectura="";
						char letra;
						int caracter;
						if(fichero.exists())
						{
							//SI EL FICHERO EXISTE LO QUE TENDRA QUE HACER ES AÑADIR NO SOBREESCRIBIR
							//PRIMERO LEE EL CONTENIDO DEL FICHERO
							FileReader leerFichero= new FileReader("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+mensaje+".txt");
							caracter=leerFichero.read();
							while(caracter!=-1)
							{
								letra=(char)caracter;
								lectura=lectura+letra;
								caracter=leerFichero.read();
							}
							leerFichero.close();  //cierre de lectura
							System.out.println(lectura);
							//SEGUNDO ADJUNTA EL NUEVO CONTENIDO CON EL ANTERIOR DEL FICHERO
							FileWriter escribirFichero= new FileWriter("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+mensaje+".txt");
							mensaje=JOptionPane.showInputDialog("INDIQUE EL TEXTO QUE QUIERE INTORDUCIR EN EL FICHERO NUEVO");
							mensaje= lectura.concat("\n").concat(mensaje);
							System.out.println(mensaje);
							for(int i=0;i<mensaje.length();i++)
							{
								escribirFichero.write(mensaje.charAt(i));
							}
							escribirFichero.close();  //cierre de escritura
						}
						else
						{
							//SI NO EXISTE LO QUE TENDRA QUE HACER ES CREAR EL FICHERO Y ESRIBIR EN EL
							FileWriter escribirFichero= new FileWriter("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+mensaje+".txt");
							mensaje=JOptionPane.showInputDialog("INDIQUE EL TEXTO QUE QUIERE INTORDUCIR EN EL FICHERO NUEVO");
							for(int i=0;i<mensaje.length();i++)
							{
								escribirFichero.append(mensaje.charAt(i));
							}
							escribirFichero.close();  //cierre de escritura
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("No se ha podido escribir en el fichero porque no existe o esta corrupto");
					}
				}		
			}
				break;
			case 4:
			{
				break;
			}
			case 5:
			{
				break;
			}
			case 6:
			{
				break;
			}
			default:
			{
				System.out.println("No existe esa opcion");
			}
		}
	}
}