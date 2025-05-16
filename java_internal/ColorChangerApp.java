package java_internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerApp extends JFrame implements ActionListener {
    // Buttons for Red, Yellow, and Blue
    JButton redButton, yellowButton, blueButton;

    // Constructor to set up the GUI
    public ColorChangerApp() {
        // Set up the JFrame
        setTitle("Color Changer");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons and add action listeners
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        blueButton = new JButton("Blue");

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Add buttons to the JFrame
        add(redButton);
        add(yellowButton);
        add(blueButton);
    }

    // ActionPerformed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            getContentPane().setBackground(Color.RED); // Change background to Red
        } else if (e.getSource() == yellowButton) {
            getContentPane().setBackground(Color.YELLOW); // Change background to Yellow
        } else if (e.getSource() == blueButton) {
            getContentPane().setBackground(Color.BLUE); // Change background to Blue
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChangerApp app = new ColorChangerApp();
            app.setVisible(true); // Make the JFrame visible
        });
    }
}

