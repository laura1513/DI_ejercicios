import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Persona implements ActionListener {
    private String nombre;
    private String correo;
    private int anyoNacimiento;
    private JLabel name = new JLabel("Name:");
    private TextField tfName = new TextField(20);
    private JLabel email = new JLabel("Email:");
    private TextField tfEmail = new TextField(20);
    private JLabel anyo = new JLabel("Date of Birth:");
    private TextField tfAnyo = new TextField(20);
    public Persona(JLabel name, TextField tfName, JLabel email, TextField tfEmail, JLabel anyo, TextField tfAnyo) {
        this.name = name;
        this.tfName = tfName;
        this.email = email;
        this.tfEmail = tfEmail;
        this.anyo = anyo;
        this.tfAnyo = tfAnyo;
    }
    public Persona(String nombre, String correo, int anyoNacimiento) {
        this.nombre = nombre;
        this.correo = correo;
        this.anyoNacimiento = anyoNacimiento;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
