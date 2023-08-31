package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.*;

public class DriverInformation extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    DriverInformation() {

        t1 = new JTable();
        t1.setBounds(0, 110, 1500, 550);
        add(t1);

        JLabel l1 = new JLabel("NAME");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(60, 80, 110, 30);
        add(l1);

        JLabel l2 = new JLabel("AGE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(220, 80, 110, 30);
        add(l2);

        JLabel l3 = new JLabel("GENDER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(350, 80, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("PHONE NUMBER");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(480, 80, 110, 30);
        add(l4);

        JLabel l5 = new JLabel("EMAIL - ID");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(640, 80, 110, 30);
        add(l5);

        JLabel l6 = new JLabel("AADHAR CARD NUMBER");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(750, 80, 150, 30);
        add(l6);

        JLabel l7 = new JLabel("CAR COMPANY");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(930, 80, 170, 30);
        add(l7);

        JLabel l8 = new JLabel("CAR MODEL");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l8.setBounds(1090, 80, 110, 30);
        add(l8);

        JLabel l9 = new JLabel("AVAILABLE");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l9.setBounds(1240, 80, 110, 30);
        add(l9);

        JLabel l10 = new JLabel("LOCATION");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l10.setBounds(1380, 80, 110, 30);
        add(l10);

        JLabel l11 = new JLabel("DRIVER INFORMATION");
        l11.setFont(new Font("Tahoma", Font.BOLD, 30));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(600, 20, 450, 30);
        add(l11);

        b1 = new JButton("LOAD DATA");
        b1.setBounds(550, 680, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(750, 680, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.PINK);

        setLayout(null);
        setBounds(200, 150, 1500, 780);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();
                String str = "select * from add_driver";
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
        new DriverInformation();
    }

}
