import javax.swing.*;
import java.awt.*;

public class cuatro extends JFrame {
    private Container panel;
    private JLabel labelexp;
    private JLabel cels;
    private JLabel fahr;
    private JTextField tempCelsius;
    private JTextField tempFahrenheit;
    private JButton buttonCF;
    private JButton buttonFC;
    private JButton cerrar;
    public cuatro() {
        super("Celsius to Fahrenheit");
        panel = getContentPane();
        labelexp = new JLabel("This program is to convert Celsius to Fahrenheit");
        fahr = new JLabel("Fahrenheit:");
        cels = new JLabel("Celsius:");
        buttonCF = new JButton("A Fahrenheit");
        buttonFC = new JButton("A Celsius");
        cerrar = new JButton("CerrarVentana");
        setLayout(new FlowLayout());
        setSize(340,400);
        tempCelsius = new JTextField(5);
        tempFahrenheit = new JTextField(5);
        buttonCF.addActionListener(new Calcular(tempCelsius, tempFahrenheit));
        buttonFC.addActionListener(new Calcular(tempCelsius, tempFahrenheit));
        cerrar.addActionListener(new Cerrar(panel));
        panel.add(labelexp);
        panel.add(cels);
        panel.add(tempCelsius);
        panel.add(fahr);
        panel.add(tempFahrenheit);
        panel.add(buttonCF);
        panel.add(buttonFC);
        panel.add(cerrar);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        cuatro app = new cuatro();
    }
}
