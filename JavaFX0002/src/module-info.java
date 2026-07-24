module JavaFX0002 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
