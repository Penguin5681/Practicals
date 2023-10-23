import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEG {
    public static void main(String[] args) {
        JFrame borderFrame = new JFrame("Border Layout");
        borderFrame.setLayout(new BorderLayout(5, 5));

        String[] buttonStrings = {"NORTH", "EAST", "WEST", "SOUTH", "CENTER"};
        String[] borderPositions = {BorderLayout.NORTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.CENTER};
        
        for (int i = 0; i < buttonStrings.length; i++) {
            borderFrame.add(new JButton(buttonStrings[i]), borderPositions[i]);
        }

        borderFrame.setSize(1024, 768);
        borderFrame.setVisible(true);
        borderFrame.setResizable(true);
    }

    private static class ButtonEventListener implements ActionListener {
        
    }
}
