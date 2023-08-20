import java.awt.*;
import javax.swing.*;

public class SwingTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Test Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));
        frame.setLocation(100, 100);

        Container contentPane = frame.getContentPane();
        LayoutManager lm = contentPane.getLayout();
        if (lm instanceof BorderLayout) {
            ((BorderLayout) lm).setHgap(25);
        }

        JLabel label = new JLabel("HERE ARE SOME BUTTONS", SwingConstants.CENTER);
        JButton button1 = new JButton("BUTTON1");
        JButton button2 = new JButton("BUTTON2");
        JButton button3 = new JButton("BUTTON3");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
