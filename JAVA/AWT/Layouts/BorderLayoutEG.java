import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEG {
    public static void main(String[] args) {
        JFrame borderFrame = new JFrame("Border Layout");
        borderFrame.setLayout(new BorderLayout(5, 5));

        String[] buttonStrings = {"Button1", "Button2", "Button3", "Button4", "Button5"};
        
        borderFrame.add(new JButton(buttonStrings[0]), BorderLayout.NORTH);
        borderFrame.add(new JButton(buttonStrings[1]), BorderLayout.EAST);
        borderFrame.add(new JButton(buttonStrings[2]), BorderLayout.SOUTH);
        borderFrame.add(new JButton(buttonStrings[3]), BorderLayout.WEST);
        borderFrame.add(new JButton(buttonStrings[4]), BorderLayout.CENTER);


        borderFrame.setSize(1024, 768);
        borderFrame.setVisible(true);
        borderFrame.setResizable(true);
    }
}
