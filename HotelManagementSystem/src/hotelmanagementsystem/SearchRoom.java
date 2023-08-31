package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class SearchRoom extends JFrame implements ActionListener {

    JTable t1;
    JComboBox c1, c2;
    JCheckBox c3;
    JButton b1, b2;

    SearchRoom() {

        t1 = new JTable();
        t1.setBounds(0, 180, 1200, 500);
        add(t1);

        JLabel l1 = new JLabel("BED TYPE");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(40, 50, 110, 30);
        add(l1);

        String bed_type[] = {"Single Bed", "Double Bed"};
        c1 = new JComboBox(bed_type);
        c1.setBackground(Color.WHITE);
        c1.setBounds(150, 50, 150, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM TYPE");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(40, 100, 110, 30);
        add(l2);

        String room_type[] = {"AC Room", "Non AC Room"};
        c2 = new JComboBox(room_type);
        c2.setBackground(Color.WHITE);
        c2.setBounds(150, 100, 150, 30);
        add(c2);

        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(60, 150, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("AVAILABILITY");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(260, 150, 120, 30);
        add(l4);

        JLabel l5 = new JLabel("BED TYPE");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(480, 150, 120, 30);
        add(l5);

        JLabel l6 = new JLabel("ROOM TYPE");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(670, 150, 120, 30);
        add(l6);

        JLabel l7 = new JLabel("CLEANING STATUS");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l7.setBounds(840, 150, 120, 30);
        add(l7);

        JLabel l8 = new JLabel("PRICE");
        l8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l8.setBounds(1070, 150, 120, 30);
        add(l8);

        c3 = new JCheckBox("ONLY DISPLAY AVAILABLE ROOM");
        c3.setFont(new Font("Tahoma", Font.BOLD, 14));
        c3.setBounds(900, 50, 270, 30);
        add(c3);

        JLabel l9 = new JLabel("SEARCH ROOM");
        l9.setFont(new Font("Tahoma", Font.BOLD, 40));
        l9.setForeground(Color.RED);
        l9.setBounds(450, 30, 450, 40);
        add(l9);

        b1 = new JButton("SUBMIT");
        b1.setBounds(400, 700, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(600, 700, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.YELLOW);

        setLayout(null);
        setBounds(400, 150, 1200, 800);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();

                String str1 = "select * from add_room where bed_type = '" + c1.getSelectedItem() + "' and room_type = '" + c2.getSelectedItem() + "'";

                String str2 = "select * from add_room where availability = 'Available' and bed_type = '" + c1.getSelectedItem() + "' and room_type = '" + c2.getSelectedItem() + "'";

                if (c3.isSelected()) {
                    ResultSet rs = c.s.executeQuery(str2);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));

                } else {
                    ResultSet rs = c.s.executeQuery(str1);
                    t1.setModel(DbUtils.resultSetToTableModel(rs));

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SearchRoom();
    }

}
