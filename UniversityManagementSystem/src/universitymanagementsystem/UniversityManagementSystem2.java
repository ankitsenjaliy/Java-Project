package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UniversityManagementSystem2 extends JFrame implements ActionListener {

    JButton b1, b2;

    UniversityManagementSystem2() {

        b1 = new JButton("STUDENT AND FACULTY MANAGEMENT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBounds(160, 900, 410, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UNIVERSITY  MANAGEMENT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBounds(1360, 900, 410, 50);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("universitymanagementsystem/icons/U1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1920, 1000);
        add(l1);

        JLabel l2 = new JLabel("UNIVERSITY MANAGEMENT SYSTEM");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(500, 30, 1500, 100);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new StudentAndFacultyLogin("").setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new UniversityLogin().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {
        new UniversityManagementSystem2();

    }
}
