package net.stoneiron.java.week14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Problem3 extends JFrame {
    JCheckBox disableCheck = new JCheckBox("버튼 비활성화");
    JCheckBox hideCheck = new JCheckBox("버튼 감추기");
    JButton button = new JButton("test button");

    public Problem3() {
        setTitle("CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(disableCheck);
        disableCheck.addItemListener(new MyCheckBoxListener());
        panel.add(hideCheck);
        hideCheck.addItemListener(new MyCheckBoxListener());
        c.add(panel, BorderLayout.NORTH);
        c.add(button);
        setSize(300, 200);
        setVisible(true);
    }

    private class MyCheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem().equals(disableCheck)) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    button.setEnabled(false);
                else
                    button.setEnabled(true);
            }
            if (e.getItem().equals(hideCheck)) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                    button.setVisible(false);
                else
                    button.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new Problem3();
    }
}
