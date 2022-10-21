import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CerrarVentana implements ActionListener {
    private JFrame cerrar = new JFrame();
    public CerrarVentana(JFrame cerrar) {
        this.cerrar = cerrar;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cerrar.dispose();
    }
}
