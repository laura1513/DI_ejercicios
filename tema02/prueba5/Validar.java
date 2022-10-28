import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Validar implements ActionListener {
    private JTextField tfNombre;
    private JTextField tfApellidos;
    private JTextField tfDni;
    private JTextField tfDireccion;
    private JTextField tfCP;
    private JTextField tfTelefono;
    private JTextField tfCiudad;
    private JTextField tfNF;
    private ButtonGroup bgGenero;
    private JPasswordField pfPassword;
    private JPasswordField pfRepitePassword;
    private JComboBox<String> cbTipoComp;
    private JComboBox<String> cbTipoHerr;
    private ButtonGroup bgComp;
    private JLabel lErrorNombre;
    private JLabel lErrorApellidos;
    private JLabel lErrorDni;
    private JLabel lErrorDirecccion;
    private JLabel lErrorCP;
    private JLabel lErrorTelefono;
    private JLabel lErrorCiudad;
    private JLabel lErrorNF;
    private JLabel lErrorGenero;
    private JLabel lErrorPassword;
    private JLabel lErrorRepitePassword;
    private JLabel lErrorCompeticion;
    public Validar (JTextField tfNombre, JTextField tfApellidos, JTextField tfDni, JTextField tfDireccion, JTextField tfCP, JTextField tfTelefono, JTextField tfCiudad, JTextField tfNF, ButtonGroup bgGenero, JPasswordField pfPassword, JPasswordField pfRepitePassword, JComboBox<String> cbTipoComp, JComboBox<String> cbTipoHerr, ButtonGroup bgComp, JLabel lErrorNombre, JLabel lErrorApellidos, JLabel lErrorDni, JLabel lErrorDireccion, JLabel lErrorCP, JLabel lErrorTelefono, JLabel lErrorCiudad, JLabel lErrorNF, JLabel lErrorGenero, JLabel lErrorPassword, JLabel lErrorRepitePassword, JLabel lErrorCompeticion) {
        this.tfNombre = tfNombre;
        this.tfApellidos = tfApellidos;
        this.tfDni = tfDni;
        this.tfDireccion = tfDireccion;
        this.tfCP = tfCP;
        this.tfTelefono = tfTelefono;
        this.tfCiudad = tfCiudad;
        this.tfNF = tfNF;
        this.bgGenero = bgGenero;
        this.pfPassword = pfPassword;
        this.pfRepitePassword = pfRepitePassword;
        this.cbTipoComp = cbTipoComp;
        this.cbTipoHerr = cbTipoHerr;
        this.bgComp = bgComp;

        this.lErrorNombre = lErrorNombre;
        this.lErrorApellidos = lErrorApellidos;
        this.lErrorDni = lErrorDni;
        this.lErrorDirecccion = lErrorDireccion;
        this.lErrorCP = lErrorCP;
        this.lErrorTelefono = lErrorTelefono;
        this.lErrorCiudad = lErrorCiudad;
        this.lErrorNF = lErrorNF;
        this.lErrorGenero = lErrorGenero;
        this.lErrorPassword = lErrorPassword;
        this.lErrorRepitePassword = lErrorRepitePassword;
        this.lErrorCompeticion = lErrorCompeticion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Validación nombre
        String patNombre = "(\\a-zA-ZñÑáàÁÀéèÉÈíÍóòÓÒúÚ{1,29})";
        if (tfNombre.getText().isEmpty() && !(patNombre.matches(tfNombre.getText()))) {
            lErrorNombre.setVisible(true);
        } else {
            lErrorNombre.setVisible(false);
        }

        //Validación apellidos
        String patApellidos = "(\\a-zA-ZñÑáàÁÀéèÉÈíÍóòÓÒúÚ[ ]{1,60})";
        if (tfApellidos.getText().isEmpty() && !patApellidos.matches(tfApellidos.getText())) {
            lErrorApellidos.setVisible(true);
        } else {
            lErrorApellidos.setVisible(false);
        }

        //Validación DNI/NIE
        String patDniNie= "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni = Integer.parseInt(tfDni.getText().substring(0, tfDni.getText().length()-1));
        if((tfDni.getText().length()==9) && (tfDni.getText().charAt(tfDni.getText().length()-1) == patDniNie.charAt(dni%23))){
            lErrorDni.setVisible(false);
        }else if (tfDni.getText().isEmpty() || (tfDni.getText().length()!=9)) {
            lErrorDni.setVisible(true);
        }
    }
}