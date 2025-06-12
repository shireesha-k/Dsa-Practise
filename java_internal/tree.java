package java_internal;
import javax.swing.*;
import javax.swing.tree.*;

public class tree {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tree Example");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("College");
        DefaultMutableTreeNode cse = new DefaultMutableTreeNode("CSE");
        DefaultMutableTreeNode ece = new DefaultMutableTreeNode("ECE");
        DefaultMutableTreeNode it = new DefaultMutableTreeNode("IT");

        cse.add(new DefaultMutableTreeNode("AI & ML"));
        cse.add(new DefaultMutableTreeNode("Cyber Security"));
        ece.add(new DefaultMutableTreeNode("VLSI"));
        it.add(new DefaultMutableTreeNode("Data Science"));

        root.add(cse); root.add(ece); root.add(it);

        f.add(new JScrollPane(new JTree(root)));
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
