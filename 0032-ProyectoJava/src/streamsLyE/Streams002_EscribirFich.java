package streamsLyE;

import java.io.FileWriter;
import java.io.IOException;

public class Streams002_EscribirFich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EscrituraFicheroNuevo creaEscribeFichero= new EscrituraFicheroNuevo();
		creaEscribeFichero.escribiendo();
		EscrituraFicheroAntiguo creaEscribeFicheroAntiguo= new EscrituraFicheroAntiguo();
		creaEscribeFicheroAntiguo.escribiendo();
	}

}

class EscrituraFicheroNuevo
{
	public void escribiendo()
	{
		String textoEscribir="Vitrea Horiz con 21 primaveras";
		try {
			FileWriter escritura= new FileWriter("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0032-ProyectoJava/fichero.txt");
			for(int i=0;i<textoEscribir.length();i++)
			{
				//Escribirá caracter a caracter dentro del fichero
				escritura.write(textoEscribir.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class EscrituraFicheroAntiguo
{
	public void escribiendo()
	{
		String textoEscribir="Emiliam Bastreriz con 21 otoños";
		try {
			FileWriter escritura= new FileWriter("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0032-ProyectoJava/ficheroEscritura.txt",true);
			for(int i=0;i<textoEscribir.length();i++)
			{
				//Escribirá caracter a caracter dentro del fichero
				escritura.write(textoEscribir.charAt(i));
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}