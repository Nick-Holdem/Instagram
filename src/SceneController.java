import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneController {

    @FXML
    private Label display;

    @FXML
    private Button submitBtn;

    @FXML
    private TextField txtFild;

    @FXML
    void onSubmitBtnClick(ActionEvent event) {
         display.setText(txtFild.getText());
         
    }

}
