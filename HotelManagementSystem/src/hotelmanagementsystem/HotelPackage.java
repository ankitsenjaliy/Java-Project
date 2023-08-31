package hotelmanagementsystem;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.proteanit.sql.*;
import java.util.*;

class HotelPackage extends JFrame implements ActionListener {

    JTable t1;
    JComboBox c1, c2;
    JCheckBox c3;
    JButton b1, b2;

    HotelPackage() {

        JLabel l3 = new JLabel("BED TYPE");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(40, 40, 150, 30);
        add(l3);

        String bed_type[] = {"Single Bed", "Double Bed"};
        c1 = new JComboBox(bed_type);
        c1.setBackground(Color.WHITE);
        c1.setBounds(140, 40, 150, 30);
        add(c1);

        JLabel l4 = new JLabel("ROOM TYPE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(40, 90, 150, 30);
        add(l4);

        String room_type[] = {"AC Room", "Non AC Room"};
        c2 = new JComboBox(room_type);
        c2.setBackground(Color.WHITE);
        c2.setBounds(140, 90, 150, 30);
        add(c2);

        c3 = new JCheckBox("PLEASE CLICK ON THE CHECK BOX");
        c3.setFont(new Font("Tahoma", Font.BOLD, 14));
        c3.setBounds(750, 40, 280, 30);
        add(c3);

        b1 = new JButton("SEARCH");
        b1.setBounds(830, 100, 130, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        t1 = new JTable();
        t1.setBounds(0, 200, 1100, 500);
        add(t1);

        JLabel l5 = new JLabel("ROOM NUMBER");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(100, 170, 110, 30);
        add(l5);

        JLabel l6 = new JLabel("BED TYPE");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(400, 170, 110, 30);
        add(l6);

        JLabel l7 = new JLabel("ROOM TYPE");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(650, 170, 110, 30);
        add(l7);

        JLabel l8 = new JLabel("PRICE");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l8.setBounds(930, 170, 110, 30);
        add(l8);

        JLabel l9 = new JLabel("NOTE :- THIS IS FOR PRICE PER DAY");
        l9.setFont(new Font("Tahoma", Font.BOLD, 18));
        l9.setForeground(Color.BLUE);
        l9.setBounds(740, 720, 400, 30);
        add(l9);

        b2 = new JButton("OK");
        b2.setBounds(450, 720, 130, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        JLabel l10 = new JLabel("HOTEL PACKAGE");
        l10.setFont(new Font("Tahoma", Font.BOLD, 40));
        l10.setForeground(Color.BLUE);
        l10.setBounds(350, 30, 450, 40);
        add(l10);

        getContentPane().setBackground(Color.ORANGE);

        setLayout(null);
        setBounds(450, 150, 1100, 820);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {
                Conn c = new Conn();

                String str = "select room_no,bed_type,room_type,price from add_room where availability = 'Available' and bed_type = '" + c1.getSelectedItem() + "' and room_type = '" + c2.getSelectedItem() + "'";

                if (c3.isSelected()) {
                    ResultSet rs = c.s.executeQuery(str);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));
                } else {
                    JOptionPane.showMessageDialog(null, "Please Click On The Check Box", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {

            String ok = b2.getText();

            if (ok.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Then Press The Search Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
                Random AS = new Random();

                long customer_no = (AS.nextLong() % 900000L) + 100000L;
                long customer_id_no = Math.abs(customer_no);

                long pin_no = (AS.nextLong() % 90000L) + 10000L;
                long pin_id_no = Math.abs(pin_no);

                try {
                    Conn c = new Conn();

                    String str = "insert into new_registration_form values('" + customer_id_no + "','" + pin_id_no + "')";
                    c.s.executeUpdate(str);

                    JOptionPane.showMessageDialog(null, " Hotel Package " + "\n Customer Id No. = " + customer_id_no + "\n Pin Id No. = " + pin_id_no);
                    new NewRegistrationForm().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }

    }

    public static void main(String[] args) {
        new HotelPackage();
    }
}
