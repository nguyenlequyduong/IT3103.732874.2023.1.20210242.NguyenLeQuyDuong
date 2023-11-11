import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        // Hiển thị hộp thoại xác nhận và lưu kết quả vào biến "option"
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to first class ticket?");

        // Hiển thị thông báo về lựa chọn của người dùng
        JOptionPane.showMessageDialog(null, "You have chosen: " +
                (option == JOptionPane.YES_OPTION ? "YES" : "NO"));

        // Kết thúc chương trình
        System.exit(0);
    }
}
