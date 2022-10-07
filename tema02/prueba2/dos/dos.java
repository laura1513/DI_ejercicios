import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class dos extends JFrame{
    private Container panel;
    static String vent = "Hola";
    static String bot = "Adios";
    private JButton button;
    public dos(String v, String b) {
        super(vent);
        button = new JButton(bot);
        panel = getContentPane();
        setLayout(new GridLayout());
        setSize(200,100);
        panel.add(button);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        dos app = new dos(vent, bot);
        System.out.println("Introduce el nombre de la ventana");
        vent = read.nextLine();
        System.out.println("Introduce el nombre del botón");
        bot = read.nextLine();
        app = new dos(vent, bot);
    }
}
