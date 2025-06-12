package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class card {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Thid is card layout");
        CardLayout cl=new CardLayout();
        JPanel panel=new JPanel(cl);

        JPanel card1=new JPanel();
        card1.add(new JLabel("This is cars1"));
        JPanel card2=new JPanel();
        card2.add(new JLabel("thid id cad2"));

        panel.add(card1,"1");
        panel.add(card2,"2");

        JPanel buttonpanel=new JPanel();
        JButton b1=new JButton("card 1");
        JButton b2=new JButton("card 2");

        b1.addActionListener(e->cl.show(panel,"1"));
        b2.addActionListener(e->cl.show(panel,"2"));


        buttonpanel.add(b1);
        buttonpanel.add(b2);

       frame.add(buttonpanel, BorderLayout.NORTH); 
        frame.add(panel,BorderLayout.CENTER); 
        frame.setVisible(true);
    }
}
