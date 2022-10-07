import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscuchadoraBoton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Has pulsado el botón 'Hola :)'");
    }
}
