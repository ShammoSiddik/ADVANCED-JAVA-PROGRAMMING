import java.awt.*;
import javax.swing.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(100,100);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("HERE IS A LABEL");
        JButton button = new JButton("BUTTON");
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JList list = new JList(options);
        JCheckBox cbox = new JCheckBox("Check");
        JSlider slider = new JSlider();
        contentPane.add(label);
        contentPane.add(button);
        contentPane.add(list);
        contentPane.add(cbox);
        contentPane.add(slider);
        frame.setVisible(true);
    }
}
