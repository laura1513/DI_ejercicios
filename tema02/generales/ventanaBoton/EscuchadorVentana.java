import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EscuchadorVentana implements WindowListener {
    public void windowActivated(WindowEvent e) {    }
    @Override
    public void windowClosed(WindowEvent e) {    }
    @Override
    public void windowClosing(WindowEvent e) {    }
    @Override
    public void windowDeactivated(WindowEvent e) {    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Me he hecho grande");
    }
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Me he hehco pequeña");
    }
    @Override
    public void windowOpened(WindowEvent e) {    }
}
