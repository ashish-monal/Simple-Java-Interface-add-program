import javax.swing.*;
public class MainScreen {

    public static void main(String[] args)
    {
        // JOptionPane
        //1- Input Dialog
        //2- Message Dialog

        // obtain User input from JoptionPane Dialog

        String firstNumber = JOptionPane.showInputDialog("Enter First Number");
        String SecondNumber = JOptionPane.showInputDialog("Enter Second Number");

        // Convert string Input to integer values for use in calculation
        int Number1 = Integer.parseInt(firstNumber);
        int Number2 = Integer.parseInt(SecondNumber);

        int sum = Number1 + Number2;

        // Display result in a JOptionPane Message Dialog

        JOptionPane.showMessageDialog(null,"The Sum is " +sum ,"Sum of two integer",JOptionPane.INFORMATION_MESSAGE);
    }
}
