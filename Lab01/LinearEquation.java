import javax.swing.*;

public class LinearEquation {
    public static void main(String[] args) {
        // Nhập giá trị cho a từ người dùng và chuyển đổi thành số thực
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a"));
        
        // Nhập giá trị cho b từ người dùng và chuyển đổi thành số thực
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b"));
        
        if (a == 0) {
            // Xử lý trường hợp a bằng 0
            if (b == 0)
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions");
            else
                JOptionPane.showMessageDialog(null, "The equation has no solution");
        } else {
            // Tính và hiển thị nghiệm của phương trình
            double solution = -b / a;
            JOptionPane.showMessageDialog(null, "The equation \"ax + b = 0\" has one solution: x = " + solution);
        }
    }
}
