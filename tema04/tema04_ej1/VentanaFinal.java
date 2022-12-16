import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaFinal  extends JFrame{
    private JLabel titulo;
    private JLabel inst;
    private JProgressBar progress;
    private JPanel fin;
    private JButton ejecutar;
    private JButton salir;
    int i = 0;
    Timer t;

    public VentanaFinal() {
        //La instalación se completa
        super("Ventana Final");
        progress = new JProgressBar(0, 100);
        progress.setBounds(40,40,160,30);
        progress.setStringPainted(true);
        progress.setValue(0);
        progress.setStringPainted(true);

        //Se finaliza la ejecución de la instalación y abre la ventana VentanaEjecutar
        ejecutar.addActionListener(d -> {
            setVisible(false);
            VentanaEjecutar ve = new VentanaEjecutar();
        });

        //Sale del programa
        salir.addActionListener(e -> {
            System.exit(0);
        });
        setContentPane(fin);
        setSize(800,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
