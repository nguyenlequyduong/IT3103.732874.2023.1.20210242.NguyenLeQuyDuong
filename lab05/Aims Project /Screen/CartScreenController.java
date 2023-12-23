import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lab05.AimsProject.Cart;
import lab05.AimsProject.media.Media;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
    private Cart cart;

    private FXMLLoader loader;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;


    // Constructor
    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    // Initialize method called after FXML file is loaded
    @FXML
    private void initialize() {
        // Set cell value factories for each column
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost"));

        // Set the items in the table to the items in the Cart
        tblMedia.setItems(this.cart.getItemsOrdered());
    }

       