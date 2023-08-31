package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentLeaveApplication extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JTextField t1, t2;
    JComboBox C1, c1;
    JButton b1, b2, b3, b4;

    StudentLeaveApplication() {

        JLabel l1 = new JLabel("ROOM ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_student_hostel";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("room_id_no"));
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
        l2.setForeground(Color.YELLOW);
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
        b1.setBounds(150, 230, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 230, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("HOSTEL NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.GREEN);
        l3.setBounds(100, 300, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(400, 300, 300, 30);
        add(l4);

        l5 = new JLabel("STUDENT NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.GREEN);
        l5.setBounds(700, 100, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(1000, 100, 600, 30);
        add(l6);

        l7 = new JLabel("GENDER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.GREEN);
        l7.setBounds(700, 150, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(1000, 150, 300, 30);
        add(l8);

        l9 = new JLabel("PHONE NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.GREEN);
        l9.setBounds(700, 200, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(1000, 200, 300, 30);
        add(l10);

        l11 = new JLabel("REASON");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.GREEN);
        l11.setBounds(700, 250, 300, 30);
        add(l11);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(1000, 250, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l12 = new JLabel("LEAVE STATUS");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.GREEN);
        l12.setBounds(700, 300, 300, 30);
        add(l12);

        String leave_status[] = {"Yes", "No"};
        c1 = new JComboBox(leave_status);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(1000, 300, 200, 30);
        add(c1);

        b3 = new JButton("SUBMIT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400, 380, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(700, 380, 150, 40);
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
        t2.setVisible(false);
        l12.setVisible(false);
        c1.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/H5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l13 = new JLabel(i3);
        l13.setBounds(0, 0, 1300, 500);
        add(l13);

        JLabel l14 = new JLabel("STUDENT LEAVE APPLICATION");
        l14.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l14.setForeground(Color.CYAN);
        l14.setBounds(350, 20, 800, 50);
        l13.add(l14);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(460, 330, 1300, 500);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String room_id_no = (String) C1.getSelectedItem();

            String room_no = t1.getText();

            if (room_no.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "select * from add_new_student_hostel where room_id_no = '" + room_id_no + "' and room_no = '" + room_no + "'";

                    ResultSet rs2 = c.s.executeQuery(str2);

                    if (rs2.next()) {

                        l3.setVisible(true);
                        l4.setVisible(true);
                        l5.setVisible(true);
                        l6.setVisible(true);
                        l7.setVisible(true);
                        l8.setVisible(true);
                        l9.setVisible(true);
                        l10.setVisible(true);
                        l11.setVisible(true);
                        t2.setVisible(true);
                        l12.setVisible(true);
                        c1.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String hostel_name = rs2.getString("hostel_name");
                        String student_name = rs2.getString("student_name");
                        String gender = rs2.getString("gender");
                        String phone_no = rs2.getString("phone_no");

                        l4.setText(hostel_name);
                        l6.setText(student_name);
                        l8.setText(gender);
                        l10.setText(phone_no);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {

                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new StudentLeaveInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String room_id_no = (String) C1.getSelectedItem();

            String room_no = t1.getText();

            String hostel_name = l4.getText();
            String student_name = l6.getText();
            String gender = l8.getText();
            String phone_no = l10.getText();
            String reason = t2.getText();

            String leave_status = (String) c1.getSelectedItem();

            if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Reason", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                if (leave_status.equals("Yes")) {

                    try {

                        Conn c = new Conn();

                        String str3 = "insert into student_leave_application values('" + room_id_no + "','" + room_no + "','" + hostel_name + "','" + student_name + "','" + gender + "','" + phone_no + "','" + reason + "','" + leave_status + "')";
                        c.s.executeUpdate(str3);

                        String str4 = "update add_new_room set student_status = 'No' where room_id_no = '" + room_id_no + "' and room_no = '" + room_no + "'";
                        c.s.executeUpdate(str4);

                        JOptionPane.showMessageDialog(null, "Student Leave Application Added");

                        new StudentLeaveInformation().setVisible(true);
                        this.setVisible(false);

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else if (leave_status.equals("No")) {

                    try {

                        Conn c = new Conn();

                        String str5 = "update add_new_room set student_status = 'Yes' where room_id_no = '" + room_id_no + "' and room_no = '" + room_no + "'";
                        c.s.executeUpdate(str5);

                        String str6 = "delete from student_leave_application where room_id_no = '" + room_id_no + "' and room_no = '" + room_no + "'";
                        c.s.executeUpdate(str6);

                        JOptionPane.showMessageDialog(null, "Student Leave Application Delete");

                        new StudentLeaveInformation().setVisible(true);
                        this.setVisible(false);

                    } catch (Exception e) {

                        System.out.println(e);
                    }
                }

            }

        } else if (ae.getSource() == b4) {

            new StudentLeaveInformation().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {

        new StudentLeaveApplication();
    }

}
