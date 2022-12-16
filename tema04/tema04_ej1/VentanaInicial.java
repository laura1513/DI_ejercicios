import javax.swing.*;

public class VentanaInicial extends JFrame{
    private JPanel panelPrincipal;
    private JLabel titulo;
    private JTextPane enElCasoDeTextPane;
    private JButton siguiente;
    private JCheckBox aceptoLasCondiciones;
    public VentanaInicial() {
        //Esta es la ventana por la cual iniciará el programa
        super("Ventana Principal");
        //Añado el contenidi del panel 'panelPrincipal'
        setContentPane(panelPrincipal);
        setSize(800,400);

        //Es necesario tener el checkBox seleccionado para poder pasar a la siguiente ventana
        aceptoLasCondiciones.addActionListener(a -> {
            if (aceptoLasCondiciones.isSelected()) {
                siguiente.setEnabled(true);
            } else {
                siguiente.setEnabled(false);
            }
        });
        //Cuando le da clic a siguiente, se abrirá la ventana VentanConf
        siguiente.addActionListener(b -> {
            setVisible(false);
            VentanaConf vc = new VentanaConf();
        });

        //Opciones de localización, visibilidad y cerrrado
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        VentanaInicial vi = new VentanaInicial();
    }
}
