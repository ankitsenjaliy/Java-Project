package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddDriver extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    JRadioButton r1, r2;
    ButtonGroup G;
    JComboBox c1;
    JButton b1, b2;

    AddDriver() {

        JLabel l1 = new JLabel("NAME");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 30, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(280, 30, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("AGE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 80, 150, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(280, 80, 150, 30);
        add(t2);

        JLabel l3 = new JLabel("GENDER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 130, 150, 30);
        add(l3);

        ButtonGroup G = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        r1.setBounds(280, 130, 80, 30);
        r1.setBackground(Color.WHITE);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        r2.setBounds(360, 130, 80, 30);
        r2.setBackground(Color.WHITE);
        G.add(r2);
        add(r2);

        JLabel l4 = new JLabel("PHONE NUMBER");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 180, 150, 30);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(280, 180, 150, 30);
        add(t3);

        JLabel l5 = new JLabel("EMAIL - ID");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 230, 150, 30);
        add(l5);

        t4 = new JTextField();
        t4.setBounds(280, 230, 150, 30);
        add(t4);

        JLabel l6 = new JLabel("AADHAR CARD NUMBER");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 280, 180, 30);
        add(l6);

        t5 = new JTextField();
        t5.setBounds(280, 280, 150, 30);
        add(t5);

        JLabel l7 = new JLabel("CAR COMPANY");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 330, 150, 30);
        add(l7);

        t6 = new JTextField();
        t6.setBounds(280, 330, 150, 30);
        add(t6);

        JLabel l8 = new JLabel("CAR MODEL");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setBounds(60, 380, 150, 30);
        add(l8);

        t7 = new JTextField();
        t7.setBounds(280, 380, 150, 30);
        add(t7);

        JLabel l9 = new JLabel("AVAILABLE");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setBounds(60, 430, 150, 30);
        add(l9);

        String available[] = {"Available", "Busy"};
        c1 = new JComboBox(available);
        c1.setBackground(Color.WHITE);
        c1.setBounds(280, 430, 150, 30);
        add(c1);

        JLabel l10 = new JLabel("LOCATION");
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setBounds(60, 480, 150, 30);
        add(l10);

        t8 = new JTextField();
        t8.setBounds(280, 480, 150, 30);
        add(t8);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(500, 100, 500, 400);
        add(l11);

        JLabel l12 = new JLabel("ADD DRIVER DETAILS");
        l12.setFont(new Font("Tahoma", Font.BOLD, 30));
        l12.setForeground(Color.RED);
        l12.setBounds(600, 30, 450, 30);
        add(l12);

        b1 = new JButton("ADD DRIVER");
        b1.setBounds(80, 550, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCLE");
        b2.setBounds(300, 550, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(480, 200, 1060, 650);
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

            String phone_no = t3.getText();
            String email_id = t4.getText();
            String aadhar_card_no = t5.getText();
            String car_company = t6.getText();
            String car_model = t7.getText();

            String available = (String) c1.getSelectedItem();

            String location = t8.getText();

            if (name.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Driver Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (age.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Driver Age", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Driver Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (email_id.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Driver Email - Id", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (aadhar_card_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Driver Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (car_company.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Car Company", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (car_model.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Car Model", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (location.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Location", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Conn c = new Conn();
                    String str = "insert into add_driver values( '" + name + "', '" + age + "', '" + gender + "', '" + phone_no + "', '" + email_id + "', '" + aadhar_card_no + "','" + car_company + "', '" + car_model + "', '" + available + "', '" + location + "')";

                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "New Driver Added");
                    setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new AddDriver();
    }
}
