package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class NewCustomerForm extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JRadioButton r1, r2;
    ButtonGroup G;
    JComboBox c1, c2;
    Choice c3;
    JButton b1, b2;

    NewCustomerForm() {

        JLabel l1 = new JLabel("NAME");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 30, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(300, 30, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("AGE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 80, 150, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(300, 80, 150, 30);
        add(t2);

        JLabel l3 = new JLabel("GENDER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 130, 150, 30);
        add(l3);

        G = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        r1.setBounds(300, 130, 70, 30);
        r1.setBackground(Color.WHITE);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        r2.setBounds(370, 130, 80, 30);
        r2.setBackground(Color.WHITE);
        G.add(r2);
        add(r2);

        JLabel l4 = new JLabel("CITY");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 180, 150, 30);
        add(l4);

        String city[] = {"Ahmadabad", "Rajkot", "Surat", "Baroda", "Jamnagar", "Bhavnagar"};
        c1 = new JComboBox(city);
        c1.setBackground(Color.WHITE);
        c1.setBounds(300, 180, 150, 30);
        add(c1);

        JLabel l5 = new JLabel("PHONE NUMBER");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 230, 150, 30);
        add(l5);

        t3 = new JTextField();
        t3.setBounds(300, 230, 150, 30);
        add(t3);

        JLabel l6 = new JLabel("EMAIL ID");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 280, 150, 30);
        add(l6);

        t4 = new JTextField();
        t4.setBounds(300, 280, 150, 30);
        add(t4);

        JLabel l7 = new JLabel("ID CARD");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 330, 150, 30);
        add(l7);

        String id_card[] = {"Aadhar Card", "Pan Card", "Driving License", "Voter-Id Card"};
        c2 = new JComboBox(id_card);
        c2.setBackground(Color.WHITE);
        c2.setBounds(300, 330, 150, 30);
        add(c2);

        JLabel l8 = new JLabel("ID CARD NUMBER");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setBounds(60, 380, 150, 30);
        add(l8);

        t5 = new JTextField();
        t5.setBounds(300, 380, 150, 30);
        add(t5);

        JLabel l9 = new JLabel("ROOM NUMBER");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setBounds(60, 430, 210, 30);
        add(l9);

        c3 = new Choice();
        try {
            Conn c = new Conn();
            String str = "select * from add_room where availability = 'Available'";
            ResultSet rs = c.s.executeQuery(str);
            while (rs.next()) {
                c3.add(rs.getString("room_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        c3.setBounds(300, 430, 150, 30);
        add(c3);

        JLabel l10 = new JLabel("CHECKED - IN");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setBounds(60, 480, 150, 30);
        add(l10);

        t6 = new JTextField();
        t6.setBounds(300, 480, 150, 30);
        add(t6);

        JLabel l11 = new JLabel("DEPOSIT");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l11.setBounds(60, 530, 150, 30);
        add(l11);

        t7 = new JTextField();
        t7.setBounds(300, 530, 150, 30);
        add(t7);

        JLabel l12 = new JLabel("ADDRESS");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l12.setBounds(60, 580, 150, 30);
        add(l12);

        t8 = new JTextField();
        t8.setBounds(300, 580, 150, 30);
        add(t8);

        JLabel l13 = new JLabel("PIN CODE NUMBER");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l13.setBounds(60, 630, 150, 30);
        add(l13);

        t9 = new JTextField();
        t9.setBounds(300, 630, 150, 30);
        add(t9);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/9.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(480, 130, 650, 550);
        add(l14);

        JLabel l15 = new JLabel("NEW CUSTOMER DETAILS");
        l15.setFont(new Font("Tahoma", Font.BOLD, 40));
        l15.setForeground(Color.RED);
        l15.setBounds(550, 30, 600, 60);
        add(l15);

        b1 = new JButton("SUBMIT");
        b1.setBounds(60, 700, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(300, 700, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(400, 180, 1170, 800);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String name = t1.getText();
            String age = t2.getText();

            String gender = null;

            if (r1.isSelected()) {
                gender = "male";

            } else if (r2.isSelected()) {
                gender = "female";
            }

            String city = (String) c1.getSelectedItem();

            String phone_no = t3.getText();
            String email_id = t4.getText();

            String id_card = (String) c2.getSelectedItem();

            String id_card_no = t5.getText();

            String room_no = (String) c3.getSelectedItem();

            String checked_in = t6.getText();
            String deposit = t7.getText();
            String address = t8.getText();
            String pin_code_no = t9.getText();

            if (name.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (age.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Age", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (email_id.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (id_card_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Id Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (checked_in.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Check In", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (deposit.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Room Deposit", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (address.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Address", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (pin_code_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Conn c = new Conn();

                    String str1 = "insert into new_customer_form values( '" + name + "', '" + age + "', '" + gender + "','" + city + "', '" + phone_no + "', '" + email_id + "','" + id_card + "', '" + id_card_no + "', '" + room_no + "', '" + checked_in + "', '" + deposit + "', '" + address + "', '" + pin_code_no + "')";
                    c.s.executeUpdate(str1);

                    String str2 = "update add_room set availability = 'Occupied' where room_no = '" + room_no + "'";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, "New Customer Added");
                    setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewCustomerForm();
    }
}
