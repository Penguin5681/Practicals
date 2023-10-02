import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends JFrame implements MouseListener {
    private JTextArea textArea;

    public MouseEventsDemo() {
        setTitle("Mouse Events Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.addMouseListener(this);

        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        textArea.append("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        textArea.append("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        textArea.append("Mouse Released at (" + e.getX() + ", " + e.getY() + ")\n");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        textArea.append("Mouse Entered\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        textArea.append("Mouse Exited\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventsDemo());
    }
}
