import javax.swing.*;

public class LinearEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b"));
        if (a == 0) {
            if (b == 0)
                JOptionPane.showMessageDialog(null, "The equation has infinitely many solutions");
            else
                JOptionPane.showMessageDialog(null, "The equation has no solution");
        }
        else
            JOptionPane.showMessageDialog(null, "The equation \"ax + b = 0\" has one solution: x = " + -b/a);
    }
}