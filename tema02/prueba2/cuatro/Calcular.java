import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcular implements ActionListener {
    private JTextField cels;
    private JTextField fahr;
    public Calcular(JTextField cels, JTextField fahr) {
        this.cels = cels;
        this.fahr = fahr;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float f;
        float c;
        c = Float.parseFloat(this.cels.getText());
        f = (float) (c*1.8)+32;
        this.fahr.setText(Float.toString(f));
    }
}
