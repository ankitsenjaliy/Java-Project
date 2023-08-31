package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class NewRegistrationForm1 extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7;
    JRadioButton r1, r2;
    ButtonGroup G;
    JComboBox c1, c2, c3, c4, c5;
    JButton b1, b2;

    NewRegistrationForm1() {

        JLabel l1 = new JLabel("NAME");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 30, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(250, 30, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("AGE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 80, 150, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(250, 80, 150, 30);
        add(t2);

        JLabel l3 = new JLabel("GENDER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 130, 150, 30);
        add(l3);

        G = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        r1.setBounds(250, 130, 70, 30);
        r1.setBackground(Color.WHITE);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        r2.setBounds(330, 130, 80, 30);
        r2.setBackground(Color.WHITE);
        G.add(r2);
        add(r2);

        JLabel l4 = new JLabel("DATE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 180, 150, 30);
        add(l4);

        String date[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        c1.setBounds(120, 180, 80, 30);
        add(c1);

        JLabel l5 = new JLabel("MONTH");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(240, 180, 150, 30);
        add(l5);

        String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        c2 = new JComboBox(month);
        c2.setBackground(Color.WHITE);
        c2.setBounds(320, 180, 80, 30);
        add(c2);

        JLabel l6 = new JLabel("YEAR");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 230, 150, 30);
        add(l6);

        String year[] = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};
        c3 = new JComboBox(year);
        c3.setBackground(Color.WHITE);
        c3.setBounds(120, 230, 80, 30);
        add(c3);

        JLabel l7 = new JLabel("CITY");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 280, 150, 30);
        add(l7);

        String city[] = {"Ahmadabad", "Rajkot", "Surat", "Baroda", "Jamnagar", "Bhavnagar"};
        c4 = new JComboBox(city);
        c4.setBackground(Color.WHITE);
        c4.setBounds(250, 280, 150, 30);
        add(c4);

        JLabel l8 = new JLabel("PHONE NUMBER");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setBounds(60, 330, 150, 30);
        add(l8);

        t3 = new JTextField();
        t3.setBounds(250, 330, 150, 30);
        add(t3);

        JLabel l9 = new JLabel("EMAIL ID");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setBounds(60, 380, 150, 30);
        add(l9);

        t4 = new JTextField();
        t4.setBounds(250, 380, 150, 30);
        add(t4);

        JLabel l10 = new JLabel("ID CARD");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setBounds(60, 430, 150, 30);
        add(l10);

        String id_card[] = {"Aadhar Card", "Pan Card", "Driving License", "Voter-Id Card"};
        c5 = new JComboBox(id_card);
        c5.setBackground(Color.WHITE);
        c5.setBounds(250, 430, 150, 30);
        add(c5);

        JLabel l11 = new JLabel("ID CARD NUMBER");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l11.setBounds(60, 480, 150, 30);
        add(l11);

        t5 = new JTextField();
        t5.setBounds(250, 480, 150, 30);
        add(t5);

        JLabel l12 = new JLabel("ADDRESS");
        l12.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l12.setBounds(60, 530, 150, 30);
        add(l12);

        t6 = new JTextField();
        t6.setBounds(250, 530, 150, 30);
        add(t6);

        JLabel l13 = new JLabel("PIN CODE NUMBER");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l13.setBounds(60, 580, 150, 30);
        add(l13);

        t7 = new JTextField();
        t7.setBounds(250, 580, 150, 30);
        add(t7);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tenth.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l14 = new JLabel(i3);
//        l14.setBounds(410, 80, 480, 410);
//        add(l14);

        JLabel l15 = new JLabel("WEL COME");
        l15.setFont(new Font("Tahoma", Font.BOLD, 40));
        l15.setForeground(Color.RED);
        l15.setBounds(600, 30, 450, 60);
        add(l15);

        b1 = new JButton("CANCLE");
        b1.setBounds(80, 650, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("NEXT");
        b2.setBounds(270, 650, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(500, 200, 1000, 750);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            System.exit(0);
            
        } else if (ae.getSource() == b2) {

            String name = t1.getText();
            String age = t2.getText();

            String gender = null;

            if (r1.isSelected()) {
                gender = "male";

            } else if (r2.isSelected()) {
                gender = "female";
            }

            String date = (String) c1.getSelectedItem();
            String month = (String) c2.getSelectedItem();
            String year = (String) c3.getSelectedItem();
            String city = (String) c4.getSelectedItem();

            String phone_no = t3.getText();
            String email_id = t4.getText();

            String id_card = (String) c5.getSelectedItem();

            String id_card_no = t5.getText();
            String address = t6.getText();
            String pin_code_no = t7.getText();

            if (name.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (age.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Age", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (email_id.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (id_card_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Id Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (address.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Address", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (pin_code_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Conn c = new Conn();

                    String str1 = "insert into new_registration_form_1 values( '" + name + "', '" + age + "', '" + gender + "','" + date + "','" + month + "','" + year + "','" + city + "', '" + phone_no + "', '" + email_id + "', '" + id_card + "', '" + id_card_no + "','" + address + "', '" + pin_code_no + "')";
                    c.s.executeUpdate(str1);

                    new NewRegistrationForm2().setVisible(true);
                    setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }
    }

    public static void main(String[] args) {
        new NewRegistrationForm1();
    }
}
