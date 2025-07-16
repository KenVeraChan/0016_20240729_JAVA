package streamsLyE;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*Se hace el copiado y pegado en otro directorio de un fichero el que sea: codigo util para transferencia
 * de archivos en la red con SHOCKETS
 * */

public class Streams004_StreamsBytesFich {
	public static void main(String[] args)
	{
		int contador=0;   //Para contar los bytes que se van a generar (mejor hacer esto con COLECCIONES)
		int datoByte[]= new int[22200];
	try {
		//PARTE 1: LECTURA DEL FICHERO INTRODUCIDO EN BYTES DE DATOS
		FileInputStream lectura_archivo= new FileInputStream("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0032-ProyectoJava/portada.jpg");
		boolean final_archivo=false;
		while(final_archivo==false)
		{
			int byteImagenEntrada=lectura_archivo.read();
			
			//PARTE 2: GUARDAR EL DATO BYTE EN EL ARRAY
			if(byteImagenEntrada!=-1) datoByte[contador]=byteImagenEntrada;
			else final_archivo=true; //Ha llegado al final del archivo
			System.out.println(datoByte[contador]);
			contador++;
		}
	} catch (IOException e) {   //Se pone IOException porque habían dos excepciones: intento apertura fichero y lectura fichero
		// TODO Auto-generated catch block
		System.out.println("El fichero no se ha podido abrir o bien no se ha podido leer");
	}
	//System.out.println("Numero de bytes: "+contador);  //PARA SABER LAS POSICIONES DEL ARRAY
	CreaFichero(datoByte);  //Llamada al método de crear fichero
	}
	static void CreaFichero(int arrayExterno[])  //Un metodo estatico solo puede ser llamado por otro metodo estatico por eso este metodo es estatico
	{
		try {
			FileOutputStream ficheroExterno= new FileOutputStream("C:/Users/Sfer4/Desktop/AVANCES/0016_20240729_JAVA/0032-ProyectoJava/directorioEscritura/portadaClon.jpg");
		for(int i=0;i<arrayExterno.length;i++)
			{
				ficheroExterno.write(arrayExterno[i]);  //Crea el fichero recontruyendo la imagen con los bytes
			}
			ficheroExterno.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido crear el fichero");
		}
	}
}
