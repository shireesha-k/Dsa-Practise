package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttoncolor extends JFrame implements ActionListener{
    JButton reButton,blueButton,yellowButton;

    public buttoncolor(){
         setTitle("Rgb color changer");
    setSize(400,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new FlowLayout());

    reButton=new JButton("Red");
    blueButton=new JButton("Blue");
    yellowButton=new JButton("Yellow");
    
    reButton.addActionListener(this);
    blueButton.addActionListener(this);
    yellowButton.addActionListener(this);

    add(reButton);
    add(blueButton);
    add(yellowButton);


    } 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reButton){
            getContentPane().setBackground(Color.RED);
        } else if(e.getSource()==blueButton){
            getContentPane().setBackground(Color.BLUE);
        } else if(e.getSource()==yellowButton){
            getContentPane().setBackground(Color.YELLOW);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            buttoncolor app=new buttoncolor();
            app.setVisible(true);

        });
    }
    }
