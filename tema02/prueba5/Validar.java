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
        String patNombre = "(\\a-zA-ZñÑáàÁÀéèÉÈíÍóòÓÒúÚ[ ]{1,29})";
        if (tfNombre.getText().length() <= 29) {
            if (tfNombre.getText().isEmpty() && !(patNombre.matches(tfNombre.getText()))) {
                lErrorNombre.setVisible(true);
            } else {
                lErrorNombre.setVisible(false);
            }
        } else {
            lErrorNombre.setVisible(true);
        }

        //Validación apellidos
        String patApellidos = "(\\a-zA-ZñÑáàÁÀéèÉÈíÍóòÓÒúÚ[ ]{1,60})";
        if (tfApellidos.getText().length() <= 60) {
            if (tfApellidos.getText().isEmpty() && !patApellidos.matches(tfApellidos.getText())) {
                lErrorApellidos.setVisible(true);
            } else {
                lErrorApellidos.setVisible(false);
            }
        } else {
            lErrorApellidos.setVisible(true);
        }

        //Validación DNI/NIE
        String patDniNie= "TRWAGMYFPDXBNJZSQVHLCKE";
        if(tfDni.getText().length()>0) {
            int dni = Integer.parseInt(tfDni.getText().substring(0, tfDni.getText().length() - 1));
            if ((tfDni.getText().length() == 9) && (tfDni.getText().charAt(tfDni.getText().length() - 1) == patDniNie.charAt(dni % 23))) {
                lErrorDni.setVisible(false);
            } else {
                lErrorDni.setVisible(true);
            }
        } else {
            lErrorDni.setVisible(true);
        }

        //Validar dirección
        String patDireccion = "(\\a-zA-ZñÑáàÁÀéèÉÈíÍóòÓÒúÚ0-9{1,120})";
        if (tfDireccion.getText().length() <= 120) {
            if (tfDireccion.getText().isEmpty() && !patDireccion.matches(tfDireccion.getText())) {
                lErrorDirecccion.setVisible(true);
            } else {
                lErrorDirecccion.setVisible(false);
            }
        } else {
            lErrorDirecccion.setVisible(true);
        }

        //Validar CP
        String patCP ="(\\0-9{5})";
        if (tfCP.getText().length() == 5) {
            if (tfCP.getText().isEmpty() && !patCP.matches(tfCP.getText())) {
                lErrorCP.setVisible(true);
            } else {
                lErrorCP.setVisible(false);
            }
        } else {
            lErrorCP.setVisible(true);
        }

        //Validar Telefono
        String patTelefono = "(\\0-9{9})";
        if (tfTelefono.getText().length() == 9) {
            if (tfTelefono.getText().isEmpty() && !patTelefono.matches(tfTelefono.getText())) {
                lErrorTelefono.setVisible(true);
            } else {
                lErrorTelefono.setVisible(false);
            }
        } else {
            lErrorTelefono.setVisible(true);
        }

        //Validar Ciudad
        String patCiudad = "(\\a-zA-ZñÑáàÁÀéèÉÈíÍóòÓÒúÚ[ ]{1-30})";
        if (tfCiudad.getText().length() <= 30) {
            if (tfCiudad.getText().isEmpty() && !patCiudad.matches(tfCiudad.getText())) {
                lErrorCiudad.setVisible(true);
            } else {
                lErrorCiudad.setVisible(false);
            }
        } else {
            lErrorCiudad.setVisible(true);
        }

        //Validar NF
        
    }
}
