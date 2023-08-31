package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.*;

public class NewRegistrationCustomerInformation2 extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    NewRegistrationCustomerInformation2() {

        t1 = new JTable();
        t1.setBounds(0, 110, 900, 570);
        add(t1);

        JLabel l1 = new JLabel("ID CARD NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l1.setBounds(70, 80, 110, 30);
        add(l1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l2.setBounds(300, 80, 110, 30);
        add(l2);

        JLabel l3 = new JLabel("CHECKED - IN");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l3.setBounds(520, 80, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("ADVANCE DEPOSIT");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 13));
        l4.setBounds(720, 80, 110, 30);
        add(l4);

        JLabel l5 = new JLabel("NEW REGISTRATION CUSTOMER INFORMATION");
        l5.setFont(new Font("Tahoma", Font.BOLD, 30));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(80, 20, 740, 30);
        add(l5);

        b1 = new JButton("LOAD DATA");
        b1.setBounds(300, 700, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(500, 700, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.RED);

        setLayout(null);
        setBounds(500, 150, 900, 800);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();
                String str = "select * from new_registration_form_2";
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
        new NewRegistrationCustomerInformation2();
    }

}
