import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;

public class Wardrobe {
    public static void main(String[] args) {
        JFrame wardrobeFrame = new JFrame("Wardrobe"); 
        ImageIcon imageIcon = new ImageIcon("Google_Icons-09-512.png");
        wardrobeFrame.setSize(500, 700);
        wardrobeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        JPanel topPanel = new JPanel(new GridLayout(1, 2));
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3));

        JPanel bottomLeftPanel = new JPanel(new GridLayout(2, 2));
        JPanel bottomRightPanel = new JPanel(new BorderLayout());

        topPanel.add(new JButton("Shirt"));
        topPanel.add(bottomLeftPanel);

        bottomLeftPanel.add(new JButton("Perfume"));
        bottomLeftPanel.add(new JButton("Cream"));
        bottomLeftPanel.add(bottomRightPanel);

        String[] directionStrings = {BorderLayout.WEST, BorderLayout.CENTER, BorderLayout.EAST};
        JButton[] valuableStrings = {new JButton("Gold"), new JButton("Diamonds"), new JButton("Credit Card")};

        // for (JButton valuableString : valuableStrings) {
        //     bottomRightPanel.add(valuableString);
        // }

        bottomRightPanel.add(new JButton("Gold"), BorderLayout.WEST);
        bottomRightPanel.add(new JButton("Diamond"), BorderLayout.CENTER);
        bottomRightPanel.add(new JButton("Cards"), BorderLayout.EAST);

        bottomPanel.add(new JButton("Shirt"));
        bottomPanel.add(new JButton("Pants"));
        bottomPanel.add(new JButton("Shirt"));
        bottomPanel.add(new JButton("Pants"));

        mainPanel.add(topPanel);
        mainPanel.add(bottomPanel);

        wardrobeFrame.add(mainPanel);
        wardrobeFrame.setVisible(true);
    }
    private static class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String sourceString = ((JButton)e.getSource()).getText();
            JOptionPane.showMessageDialog(null, sourceString);
        }
    }
}