import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import lab05.AimsProject.Cart;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class CartScreen extends JFrame {
    private Cart cart;

    // Constructor
    public CartScreen(Cart cart) {
        super();

        this.cart = cart;

        // Create a JavaFX panel embedded in a Swing JFrame
        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        // Set JFrame properties
        this.setTitle("Cart");
        this.setVisible(true);

        // Run the JavaFX operations on the JavaFX Application Thread
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    // Load the FXML file using FXMLLoader
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("cart.fxml"));

                    // Create a controller for the CartScreen
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);

                    // Load the FXML file and set the controller
                    Parent root = loader.load();

                    // Set the scene for the JavaFX panel
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
