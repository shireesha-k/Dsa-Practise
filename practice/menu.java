package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class menu {
    public static void main(String[] args) {
        JFrame f=new JFrame("Menu example");
        JLabel label=new JLabel("Choose an option");
        JMenuBar mb=new JMenuBar();
        JMenu menu=new JMenu("Menu");
        JMenuItem Item1=new JMenuItem("Item 1");
        JMenuItem Item2=new JMenuItem("Item 2");
        
       

        Item1.addActionListener(e->label.setText("Item1 is clicked"));
        Item2.addActionListener(e->label.setText("Item2 is clicked"));
         menu.add(Item1);
        menu.add(Item2);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.add(label);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setBounds(40,50,60,70);
        f.setVisible(true);
    }
}
