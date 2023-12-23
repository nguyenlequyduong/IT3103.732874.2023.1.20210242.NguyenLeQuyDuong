import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file to create the UI layout
        Parent root = FXMLLoader.load(getClass().getResource("Painter.fxml"));

        // Create a scene with the UI layout
        Scene scene = new Scene(root);

        // Set the stage title
        stage.setTitle("Painter");

        // Set the scene for the stage
        stage.setScene(scene);

        // Show the stage (display the application window)
        stage.show();
    }

    // The main method to launch the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
}
