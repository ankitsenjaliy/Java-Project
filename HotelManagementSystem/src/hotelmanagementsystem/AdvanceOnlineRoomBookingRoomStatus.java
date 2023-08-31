package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AdvanceOnlineRoomBookingRoomStatus extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    Choice c1;
    JButton b1, b2, b3;

    AdvanceOnlineRoomBookingRoomStatus() {

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
        c1.setBounds(280, 50, 150, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 100, 150, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(280, 100, 150, 30);
        add(t1);

        JLabel l3 = new JLabel("NAME");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 150, 150, 30);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(280, 150, 150, 30);
        add(t2);

        JLabel l4 = new JLabel("ID CARD");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 200, 150, 30);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(280, 200, 150, 30);
        add(t3);

        JLabel l5 = new JLabel("BED TYPE");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 250, 150, 30);
        add(l5);

        t4 = new JTextField();
        t4.setBounds(280, 250, 150, 30);
        add(t4);

        JLabel l6 = new JLabel("ROOM TYPE");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 300, 150, 30);
        add(l6);

        t5 = new JTextField();
        t5.setBounds(280, 300, 150, 30);
        add(t5);

        JLabel l7 = new JLabel("AVAILABILITY");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 350, 150, 30);
        add(l7);

        t6 = new JTextField();
        t6.setBounds(280, 350, 150, 30);
        add(t6);

        JLabel l8 = new JLabel("CLEANING STATUS");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setBounds(60, 400, 150, 30);
        add(l8);

        t7 = new JTextField();
        t7.setBounds(280, 400, 150, 30);
        add(t7);

        JLabel l9 = new JLabel("PRICE");
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setBounds(60, 450, 150, 30);
        add(l9);

        t8 = new JTextField();
        t8.setBounds(280, 450, 150, 30);
        add(t8);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/11.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(500, 50, 500, 400);
        add(l10);

        JLabel l11 = new JLabel("ONLINE ROOM BOOKING");
        l11.setFont(new Font("Tahoma", Font.BOLD, 30));
        l11.setForeground(Color.RED);
        l11.setBounds(560, 30, 450, 30);
        add(l11);

        b1 = new JButton("CHECK");
        b1.setBounds(200, 520, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UPDATE");
        b2.setBounds(100, 580, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("CANCLE");
        b3.setBounds(300, 580, 130, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.PINK);

        setLayout(null);
        setBounds(460, 200, 1060, 680);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String room_no = null;
            String id_card_no = c1.getSelectedItem();

            try {
                Conn c = new Conn();

                String str1 = "select * from new_registration_form_2 where id_card_no = '" + id_card_no + "' ";
                ResultSet rs1 = c.s.executeQuery(str1);
                while (rs1.next()) {

                    t1.setText(rs1.getString("room_no"));
                    room_no = rs1.getString("room_no");

                }

                String str2 = "select * from new_registration_form_1 where id_card_no = '" + id_card_no + "' ";
                ResultSet rs2 = c.s.executeQuery(str2);
                while (rs2.next()) {

                    t2.setText(rs2.getString("name"));
                    t3.setText(rs2.getString("id_card"));
                }

                String str3 = "select * from add_room where room_no = '" + room_no + "'";
                ResultSet rs3 = c.s.executeQuery(str3);
                while (rs3.next()) {

                    t4.setText(rs3.getString("bed_type"));
                    t5.setText(rs3.getString("room_type"));
                    t6.setText(rs3.getString("availability"));
                    t7.setText(rs3.getString("cleaned_status"));
                    t8.setText(rs3.getString("price"));

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {

            String id_card_no = c1.getSelectedItem();

            String room_no = t1.getText();
            String name = t2.getText();
            String id_card = t3.getText();
            String bed_type = t4.getText();
            String room_type = t5.getText();
            String availability = t6.getText();
            String cleaned_status = t7.getText();
            String price = t8.getText();

            if (room_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (name.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (id_card.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (bed_type.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (room_type.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (price.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str1 = "update new_registration_form_1 set name = '" + name + "' where id_card_no = '" + id_card_no + "'";
                    c.s.executeUpdate(str1);

                    String str2 = "update add_room set bed_type = '" + bed_type + "', room_type = '" + room_type + "', availability = '" + availability + "', cleaned_status = '" + cleaned_status + "', price = '" + price + "' where room_no = '" + room_no + "'";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, "Updated SuccessFully");
                    new Reception().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == b3) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new AdvanceOnlineRoomBookingRoomStatus();
    }
}
