package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class RoomDetails2 extends JFrame implements ActionListener {

    JTable t;
    JComboBox c1, c2;
    ButtonGroup G1, G2, G3;
    JRadioButton r1, r2, r3, r4, r5, r6;
    JButton b1, b2, b3, b4, b5;

    RoomDetails2() {

        t = new JTable();
        t.setBounds(0, 200, 1500, 560);
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
        l1.setBounds(50, 60, 300, 30);
        add(l1);

        String hostel_name[] = {"Boys Hostel", "Girls Hostel"};
        c1 = new JComboBox(hostel_name);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(280, 60, 200, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM STATUS");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(50, 110, 300, 30);
        add(l2);

        String room_status[] = {"Booked", "Not Booked"};
        c2 = new JComboBox(room_status);
        c2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.RED);
        c2.setBounds(280, 110, 200, 30);
        add(c2);

        G1 = new ButtonGroup();

        r1 = new JRadioButton("CLEAN");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r1.setBackground(Color.YELLOW);
        r1.setForeground(Color.BLACK);
        r1.setBounds(700, 90, 100, 30);
        G1.add(r1);
        add(r1);

        r2 = new JRadioButton("DIRTY");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r2.setBackground(Color.YELLOW);
        r2.setForeground(Color.BLACK);
        r2.setBounds(700, 130, 100, 30);
        G1.add(r2);
        add(r2);

        G2 = new ButtonGroup();

        r3 = new JRadioButton("YES");
        r3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r3.setBackground(Color.YELLOW);
        r3.setForeground(Color.BLACK);
        r3.setBounds(1000, 90, 100, 30);
        G2.add(r3);
        add(r3);

        r4 = new JRadioButton("NO");
        r4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r4.setBackground(Color.YELLOW);
        r4.setForeground(Color.BLACK);
        r4.setBounds(1000, 130, 100, 30);
        G2.add(r4);
        add(r4);

        G3 = new ButtonGroup();

        r5 = new JRadioButton("YES");
        r5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r5.setBackground(Color.YELLOW);
        r5.setForeground(Color.BLACK);
        r5.setBounds(1300, 90, 100, 30);
        G3.add(r5);
        add(r5);

        r6 = new JRadioButton("NO");
        r6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r6.setBackground(Color.YELLOW);
        r6.setForeground(Color.BLACK);
        r6.setBounds(1300, 130, 100, 30);
        G3.add(r6);
        add(r6);

        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(70, 170, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("ROOM STATUS");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(370, 170, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("CLEANING STATUS");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(650, 170, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("ACTIVATE STATUS");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(950, 170, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("STUDENT STATUS");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.RED);
        l7.setBounds(1240, 170, 300, 30);
        add(l7);

        b1 = new JButton("ROOM STATUS");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50, 780, 250, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CLEANING STATUS");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350, 780, 250, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("ACTIVATE STATUS");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(650, 780, 250, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("STUDENT STATUS");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(950, 780, 250, 40);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("BACK");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(1250, 780, 150, 40);
        b5.addActionListener(this);
        add(b5);

        JLabel l8 = new JLabel("ROOM DETAILS");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l8.setForeground(Color.BLUE);
        l8.setBounds(600, 20, 800, 50);
        add(l8);

        getContentPane().setBackground(Color.YELLOW);

        setLayout(null);
        setBounds(360, 130, 1500, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {

                Conn c = new Conn();

                String str1 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where hostel_name = '" + c1.getSelectedItem() + "' and room_status = '" + c2.getSelectedItem() + "'";

                ResultSet rs1 = c.s.executeQuery(str1);
                t.setModel(DbUtils.resultSetToTableModel(rs1));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            try {

                Conn c = new Conn();

                String str2 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where cleaning_status = 'Clean' and hostel_name = '" + c1.getSelectedItem() + "'";

                String str3 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where cleaning_status = 'Dirty' and hostel_name = '" + c1.getSelectedItem() + "'";

                if (r1.isSelected()) {

                    ResultSet rs2 = c.s.executeQuery(str2);
                    t.setModel(DbUtils.resultSetToTableModel(rs2));

                } else if (r2.isSelected()) {

                    ResultSet rs3 = c.s.executeQuery(str3);
                    t.setModel(DbUtils.resultSetToTableModel(rs3));
                }

            } catch (Exception e) {

                System.out.println(e);

            }

        } else if (ae.getSource() == b3) {

            try {

                Conn c = new Conn();

                String str4 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where activate_status = 'Yes' and hostel_name = '" + c1.getSelectedItem() + "'";

                String str5 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where activate_status = 'No' and hostel_name = '" + c1.getSelectedItem() + "'";

                if (r3.isSelected()) {

                    ResultSet rs4 = c.s.executeQuery(str4);
                    t.setModel(DbUtils.resultSetToTableModel(rs4));

                } else if (r4.isSelected()) {

                    ResultSet rs5 = c.s.executeQuery(str5);
                    t.setModel(DbUtils.resultSetToTableModel(rs5));
                }

            } catch (Exception e) {

                System.out.println();
            }

        } else if (ae.getSource() == b4) {

            try {

                Conn c = new Conn();

                String str6 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where student_status = 'Yes' and hostel_name = '" + c1.getSelectedItem() + "'";

                String str7 = "select room_no,room_status,cleaning_status,activate_status,student_status from add_new_room where student_status = 'No' and hostel_name = '" + c1.getSelectedItem() + "'";

                if (r5.isSelected()) {

                    ResultSet rs6 = c.s.executeQuery(str6);
                    t.setModel(DbUtils.resultSetToTableModel(rs6));

                } else if (r6.isSelected()) {

                    ResultSet rs7 = c.s.executeQuery(str7);
                    t.setModel(DbUtils.resultSetToTableModel(rs7));
                }

            } catch (Exception e) {

                System.out.println();
            }

        }else if(ae.getSource() == b5){
            
            new RoomInformation2().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new RoomDetails2();
    }

}
