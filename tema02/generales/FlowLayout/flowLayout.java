import javax.swing.*;
import java.awt.*;

public class flowLayout extends JFrame {
     public flowLayout() {
         super ("Layout example");
         setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
         for (int i = 1; i <= 10; i++) {
             add(new JButton("Component "+i));
         }
         pack();
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
     }

    public static void main(String[] args) {
        flowLayout app = new flowLayout();
    }
}
