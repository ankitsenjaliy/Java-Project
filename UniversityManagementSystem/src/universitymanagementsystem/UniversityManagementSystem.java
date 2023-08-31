package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UniversityManagementSystem extends JFrame implements ActionListener {

    JButton b1, b2, b3;

    UniversityManagementSystem() {

        b1 = new JButton("HOSTEL  MANAGEMENT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 900, 350, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UNIVERSITY  MANAGEMENT");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(800, 900, 350, 50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("LIBRARY  MANAGEMENT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(1480, 900, 350, 50);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("universitymanagementsystem/icons/1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1920, 1000);
        add(l1);

        JLabel l2 = new JLabel("UNIVERSITY MANAGEMENT SYSTEM");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 60));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(400, 30, 1500, 100);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

        while (true) {

            l2.setVisible(false);
            
            try {

                Thread.sleep(500);

            } catch (Exception e) {

                System.out.println(e);
            }

            l2.setVisible(true);
           
            try {

                Thread.sleep(500);

            } catch (Exception e) {

                System.out.println(e);
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new HostelLogin().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new UniversityManagementSystem2().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new LibraryLogin().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new UniversityManagementSystem();

    }
}
