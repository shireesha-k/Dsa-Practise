package java_internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorChanger extends JFrame implements AdjustmentListener {

    // Scrollbars for Red, Green, Blue colors
    JScrollBar redScroll, greenScroll, blueScroll;

    // Label to show the current color
    JLabel colorLabel;

    // Constructor to set up the GUI components
    public RGBColorChanger() {
        setTitle("RGB Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        // Creating and setting up scroll bars for Red, Green, Blue
        redScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 256);
        greenScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 256);
        blueScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 0, 0, 256);

        // Adding labels and scroll bars to the layout
        add(new JLabel("Red"));
        add(redScroll);
        add(new JLabel("Green"));
        add(greenScroll);
        add(new JLabel("Blue"));
        add(blueScroll);

        // Label to display the current color
        colorLabel = new JLabel("Color(0,0,0)", JLabel.CENTER);
        colorLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(colorLabel);

        // Adding adjustment listeners to detect changes in scroll bars
        redScroll.addAdjustmentListener(this);
        greenScroll.addAdjustmentListener(this);
        blueScroll.addAdjustmentListener(this);
    }

    // Method to handle the scroll bar changes and update the color
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Get the current values of the scroll bars
        int r = redScroll.getValue();
        int g = greenScroll.getValue();
        int b = blueScroll.getValue();

        // Create a new Color object using the scroll values
        Color color = new Color(r, g, b);

        // Change the color of the label's text to the new color
        colorLabel.setForeground(color);

        // Update the label text with the RGB values
        colorLabel.setText("Color (" + r + "," + g + "," + b + ")");
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create and display the RGBColorChanger window in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            RGBColorChanger window = new RGBColorChanger();
            window.setVisible(true); // Make sure the window is visible
        });
    }
}
