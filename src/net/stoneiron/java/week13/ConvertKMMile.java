package net.stoneiron.java.week13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertKMMile extends JFrame {
    private final double KMS_PER_MILE = 1.609;
    JTextField km = new JTextField(6);
    JTextField mile = new JTextField(6);
    JButton kmToMile = new JButton("KM->Mile");
    JButton mileToKm = new JButton("Mile->KM");

    ConvertKMMile() {
        setTitle("EX3");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1));

        JPanel p1 = new JPanel();
        p1.add(new Label("KM"));
        p1.add(km);
        p1.add(new Label("Mile"));
        p1.add(mile);
        c.add(p1);

        JPanel p2 = new JPanel();
        p2.add(kmToMile);
        p2.add(mileToKm);
        c.add(p2);

        kmToMile.addActionListener(new KmToMileListener());
        mileToKm.addActionListener(new MileToKmListener());

        setSize(500, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ConvertKMMile();
    }

    private class KmToMileListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double dKm = Double.parseDouble(km.getText());
            mile.setText(String.format("%.3f", dKm / KMS_PER_MILE));
        }
    }

    private class MileToKmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double dMile = Double.parseDouble(mile.getText());
            km.setText(String.format("%.3f", dMile * KMS_PER_MILE));
        }
    }
}
