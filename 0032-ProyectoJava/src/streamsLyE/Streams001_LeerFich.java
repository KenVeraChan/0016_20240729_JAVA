package streamsLyE;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Streams001_LeerFich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero doc = new LeerFichero();
		doc.leeDatos();
	}

}
class LeerFichero{
	
	public void leeDatos() {
		try {
			FileReader entrada= new FileReader("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0032-ProyectoJava/fichero.txt");
			int caracter= entrada.read();
			char letra;
			while(caracter!=-1)
			{
				letra=(char)caracter;
				System.out.print(letra);
				caracter=entrada.read();
			}
			entrada.close();  //Cerrando el flujo de datos
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el fichero");
		}
	}
}
