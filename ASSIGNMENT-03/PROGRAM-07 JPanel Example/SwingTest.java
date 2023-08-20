import java.awt.*;
import javax.swing.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(300, 200));
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        JLabel label = new JLabel("HERE ARE SOME BUTTONS", SwingConstants.CENTER);
        JButton button1 = new JButton("BUTTON1");
        JButton button2 = new JButton("BUTTON2");
        JButton button3 = new JButton("BUTTON3");
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
