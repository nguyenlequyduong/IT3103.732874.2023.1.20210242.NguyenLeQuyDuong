
import javax.swing.*;
public class LinearSystem {
    public static void main(String[] args) {
        String[] eq1 = JOptionPane.showInputDialog("Enter the coefficients \"a11 a12 b1\" for the first equation:").split(" ");
        String[] eq2 = JOptionPane.showInputDialog("Enter the coefficients \"a21 a22 b2\" for the second equation:").split(" ");
        double a11 = Double.parseDouble(eq1[0]);
        double a12 = Double.parseDouble(eq1[1]);
        double b1 = Double.parseDouble(eq1[2]);
        double a21 = Double.parseDouble(eq2[0]);
        double a22 = Double.parseDouble(eq2[1]);
        double b2 = Double.parseDouble(eq2[2]);
        double det = a11 * a22 - a12 * a21;
        double d_1 = b1 * a22 - a12 * b2;
        double d_2 = a11 * b2 - b1 * a21;
        if (det != 0) {
            double x_1 = d_1 / det;
            double x_2 = d_2 / det;
            JOptionPane.showMessageDialog(null, "The solutions for the system: x1 = " + x_1 + ", x2 = " + x_2);
        }
        else {
            if (d_1 == 0 || d_2 == 0) {
                JOptionPane.showMessageDialog(null, "The system has infinitely many solutions");
            }
            else {
                JOptionPane.showMessageDialog(null, "The system has no solution");
            }
        }
        System.exit(0);
    }
}