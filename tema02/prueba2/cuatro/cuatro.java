import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Scanner;

public class cuatro extends JFrame {
    private Container panel;
    private JLabel labelexp;
    private JLabel cels;
    private JLabel fahr;
    private JTextField tempCelsius;
    private JTextField tempFahrenheit;
    private JButton button;
    private JButton cerrar;
    public cuatro() {
        super("Celsius to Fahrenheit");
        panel = getContentPane();
        labelexp = new JLabel("This program is to convert Celsius to Fahrenheit");
        fahr = new JLabel("Fahrenheit:");
        cels = new JLabel("Celsius:");
        button = new JButton("Calcular");
        cerrar = new JButton("Cerrar");
        setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));
        setSize(350,400);
        tempCelsius = new JTextField("00.00");
        tempFahrenheit = new JTextField("00.00");
        button.addActionListener(new Calcular(tempCelsius, tempFahrenheit));
        cerrar.addActionListener(new Cerrar(panel));
        panel.add(labelexp);
        panel.add(cels);
        panel.add(tempCelsius);
        panel.add(fahr);
        panel.add(tempFahrenheit);
        panel.add(button);
        panel.add(cerrar);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        cuatro app = new cuatro();
    }
}
