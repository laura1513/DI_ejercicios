import javax.swing.*;

public class VentanaInicial extends JFrame{
    private JPanel panelPrincipal;
    private JLabel titulo;
    private JTextPane enElCasoDeTextPane;
    private JButton siguiente;
    private JCheckBox aceptoLasCondiciones;
    public VentanaInicial() {
        super("Ventana Principal");
        setContentPane(panelPrincipal);
        setSize(800,400);

        aceptoLasCondiciones.addActionListener(a -> {
            if (aceptoLasCondiciones.isSelected()) {
                siguiente.setEnabled(true);
            } else {
                siguiente.setEnabled(false);
            }
        });
        siguiente.addActionListener(b -> {
            setVisible(false);
            VentanaConf vc = new VentanaConf();
        });
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        VentanaInicial vi = new VentanaInicial();
    }
}
