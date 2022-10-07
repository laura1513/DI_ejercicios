import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class uno extends JFrame {
    private Container panel;
    static int numeroVentanas;
    static int grid;
    static int num = 0;
    public uno(Color cl) {
        super("Ventana " + (num+=1));
        setLayout(new GridLayout());
        setSize((int) (Math.random()*800+100), (int) (Math.random()*800+100));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocation((int) (Math.random()*1080+1), (int) (Math.random()*1920+1));
        getContentPane().setBackground(cl);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Color cl;
        boolean seguir = true;
        Scanner read= new Scanner(System.in);
        do {
            System.out.println("Introduce el númerode ventanas que quieres que aparezcan");
            numeroVentanas = read.nextInt();
            if (numeroVentanas<0) {
                System.out.println("No puede ser un número negativo");
                seguir = false;
            }
        } while (seguir == false);
        for (int i = 0; i < numeroVentanas; i++) {
            cl = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
            uno app = new uno(cl);
        }
    }
}
