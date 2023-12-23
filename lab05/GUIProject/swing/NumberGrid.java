import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    // Attributes
    private JButton[] btnNumbers = new JButton[10]; // Mảng chứa các nút số từ 0 đến 9
    private JButton btnDelete, btnReset; // Nút "DEL" và "C"
    private JTextField tfDisplay; // TextField để hiển thị và nhập số

    // Constructor
    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(200, 200);
        setVisible(true);
    }

    // Method to add buttons
    void addButtons(JPanel panelButtons) {
        ButtonListener btnListener = new ButtonListener();
        for (int i = 1; i <= 9; i++) {
            btnNumbers[i] = new JButton("" + i);
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(btnListener);
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener);

        btnNumbers[0] = new JButton("0");
        panelButtons.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);
    }

    // ActionListener for buttons
    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
                tfDisplay.setText(tfDisplay.getText() + button); // Nếu là nút số, thêm số vào TextField
            } else if (button.equals("DEL")) {
                String currentText = tfDisplay.getText();
                String text = currentText.substring(0, currentText.length() - 1);
                tfDisplay.setText(text); // Nếu là nút "DEL", xóa ký tự cuối cùng trong TextField
            } else {
                tfDisplay.setText(""); // Nếu là nút "C", xóa toàn bộ nội dung trong TextField
            }
        }
    }

    // Main method to create an instance of NumberGrid
    public static void main(String[] args) {
        new NumberGrid();
    }
}
