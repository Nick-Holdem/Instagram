import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Automat generare metoda
        Parent root = FXMLLoader.load(getClass().getResource("SceenDemo.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

    }
}
