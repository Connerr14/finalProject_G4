import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main (String[] args)
    {
        launch(args);


    }
    @Override
    public void start(Stage stage) throws Exception {
        // This gives us acsess to the .fxml file (whitch connects to the controller)
        Parent root = FXMLLoader.load(getClass().getResource("lesson1-start.fxml"));

        // Creating a new scene instance
        Scene scene = new Scene(root);

        // Setting the scene
        stage.setScene(scene);

        // Showing the scene
        stage.show();
    }
}
