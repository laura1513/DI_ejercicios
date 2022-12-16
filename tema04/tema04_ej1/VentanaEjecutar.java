import javax.swing.*;

public class VentanaEjecutar extends JFrame{
    private JPanel error;
    private JLabel err;
    public VentanaEjecutar() {
        super("");
        setContentPane(error);
        setSize(800,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
