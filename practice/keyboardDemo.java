package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyboardDemo extends JFrame implements KeyListener {
    JLabel label;

    public keyboardDemo() {
        setTitle("Keyboard event demo");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Press any key", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        add(label);
        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new keyboardDemo();
    }
}
