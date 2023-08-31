package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class HostelStudentDeleteDetails extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    JTextField t1;
    JComboBox c1;
    JButton b1, b2, b3, b4;

    HostelStudentDeleteDetails() {

        JLabel l1 = new JLabel("HOSTEL NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(60, 100, 300, 30);
        add(l1);

        String current_semester[] = {"Boys Hostel", "Girls Hostel"};
        c1 = new JComboBox(current_semester);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.BLUE);
        c1.setBounds(300, 100, 200, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(60, 150, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(300, 150, 200, 30);
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
        b1.setBounds(80, 220, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 220, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(60, 300, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(380, 300, 300, 30);
        add(l4);

        l5 = new JLabel("ROLL NUMBER");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(600, 100, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.BLUE);
        l6.setBounds(850, 100, 300, 30);
        add(l6);

        l7 = new JLabel("STUDENT NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.BLUE);
        l7.setBounds(600, 150, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.RED);
        l8.setBounds(850, 150, 600, 30);
        add(l8);

        l9 = new JLabel("FATHER NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.RED);
        l9.setBounds(600, 200, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.BLUE);
        l10.setBounds(850, 200, 600, 30);
        add(l10);

        l11 = new JLabel("GENDER");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.BLUE);
        l11.setBounds(600, 250, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.RED);
        l12.setBounds(850, 250, 600, 30);
        add(l12);

        l13 = new JLabel("PHONE NUMBER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.RED);
        l13.setBounds(600, 300, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.BLUE);
        l14.setBounds(850, 300, 300, 30);
        add(l14);

        b3 = new JButton("DELETE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(350, 380, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(650, 380, 150, 40);
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

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l15 = new JLabel(i3);
        l15.setBounds(0, 0, 1150, 500);
        add(l15);

        JLabel l16 = new JLabel("DELETE STUDENT DETAILS");
        l16.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l16.setForeground(Color.BLUE);
        l16.setBounds(300, 20, 800, 50);
        l15.add(l16);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(540, 300, 1150, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String hostel_name = (String) c1.getSelectedItem();

            String room_no = t1.getText();

            if (room_no.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str1 = "select * from add_new_student_hostel where hostel_name = '" + hostel_name + "' and  room_no = '" + room_no + "'";

                    ResultSet rs1 = c.s.executeQuery(str1);

                    if (rs1.next()) {

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

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String enrollment_id_no = rs1.getString("enrollment_id_no");
                        String roll_no = rs1.getString("roll_no");
                        String student_name = rs1.getString("student_name");
                        String father_name = rs1.getString("father_name");
                        String gender = rs1.getString("gender");
                        String phone_no = rs1.getString("phone_no");

                        l4.setText(enrollment_id_no);
                        l6.setText(roll_no);
                        l8.setText(student_name);
                        l10.setText(father_name);
                        l12.setText(gender);
                        l14.setText(phone_no);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            new HostelInformation1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String hostel_name = (String) c1.getSelectedItem();
            String room_no = t1.getText();

            String enrollment_id_no = l4.getText();
            String roll_no = l6.getText();

            try {

                Conn c = new Conn();

                String str2 = "update add_new_room set room_status = 'Not Booked', student_status = 'No'  where room_no = '" + room_no + "' and hostel_name = '" + hostel_name + "'";
                c.s.executeUpdate(str2);

                String str3 = "update student_fees set hostel_status = 'No', hostel_fees = '0' where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";
                c.s.executeUpdate(str3);

                String str4 = "delete from add_new_student_hostel where hostel_name = '" + hostel_name + "' and room_no = '" + room_no + "'";
                c.s.executeUpdate(str4);

                JOptionPane.showMessageDialog(null, "Student Admission Cancel");

                new HostelInformation1().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b4) {

            new HostelInformation1().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {

        new HostelStudentDeleteDetails();
    }

}
