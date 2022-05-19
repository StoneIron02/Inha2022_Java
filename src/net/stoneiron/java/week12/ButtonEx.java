package net.stoneiron.java.week12;

import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {
    public ButtonEx() {
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon normalIcon = new ImageIcon("src/net/stoneiron/java/week12/images/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("src/net/stoneiron/java/week12/images/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("src/net/stoneiron/java/week12/images/pressedIcon.gif");
        JButton btn = new JButton("Button", normalIcon);
        btn.setPressedIcon(pressedIcon);
        btn.setRolloverIcon(rolloverIcon);
        c.add(btn);
        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}