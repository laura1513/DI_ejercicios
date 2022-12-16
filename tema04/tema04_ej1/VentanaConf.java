import javax.swing.*;

public class VentanaConf extends JFrame{
    private JLabel titulo;
    private JCheckBox opcion1;
    private JCheckBox opcion2;
    private JCheckBox opcion3;
    private JCheckBox opcion4;
    private JCheckBox opcion5;
    private JCheckBox opcion6;
    private JCheckBox opcion7;
    private JCheckBox opcion8;
    private JCheckBox opcion9;
    private JButton aceptar;
    private JPanel conf;
    private JLabel info;

    public VentanaConf() {
        super("Ventana Principal");
        setContentPane(conf);
        setSize(700,400);
        aceptar.addActionListener(c -> {
            setVisible(false);
            VentanaFinal vf = new VentanaFinal();
        });
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
