import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame {
    public myFrame() {
        // setting visibility, title, size and bg color
        this.setVisible(true);
        this.setTitle("To do");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(20, 20, 20));

        // setting icon
        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }
}
