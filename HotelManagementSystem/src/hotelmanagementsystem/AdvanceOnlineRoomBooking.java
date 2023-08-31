package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AdvanceOnlineRoomBooking extends JFrame implements ActionListener {

    JLabel l4, l6, l8, l10, l12, l14;
    JTextField t1, t2;
    Choice c1;
    JButton b1, b2, b3;

    AdvanceOnlineRoomBooking() {

        JLabel l1 = new JLabel("ID CARD NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 50, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(280, 50, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("PHONE NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 100, 150, 30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(280, 100, 150, 30);
        add(t2);

        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 150, 150, 30);
        add(l3);

        l4 = new JLabel();
        l4.setBounds(280, 150, 150, 30);
        add(l4);

        JLabel l5 = new JLabel("NAME");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 200, 150, 30);
        add(l5);

        l6 = new JLabel();
        l6.setBounds(280, 200, 150, 30);
        add(l6);

        JLabel l7 = new JLabel("ID CARD");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 250, 150, 30);
        add(l7);

        l8 = new JLabel();
        l8.setBounds(280, 250, 150, 30);
        add(l8);

        JLabel l9 = new JLabel("BED TYPE");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setBounds(60, 300, 150, 30);
        add(l9);

        l10 = new JLabel();
        l10.setBounds(280, 300, 150, 30);
        add(l10);

        JLabel l11 = new JLabel("ROOM TYPE");
        l11.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l11.setBounds(60, 350, 150, 30);
        add(l11);

        l12 = new JLabel();
        l12.setBounds(280, 350, 150, 30);
        add(l12);

        JLabel l13 = new JLabel("PRICE");
        l13.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l13.setBounds(60, 400, 150, 30);
        add(l13);

        l14 = new JLabel();
        l14.setBounds(280, 400, 150, 30);
        add(l14);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/Login.png"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l15 = new JLabel(i3);
        l15.setBounds(500, 50, 500, 400);
        add(l15);

        JLabel l16 = new JLabel("ONLINE ROOM BOOKING");
        l16.setFont(new Font("Tahoma", Font.BOLD, 30));
        l16.setForeground(Color.RED);
        l16.setBounds(560, 30, 450, 30);
        add(l16);

        b1 = new JButton("CHECK");
        b1.setBounds(200, 460, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("ROOM BOOKED");
        b2.setBounds(100, 510, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("CANCLE");
        b3.setBounds(300, 510, 130, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(460, 200, 1100, 600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String room_no = null;
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

                        String str1 = "select * from new_registration_form_2 where id_card_no = '" + id_card_no + "' ";
                        ResultSet rs1 = c.s.executeQuery(str1);

                        while (rs1.next()) {

                            l4.setText(rs1.getString("room_no"));
                            room_no = rs1.getString("room_no");

                        }

                        String str2 = "select * from new_registration_form_1 where id_card_no = '" + id_card_no + "' ";
                        ResultSet rs2 = c.s.executeQuery(str2);

                        while (rs2.next()) {

                             l6.setText(rs2.getString("name"));
                             l8.setText(rs2.getString("id_card"));
                        }

                        String str3 = "select * from add_room where room_no = '" + room_no + "'";
                        ResultSet rs3 = c.s.executeQuery(str3);

                        while (rs3.next()) {

                            l10.setText(rs3.getString("bed_type"));
                            l12.setText(rs3.getString("room_type"));
                            l14.setText(rs3.getString("price"));

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Phone Number And Id Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            String id_card_no = t1.getText();
            String phone_no = t2.getText();

            String room_no = l4.getText();

            if (id_card_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (phone_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str = "select * from new_registration_form_1 where id_card_no = '" + id_card_no + "' and phone_no = '" + phone_no + "'";
                    ResultSet rs = c.s.executeQuery(str);

                    if (rs.next()) {

                        String str1 = "update add_room set availability = 'Occupied' where room_no = '" + room_no + "'";
                        c.s.executeUpdate(str1);

                        JOptionPane.showMessageDialog(null, "Room Booking SuccessFully");
                        new Payment().setVisible(true);
                        this.setVisible(false);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Phone Number And Id Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == b3) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new AdvanceOnlineRoomBooking();
    }
}
