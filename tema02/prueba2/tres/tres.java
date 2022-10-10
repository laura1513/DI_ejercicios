import javax.swing.*;
import java.awt.*;

public class tres extends JFrame{
    private Container panel;
    public tres() {
        super("Prueba");
        TextField text = new TextField("Introduce un texto");
        panel = getContentPane();
        setLayout(new GridLayout());
        setSize(200,100);
        panel.add(text);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        tres app = new tres();
    }
}
