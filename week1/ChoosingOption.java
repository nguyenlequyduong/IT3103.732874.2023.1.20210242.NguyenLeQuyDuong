
import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to first class ticket?");
        JOptionPane.showMessageDialog(null, "You have chosen: " +
                (option == JOptionPane.YES_OPTION ? "YES" : "NO"));
        System.exit(0);
    }
}