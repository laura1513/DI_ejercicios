import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Reproductor extends JFrame {
    private JButton encender;
    private JButton play;
    private JButton record;
    private JButton pistAnterior;
    private JButton pause;
    private JButton pistPosterior;
    private JButton atras;
    private JButton stop;
    private JButton adelante;
    private JPanel panel;

    public Reproductor() {
        super("reproductor");

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBackground(new Color(0xE9E9E9));

        encender = new JButton("ON/OFF");
        encender.setBorder(new EmptyBorder(0,0,0,0));
        encender.setBackground(new Color(0xE9E9E9));
        ImageIcon on = new ImageIcon("tema03/ejercicio1/apagar.png");
        encender.setIcon(on);
        panel.add(encender);

        play = new JButton("PLAY");
        play.setBorder(new EmptyBorder(0,0,0,0));
        play.setBackground(new Color(0xE9E9E9));
        ImageIcon pl = new ImageIcon("tema03/ejercicio1/play.png");
        play.setIcon(pl);
        panel.add(play);

        record = new JButton("RECORD");
        record.setBorder(new EmptyBorder(0,0,0,0));
        record.setBackground(new Color(0xE9E9E9));
        ImageIcon rec = new ImageIcon("tema03/ejercicio1/record.png");
        record.setIcon(rec);
        panel.add(record);


        pistAnterior= new JButton("PISTA ANTERIOR");
        pistAnterior.setBorder(new EmptyBorder(0,0,0,0));
        pistAnterior.setBackground(new Color(0xE9E9E9));
        ImageIcon pisA = new ImageIcon("tema03/ejercicio1/pistAnterior.png");
        pistAnterior.setIcon(pisA);
        panel.add(pistAnterior);

        pause = new JButton("PAUSE");
        pause.setBorder(new EmptyBorder(0,0,0,0));
        pause.setBackground(new Color(0xE9E9E9));
        ImageIcon pau = new ImageIcon("tema03/ejercicio1/pause.png");
        pause.setIcon(pau);
        panel.add(pause);


        pistPosterior = new JButton("PISTA POSTERIOR");
        pistPosterior.setBorder(new EmptyBorder(0,0,0,0));
        pistPosterior.setBackground(new Color(0xE9E9E9));
        ImageIcon pisP = new ImageIcon("tema03/ejercicio1/pistPosterior.png");
        pistPosterior.setIcon(pisP);
        panel.add(pistPosterior);


        atras = new JButton("REBOBINAR ATRÁS");
        atras.setBorder(new EmptyBorder(0,0,0,0));
        atras.setBackground(new Color(0xE9E9E9));
        ImageIcon at = new ImageIcon("tema03/ejercicio1/atras.png");
        atras.setIcon(at);
        panel.add(atras);


        stop = new JButton("STOP");
        stop.setBorder(new EmptyBorder(0,0,0,0));
        stop.setBackground(new Color(0xE9E9E9));
        ImageIcon st = new ImageIcon("tema03/ejercicio1/stop.png");
        stop.setIcon(st);
        panel.add(stop);


        adelante = new JButton("REBOBINAR ADELANTE");
        adelante.setBorder(new EmptyBorder(0,0,0,0));
        adelante.setBackground(new Color(0xE9E9E9));
        ImageIcon ade = new ImageIcon("tema03/ejercicio1/adelante.png");
        adelante.setIcon(ade);
        panel.add(adelante);

        add(panel);
        setSize(630, 680);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor();
    }
}
