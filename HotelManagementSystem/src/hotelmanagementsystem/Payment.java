package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Payment extends JFrame implements ActionListener {

    Choice c1;
    JTextField t1, t2;
    JButton b1, b2, b3;

    Payment() {

        JLabel l1 = new JLabel("ID CARD NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 50, 150, 30);
        add(l1);

        c1 = new Choice();
        try {

            Conn c = new Conn();
            String str = "select * from new_registration_form_2";
            ResultSet rs = c.s.executeQuery(str);
            while (rs.next()) {
                c1.add(rs.getString("id_card_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        c1.setBounds(250, 50, 150, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 100, 150, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(250, 100, 150, 30);
        add(t1);

        JLabel l3 = new JLabel("ADVANCE DEPOSIT");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 150, 150, 30);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(250, 150, 150, 30);
        add(t2);

        b1 = new JButton("CHECK");
        b1.setBounds(200, 280, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("PAYMENT");
        b2.setBounds(100, 330, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("CANCLE");
        b3.setBounds(300, 330, 130, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.GREEN);

        setLayout(null);
        setBounds(500, 200, 1000, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String id_card_no = c1.getSelectedItem();

            try {
                Conn c = new Conn();

                String str = "select * from new_registration_form_2 where id_card_no = '" + id_card_no + "' ";
                ResultSet rs = c.s.executeQuery(str);
                while (rs.next()) {
                    t1.setText(rs.getString("room_no"));
                    t2.setText(rs.getString("deposit"));
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        } else if (ae.getSource() == b2) {

            String room_no = t1.getText();
            String deposit = t2.getText();

            if (room_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (deposit.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    JOptionPane.showMessageDialog(null, "Payment SuccessFully");
                    new Reception().setVisible(true);
                    setVisible(false);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b3) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Payment();
    }

}
