import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buscar implements ActionListener {
    private JFrame buscar = new JFrame("Buscar persona");
    private JButton search = new JButton("Search");
    private JLabel name = new JLabel("Name:");
    private TextField tfName = new TextField(20);
    private JLabel email = new JLabel("Email:");
    private TextField tfEmail = new TextField(20);
    private JLabel anyo = new JLabel("Year:");
    private TextField tfAnyo = new TextField(20);

    private JButton cerrar = new JButton("Cerrar");
    public Buscar(JFrame ventanaBuscar) {
        this.buscar = ventanaBuscar;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        buscar.setLayout(new FlowLayout());
        buscar.setSize(200,400);
        buscar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscar.setVisible(true);
        buscar.setLocationRelativeTo(null);
        buscar.add(name);
        buscar.add(tfName);
        buscar.add(email);
        email.setVisible(false);
        buscar.add(tfEmail);
        tfEmail.setVisible(false);
        buscar.add(anyo);
        anyo.setVisible(false);
        buscar.add(tfAnyo);
        tfAnyo.setVisible(false);
        search.addActionListener(new Persona(name, tfName,email, tfEmail, anyo, tfAnyo));
        buscar.add(search);
        cerrar.addActionListener(new CerrarVentana(buscar));
        buscar.add(cerrar);
    }

}