import javax.swing.*;
import java.awt.*;

/**
 * Public class 'pp' in created, this class extends JFrame.
 * JFrame is a class used in Swing to generate windows on which to add different objects with which the user can interact or not.
 */
public class pp extends JFrame {
    public pp () {
        //Initialize the first window with the objects
        //Set the title of the window
        super("Mi primera ventana");
        //Set window size with a width of 300px and a height 300px
        setSize(300,300);
        //Set a color to the window background on rgb, dark blue
        setBackground(new Color(0, 64, 128));
        //Change window size with a width of 600px and a height 600px
        setSize(600, 600);
        //Create a button and set name to the button
        JButton button = new JButton("Pulsa aquí");
        //Set font properties to the button
        button.setFont(new Font("Arial", Font.PLAIN, 11));
        //Set position and size to the button
        button.setBounds(20, 30, 30, 30);
        //Set font color in the button (blue)
        button.setForeground(Color.BLUE);
        //Set background color in the button (white)
        button.setBackground(Color.white);
        //Show a message when the cursor is on the button
        button.setToolTipText("Esto es una prueba");
        //Add the button to the window and the position of this
        getContentPane().add(button, BorderLayout.NORTH);

        //Create a JTextField
        JTextField textField1 = new JTextField();
        //Set the position and the size of the JTextField
        textField1.setBounds(90, 60, 100, 30);
        //Align the TextField on the right
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        //Set the text on the TextField
        textField1.setText("Y aún otra prueba");
        //Set the background color of the TextField (pink)
        textField1.setBackground(Color.pink);
        //Add the TextField to the window
        add(textField1);

        //The window will close when the program is over
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set visible the window
        setVisible(true);
    }

    /**
     * Class main
     * @param args
     */
    public static void main(String[] args) {
        //Here the main call 'pp' class
        pp i= new pp();

        //The Toolkit class is a class that provides a platform-independent interface to platform-specific services, such as character fonts, images, printing, and display settings.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        //Set the dimension of the screen
        Dimension screenSize = toolkit.getScreenSize();
        //Initialize the String that the second window shows
        String resolucion = "La resolución de la pantalla es de " +
                (int)screenSize.getWidth() + " x " +
                (int)screenSize.getHeight();

        /*
        Creates a second window predetermined by the system. And show us with the message in the variable 'resolucion'
         */
        JOptionPane.showMessageDialog(null, resolucion,
                "Resolución de la pantalla",
                JOptionPane.INFORMATION_MESSAGE);
    }
}