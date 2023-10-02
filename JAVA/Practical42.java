import javax.swing.*;
import java.awt.*;

public class Practical42 extends JFrame {

    public Practical42() {
        setTitle("Simple Graphics Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        add(new MyCanvas()); // Add a custom JPanel for drawing
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class MyCanvas extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw a red rectangle
            g.setColor(Color.RED);
            g.fillRect(50, 50, 100, 100);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Practical42());
    }
}
