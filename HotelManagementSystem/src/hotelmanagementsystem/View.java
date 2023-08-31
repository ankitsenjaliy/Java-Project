package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class View extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b1, b2;

    View() {

        JLabel l1 = new JLabel("ID CARD NUMNER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 50, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(280, 50, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("PHONE NUMNER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 100, 150, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(280, 100, 150, 30);
        add(t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/21.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(410, 30, 300, 200);
        add(l3);

        b1 = new JButton("SEARCH");
        b1.setBounds(80, 180, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCLE");
        b2.setBounds(270, 180, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(640, 200, 700, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String id_card_no = t1.getText();
            String phone_no = t2.getText();

            if (id_card_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Id Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();
                    String str = "select * from new_registration_form_1 where id_card_no = '" + id_card_no + "' and phone_no = '" + phone_no + "'";

                    ResultSet rs = c.s.executeQuery(str);

                    if (rs.next()) {

                        Details D = new Details(t1.getText());
                        this.setVisible(false);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Phone Number And Id Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new View();
    }
}
