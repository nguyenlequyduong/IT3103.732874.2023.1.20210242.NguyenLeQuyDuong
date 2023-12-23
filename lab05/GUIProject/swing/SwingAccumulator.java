import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAccumulator extends JFrame {
    // Attributes
    private JTextField tfInput;  // JTextField để nhập số nguyên
    private JTextField tfOutput; // JTextField hiển thị tổng tích lũy
    private int sum = 0; // Biến lưu trữ tổng tích lũy

    // Constructor
    public SwingAccumulator() {
        Container cp = getContentPane(); // Lấy content pane của JFrame
        cp.setLayout(new GridLayout(2, 2)); // Sử dụng GridLayout với 2 hàng và 2 cột

        cp.add(new JLabel("Enter an Integer: ")); // Label hướng dẫn nhập số nguyên

        tfInput = new JTextField(10); // JTextField cho việc nhập số nguyên
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener()); // Đăng ký sự kiện cho JTextField nhập số nguyên

        cp.add(new JLabel("The Accumulated Sum is: ")); // Label hiển thị tổng tích lũy

        tfOutput = new JTextField(10); // JTextField hiển thị tổng tích lũy (không cho phép chỉnh sửa)
        tfOutput.setEditable(false);
        cp.add(tfOutput);

        setTitle("Swing Accumulator"); // Tiêu đề của JFrame
        setSize(350, 120); // Kích thước của JFrame
        setVisible(true); // Hiển thị JFrame
    }

    // Phương thức main để khởi tạo đối tượng SwingAccumulator
    public static void main(String[] args) {
        new SwingAccumulator();
    }

    // Lớp nội dung TFInputListener để xử lý sự kiện khi nhập số nguyên
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Lấy số nguyên từ JTextField và cộng vào tổng tích lũy
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;

            // Xóa nội dung trong JTextField nhập số nguyên
            tfInput.setText("");

            // Hiển thị tổng tích lũy trong JTextField hiển thị
            tfOutput.setText(sum + "");
        }
    }
}