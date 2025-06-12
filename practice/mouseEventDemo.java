package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class mouseEventDemo extends JFrame implements MouseListener {
    JLabel label;
    public mouseEventDemo(){
        setTitle("Mouse event demo");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label=new JLabel("Mouse click here",JLabel.CENTER);
        label.setFont(new Font("Arial",Font.BOLD,18));
        add(label);

        addMouseListener(this);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        label.setText("Mouse clicked at ("+e.getX()+","+e.getY()+")");
    }
    public void mousePressed (MouseEvent e){
        label.setText("Mouse ressed("+e.getX()+","+e.getY()+")");
    }
    public void mouseReleased(MouseEvent e){
        label.setText("Mouse released at ("+e.getX()+","+e.getY()+")");
    }
    public void mouseEntered(MouseEvent e){
        label.setText("Mouse enterd");
    }
    public void mouseExited(MouseEvent e){
        label.setText("Mouse exited");
    }
    public static void main(String[] args) {
        new mouseEventDemo();
    }
}
