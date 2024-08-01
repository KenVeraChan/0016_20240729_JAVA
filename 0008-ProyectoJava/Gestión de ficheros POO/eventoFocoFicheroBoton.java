package eventos;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

public class eventoFocoFicheroBoton {

	public static void main(String[] args) {
		escenario ventana= new escenario();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setTitle("MENU DE FRASES CELEBRES");
	
	}
}

class escenario extends JFrame{
	
	public escenario(){
		dinas nuevoMarco= new dinas();
		setBounds(200, 200, 550, 250);
		add(nuevoMarco);
		setVisible(true);
	}
}

class dinas extends JPanel{

	Button crearFichero= new Button("COMPROBAR ESTADO DEL FICHERO");
	Button verContenido= new Button("VER CONTENIDO");
	Button anadirContenido= new Button("AÑADIR CONTENIDO");
	RATON Clic= new RATON();
	TextArea Caja= new TextArea();
	public dinas()
	{
		//SE AÑADEN LOS BOTONES DE ACCESO
		add(crearFichero);
		add(verContenido);
		add(anadirContenido);
		//SE AÑADE LA CAJA DE TEXTO
		Caja.setBounds(50, 50, 500, 300);
		add(Caja);
		//SE CREAN LOS LISTENERS
		Caja.addMouseListener(Clic);
		crearFichero.addMouseListener(Clic);
		verContenido.addMouseListener(Clic);
		anadirContenido.addMouseListener(Clic);	
	}
	
	//ACCIONAMIENTO CON EL RATON REGISTADO COMO CLASE INTERNA
	class RATON extends MouseInputAdapter{
		private static int contador=0;
		private static int FINBUCLE=0;
		String NOMBREFICH = new String(JOptionPane.showInputDialog("Intro nombre fichero para CREAR/CARGAR"));
		String NOTA= new String(NOMBREFICH+".txt");
		//PARA CONSTRUIR UNA CADENA DE CARACTERES A BASE DE UNIR CARACTERES SUELTOS
		StringBuilder Contenido= new StringBuilder("");
		File nuevoDocumento= new File(NOTA);
		public void mousePressed(MouseEvent e) {
			if(e.getSource()==crearFichero)
			{
				try {
					//SE TIENE QUE COMPROBAR QUE EL FICHERO EXISTE O NO
					if(nuevoDocumento.exists()==false)
					{
					//EL FICHERO NO EXISTÍA Y SE HA CREADO UNO NUEVO
					nuevoDocumento.createNewFile();
					Caja.setText("Se ha creado un NUEVO fichero.\nNombre del Fichero: "+NOMBREFICH);
					}
					else if(nuevoDocumento.exists()==true) 
					{
					//EL FICHERO EXISTE Y NO SE CREA DE NUEVO SE EDITA Y SE SOBREESCRIBE. SE EMPLEAN RETORNOS DE CARRO PARA GESTIONAR EL MENSAJE
					Caja.setText("El fichero: "+NOMBREFICH+"\nYa existe.\nSe ha cargado en el Buffer.\nSe mostrará su contenido en CONSOLA");
					}

				} catch (IOException e1) {
					// SE SACA UNA EXCEPCION EN EL CASO DE QUE EL PROGRAMA FALLE
					e1.printStackTrace();
				}
			}
			if(e.getSource()==verContenido)
			{					
				//PRUEBA DE EXPOSICION DE QUE LO QUE HA COPIADO ERA EL CONTENIDO DEL FICHERO
				System.out.println("");
				System.out.println("----------------------------------------------------");
				System.out.println("--- FICHERO POSEE EL SIGUIENTE CONTENIDO ESCRITO ---");
				System.out.println("----------------------------------------------------");
				System.out.println("");
				try {
					//EL FICHERO EXISTE Y NO SE CREA DE NUEVO SE EDITA Y SE SOBREESCRIBE 
					//SE PROCEDERA A LEER EL CONTENIDO DEL FICHERO
					FileReader lector= new FileReader(NOTA);
					//CREA MATRIZ PARA GUARDAR LOS CARACTERES ALMACENADOS
					char leyendo[]= new char[10000];
					//METODO INVOCADO PARA LEER DEL FICHERO
					lector.read(leyendo, 0, 10000);
					//EXPONE TODO LO QUE HAYA LEIDO DEL FICHERO
						for(int i=0;i<=nuevoDocumento.length();i++)    
						{
							//LOS CARACTERES SE VAN UNIENDO COMO VAGONES DE UN TREN
							//RETORNO DE CARRO SE HA DESCUBIERTO QUE SE PUEDE REGISTRAR COMO \n o \r
							if(leyendo[i]=='.' && leyendo[i]!='\n' && leyendo[i]!='\r' && FINBUCLE==0)
							{
								System.out.println(Contenido.toString());
								System.out.println("Tiene: "+contador+" letras");
								System.out.println("");
								Contenido.delete(0, contador);   //SE BORRA TODO EL CONTENIDO HASTA EL MOMENTO Y SE VUELVE A EMPEZAR
								contador=0;  //SE REINICIA EL CONTADOR PARA LA SIGUIENTE FRASE CELEBRE								
							}
							if(leyendo[0]=='\0') //CARACTER NULO
							{
								System.out.println("El Fichero: "+NOMBREFICH+"\nNo tiene contenido escrito");
								FINBUCLE=1;   //ASI SE TERMINA EL BUCLE FOR
							}
							if(FINBUCLE==0 && leyendo[i]!='.' && leyendo[i]!='\n' && leyendo[i]!='\r')
							{
								//NO PUEDE CONTABILIZAR COMO CARACTER UN RETORNO DE CARRO
							    Contenido.append(leyendo[i]);	
								contador++;
							}
						}
				}
				catch (IOException e1) {
				// SE SACA UNA EXCEPCION EN EL CASO DE QUE EL PROGRAMA FALLE
				e1.printStackTrace();
				}
			}
			if(e.getSource()==anadirContenido)
			{
				try {
					//AQUI DEBE PEDIR AL USUARIO CUANTAS FRASES QUIERE AÑADIR Y EL CONTENIDO DE LAS FRASES
					int NUMFRASES = Integer.parseInt(JOptionPane.showInputDialog("Intro numero de frases que quiere meter en el fichero CARGADO"));
					String frasesAntiguas[]= new String[500];
					int puntero=0;
					//SE VACIA EL VECTOR DE FRASES
						for(puntero=0;puntero<frasesAntiguas.length;puntero++)
						{
							frasesAntiguas[puntero]="";
						}
						puntero=0; //SE REINICIA VARIABLE
					//SE ABRE EL FICHERO PARA COPIAR SUS FRASES
					//PRIMERO SE LEE Y LUEGO SE COPIA FRASE A FRASE 
					// CONCATENANDO CARACTERES SE PROCEDERA A LEER EL CONTENIDO DEL FICHERO
					FileReader lector= new FileReader(NOTA);
					//CREA MATRIZ PARA GUARDAR LOS CARACTERES ALMACENADOS
					char leyendo[]= new char[10000];
					//METODO INVOCADO PARA LEER DEL FICHERO
					lector.read(leyendo, 0, 10000);
					//EXPONE TODO LO QUE HAYA LEIDO DEL FICHERO
					//LO COPIA EN LA MATRIZ DE frasesAntiguas[]
						for(int i=0;i<=nuevoDocumento.length();i++)    
							{
								//RETORNO DE CARRO SE HA DESCUBIERTO QUE SE PUEDE REGISTRAR COMO \n o \r
								if(leyendo[i]=='.' && leyendo[i]!='\n' && leyendo[i]!='\r' && FINBUCLE==0)
								{
									frasesAntiguas[puntero]=Contenido.toString();
									Contenido.delete(0,contador);   //SE BORRA TODO EL CONTENIDO HASTA EL MOMENTO Y SE VUELVE A EMPEZAR
									puntero++;   //LA FRASE SIGUIENTE SE GUARDA EN LA SIGUIENTE CASILLA
									contador=0;  //SE REINICIA EL CONTADOR PARA LA SIGUIENTE FRASE CELEBRE
								}
								if(leyendo[0]=='\0') //CARACTER NULO
								{
									FINBUCLE=1;   //ASI SE TERMINA EL BUCLE FOR
								}
								if(FINBUCLE==0 && leyendo[i]!='.' && leyendo[i]!='\n' && leyendo[i]!='\r')
								{
									//NO PUEDE CONTABILIZAR COMO CARACTER UN RETORNO DE CARRO
									Contenido.append(leyendo[i]);	
									contador++;
								}
							}
							if(FINBUCLE==0)
							{ //ASEGURANDOSE QUE LA PRIMERA FRASE INTRODUCIDA EXISTE SINO NO ENTRA EN EL IF
							frasesAntiguas[0]=frasesAntiguas[0].substring(1, frasesAntiguas[0].length());
							}
					//SE SOLICITAN TODAS LAS FRASES QUE SE HAN MENCIONADO QUE SE INTRODUCIRÍAN
					//Y SE GUARDAN EN EL MISMO VECTOR PARA SEGUIR LA SECUENCIA
						contador=0;  //PARA CONTROLAR LA CANTIDAD DE FRASES METIDAS
					for(puntero=0;puntero<frasesAntiguas.length;puntero++)
					{
						if(frasesAntiguas[puntero]=="" && contador<NUMFRASES)
						{
						frasesAntiguas[puntero]=JOptionPane.showInputDialog("Intro frase: "+(contador+1));
						contador++;
						}					
					}				
					//PRUEBA DE EXPOSICION DE QUE LO QUE HA COPIADO ERA EL CONTENIDO DEL FICHERO
					System.out.println("");
					System.out.println("----------------------------------------------------");
					System.out.println("-- FICHERO ACTUALIZADO CON EL CONTENIDO SIGUIENTE --");
					System.out.println("----------------------------------------------------");
					System.out.println("");
					for(puntero=0;puntero<frasesAntiguas.length;puntero++)
					{
						if(frasesAntiguas[puntero]!="")
						{
							System.out.println(frasesAntiguas[puntero]);
						}
					}

					try (FileWriter ESCRIBIENDO = new FileWriter(nuevoDocumento)) {
						//SE ESCRIBE EN EL FICHERO CON LAS FRASES QUE SE HAN REGISTRADO
						for(puntero=0;puntero<frasesAntiguas.length;puntero++)
						{ 
							if(frasesAntiguas[puntero]!="")
							{
							ESCRIBIENDO.write(frasesAntiguas[puntero].concat("."), (int)nuevoDocumento.length(), frasesAntiguas[puntero].length()+1);
							ESCRIBIENDO.write('\n');
							}
						}
					}				
				} catch (IOException e1) {  //SI DA PROBLEMAS DE APERTURA Y ESCRITURA EN EL FICHERO
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		}
	}	
}



