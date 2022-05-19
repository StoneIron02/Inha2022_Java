package net.stoneiron.java.week12;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);

        Container c = getContentPane();
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new SouthPanel(), BorderLayout.SOUTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new CalculatorFrame();
    }
}

class NorthPanel extends JPanel {
    public NorthPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("수식입력");
        add(label);

        JTextField textField = new JTextField(12);
        add(textField);
    }
}

class SouthPanel extends JPanel {
    public SouthPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel label = new JLabel("계산결과");
        add(label);

        JTextField textField = new JTextField(12);
        add(textField);
    }
}

class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(new GridLayout(4, 4));
        add(new JButton("0"));
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
        add(new JButton("7"));
        add(new JButton("8"));
        add(new JButton("9"));
        add(new JButton("CE"));
        add(new JButton("계산"));
        add(new JButton("+"));
        add(new JButton("-"));
        add(new JButton("×"));
        add(new JButton("÷"));
    }
}