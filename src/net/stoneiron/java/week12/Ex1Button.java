package net.stoneiron.java.week12;

import javax.swing.*;
import java.awt.*;

public class Ex1Button extends JFrame {

    public Ex1Button() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton button1 = new JButton("Blue/Yellow Button");
        button1.setForeground(Color.BLUE);
        button1.setBackground(Color.YELLOW);
        c.add(button1);

        JButton button2 = new JButton("Disabled Button");
        button2.setEnabled(false);
        c.add(button2);

        JButton button3 = new JButton("Italic Button");
        button3.setFont(new Font("Arial", Font.ITALIC, 20));
        c.add(button3);

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex1Button();
    }
}
