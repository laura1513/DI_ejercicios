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
    private JTextField tfDireccion;
    private JLabel lDireccion;
    private JLabel lErrorDireccion;
    private JTextField tfCP;
    private JLabel lCP;
    private JLabel lErrorCP;
    private JTextField tfTelefono;
    private JLabel lTelefono;
    private JLabel lErrorTelefono;
    private JTextField tfCiudad;
    private JLabel lCiudad;
    private JLabel lErrorCiudad;
    private JTextField tfNF;
    private JLabel lNF;
    private JLabel lErrorNF;
    private JLabel lGenero;
    private JRadioButton rbGeneroF;
    private JRadioButton rbGeneroM;
    private JLabel lErrorGenero;
    private ButtonGroup bgGenero;
    private JLabel lPassword;
    private JPasswordField pfPassword;
    private JLabel lErrorPassword;
    private JLabel lRepitePassword;
    private JPasswordField pfReitePassword;
    private JLabel lErrorRepitePassword;


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

        lDireccion = new JLabel("Dirección:");
        lDireccion.setBounds(195, 80, 100, 20);
        tfDireccion = new JTextField("" , 80);
        tfDireccion.setBounds(265, 80, 405, 20);
        lErrorDireccion = new JLabel("Error en el formato de la direccion");
        lErrorDireccion.setForeground(Color.red);
        lErrorDireccion.setBounds(195, 100, 300, 20);
        add(lDireccion);
        add(tfDireccion);
        add(lErrorDireccion);

        lCP = new JLabel("CP:");
        lCP.setBounds(10, 140, 30, 20);
        tfCP = new JTextField("", 6);
        tfCP.setBounds(40, 140, 120, 20);
        lErrorCP = new JLabel( "Error en el formato del CP");
        lErrorCP.setForeground(Color.red);
        lErrorCP.setBounds(10, 160, 300,20);
        add(lCP);
        add(tfCP);
        add(lErrorCP);

        lTelefono = new JLabel("Telefono:");
        lTelefono.setBounds(200, 140, 200, 20);
        tfTelefono = new JTextField("", 10);
        tfTelefono.setBounds(270, 140, 200, 20);
        lErrorTelefono = new JLabel("Error en el formato del teléfono");
        lErrorTelefono.setForeground(Color.red);
        lErrorTelefono.setBounds(200, 160, 300, 20);
        add(lTelefono);
        add(tfTelefono);
        add(lErrorTelefono);

        lCiudad = new JLabel("Ciudad:");
        lCiudad.setBounds(10, 200, 150, 20);
        tfCiudad = new JTextField("", 30);
        tfCiudad.setBounds(70, 200, 150, 20);
        lErrorCiudad = new JLabel("Error en el formato de la Ciudad");
        lErrorCiudad.setForeground(Color.red);
        lErrorCiudad.setBounds(10, 220, 300, 20);
        add(lCiudad);
        add(tfCiudad);
        add(lErrorCiudad);

        lNF = new JLabel("Número de federado:");
        lNF.setBounds(240, 200, 200, 20);
        tfNF = new JTextField("", 10);
        tfNF.setBounds(380, 200, 150, 20);
        lErrorNF = new JLabel("Error en el formato del número de federado");
        lErrorNF.setForeground(Color.red);
        lErrorNF.setBounds(240, 220, 300, 20);
        add(lNF);
        add(tfNF);
        add(lErrorNF);

        bgGenero = new ButtonGroup();
        lGenero = new JLabel("Sexo:");
        lGenero.setBounds(10, 260, 100, 20);
        rbGeneroF = new JRadioButton("F", false);
        rbGeneroF.setBounds(50, 260, 50, 20);
        rbGeneroM = new JRadioButton("M", false);
        rbGeneroM.setBounds(100, 260, 50, 20);
        lErrorGenero = new JLabel("Debes seleccionar uno");
        lErrorGenero.setForeground(Color.red);
        lErrorGenero.setBounds(10, 280, 200, 20);
        bgGenero.add(rbGeneroF);
        bgGenero.add(rbGeneroM);
        add(lGenero);
        add(rbGeneroF);
        add(rbGeneroM);
        add(lErrorGenero);

        lPassword = new JLabel("Contraseña");
        lPassword.setBounds(180, 260, 150, 20);
        pfPassword = new JPasswordField("", 20);
        pfPassword.setBounds(260, 260, 100, 20);
        lErrorPassword = new JLabel("Debes introducir una contraseña");
        lErrorPassword.setForeground(Color.red);
        lErrorPassword.setBounds(180, 280, 200, 20);
        add(lPassword);
        add(pfPassword);
        add(lErrorPassword);

        lRepitePassword = new JLabel("Repite la contraseña");
        lRepitePassword.setBounds(400, 260, 150, 20);
        pfReitePassword = new JPasswordField("");
        pfReitePassword.setBounds(540, 260, 100, 20);
        lErrorRepitePassword = new JLabel("Contraseña incorrecta");
        lErrorRepitePassword.setForeground(Color.red);
        lErrorRepitePassword.setBounds(400, 280, 200, 20);
        add(lRepitePassword);
        add(pfReitePassword);
        add(lErrorRepitePassword);

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
