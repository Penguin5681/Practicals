import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Practical40 extends JFrame implements KeyListener {
    private JTextArea textArea;

    public KeyboardEventsDemo() {
        setTitle("Keyboard Events Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.addKeyListener(this);

        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key has been typed
        char keyChar = e.getKeyChar();
        textArea.append("Key Typed: " + keyChar + "\n");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a physical key is pressed down
        int keyCode = e.getKeyCode();
        textArea.append("Key Pressed: " + KeyEvent.getKeyText(keyCode) + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Invoked when a physical key is released
        int keyCode = e.getKeyCode();
        textArea.append("Key Released: " + KeyEvent.getKeyText(keyCode) + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyboardEventsDemo());
    }
}
