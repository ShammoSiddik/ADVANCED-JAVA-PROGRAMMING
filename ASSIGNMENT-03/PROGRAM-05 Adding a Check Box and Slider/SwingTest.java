import java.awt.*;
import javax.swing.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(400,200));
        frame.setLocation(100,100);
        Container contentPane = frame.getContentPane();
        JLabel label = new JLabel("HERE IS A LABEL");
        contentPane.add(label, BorderLayout.NORTH);
        JButton button = new JButton("BUTTON");
        contentPane.add(button, BorderLayout.SOUTH);
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JList list = new JList(options);
        contentPane.add(list, BorderLayout.CENTER);
        JCheckBox cbox = new JCheckBox("Check");
        contentPane.add(cbox, BorderLayout.WEST);
        JSlider slider = new JSlider();
        contentPane.add(slider, BorderLayout.EAST);
        frame.setVisible(true);
    }
}
