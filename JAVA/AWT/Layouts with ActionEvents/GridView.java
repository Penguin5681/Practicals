import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridView"); 
        frame.setLayout(new GridLayout(3, 2));
        
        String[] buttonStrings = {"Pizza", "Burger", "Hot-Dog", "Pasta", "Mushroom", "Carrots"};

        for (String str : buttonStrings) {
            JButton button = new JButton(str);
            button.addActionListener(new ButtonEventListener());
            frame.add(button);
        }

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
    }

    private static class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String sourceText = source.getText();
            JOptionPane.showMessageDialog(null, "You clicked: " + sourceText + " Button");
        }
    }

}