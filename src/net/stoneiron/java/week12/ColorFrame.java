package net.stoneiron.java.week12;

import javax.swing.*;
import java.awt.*;

public class ColorFrame extends JFrame {
    public ColorFrame() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.ORANGE);
        c.setLayout(new FlowLayout());
        c.add(new JButton("OK"));
        c.add(new JButton("Cancel"));
        c.add(new JButton("Ignore"));
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}
