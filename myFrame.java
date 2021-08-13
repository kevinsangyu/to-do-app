import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myFrame extends JFrame {

    public int x;
    public int y;

    public myFrame(int x, int y) {
        // setting visibility, title, size and bg color
        this.x = x;
        this.y = y;
        this.setTitle("To do");
        this.setMinimumSize(new Dimension(x, y));
        this.setSize(x, y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(20, 20, 20));
        this.setLayout(null);
        this.setVisible(true);

        // setting icon
        ImageIcon icon = new ImageIcon("icon.jpg");
        this.setIconImage(icon.getImage());
    }

    public myFrame() {
        this(500, 600);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
