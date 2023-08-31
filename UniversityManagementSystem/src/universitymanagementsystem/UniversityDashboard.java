package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UniversityDashboard extends JFrame implements ActionListener {

    JPanel p1, p2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

    UniversityDashboard() {

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

        b2 = new JButton("FACULTY INFORMATION");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 10));
        b2.setBounds(0, 80, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("COURSE INFORMATION");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 30));
        b3.setBounds(0, 130, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("SUBJECT INFORMATION");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setMargin(new Insets(0, 0, 0, 20));
        b4.setBounds(0, 180, 300, 50);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("FEES INFORMATION");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setMargin(new Insets(0, 0, 0, 60));
        b5.setBounds(0, 230, 300, 50);
        b5.addActionListener(this);
        p2.add(b5);

        b6 = new JButton("HOSTEL INFORMATION");
        b6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setMargin(new Insets(0, 0, 0, 30));
        b6.setBounds(0, 280, 300, 50);
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("ROOM INFORMATION");
        b7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setMargin(new Insets(0, 0, 0, 50));
        b7.setBounds(0, 330, 300, 50);
        b7.addActionListener(this);
        p2.add(b7);

        b8 = new JButton("EMPLOYEE INFORMATION");
        b8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setMargin(new Insets(0, 0, 0, 10));
        b8.setBounds(0, 380, 300, 50);
        b8.addActionListener(this);
        p2.add(b8);

        b9 = new JButton("PAYMENT INFORMATION");
        b9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setMargin(new Insets(0, 0, 0, 310));
        b9.setBounds(0, 430, 600, 50);
        b9.addActionListener(this);
        p2.add(b9);

        b10 = new JButton("INFORMATION");
        b10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setMargin(new Insets(0, 0, 0, 410));
        b10.setBounds(0, 480, 600, 50);
        b10.addActionListener(this);
        p2.add(b10);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U6.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1640, 930, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(280, 80, 1680, 930);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U4.jpg"));
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

            new StudentInformation().setVisible(true);

        } else if (ae.getSource() == b2) {

            new FacultyInformation().setVisible(true);

        } else if (ae.getSource() == b3) {

            new CourseInformation().setVisible(true);

        } else if (ae.getSource() == b4) {

            new SubjectInformation().setVisible(true);

        } else if (ae.getSource() == b5) {

            new FeesInformation().setVisible(true);

        } else if (ae.getSource() == b6) {

            new HostelInformation1().setVisible(true);

        } else if (ae.getSource() == b7) {

            new RoomInformation1().setVisible(true);

        } else if (ae.getSource() == b8) {

            new EmployeeInformation1().setVisible(true);

        } else if (ae.getSource() == b9) {

            new PaymentInformation().setVisible(true);

        } else if (ae.getSource() == b10) {

            new Information().setVisible(true);
        }
    }

    public static void main(String[] args) {

        new UniversityDashboard();
    }

}
