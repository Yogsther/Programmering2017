import javax.swing.*;

public class Test {

	public static void main (String[] arg) {
		
		//Show hello message
		JOptionPane.showMessageDialog(null, "Hello " + 
			System.getProperty("user.name") + "!");

		//Get user name via input box
		String userName = JOptionPane.showInputDialog("Please enter your name: ");

		JOptionPane.showMessageDialog(null, "Thank you " + 
			userName + "!");
		//Get two numbers, and add them.
		String numberOne = JOptionPane.showInputDialog("Enter a number: ");
		String numberTwo = JOptionPane.showInputDialog("Enter another number: ");
		int sumOfNumbers = Integer.parseInt(numberOne) + Integer.parseInt(numberOne);
		// Display sum of numberTwo & numberOne
		JOptionPane.showMessageDialog(null, "The sum of your numbers is " + 
			sumOfNumbers + "!");



	}

}