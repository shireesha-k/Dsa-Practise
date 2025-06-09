package java_internal;
import javax.swing.*;

public class tab{
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Example");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        tab1.add(new JLabel("Welcome to Tab 1"));

        JPanel tab2 = new JPanel();
        tab2.add(new JLabel("This is Tab 2"));

        JPanel tab3 = new JPanel();
        tab3.add(new JLabel("You're in Tab 3"));

        tabbedPane.add("Tab 1", tab1);
        tabbedPane.add("Tab 2", tab2);
        tabbedPane.add("Tab 3", tab3);

        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

