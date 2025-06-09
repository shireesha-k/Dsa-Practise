package java_internal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class card {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        CardLayout cl = new CardLayout();
        JPanel cardPanel = new JPanel(cl);

        // Cards
        JPanel card1 = new JPanel(); card1.add(new JLabel("This is Card 1"));
        JPanel card2 = new JPanel(); card2.add(new JLabel("This is Card 2"));
        JPanel card3 = new JPanel(); card3.add(new JLabel("This is Card 3"));

        cardPanel.add(card1, "1");
        cardPanel.add(card2, "2");
        cardPanel.add(card3, "3");

        // Buttons to switch cards
        JPanel buttonPanel = new JPanel();
        JButton b1 = new JButton("Card 1");
        JButton b2 = new JButton("Card 2");
        JButton b3 = new JButton("Card 3");

        b1.addActionListener(e -> cl.show(cardPanel, "1"));
        b2.addActionListener(e -> cl.show(cardPanel, "2"));
        b3.addActionListener(e -> cl.show(cardPanel, "3"));

        buttonPanel.add(b1); buttonPanel.add(b2); buttonPanel.add(b3);

        frame.setLayout(new BorderLayout());
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(cardPanel, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

