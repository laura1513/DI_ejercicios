import javax.swing.*;
import java.awt.*;

public class VFormulario extends JFrame {
    private JTextField tfNombre;
    private JLabel lNombre;
    private JLabel lErrorNombre;
    private JTextField tfApellidos;
    private JLabel lApellidos;
    private JLabel lErrorApellidos;
    private JTextField tfDni;
    private JLabel lDni;
    private JLabel lErrorDni;
    public VFormulario() {
        super("Formulario");
        setSize(700, 500);
        setBackground(new Color(137, 180, 232));

        lNombre = new JLabel("Nombre:");
        lNombre.setBounds(10, 20, 100, 20);
        tfNombre = new JTextField("", 30);
        tfNombre.setBounds(70, 20, 200, 20);
        lErrorNombre = new JLabel("Error en el formato del nombre");
        lErrorNombre.setForeground(Color.red);
        lErrorNombre.setBounds(10, 40, 200, 20);
        add(lNombre);
        add(tfNombre);
        add(lErrorNombre);

        lApellidos = new JLabel("Apellidos:");
        lApellidos.setBounds(300, 20, 100, 20);
        tfApellidos = new JTextField("", 60);
        tfApellidos.setBounds(370, 20, 300, 20);
        lErrorApellidos = new JLabel("Error en el formato del apellido");
        lErrorApellidos.setForeground(Color.red);
        lErrorApellidos.setBounds(300, 40, 200, 20);
        add(lApellidos);
        add(tfApellidos);
        add(lErrorApellidos);

        lDni = new JLabel("DNI:");
        lDni.setBounds(10, 80, 50, 20);
        tfDni = new JTextField("", 10);
        tfDni.setBounds(50, 80, 125, 20);
        lErrorDni = new JLabel("Error en el formato del DNI");
        lErrorDni.setForeground(Color.red);
        lErrorDni.setBounds(10, 100, 300, 20);
        add(lDni);
        add(tfDni);
        add(lErrorDni);

        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        VFormulario app = new VFormulario();
    }
}
