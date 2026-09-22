import javax.swing.JOptionPane;
public class OperationsWithTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double sum, difference, product, quotient;
        String sumNotification = "The sum of two numbers is: ";
        String differenceNotification = "The difference of two numbers is: ";
        String productNotification = "The product of two numbers is: ";
        String quotientNotification = "The quotient of two numbers is: ";

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        sum = num1 + num2;
        sumNotification += String.valueOf(sum);
        JOptionPane.showMessageDialog(null, sumNotification, "Show the sum of two numbers", JOptionPane.INFORMATION_MESSAGE);

        difference = num1 - num2;
        differenceNotification += String.valueOf(difference);
        JOptionPane.showMessageDialog(null, differenceNotification, "Show the difference of two numbers", JOptionPane.INFORMATION_MESSAGE);

        product = num1 * num2;
        productNotification += String.valueOf(product);
        JOptionPane.showMessageDialog(null, productNotification, "Show the product of two numbers", JOptionPane.INFORMATION_MESSAGE);

        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "Cannot divide!", "Show the quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        } else {
            quotient = num1 / num2;
            quotientNotification += String.valueOf(quotient);
            JOptionPane.showMessageDialog(null, quotientNotification, "Show the quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
