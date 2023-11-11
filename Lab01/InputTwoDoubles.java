import javax.swing.*;

public class InputTwoDoubles {
    public static void main(String[] args) {
        // Khai báo biến chuỗi để lưu dữ liệu nhập từ người dùng và thông báo kết quả
        String strNum1, strNum2;
        String strNotification;
        
        // Hiển thị hộp thoại nhập dữ liệu cho số thứ nhất và lưu giá trị vào strNum1
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        
        // Hiển thị hộp thoại nhập dữ liệu cho số thứ hai và lưu giá trị vào strNum2
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        
        // Chuyển đổi chuỗi thành số thực (double)
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        // Tính tổng, hiệu và tích của hai số
        double sum = num1 + num2,
                difference = num1 - num2,
                product = num1 * num2;
        
        if (num2 == 0) {
            // Xử lý trường hợp số thứ hai (num2) bằng 0
            strNotification = "The sum, difference, and product of two numbers are: " + sum + ", "
                    + difference + ", " + product + ", respectively. Since num2 = 0, there is no quotient.";
        } else {
            // Tính thương khi số thứ hai không bằng 0
            double quotient = num1 / num2;
            strNotification = "The sum, difference, product, and quotient of two numbers are: " + sum + ", "
                    + difference + ", " + product + "," + quotient + ", respectively.";
        }
        
        // Hiển thị thông báo chứa kết quả
        JOptionPane.showMessageDialog(null, strNotification, "Answer", JOptionPane.INFORMATION_MESSAGE);
        
        // Kết thúc chương trình
        System.exit(0);
    }
}
