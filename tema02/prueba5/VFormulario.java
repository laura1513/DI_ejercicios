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
    private JPasswordField pfRepitePassword;
    private JLabel lErrorRepitePassword;
    private String[] tipoComp = {"Arbitro", "Entrenador", "Tirador", "Director"};
    private JComboBox<String> cbTipoComp;
    private String[] tipoHerramienta = {"Sable", "Espada", "Florete"};
    private JComboBox<String> cbTipoHerr;
    private JRadioButton rbCompI;
    private JRadioButton rbCompE;
    private JLabel lErrorCompeticion;
    private ButtonGroup bgComp;
    private JButton guardar;
    private JButton salir;
    public VFormulario() {
        super("Formulario");
        setSize(700, 500);
        getContentPane().setBackground(new Color(187, 252, 198));

        lNombre = new JLabel("Nombre:");
        lNombre.setBounds(10, 20, 100, 20);
        tfNombre = new JTextField( 30);
        tfNombre.setBounds(70, 20, 200, 20);
        lErrorNombre = new JLabel("Error en el formato del nombre");
        lErrorNombre.setForeground(Color.red);
        lErrorNombre.setBounds(10, 40, 200, 20);
        add(lNombre);
        add(tfNombre);
        add(lErrorNombre);
        lErrorNombre.setVisible(false);

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
        lErrorApellidos.setVisible(false);

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
        lErrorDni.setVisible(false);

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
        lErrorDireccion.setVisible(false);

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
        lErrorCP.setVisible(false);

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
        lErrorTelefono.setVisible(false);

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
        lErrorCiudad.setVisible(false);

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
        lErrorNF.setVisible(false);

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
        lErrorGenero.setVisible(false);

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
        lErrorPassword.setVisible(false);

        lRepitePassword = new JLabel("Repite la contraseña");
        lRepitePassword.setBounds(400, 260, 150, 20);
        pfRepitePassword = new JPasswordField("");
        pfRepitePassword.setBounds(540, 260, 100, 20);
        lErrorRepitePassword = new JLabel("Contraseña incorrecta");
        lErrorRepitePassword.setForeground(Color.red);
        lErrorRepitePassword.setBounds(400, 280, 200, 20);
        add(lRepitePassword);
        add(pfRepitePassword);
        add(lErrorRepitePassword);
        lErrorRepitePassword.setVisible(false);

        cbTipoComp = new JComboBox<String>(tipoComp);
        cbTipoComp.setBounds(10, 320, 100, 20);
        add(cbTipoComp);

        cbTipoHerr = new JComboBox<>(tipoHerramienta);
        cbTipoHerr.setBounds(150, 320, 100, 20);
        add(cbTipoHerr);

        bgComp = new ButtonGroup();
        rbCompI = new JRadioButton("Competición individual", false);
        rbCompI.setBounds(300, 320, 170, 20);
        rbCompE = new JRadioButton("Competición por equipos", false);
        rbCompE.setBounds(470, 320, 200, 20);
        bgComp.add(rbCompI);
        bgComp.add(rbCompE);
        lErrorCompeticion = new JLabel("Debes seleccionar una opción");
        lErrorCompeticion.setForeground(Color.RED);
        lErrorCompeticion.setBounds(300, 340, 300, 20);
        add(rbCompI);
        add(rbCompE);
        add(lErrorCompeticion);
        lErrorCompeticion.setVisible(false);

        guardar = new JButton("Guardar");
        guardar.setBounds(10, 420, 150, 40);
        guardar.addActionListener(new Validar(tfNombre, tfApellidos, tfDni, tfDireccion, tfCP, tfTelefono, tfCiudad, tfNF, bgGenero, pfPassword, pfRepitePassword, cbTipoComp, cbTipoHerr, bgComp, lErrorNombre, lErrorApellidos, lErrorDni, lErrorDireccion, lErrorCP, lErrorTelefono, lErrorCiudad, lErrorNF, lErrorGenero, lErrorPassword, lErrorRepitePassword, lErrorCompeticion));
        add(guardar);

        salir = new JButton("Salir");
        salir.setBounds(530, 420, 150, 40);
        add(salir);

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
