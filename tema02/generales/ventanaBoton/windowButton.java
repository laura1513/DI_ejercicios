import javax.swing.*;
import java.awt.*;

public class windowButton extends JFrame {
    private Container panel;

    private JButton button1;

    private JButton button2;
    public windowButton() {
        super("Window with button");
        button1 = new JButton("Hello :)");
        button2 = new JButton("Bye :(");
        panel = getContentPane();
        setLayout(new GridLayout(2, 1));
        panel.add(button1);
        panel.add(button2);
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        button1.addActionListener(new EscuchadoraBoton());
    }

    public static void main(String[] args) {
        windowButton app = new windowButton();
    }

}
