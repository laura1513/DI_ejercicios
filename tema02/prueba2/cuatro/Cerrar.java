import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cerrar implements ActionListener {
    private Container panel;
    public Cerrar(Container panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
