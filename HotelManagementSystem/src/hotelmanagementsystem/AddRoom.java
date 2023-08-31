package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class AddRoom extends JFrame implements ActionListener {

    JTextField t1, t2;
    JComboBox c1, c2, c3, c4;
    JButton b1, b2;

    AddRoom() {

        JLabel l1 = new JLabel("ROOM NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 30, 150, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(280, 30, 150, 30);
        add(t1);

        JLabel l2 = new JLabel("AVAILABILITY");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 80, 150, 30);
        add(l2);

        String availability[] = {"Available", "Occupied"};
        c1 = new JComboBox(availability);
        c1.setBackground(Color.WHITE);
        c1.setBounds(280, 80, 150, 30);
        add(c1);

        JLabel l3 = new JLabel("BED TYPE");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 130, 150, 30);
        add(l3);

        String bed_type[] = {"Single Bed", "Double Bed"};
        c2 = new JComboBox(bed_type);
        c2.setBackground(Color.WHITE);
        c2.setBounds(280, 130, 150, 30);
        add(c2);

        JLabel l4 = new JLabel("ROOM TYPE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 180, 150, 30);
        add(l4);

        String room_type[] = {"AC Room", "Non AC Room"};
        c3 = new JComboBox(room_type);
        c3.setBackground(Color.WHITE);
        c3.setBounds(280, 180, 150, 30);
        add(c3);

        JLabel l5 = new JLabel("CLEANING STATUS");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 230, 150, 30);
        add(l5);

        String cleaned_status[] = {"Cleaned", "Dirty"};
        c4 = new JComboBox(cleaned_status);
        c4.setBackground(Color.WHITE);
        c4.setBounds(280, 230, 150, 30);
        add(c4);

        JLabel l6 = new JLabel("PRICE");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 280, 150, 30);
        add(l6);

        t2 = new JTextField();
        t2.setBounds(280, 280, 150, 30);
        add(t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/6.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(500, 50, 500, 400);
        add(l7);

        JLabel l8 = new JLabel("ADD ROOM DETAILS");
        l8.setFont(new Font("Tahoma", Font.BOLD, 30));
        l8.setForeground(Color.RED);
        l8.setBounds(600, 30, 450, 30);
        add(l8);

        b1 = new JButton("ADD ROOM");
        b1.setBounds(80, 350, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCLE");
        b2.setBounds(270, 350, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(480, 200, 1060, 480);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String room_no = t1.getText();

            String availability = (String) c1.getSelectedItem();
            String bed_type = (String) c2.getSelectedItem();
            String room_type = (String) c3.getSelectedItem();
            String cleaned_status = (String) c4.getSelectedItem();

            String price = t2.getText();

            if (room_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (price.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Room Price", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Conn c = new Conn();
                    String str = "insert into add_room values( '" + room_no + "', '" + availability + "', '" + bed_type + "','" + room_type + "', '" + cleaned_status + "', '" + price + "')";

                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "New Room Added");
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
        new AddRoom();
    }
}
