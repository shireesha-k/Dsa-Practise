package java_internal;

import javax.swing.*;
import java.awt.event.*;

public class dialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Box Example");
        JButton btnMessage = new JButton("Show Message");
        JButton btnInput = new JButton("Show Input");
        JButton btnConfirm = new JButton("Show Confirm");

        btnMessage.setBounds(50, 30, 150, 30);
        btnInput.setBounds(50, 70, 150, 30);
        btnConfirm.setBounds(50, 110, 150, 30);

        btnMessage.addActionListener(e -> 
            JOptionPane.showMessageDialog(frame, "Hello Sirii ❤️, this is a message dialog!")
        );

        btnInput.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(frame, "Enter your name:");
            if (name != null)
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
        });

        btnConfirm.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(frame, "Do you like Java?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION)
                JOptionPane.showMessageDialog(frame, "Great! Keep coding!");
            else
                JOptionPane.showMessageDialog(frame, "Oh no! Give it another try.");
        });

        frame.add(btnMessage);
        frame.add(btnInput);
        frame.add(btnConfirm);

        frame.setSize(260, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

