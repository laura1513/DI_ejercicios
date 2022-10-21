import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UTFDataFormatException;

public class Mostrar implements ActionListener {
    private JFrame mostrar = new JFrame("Mostrar persona");
    private JLabel name = new JLabel("Name:");

    private JLabel email = new JLabel("Email");
    private JLabel anyo = new JLabel("Year");

    private JButton primero = new JButton("First");
    private JButton anterior = new JButton("Previous");
    private JButton siguiente = new JButton("Next");
    private JButton ultimo = new JButton("Last");
    private TextField tfName = new TextField(20);
    private TextField tfEmail = new TextField(20);
    private TextField tfAnyo = new TextField(20);
    private JButton cerrar = new JButton("Cerrar");

    public Mostrar(JFrame ventanaMostrar) {
        this.mostrar = ventanaMostrar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mostrar.setLayout(new FlowLayout());
        mostrar.setSize(190, 400);
        mostrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar.setVisible(true);
        mostrar.setLocationRelativeTo(null);
        mostrar.add(name);
        mostrar.add(tfName);
        mostrar.add(email);
        mostrar.add(tfEmail);
        mostrar.add(anyo);
        mostrar.add(tfAnyo);
        mostrar.add(primero);
        mostrar.add(anterior);
        mostrar.add(siguiente);
        mostrar.add(ultimo);
        cerrar.addActionListener(new CerrarVentana(mostrar));
        mostrar.add(cerrar);
    }
}