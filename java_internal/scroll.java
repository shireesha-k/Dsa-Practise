package java_internal;

import javax.swing.*;

public class scroll {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ScrollPane Example");

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setText("Hey Sirii ❤️,\nThis is a long text...\n".repeat(20));

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

