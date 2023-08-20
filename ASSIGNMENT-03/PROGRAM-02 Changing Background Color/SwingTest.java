import java.awt.*;
import javax.swing.*;
public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(new Dimension(300,200));
        frame.setLocation(100,100);
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(Color.red);
        frame.setVisible(true);
    }
}
