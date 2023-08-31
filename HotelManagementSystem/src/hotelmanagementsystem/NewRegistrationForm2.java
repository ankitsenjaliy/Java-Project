package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class NewRegistrationForm2 extends JFrame implements ActionListener {

    JLabel l3;
    JTextField t1, t2, t3;
    JComboBox c1, c2;
    JButton b1, b2, b3;

    NewRegistrationForm2() {

        JLabel l1 = new JLabel("PHONE NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 30, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(300, 30, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("ID CARD NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 80, 150, 30);
        add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(300, 80, 150, 30);
        add(l3);

        JLabel l4 = new JLabel("TOTAL PERSONS");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 130, 190, 30);
        add(l4);

        t2 = new JTextField();
        t2.setBounds(300, 130, 150, 30);
        add(t2);

        JLabel l5 = new JLabel("ROOM NUMBER");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 180, 190, 30);
        add(l5);

        t3 = new JTextField();
        t3.setBounds(300, 180, 150, 30);
        add(t3);

        JLabel l6 = new JLabel("CHECK - IN STATUS");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 230, 150, 30);
        add(l6);

        String checked_in[] = {"No", "Other"};
        c1 = new JComboBox(checked_in);
        c1.setBackground(Color.WHITE);
        c1.setBounds(300, 230, 150, 30);
        add(c1);

        JLabel l7 = new JLabel("CHOOSE ADVANCE DEPOSIT");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 280, 220, 30);
        add(l7);

        String deposit[] = {"10000", "15000", "20000", "25000", "30000", "35000", "40000"};
        c2 = new JComboBox(deposit);
        c2.setBackground(Color.WHITE);
        c2.setBounds(300, 280, 150, 30);
        add(c2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/Eighteen.jpg"));
        Image i5 = i4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        b1 = new JButton(i6);
        b1.setBounds(460, 30, 30, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("SUBMIT");
        b2.setBounds(80, 400, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("CANCLE");
        b3.setBounds(270, 400, 130, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(500, 200, 1000, 500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String phone_no = t1.getText();

            if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Phone Number And Then Press The Side Red Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Conn c = new Conn();
                    String str = "select * from new_registration_form_1 where phone_no = '" + phone_no + "' ";
                    ResultSet rs = c.s.executeQuery(str);
                    if (rs.next()) {
                        l3.setText(rs.getString("id_card_no"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            String phone_no = t1.getText();
            String id_card_no = l3.getText();
            String total_persons = t2.getText();
            String room_no = (String) t3.getText();

            String checked_in = (String) c1.getSelectedItem();
            String deposit = (String) c2.getSelectedItem();

            if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Phone Number And Then Press The Side Red Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (id_card_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Then Press The Side Red Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (total_persons.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Total Persons", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (room_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Hotel Package Choose Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                Random AS = new Random();

                long password_no = (AS.nextLong() % 90000000L) + 10000000L;
                long password = Math.abs(password_no);

                long pin_no = (AS.nextLong() % 9000L) + 1000L;
                long pin = Math.abs(pin_no);

                try {

                    Conn c = new Conn();

                    String str = "insert into new_registration_form_2 values( '" + id_card_no + "', '" + total_persons + "', '" + room_no + "', '" + checked_in + "','" + deposit + "')";
                    c.s.executeUpdate(str);

                    String str2 = "insert into login2 values('" + password + "','" + pin + "')";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, " Registration SucessFully" + "\n Password = " + password + "\n Pin Number = " + pin);
                    new Login2().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b3) {

            String id_card_no = l3.getText();

            try {

                Conn c = new Conn();
                
                String str1 = "delete from new_registration_form_1 where id_card_no = '" + id_card_no + "'";
                c.s.executeUpdate(str1);

                new Login2().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {
        new NewRegistrationForm2();
    }
}
