package java_internal;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class tree {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tree Example");

        // 🌳 Root Node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("College");

        // 🌿 Child Nodes
        DefaultMutableTreeNode cse = new DefaultMutableTreeNode("CSE");
        DefaultMutableTreeNode ece = new DefaultMutableTreeNode("ECE");
        DefaultMutableTreeNode it = new DefaultMutableTreeNode("IT");

        // 🍁 Leaf Nodes
        cse.add(new DefaultMutableTreeNode("AI & ML"));
        cse.add(new DefaultMutableTreeNode("Cyber Security"));
        ece.add(new DefaultMutableTreeNode("VLSI"));
        it.add(new DefaultMutableTreeNode("Data Science"));

        // 🌳 Add branches to root
        root.add(cse);
        root.add(ece);
        root.add(it);

        // Create JTree
        JTree tree = new JTree(root);

        frame.add(new JScrollPane(tree)); // Add with scroll
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
