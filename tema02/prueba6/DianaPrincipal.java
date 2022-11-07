import javax.swing.*;
import java.awt.*;

public class DianaPrincipal extends JFrame {
    public DianaPrincipal() {
        super("Diana Horizontal");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        JSlider diana = new JSlider(0,100);

        add(diana);
        setSize((int) screenSize.getWidth()*50/100, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        DianaPrincipal di = new DianaPrincipal();
    }
}
