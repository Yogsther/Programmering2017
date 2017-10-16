import javax.swing.*;

// 8.9
// Tar bort alla mellanslag i en string.

public class Test{

    public static void main (String[] args){

        String sentence = JOptionPane.showInputDialog("Skriv en mening: ");
        sentence = deleteSpace(sentence);
        JOptionPane.showMessageDialog(null, "Final: " + sentence);

    }

    public static String deleteSpace(String sentence){
        String newSentance = sentence.replace(" ", "");
        return newSentance;
    }

}
