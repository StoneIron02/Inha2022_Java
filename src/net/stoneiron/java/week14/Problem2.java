package net.stoneiron.java.week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Problem2 extends JFrame {
    JLabel text = new JLabel("Problem2");

    public Problem2() {
        setTitle("Problem2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        text.setLocation(0, 0);
        text.setSize(120, 30);
        text.setFont(new Font("Arial", Font.PLAIN, 10));
        text.addKeyListener(new MyKeyListener());
        c.add(text);
        setSize(300, 150);
        setVisible(true);
        text.setFocusable(true);
        text.requestFocus();
        c.addMouseWheelListener(new MyMouseWheelListener());
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_LEFT)
                text.setLocation(text.getX() - 5, text.getY());
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                text.setLocation(text.getX() + 5, text.getY());
            if (e.getKeyCode() == KeyEvent.VK_UP)
                text.setLocation(text.getX(), text.getY() - 5);
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                text.setLocation(text.getX(), text.getY() + 5);
            if (e.getKeyChar() == '+')
                text.setFont(new Font("Arial", Font.PLAIN, text.getFont().getSize() + 2));
            if (e.getKeyChar() == '-' && text.getFont().getSize() > 2)
                text.setFont(new Font("Arial", Font.PLAIN, text.getFont().getSize() - 2));
        }
    }

    class MyMouseWheelListener implements MouseWheelListener {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            if (e.getWheelRotation() < 0)
                text.setFont(new Font("Arial", Font.PLAIN, text.getFont().getSize() + 2));
            if (e.getWheelRotation() > 0 && text.getFont().getSize() > 2)
                text.setFont(new Font("Arial", Font.PLAIN, text.getFont().getSize() - 2));
        }
    }

    public static void main(String[] args) {
        new Problem2();
    }
}
