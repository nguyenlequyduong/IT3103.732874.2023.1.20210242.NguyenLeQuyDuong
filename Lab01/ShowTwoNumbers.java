import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        // Khai báo các biến chuỗi để lưu dữ liệu nhập từ người dùng và thông báo kết
        // quả
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        // Hiển thị hộp thoại nhập dữ liệu cho số thứ nhất và lưu giá trị vào strNum1
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";

        // Hiển thị hộp thoại nhập dữ liệu cho số thứ hai và lưu giá trị vào strNum2
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        // Hiển thị thông báo chứa giá trị đã nhập
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        // Kết thúc chương trình
        System.exit(0);
    }
}
