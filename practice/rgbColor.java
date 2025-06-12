package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rgbColor extends JFrame implements AdjustmentListener{

  JScrollBar redJScrollBar,greenJScrollBar,blueJScrollBar;

  JLabel colorLable;
  public rgbColor(){
    setTitle("Rgb color changer");
    setSize(400,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(5,1));

    redJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,256);
    greenJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,256);
    blueJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL,0,0,0,256);

    add(new JLabel("red"));
    add(redJScrollBar);
    add(new JLabel("green"));
    add(greenJScrollBar);
    add(new JLabel("blue"));
    add(blueJScrollBar);

    colorLable =new JLabel("color(0,0,0)",JLabel.CENTER);
    colorLable.setFont(new Font("Arial",Font.BOLD,18));
    add(colorLable);

    redJScrollBar.addAdjustmentListener(this);
    greenJScrollBar.addAdjustmentListener(this);
    blueJScrollBar.addAdjustmentListener(this);




  }

  public void adjustmentValueChanged(AdjustmentEvent e){
 int r=redJScrollBar.getValue();
    int g=greenJScrollBar.getValue();
    int b=blueJScrollBar.getValue();

    Color color=new Color(r,g,b);

    colorLable.setForeground(color);
    colorLable.setText("color("+r+","+g+","+b+")");

  }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(()->{
            rgbColor app=new rgbColor();
            app.setVisible(true);
        });
    }
}
