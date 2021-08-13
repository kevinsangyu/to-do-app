import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        myFrame frame = new myFrame();
        JLabel dailyLabel = new JLabel("Daily");
        dailyLabel.setForeground(new Color(240, 240, 240));
        dailyLabel.setVerticalAlignment(JLabel.CENTER);
        dailyLabel.setFont(new Font("Times Roman", Font.PLAIN, 20));

        JLabel weeklyLabel = new JLabel("Weekly");
        weeklyLabel.setForeground(new Color(240, 240, 240));
        weeklyLabel.setVerticalAlignment(JLabel.CENTER);
        weeklyLabel.setFont(new Font("Times Roman", Font.PLAIN, 20));

        int panel_x_size = frame.getX() / 2;
        JPanel gray_panel = new JPanel();
        gray_panel.setBackground(Color.gray);
        gray_panel.setBounds(0, 0, panel_x_size, frame.getY());
        gray_panel.add(weeklyLabel);

        JPanel blue_panel = new JPanel();
        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(panel_x_size, 0, panel_x_size, frame.getY());
        blue_panel.add(dailyLabel);
        
        frame.add(gray_panel);
        frame.add(blue_panel);
        frame.pack();
    }
}