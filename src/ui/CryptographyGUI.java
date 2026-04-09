package ui;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * This class provides a graphical user interface that allows a user to enter
 * text and select an encryption algorithm and key to encrypt the text. The user
 * can also enter encrypted text, select an algorithm and key to decrypt the
 * text.
 *
 */
public class CryptographyGUI extends JPanel {
    // Error message if the user does not enter a number for the key.
    private static final String KEY_ERROR_MESSAGE = 
            "Enter a number for the key.";

    // The width of the text areas for entering encrypted and decrypted text,
    // in characters
    private static final int TEXT_WIDTH = 50;

    // The number of rows in the text areas for entering encrypted and decrypted
    // text,
    // in characters
    private static final int TEXT_HEIGHT = 5;

    // Where the unencrypted text appears on the screen
    private JTextArea plainTextArea = new JTextArea(TEXT_HEIGHT, TEXT_WIDTH);

    // Where the encrypted text appears on the screen
    private JTextArea cipherTextArea = new JTextArea(TEXT_HEIGHT, TEXT_WIDTH);

    /**
     * Constructs the user interface for the program.
     */
    public CryptographyGUI() {
        // Create the two text areas for plain text and cipher text.
        plainTextArea.setBorder(BorderFactory.createTitledBorder("Plain text"));
        cipherTextArea
                .setBorder(BorderFactory.createTitledBorder("Cipher text"));
        

        // Add all the GUI elements to the display.
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(plainTextArea);
        add(cipherTextArea);
    }

    /**
     * The main method to start the program.
     * 
     * @param args None required
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CryptographyGUI gui = new CryptographyGUI();
        frame.getContentPane().add(gui);
        frame.pack();
        frame.setVisible(true);
    }

}

