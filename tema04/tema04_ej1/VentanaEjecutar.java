import javax.swing.*;

public class VentanaEjecutar extends JFrame{
    private JPanel error;
    private JLabel err;
    public VentanaEjecutar() {
        //Ventana la cual dirá que la instalación ha dado un error
        super("");
        setContentPane(error);
        setSize(800,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
