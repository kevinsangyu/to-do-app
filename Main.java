import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        
        JLabel label = new JLabel("Example label");
        label.setForeground(new Color(240, 240, 240));
        label.setVerticalAlignment(JLabel.TOP);
        label.setFont(new Font("Times Roman", Font.PLAIN, 20));
        label.setBounds(0, 0, 400, 200);

        myFrame frame = new myFrame();
        frame.add(label);
        frame.pack();

    }
}