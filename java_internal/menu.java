package java_internal;
import javax.swing.*;
import java.awt.event.*;

public class menu {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Demo");
        JLabel label = new JLabel("Choose an option");
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");

        item1.addActionListener(e -> label.setText("Clicked: Item 1"));
        item2.addActionListener(e -> label.setText("Clicked: Item 2"));

        menu.add(item1); menu.add(item2); mb.add(menu);
        f.setJMenuBar(mb);
        f.add(label);
        f.setSize(300, 150); f.setLayout(null); label.setBounds(100, 50, 150, 30);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
