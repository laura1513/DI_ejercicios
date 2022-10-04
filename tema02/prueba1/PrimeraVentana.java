import javax.swing.*;
import java.awt.*;

public class PrimeraVentana extends JFrame {
    public PrimeraVentana() {
        super("Mi primera Ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        this.getContentPane().setBackground(Color.orange);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new PrimeraVentana();
    }
}
