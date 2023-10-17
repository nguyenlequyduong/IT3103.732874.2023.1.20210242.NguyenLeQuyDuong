
import javax.swing.*;

public class InputTwoDoubles {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification;
        strNum1 = JOptionPane. showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane. INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ","Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2,
                difference = num1 - num2,
                product = num1 * num2;
        if (num2 == 0)
            strNotification = "The sum, difference and product of two numbers are: " + sum + ", "
                    + difference + ", " + product + ", respectively. Since num2 = 0, there is no quotient.";
        else {
            double quotient = num1 / num2;
            strNotification = "The sum, difference, product and quotient of two numbers are: " + sum + ", "
                    + difference + ", " + product + "," + quotient + ", respectively.";

        }
        JOptionPane.showMessageDialog(null, strNotification,
                "Answer", JOptionPane. INFORMATION_MESSAGE);
        System.exit(0);
    }
}