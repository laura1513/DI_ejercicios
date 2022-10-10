import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class cuatro extends JFrame {
    private Container panel;
    private JLabel label;
    public cuatro() {
        super("Celsius to Fahrenheit");
        panel = getContentPane();
        label = new JLabel("This program is to convert Celsius to Fahrenheit");
        setLayout(new GridLayout());
        setSize(200,100);
        panel.add(label);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float celsius;
        float fahrenheit;
        System.out.println("Introduce the temperature in Celsius and i " +
                "will show you in Fahrenheit");
        celsius = read.nextFloat();
        fahrenheit = (float) ((celsius * 1.8) + 32);
        System.out.println("Celsius: "+celsius+"\nFahrenheit: "+fahrenheit);
        cuatro app = new cuatro();
    }
}
