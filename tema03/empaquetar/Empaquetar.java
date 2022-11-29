import javax.swing.*;
//El ejercicio es el de tema02/prueba1
public class Empaquetar extends JFrame {

    public Empaquetar() {
        super("Mi primera Ventana");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setContentPane(new JLabel(new ImageIcon("tema03/prueba1/HS.png")));
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Empaquetar();
    }
}
