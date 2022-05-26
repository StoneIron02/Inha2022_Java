package net.stoneiron.java.week13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveLabel extends JFrame {
    JButton left = new JButton("left");
    JButton right = new JButton("right");
    JButton up = new JButton("up");
    JButton down = new JButton("down");
    JLabel label = new JLabel("Java");

    MoveLabel() {
        setTitle("EX2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JPanel p = new JPanel();
        p.add(left);
        p.add(right);
        p.add(up);
        p.add(down);
        p.setBackground(Color.YELLOW);
        c.add(p, BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.add(label);
        label.setSize(50, 15);
        label.setLocation(0, 0);
        c.add(p2, BorderLayout.CENTER);
        left.addActionListener(new ButtonListener());
        right.addActionListener(new ButtonListener());
        up.addActionListener(new ButtonListener());
        down.addActionListener(new ButtonListener());
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MoveLabel();
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.equals(left))
                label.setLocation(label.getX() - 10, label.getY());
            if (button.equals(right))
                label.setLocation(label.getX() + 10, label.getY());
            if (button.equals(up))
                label.setLocation(label.getX(), label.getY() - 10);
            if (button.equals(down))
                label.setLocation(label.getX(), label.getY() + 10);
        }
    }
}
