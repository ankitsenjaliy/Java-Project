package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.*;

public class ManagerInformation extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    ManagerInformation() {

        t1 = new JTable();
        t1.setBounds(0, 110, 1400, 550);
        add(t1);

        JLabel l1 = new JLabel("NAME");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(80, 80, 110, 30);
        add(l1);

        JLabel l2 = new JLabel("AGE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(260, 80, 110, 30);
        add(l2);

        JLabel l3 = new JLabel("GENDER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(420, 80, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("JOB");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(610, 80, 110, 30);
        add(l4);

        JLabel l5 = new JLabel("PHONE NUMBER");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(740, 80, 110, 30);
        add(l5);

        JLabel l6 = new JLabel("EMAIL - ID");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(930, 80, 110, 30);
        add(l6);

        JLabel l7 = new JLabel("AADHAR CARD NUMBER");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(1060, 80, 170, 30);
        add(l7);

        JLabel l8 = new JLabel("SALARY");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l8.setBounds(1270, 80, 110, 30);
        add(l8);

        JLabel l9 = new JLabel("MANAGER INFORMATION");
        l9.setFont(new Font("Tahoma", Font.BOLD, 30));
        l9.setForeground(Color.RED);
        l9.setBounds(500, 20, 450, 30);
        add(l9);

        b1 = new JButton("LOAD DATA");
        b1.setBounds(500, 680, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 680, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.ORANGE);

        setLayout(null);
        setBounds(300, 150, 1400, 780);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();
                String str = "select * from add_employee where job = 'Manager'";
                ResultSet rs = c.s.executeQuery(str);

                t1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new ManagerInformation();
    }

}
