import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
    private Paint penColor; // Màu của bút vẽ
    @FXML
    private Pane drawingAreaPane; // Pane chứa vùng vẽ

    @FXML
    private ToggleGroup identical; // ToggleGroup để quản lý các nút chọn

    @FXML
    void clearButtonPressed(ActionEvent event) {
        // Xóa toàn bộ nội dung trên vùng vẽ
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        // Tạo và thêm một hình tròn mới vào vùng vẽ khi chuột được kéo
        Circle newCircle = new Circle(event.getX(),
                event.getY(), 4, penColor);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void eraserButtonPressed(ActionEvent event) {
        // Đặt màu của bút là trắng để làm nút tẩy
        penColor = Color.WHITE;
    }

    @FXML
    void penButtonPressed(ActionEvent event) {
        // Đặt màu của bút là đen để làm nút bút
        penColor = Color.BLACK;
    }
}
