import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
    // Attributes
    private TextField tfInput; // TextField để nhập số nguyên
    private TextField tfOutput; // TextField hiển thị tổng tích lũy
    private int sum = 0; // Biến lưu trữ tổng tích lũy

    // Constructor
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2)); // Sử dụng GridLayout với 2 hàng và 2 cột

        add(new Label("Enter an Integer: ")); // Label hướng dẫn nhập số nguyên

        tfInput = new TextField(10); // TextField cho việc nhập số nguyên
        add(tfInput);
        tfInput.addActionListener(new TFInputListener()); // Đăng ký sự kiện cho TextField nhập số nguyên

        add(new Label("The Accumulated Sum is: ")); // Label hiển thị tổng tích lũy

        tfOutput = new TextField(10); // TextField hiển thị tổng tích lũy (không cho phép chỉnh sửa)
        tfOutput.setEditable(false);
        add(tfOutput);

        setTitle("AWT Accumulator"); // Tiêu đề của cửa sổ
        setSize(350, 120); // Kích thước của cửa sổ
        setVisible(true); // Hiển thị cửa sổ
    }

    // Phương thức main để khởi tạo đối tượng AWTAccumulator
    public static void main(String[] args) {
        new AWTAccumulator();
    }

    // Lớp nội dung TFInputListener để xử lý sự kiện khi nhập số nguyên
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Lấy số nguyên từ TextField và cộng vào tổng tích lũy
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;

            // Xóa nội dung trong TextField nhập số nguyên
            tfInput.setText("");

            // Hiển thị tổng tích lũy trong TextField hiển thị
            tfOutput.setText(sum + "");
        }
    }
}
