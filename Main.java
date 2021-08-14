import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        myFrame frame = new myFrame();

        titleLabel dailyLabel = new titleLabel("Daily");
        titleLabel weeklyLabel = new titleLabel("Weekly");
        titleLabel otherLabel = new titleLabel("Other");

        JPanel gray_panel = new JPanel();
        gray_panel.setBackground(Color.gray);
        gray_panel.setBounds(0, 0, frame.getX() / 2, 350);
        gray_panel.add(weeklyLabel);

        JPanel blue_panel = new JPanel();
        blue_panel.setBackground(Color.blue);
        blue_panel.setBounds(frame.getX() / 2, 0, frame.getX() / 2, 350);
        blue_panel.add(dailyLabel);

        JPanel green_panel = new JPanel();
        green_panel.setBackground(new Color(0, 100, 0));
        green_panel.setBounds(0, blue_panel.getHeight(), frame.getX(), 215);
        green_panel.add(otherLabel);
        
        frame.add(gray_panel);
        frame.add(blue_panel);
        frame.add(green_panel);
        frame.pack();
    }
}