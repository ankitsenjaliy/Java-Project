package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import net.proteanit.sql.*;

public class RoomInformation extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;
    

    RoomInformation() {

        t1 = new JTable();
        t1.setBounds(0, 110, 1000, 550);
        add(t1);

        JLabel l1 = new JLabel("ROOM NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l1.setBounds(40, 80, 110, 30);
        add(l1);

        JLabel l2 = new JLabel("AVAILABILITY");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l2.setBounds(210, 80, 110, 30);
        add(l2);

        JLabel l3 = new JLabel("BED TYPE");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l3.setBounds(390, 80, 110, 30);
        add(l3);

        JLabel l4 = new JLabel("ROOM TYPE");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l4.setBounds(550, 80, 110, 30);
        add(l4);

        JLabel l5 = new JLabel("CLEANING STATUS");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l5.setBounds(690, 80, 120, 30);
        add(l5);

        JLabel l6 = new JLabel("PRICE");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        l6.setBounds(880, 80, 110, 30);
        add(l6);

        JLabel l11 = new JLabel("ROOM INFORMATION");
        l11.setFont(new Font("Tahoma", Font.BOLD, 30));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(350, 20, 740, 30);
        add(l11);

        b1 = new JButton("LOAD DATA");
        b1.setBounds(330, 680, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(500, 680, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.RED);

        setLayout(null);
        setBounds(500, 150, 1000, 780);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();
                String str = "select * from add_room";
                ResultSet rs = c.s.executeQuery(str);

                t1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new RoomInformation();
    }

}
