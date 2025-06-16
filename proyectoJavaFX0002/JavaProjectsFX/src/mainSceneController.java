import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class mainSceneController {

    @FXML
    private TextField t1Title;

    @FXML
    void btnOKClicked(ActionEvent event) {
        Stage mainWindow = (Stage) t1Title.getScene().getWindow();
        String title = t1Title.getText();
        mainWindow.setTitle(title);
    }

}