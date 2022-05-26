package net.stoneiron.java.week13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundColorEx extends JFrame {
    JButton red = new JButton("red");
    JButton blue = new JButton("blue");
    JButton green = new JButton("green");

    public BackgroundColorEx() {
        setTitle("EX1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JPanel p = new JPanel();
        p.add(red);
        p.add(blue);
        p.add(green);
        p.setBackground(Color.GRAY);
        c.add(p, BorderLayout.NORTH);
        c.setBackground(Color.CYAN);
        red.addActionListener(new ButtonListener());
        blue.addActionListener(new ButtonListener());
        green.addActionListener(new ButtonListener());
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BackgroundColorEx();
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            if (button.equals(red))
                BackgroundColorEx.this.getContentPane().setBackground(Color.RED);
            if (button.equals(blue))
                BackgroundColorEx.this.getContentPane().setBackground(Color.BLUE);
            if (button.equals(green))
                BackgroundColorEx.this.getContentPane().setBackground(Color.GREEN);
        }
    }
}
