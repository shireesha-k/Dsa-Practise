package java_internal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener {
    
    // Label to display mouse event information
    JLabel label;

    // Constructor to set up the window
    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("Mouse Events", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label);

        // Adding mouse listener to detect events
        addMouseListener(this);

        setVisible(true);
    }

    // Mouse events handling methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the window.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the window.");
    }

    // Main method to run the application
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
