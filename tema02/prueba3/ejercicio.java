import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class ejercicio {
    public ejercicio() {
        JFrame ventanaPrincipal = new JFrame("Ventana principal");
        JFrame ventanaAnyadir = new JFrame("Añadir Persona");
        JFrame ventanaMostrar = new JFrame("Mostrar Persona");
        JFrame ventanaBuscar = new JFrame("Buscar Persona");
        JButton anyadir = new JButton("Añadir Persona");
        JButton mostrar = new JButton("Mostrar todo");
        JButton buscar = new JButton("Buscar Persona");
        ventanaPrincipal.setLayout(new FlowLayout());
        ventanaPrincipal.getContentPane().add(anyadir);
        anyadir.addActionListener(new anyadir(ventanaAnyadir));
        ventanaPrincipal.getContentPane().add(mostrar);
        mostrar.addActionListener(new Mostrar(ventanaMostrar));
        ventanaPrincipal.getContentPane().add(buscar);
        buscar.addActionListener(new Buscar(ventanaBuscar));
        ventanaPrincipal.setSize(400,75);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLocationRelativeTo(null);
    }
    public static class Persona implements Serializable {
        @Serial
        private static final long serialVersionUID = 100L;
        private String nombre;
        private String email;
        private int anyo;

        public Persona(String nombre, String email, int anyo) {
            this.nombre = nombre;
            this.email = email;
            this.anyo = anyo;
        }
        public String getNombre() { return nombre; }
        public String getEmail() { return email; }
        public int getAnyo() { return anyo; }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setAnyo(int anyo) {
            this.anyo = anyo;
        }

        public String toString() {
            return "Persona -> {nombre: " + nombre + ", email: " + email + ", año de nacimiento: " + anyo + "}";
        }
    }
    public static void anyadirPersona(ArrayList<Persona> lista) {
        Path fichero = Path.of("tema02/prueba3/personas.txt");

    }
    public static void main(String[] args) throws IOException {
        ArrayList<Persona> listaPersona =  new ArrayList<>();
        //anyadirPersona(listaPersona)
        //cargarPersona(listaPersona);
        //buscarPersona(listaPersona);
        ejercicio app = new ejercicio();
    }
}
