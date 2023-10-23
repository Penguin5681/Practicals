import java.awt.GridLayout;
import javax.swing.*;

public class GridView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridView"); 
        frame.setLayout(new GridLayout(3, 2));
        
        String[] buttonStrings = {"Pizza", "Burger", "Hot-Dog", "Pav-Bhaji", "Mushroom", "Carrots"};

        for (int i = 0; i < buttonStrings.length; i++) {
            JButton button = new JButton(buttonStrings[i]);
            frame.add(button);
        }


        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
    }
}
