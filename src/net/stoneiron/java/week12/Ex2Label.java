package net.stoneiron.java.week12;

import javax.swing.*;
import java.awt.*;

public class Ex2Label extends JFrame {
    public Ex2Label() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setVisible(true);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("사랑합니다");
        label1.setHorizontalAlignment(JLabel.CENTER);
        c.add(label1);

        JLabel label2 = new JLabel(new ImageIcon("src/net/stoneiron/java/week12/images/beauty.jpg"));
        c.add(label2);

        JLabel label3 = new JLabel("전화하세요", new ImageIcon("src/net/stoneiron/java/week12/images/normalIcon.gif"), SwingConstants.CENTER);
        c.add(label3);


    }

    public static void main(String[] args) {
        new Ex2Label();
    }

}
