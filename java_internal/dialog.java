package java_internal;
import javax.swing.*;

public class dialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello Sirii ❤️! This is a Message Dialog.");

        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + name + "!");

        int confirm = JOptionPane.showConfirmDialog(null, "Do you like Java?");
        String msg = (confirm == JOptionPane.YES_OPTION) ? "Yay! Keep coding!" : "Oh no, try again!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
