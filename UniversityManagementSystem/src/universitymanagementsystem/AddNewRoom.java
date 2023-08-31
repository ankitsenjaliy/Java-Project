package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewRoom extends JFrame implements ActionListener {

    JLabel l2, l3, l4, l5, l6, l7, l8, l9;
    JComboBox c1, c2, c3;
    JButton b1, b2, b3, b4;

    AddNewRoom() {

        JLabel l1 = new JLabel("HOSTEL NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 150, 300, 30);
        add(l1);

        String hostel_name[] = {"Boys Hostel", "Girls Hostel"};
        c1 = new JComboBox(hostel_name);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.BLUE);
        c1.setBounds(400, 150, 200, 30);
        add(c1);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 220, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 220, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(100, 300, 300, 30);
        add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(400, 300, 300, 30);
        add(l3);

        l4 = new JLabel("ROOM STATUS");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(100, 350, 300, 30);
        add(l4);

        l5 = new JLabel("Not Booked");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(400, 350, 300, 30);
        add(l5);

        l6 = new JLabel("CLEANING STATUS");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(100, 400, 300, 30);
        add(l6);

        String cleaning_status[] = {"Clean", "Dirty"};
        c2 = new JComboBox(cleaning_status);
        c2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.BLUE);
        c2.setBounds(400, 400, 200, 30);
        add(c2);

        l7 = new JLabel("ACTIVATE STATUS");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(100, 450, 300, 30);
        add(l7);

        String activate_status[] = {"Yes", "No"};
        c3 = new JComboBox(activate_status);
        c3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c3.setBackground(Color.WHITE);
        c3.setForeground(Color.RED);
        c3.setBounds(400, 450, 200, 30);
        add(c3);

        l8 = new JLabel("STUDENT STATUS");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(100, 500, 300, 30);
        add(l8);

        l9 = new JLabel("No");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(400, 500, 300, 30);
        add(l9);

        b3 = new JButton("SUBMIT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 580, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(400, 580, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        c2.setVisible(false);
        l7.setVisible(false);
        c3.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U15.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0, 0, 730, 700);
        add(l10);

        JLabel l11 = new JLabel("ADD NEW ROOM");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l11.setForeground(Color.GREEN);
        l11.setBounds(180, 20, 800, 50);
        l10.add(l11);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(730, 220, 730, 700);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String hostel_name = (String) c1.getSelectedItem();

            String room_no;

            try {

                Conn c = new Conn();

                if (hostel_name.equals("Boys Hostel")) {

                    int room_no_1 = 1;

                    String str1 = "select COUNT(*) from add_new_room where hostel_name = '" + hostel_name + "'";

                    ResultSet rs1 = c.s.executeQuery(str1);

                    rs1.next();

                    int room_number_1 = room_no_1 + rs1.getInt(1);

                    room_no = "B" + room_number_1;

                    l3.setText(room_no);

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    l5.setVisible(true);
                    l6.setVisible(true);
                    c2.setVisible(true);
                    l7.setVisible(true);
                    c3.setVisible(true);
                    l8.setVisible(true);
                    l9.setVisible(true);

                    b3.setVisible(true);
                    b4.setVisible(true);

                } else if (hostel_name.equals("Girls Hostel")) {

                    int room_no_2 = 1;

                    String str2 = "select COUNT(*) from add_new_room where hostel_name = '" + hostel_name + "'";

                    ResultSet rs2 = c.s.executeQuery(str2);

                    rs2.next();

                    int room_number_2 = room_no_2 + rs2.getInt(1);

                    room_no = "G" + room_number_2;

                    l3.setText(room_no);

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    l5.setVisible(true);
                    l6.setVisible(true);
                    c2.setVisible(true);
                    l7.setVisible(true);
                    c3.setVisible(true);
                    l8.setVisible(true);
                    l9.setVisible(true);

                    b3.setVisible(true);
                    b4.setVisible(true);

                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new RoomInformation1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String hostel_name = (String) c1.getSelectedItem();

            String room_no = l3.getText();

            String room_status = l5.getText();

            String cleaning_status = (String) c2.getSelectedItem();
            String activate_status = (String) c3.getSelectedItem();

            String student_status = l9.getText();

            try {

                Conn c = new Conn();

                int roomidno = 1;

                String str3 = "select COUNT(*) from add_new_room";

                ResultSet rs3 = c.s.executeQuery(str3);

                rs3.next();

                int room_id_no = roomidno + rs3.getInt(1);

                String str4 = "insert into add_new_room values('" + room_id_no + "','" + hostel_name + "','" + room_no + "','" + room_status + "', '" + cleaning_status + "','" + activate_status + "','" + student_status + "')";
                c.s.executeUpdate(str4);

                JOptionPane.showMessageDialog(null, "New Room Added" + "\n Room Id Number = " + room_id_no);

                new RoomInformation1().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);

            }
        } else if (ae.getSource() == b4) {

            new RoomInformation1().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new AddNewRoom();
    }

}
