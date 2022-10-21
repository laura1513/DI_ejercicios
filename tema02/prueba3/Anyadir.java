import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anyadir implements ActionListener {
    private JFrame anyadir = new JFrame("Añadir persona");
    private JButton add = new JButton("Add");
    private JLabel name = new JLabel("Name:");
    private TextField tfName = new TextField(20);
    private JLabel email = new JLabel("Email:");
    private TextField tfEmail = new TextField(20);
    private JLabel anyo = new JLabel("Year:");
    private TextField tfAnyo = new TextField(20);

    private JButton cerrar = new JButton("Cerrar");
    public anyadir(JFrame ventanaAnyadir) {
        this.anyadir = ventanaAnyadir;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        anyadir.setLayout(new FlowLayout());
        anyadir.setSize(180,400);
        anyadir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        anyadir.setVisible(true);
        anyadir.setLocationRelativeTo(null);
        anyadir.add(name);
        anyadir.add(tfName);
        anyadir.add(email);
        anyadir.add(tfEmail);
        anyadir.add(anyo);
        anyadir.add(tfAnyo);;
        //search.addActionListener(new Persona(name, tfName,email, tfEmail, anyo, tfAnyo));
        anyadir.add(add);
        cerrar.addActionListener(new CerrarVentana(anyadir));
        anyadir.add(cerrar);
    }
}
