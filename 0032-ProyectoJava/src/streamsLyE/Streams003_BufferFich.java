package streamsLyE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Streams003_BufferFich {

	public static void main(String[] args) {
		LecturaFichero documento= new LecturaFichero();
	}

}

class LecturaFichero
{
	public LecturaFichero()
	{
		try {
			FileReader ficheroLectura= new FileReader(new File("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0032-ProyectoJava/fichero.txt"));
			BufferedReader miBuffer= new BufferedReader(ficheroLectura);
			String linea="";
			while(linea!=null)
			{
				try {
					linea=miBuffer.readLine();
					if(linea!=null) System.out.println(linea);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("No se ha podido leer el fichero");
				}
			}
			
		}catch(FileNotFoundException error)
		{
			System.out.println("No existe el fichero en la ruta especificada");
		}
	}
}
