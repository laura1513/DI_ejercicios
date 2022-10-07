import javax.swing.*;
import java.awt.*;

public class ventanaBoton extends JFrame {
    private Container panel;
    private JButton miboton;

    private JButton miboton2;
    public ventanaBoton() {
        super("Ventana con Botón");
        miboton = new JButton("Hola :)");
        miboton2 = new JButton("Adiós :(");
        panel = getContentPane();
        setLayout(new GridLayout(2, 1));
        panel.add(miboton);
        panel.add(miboton2);
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ventanaBoton app = new ventanaBoton();
    }

}
