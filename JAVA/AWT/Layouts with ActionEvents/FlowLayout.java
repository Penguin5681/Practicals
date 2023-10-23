import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlowLayout {
    public static void main(String[] args) {
        JFrame flowFrame = new JFrame("Flow Layout");
        flowFrame.setLayout(new java.awt.FlowLayout());

        String[] nameStrings = {"Pranav", "Tanisha", "Vishwa", "Hiral", "Swayam"};

        for (String name : nameStrings) {
            JButton button = new JButton(name);
            button.addActionListener(new ButtonEventListener());
            flowFrame.add(button);
        }

        flowFrame.setSize(400, 400);
        flowFrame.setResizable(false);
        flowFrame.setDefaultCloseOperation(3); // JFrame.EXIT_ON_CLOSE = Integer 3
        flowFrame.setVisible(true);
    }

    private static class ButtonEventListener implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent e) {
            String sourceString = ((JButton) e.getSource()).getText();
            JOptionPane.showMessageDialog(null, "My friend's name is: " + sourceString);
        }
    }
}
