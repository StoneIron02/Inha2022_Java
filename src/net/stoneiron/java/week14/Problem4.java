package net.stoneiron.java.week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Problem4 extends JFrame {
    String[] items = {"Java", "Data Structure", "OS"};
    String[] infos = {"Java is a 2-1 class.", "Data structure is a 2-1 class.", "OS is a 3-1 class."};
    JComboBox<String> comboBox = new JComboBox<>(items);
    JTextArea area = new JTextArea(infos[0], 300, 300);

    public Problem4() {
        setTitle("Problem4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
        Container c = getContentPane();
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText(infos[comboBox.getSelectedIndex()]);
            }
        });
        c.add(comboBox, BorderLayout.NORTH);
        c.add(area);
    }

    public static void main(String[] args) {
        new Problem4();
    }
}
