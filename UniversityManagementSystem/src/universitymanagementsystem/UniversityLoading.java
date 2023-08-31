package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UniversityLoading extends JFrame implements Runnable {

    JProgressBar p;
    int a;

    Thread t;

    public void setUploading() {

        t.start();
    }

    public void run() {

        try {

            for (int i = 0; i < 200; i++) {

                a = a + 1;

                int m = p.getMaximum();
                int v = p.getValue();

                if (v < m) {

                    p.setValue(p.getValue() + 1);

                } else {

                    i = 201;

                    new UniversityDashboard().setVisible(true);
                    setVisible(false);
                }
                Thread.sleep(50);

            }

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    UniversityLoading() {

        t = new Thread((Runnable) this);

        p = new JProgressBar();
        p.setFont(new Font("Times New Roman", Font.BOLD, 20));
        p.setBackground(Color.WHITE);
        p.setForeground(Color.RED);
        p.setBounds(100, 100, 400, 30);
        p.setStringPainted(true);
        add(p);

        JLabel l1 = new JLabel("PLEASE WAIT.....");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.BLUE);
        l1.setBounds(140, 180, 400, 40);
        add(l1);

        setUploading();

        getContentPane().setBackground(Color.YELLOW);

        setLayout(null);
        setBounds(700, 300, 600, 400);
        setVisible(true);

    }

    public static void main(String[] args) {

        new UniversityLoading();
    }

}
