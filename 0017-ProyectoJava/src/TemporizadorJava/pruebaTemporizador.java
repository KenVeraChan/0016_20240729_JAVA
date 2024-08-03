package TemporizadorJava;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class pruebaTemporizador {
	public static void main(String[] args) {
		Temporizador oyente= new Temporizador();
		Timer miTemporizador= new Timer(1500,oyente);
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsar para detener el temporizador");
		//Al cerrarse el mensaje se detiene el temporizador
	}
}

class Temporizador implements ActionListener
{
	private static int puntero=0;
	public void actionPerformed(ActionEvent e) {
		Date horaactual= new Date();
		System.out.println(puntero+") Hola Alumnos son las: "+horaactual);
		puntero=puntero+1;
	}
}