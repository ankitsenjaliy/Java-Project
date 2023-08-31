package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class HostelDashboard extends JFrame implements ActionListener {

    JLabel l1;
    JPanel p1, p2;
    JButton b1, b2, b3, b4, b5;

    HostelDashboard() {

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.CYAN);
        p1.setBounds(0, 0, 1950, 80);
        add(p1);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.ORANGE);
        p2.setBounds(0, 50, 300, 1000);
        add(p2);

        b1 = new JButton("STUDENT INFORMATION");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0, 0, 0, 10));
        b1.setBounds(0, 30, 300, 50);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("ROOM INFORMATION");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 40));
        b2.setBounds(0, 80, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("EMPLOYEE INFORMATION");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 0));
        b3.setBounds(0, 130, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("UPDATE ROOM DETAILS");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0, 0, 0, 20));
        b4.setBounds(0, 180, 300, 50);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("LEAVE APPLICATION");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setMargin(new Insets(0, 0, 0, 50));
        b5.setBounds(0, 230, 300, 50);
        b5.addActionListener(this);
        p2.add(b5);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/H4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1650, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(280, 80, 1650, 950);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/H3.jpg"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(20, 5, 70, 70);
        p1.add(l2);

        JLabel l3 = new JLabel("WELCOMES YOU");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l3.setForeground(Color.RED);
        l3.setBounds(120, 15, 600, 50);
        p1.add(l3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new HostelInformation2().setVisible(true);

        } else if (ae.getSource() == b2) {

            new RoomInformation2().setVisible(true);

        } else if (ae.getSource() == b3) {

            new EmployeeInformation2().setVisible(true);

        } else if (ae.getSource() == b4) {

            new UpdateRoomDetails().setVisible(true);

        } else if (ae.getSource() == b5) {

            new StudentLeaveInformation().setVisible(true);
        }
    }

    public static void main(String[] args) {

        new HostelDashboard();
    }

}
