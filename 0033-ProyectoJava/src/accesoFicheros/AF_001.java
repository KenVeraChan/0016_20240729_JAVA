package accesoFicheros;

import java.io.File;
import java.io.IOException;

public class AF_001 {

	public static void main(String[] args) {
		//CREACION DE FICHERO, DIRECTORIOS Y TRATAMIENTO DE ELLOS
		//VIENDO DIRECTORIOS O FICHEROS
		File directorio= new File("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos");
		System.out.println(directorio.getAbsolutePath());
		//CREANDO UN DIRECTORIO
		File directorioCrear= new File("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+"enlaces quimicos");
		directorioCrear.mkdir();
		//CREA UN DOCUMENTO DE TEXTO EN UN DIRECTORIO, TRAS COMPROBAR QUE EXISTE
		File ficheroCrear= new File("C:"+File.separator+"Users"+File.separator+"Sfer4"+File.separator+"Desktop"+File.separator+"AVANCES"+File.separator+"0016_20240729_JAVA"+File.separator+"0033-ProyectoJava"+File.separator+"directorioDocumentos"+File.separator+"enlaces quimicos"+File.separator+"enlacesCovalentes.txt");
		try {
			if(ficheroCrear.exists())
			{
				System.out.println("No se ha creado porque ya existía!");
			}
			else
			{
				ficheroCrear.createNewFile();	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se ha podido crear el fichero. El error ha sido: "+e.getCause());
		}
	}
}
