import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout {
    public static void main(String[] args) {
        JFrame flowFrame = new JFrame("Flow Layout");
        flowFrame.setLayout(new java.awt.FlowLayout());

        String[] nameStrings = {"Pranav", "Tanisha", "Vishwa", "Hiral", "Swayam"};

        for (String name : nameStrings) {
            JButton button = new JButton(name);
            flowFrame.add(button);
        }

        flowFrame.setSize(400, 400);
        flowFrame.setResizable(false);
        flowFrame.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE = Integer 3
        flowFrame.setVisible(true);
    }
}
