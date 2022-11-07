import javax.swing.*;
import java.awt.*;

public class DianaPrincipal extends JFrame {
    public DianaPrincipal() {
        super("Diana Horizontal");
        //Se utiliza para calcular las medidas de la pantalla
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        JSlider diana = new JSlider(0,100);

        add(diana);
        //Añado las dimensiones de la ventana teniendo en cuenta que queremos que la anchura sea el 50% de la pantalla
        setSize((int) screenSize.getWidth()*50/100, 100);
        //Pongo la ventana en el centro de la pantalla
        setLocationRelativeTo(null);
        //Al cerrar la ventana, el programa finalizará
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        DianaPrincipal di = new DianaPrincipal();
    }
}
