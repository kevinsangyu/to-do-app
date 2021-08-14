import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class titleLabel extends JLabel {
    public titleLabel(String text) {
        this.setText(text);
        this.setForeground(new Color(240, 240, 240));
        this.setVerticalAlignment(JLabel.CENTER);
        this.setFont(new Font("Times Roman", Font.PLAIN, 20));
    }
}
