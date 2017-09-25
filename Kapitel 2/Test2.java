import javax.swing.*;

public class Test2 {

	public static void main (String[] arg) {
		
		// Uppgift 2.3


		String firstInput = JOptionPane.showInputDialog("Write a sentence with at least two words.");
		
		int firstOutput = firstInput.length();

		int firstSpace = firstInput.indexOf(" ");
		int lastSpace = firstInput.lastIndexOf(" ");

		String firstWord = firstInput.substring(0, firstSpace);
		String lastWord = firstInput.substring(lastSpace, firstOutput);


		JOptionPane.showMessageDialog(null, "Number of characters: " + firstOutput + "."
			+ " Your first word was: " + firstWord + "," + " and your last word was " + lastWord);

	}

}