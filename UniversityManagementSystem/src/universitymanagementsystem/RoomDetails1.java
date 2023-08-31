package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class RoomDetails1 extends JFrame implements ActionListener {

    JTable t;
    JComboBox c1, c2;
    JButton b1, b2;

    RoomDetails1() {

        t = new JTable();
        t.setBounds(0, 180, 1300, 580);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        JLabel l1 = new JLabel("HOSTEL NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(50, 50, 300, 30);
        add(l1);

        String hostel_name[] = {"Boys Hostel", "Girls Hostel"};
        c1 = new JComboBox(hostel_name);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(280, 50, 200, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM STATUS");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(50, 100, 300, 30);
        add(l2);

        String room_status[] = {"Booked", "Not Booked"};
        c2 = new JComboBox(room_status);
        c2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.RED);
        c2.setBounds(280, 100, 200, 30);
        add(c2);

        JLabel l3 = new JLabel("HOSTEL NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(100, 150, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("ROOM NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(400, 150, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("ROOM STATUS");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(740, 150, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("STUDENT STATUS");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(1030, 150, 300, 30);
        add(l6);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(420, 780, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 780, 150, 40);
        b2.addActionListener(this);
        add(b2);

        JLabel l7 = new JLabel("ROOM DETAILS");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l7.setForeground(Color.BLUE);
        l7.setBounds(500, 20, 800, 50);
        add(l7);

        getContentPane().setBackground(Color.CYAN);

        setLayout(null);
        setBounds(460, 130, 1300, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {

                Conn c = new Conn();

                String str1 = "select hostel_name,room_no,room_status,student_status from add_new_room where hostel_name = '" + c1.getSelectedItem() + "' and room_status = '" + c2.getSelectedItem() + "'";

                ResultSet rs1 = c.s.executeQuery(str1);
                t.setModel(DbUtils.resultSetToTableModel(rs1));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new RoomInformation1().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new RoomDetails1();
    }

}
