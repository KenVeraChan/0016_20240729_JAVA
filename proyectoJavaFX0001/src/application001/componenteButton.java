package application001;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class componenteButton extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Click Aqui");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {	
				System.out.println("Has pulsado el boton");				
			}
			
		});
		StackPane raiz= new StackPane();
		raiz.getChildren().add(btn);
		Scene escena = new Scene(raiz, 300, 250);
		arg0.setScene(escena);
		arg0.show();
		
	}

}
