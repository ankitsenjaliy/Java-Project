package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.*;

public class PickUpService extends JFrame implements ActionListener {

    JTable t1;
    Choice c1, c2;
    JButton b1, b2;

    PickUpService() {

        t1 = new JTable();
        t1.setBounds(0, 130, 1500, 500);
        add(t1);

        JLabel l1 = new JLabel("CAR COMPANY");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(60, 30, 110, 30);
        add(l1);

        c1 = new Choice();
        try {
            Conn c = new Conn();
            String str = "select * from add_driver";
            ResultSet rs = c.s.executeQuery(str);
            while (rs.next()) {
                c1.add(rs.getString("car_company"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        c1.setBounds(200, 30, 150, 30);
        add(c1);

        JLabel l2 = new JLabel("CAR MODEL");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(1100, 30, 110, 30);
        add(l2);

        c2 = new Choice();
        try {
            Conn c = new Conn();
            String str = "select * from add_driver";
            ResultSet rs = c.s.executeQuery(str);
            while (rs.next()) {
                c2.add(rs.getString("car_model"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        c2.setBounds(1210, 30, 150, 30);
        add(c2);

        JLabel l3 = new JLabel("NAME");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(60, 100, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("AGE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(220, 100, 110, 30);
        add(l4);

        JLabel l5 = new JLabel("GENDER");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(350, 100, 110, 30);
        add(l5);

        JLabel l6 = new JLabel("PHONE NUMBER");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(480, 100, 110, 30);
        add(l6);

        JLabel l7 = new JLabel("EMAIL - ID");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(640, 100, 110, 30);
        add(l7);

        JLabel l8 = new JLabel("AADHAR CARD NUMBER");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l8.setBounds(750, 100, 150, 30);
        add(l8);

        JLabel l9 = new JLabel("CAR COMPANY");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l9.setBounds(930, 100, 170, 30);
        add(l9);

        JLabel l10 = new JLabel("CAR MODEL");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l10.setBounds(1090, 100, 110, 30);
        add(l10);

        JLabel l11 = new JLabel("AVAILABLE");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l11.setBounds(1240, 100, 110, 30);
        add(l11);

        JLabel l12 = new JLabel("LOCATION");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l12.setBounds(1380, 100, 110, 30);
        add(l12);

        JLabel l13 = new JLabel("PICK UP SERVICE");
        l13.setFont(new Font("Tahoma", Font.BOLD, 40));
        l13.setForeground(Color.RED);
        l13.setBounds(600, 20, 450, 40);
        add(l13);

        b1 = new JButton("SUBMIT");
        b1.setBounds(550, 650, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(750, 650, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.YELLOW);

        setLayout(null);
        setBounds(200, 200, 1500, 750);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {

                Conn c = new Conn();
                String str = "select * from add_driver where car_company = '" + c1.getSelectedItem() + "' and car_model = '" + c2.getSelectedItem() + "'";
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
        new PickUpService();
    }

}
