package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.*;

public class NewRegistrationCustomerInformation1 extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    NewRegistrationCustomerInformation1() {

        t1 = new JTable();
        t1.setBounds(0, 110, 1600, 550);
        add(t1);

        JLabel l1 = new JLabel("NAME");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l1.setBounds(50, 80, 110, 30);
        add(l1);

        JLabel l2 = new JLabel("AGE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l2.setBounds(180, 80, 110, 30);
        add(l2);

        JLabel l3 = new JLabel("GENDER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l3.setBounds(290, 80, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("DATE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l4.setBounds(420, 80, 110, 30);
        add(l4);

        JLabel l5 = new JLabel("MONTH");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l5.setBounds(540, 80, 110, 30);
        add(l5);

        JLabel l6 = new JLabel("YEAR");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l6.setBounds(660, 80, 110, 30);
        add(l6);

        JLabel l7 = new JLabel("CITY");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l7.setBounds(790, 80, 110, 30);
        add(l7);

        JLabel l8 = new JLabel("PHONE NUMBER");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l8.setBounds(880, 80, 110, 30);
        add(l8);

        JLabel l9 = new JLabel("EMAIL - ID");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l9.setBounds(1020, 80, 110, 30);
        add(l9);

        JLabel l10 = new JLabel("ID CARD");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l10.setBounds(1140, 80, 170, 30);
        add(l10);

        JLabel l11 = new JLabel("ID CARD NUMBER");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l11.setBounds(1240, 80, 110, 30);
        add(l11);

        JLabel l12 = new JLabel("ADDRESS");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l12.setBounds(1380, 80, 110, 30);
        add(l12);

        JLabel l13 = new JLabel("PIN CODE NUMBER");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l13.setBounds(1470, 80, 110, 30);
        add(l13);

        JLabel l14 = new JLabel("NEW REGISTRATION CUSTOMER INFORMATION");
        l14.setFont(new Font("Tahoma", Font.BOLD, 30));
        l14.setForeground(Color.RED);
        l14.setBounds(400, 20, 740, 30);
        add(l14);

        b1 = new JButton("LOAD DATA");
        b1.setBounds(600, 680, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(800, 680, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.GREEN);

        setLayout(null);
        setBounds(200, 150, 1600, 770);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();
                String str = "select * from new_registration_form_1";
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
        new NewRegistrationCustomerInformation1();
    }

}
