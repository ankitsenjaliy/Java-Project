package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ChangeRoomDetails extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17;
    JTextField t1;
    JComboBox C1, C2;
    JButton B1, B2, b1, b2, b3, b4;

    ChangeRoomDetails() {

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.GREEN);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_student_hostel";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("enrollment_id_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(400, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 150, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(400, 150, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != 'B') && (caracter != 'G')
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only B,G Alphabet Keys Allowed And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 220, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UPDATE");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 220, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("COURSE NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(100, 300, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(400, 300, 600, 30);
        add(l4);

        l5 = new JLabel("HOSTEL NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(100, 350, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(400, 350, 600, 30);
        add(l6);

        l7 = new JLabel("ROLL NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.CYAN);
        l7.setBounds(800, 100, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(1100, 100, 300, 30);
        add(l8);

        l9 = new JLabel("STUDENT NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(800, 150, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(1100, 150, 600, 30);
        add(l10);

        l11 = new JLabel("FATHER NAME");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.CYAN);
        l11.setBounds(800, 200, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.YELLOW);
        l12.setBounds(1100, 200, 600, 30);
        add(l12);

        l13 = new JLabel("GENDER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.CYAN);
        l13.setBounds(800, 250, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.YELLOW);
        l14.setBounds(1100, 250, 300, 30);
        add(l14);

        l15 = new JLabel("NEW ROOM NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.CYAN);
        l15.setBounds(800, 300, 300, 30);
        add(l15);

        C2 = new JComboBox();

        try {
            Conn c = new Conn();

            String str2 = "select * from add_new_room where room_status = 'Not Booked' and student_status = 'No'";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                C2.addItem(rs2.getString("room_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C2.setBackground(Color.WHITE);
        C2.setForeground(Color.RED);
        C2.setBounds(1100, 300, 200, 30);
        add(C2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U17.jpg"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        B1 = new JButton(i3);
        B1.setBounds(1310, 300, 30, 30);
        B1.addActionListener(this);
        add(B1);

        l16 = new JLabel("ROOM ID NUMBER");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.CYAN);
        l16.setBounds(800, 350, 300, 30);
        add(l16);

        l17 = new JLabel();
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.YELLOW);
        l17.setBounds(1100, 350, 300, 30);
        add(l17);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U19.jpg"));
        Image i5 = i4.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        B2 = new JButton(i6);
        B2.setBounds(1310, 350, 30, 30);
        B2.addActionListener(this);
        add(B2);

        b3 = new JButton("CHANGE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400, 420, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(700, 420, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false);
        l10.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        l13.setVisible(false);
        l14.setVisible(false);
        l15.setVisible(false);
        C2.setVisible(false);
        B1.setVisible(false);
        l16.setVisible(false);
        l17.setVisible(false);
        B2.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U14.jpg"));
        Image i8 = i7.getImage().getScaledInstance(1400, 540, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l18 = new JLabel(i9);
        l18.setBounds(0, 0, 1400, 540);
        add(l18);

        JLabel l19 = new JLabel("CHANGE ROOM DETAILS");
        l19.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l19.setForeground(Color.MAGENTA);
        l19.setBounds(450, 20, 800, 50);
        l18.add(l19);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 300, 1400, 540);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String room_no = t1.getText();

            if (room_no.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Current Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str3 = "select * from add_new_student_hostel where enrollment_id_no = '" + enrollment_id_no + "' and room_no = '" + room_no + "'";

                    ResultSet rs3 = c.s.executeQuery(str3);

                    if (rs3.next()) {

                        l3.setVisible(true);
                        l4.setVisible(true);
                        l5.setVisible(true);
                        l6.setVisible(true);
                        l7.setVisible(true);
                        l8.setVisible(true);
                        l9.setVisible(true);
                        l10.setVisible(true);
                        l11.setVisible(true);
                        l12.setVisible(true);
                        l13.setVisible(true);
                        l14.setVisible(true);
                        l15.setVisible(true);
                        C2.setVisible(true);
                        B1.setVisible(true);
                        l16.setVisible(true);
                        l17.setVisible(true);
                        B2.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String course_name = rs3.getString("course_name");
                        String hostel_name = rs3.getString("hostel_name");
                        String roll_no = rs3.getString("roll_no");
                        String student_name = rs3.getString("student_name");
                        String father_name = rs3.getString("father_name");
                        String gender = rs3.getString("gender");

                        l4.setText(course_name);
                        l6.setText(hostel_name);
                        l8.setText(roll_no);
                        l10.setText(student_name);
                        l12.setText(father_name);
                        l14.setText(gender);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {

                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            String room_no = t1.getText();

            if (room_no.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Current Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str4 = "update add_new_room set room_status = 'Not Booked', student_status = 'No' where room_no = '" + room_no + "'";
                    c.s.executeUpdate(str4);

                    JOptionPane.showMessageDialog(null, "Updated SuccessFully");

                } catch (Exception e) {

                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == B1) {

            String hostel_name = l6.getText();

            String room_no = (String) C2.getSelectedItem();

            try {

                Conn c = new Conn();

                String str5 = "select * from add_new_room where room_no = '" + room_no + "' and hostel_name = '" + hostel_name + "'";

                ResultSet rs5 = c.s.executeQuery(str5);

                while (rs5.next()) {

                    String room_id_no = rs5.getString("room_id_no");

                    l17.setText(room_id_no);

                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == B2) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String room_id_no = l17.getText();

            try {

                Conn c = new Conn();

                String str6 = "update add_new_student_hostel set room_id_no = '" + room_id_no + "' where enrollment_id_no = '" + enrollment_id_no + "'";

                c.s.executeUpdate(str6);

                JOptionPane.showMessageDialog(null, "Updated SuccessFully");

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b3) {

            String room_no = (String) C2.getSelectedItem();

            String room_id_no = l17.getText();

            try {

                Conn c = new Conn();

                String str7 = "update add_new_student_hostel set room_no = '" + room_no + "' where room_id_no = '" + room_id_no + "'";
                c.s.executeUpdate(str7);

                String str8 = "update add_new_room set room_status = 'Booked', student_status = 'Yes' where room_id_no = '" + room_id_no + "'";
                c.s.executeUpdate(str8);

                JOptionPane.showMessageDialog(null, "Room Change SuccessFully");

                new RoomInformation1().setVisible(true);
                this.setVisible(false);

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

        new ChangeRoomDetails();
    }

}
