package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddStudentFees extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20;
    JTextField t1;
    JComboBox C1, c1, c2;
    JButton b, b1, b2, b3, b4;

    AddStudentFees() {

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.GREEN);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_student_university where status_1 = 'No'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("enrollment_id_no"));
            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.RED);
        C1.setBounds(400, 130, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("ROLL NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 180, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(400, 180, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 260, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 260, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("STUDENT NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(800, 150, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.GREEN);
        l4.setBounds(1100, 150, 600, 30);
        add(l4);

        l5 = new JLabel("GENDER");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(800, 200, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.GREEN);
        l6.setBounds(1100, 200, 300, 30);
        add(l6);

        l7 = new JLabel("PHONE NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(800, 250, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.GREEN);
        l8.setBounds(1100, 250, 300, 30);
        add(l8);

        l9 = new JLabel("COURSE NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(100, 350, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.GREEN);
        l10.setBounds(400, 350, 600, 30);
        add(l10);

        l11 = new JLabel("CURRENT SEMESTER");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(100, 400, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.GREEN);
        l12.setBounds(400, 400, 300, 30);
        add(l12);

        l13 = new JLabel("CURRENT YEAR");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.YELLOW);
        l13.setBounds(100, 450, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.GREEN);
        l14.setBounds(400, 450, 300, 30);
        add(l14);

        l15 = new JLabel("UNIVERSITY FEES");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.CYAN);
        l15.setBounds(800, 300, 300, 30);
        add(l15);

        l16 = new JLabel("150000");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.YELLOW);
        l16.setBounds(1100, 300, 300, 30);
        add(l16);

        l17 = new JLabel("FEES STATUS");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.CYAN);
        l17.setBounds(800, 350, 300, 30);
        add(l17);

        l18 = new JLabel("No");
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.YELLOW);
        l18.setBounds(1100, 350, 300, 30);
        add(l18);

        l19 = new JLabel("HOSTEL STATUS");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.CYAN);
        l19.setBounds(800, 400, 300, 30);
        add(l19);

        String hostel_status[] = {"Yes", "No"};
        c1 = new JComboBox(hostel_status);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(1100, 400, 200, 30);
        add(c1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U17.jpg"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        b = new JButton(i3);
        b.setBounds(1310, 400, 30, 30);
        b.addActionListener(this);
        add(b);

        l20 = new JLabel("HOSTEL FEES");
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.CYAN);
        l20.setBounds(800, 450, 300, 30);
        add(l20);

        String hostel_fees[] = {"0", "80000"};
        c2 = new JComboBox(hostel_fees);
        c2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.BLUE);
        c2.setBounds(1100, 450, 200, 30);
        add(c2);

        b3 = new JButton("SUBMIT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(450, 520, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(750, 520, 150, 40);
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
        l16.setVisible(false);
        l17.setVisible(false);
        l18.setVisible(false);
        l19.setVisible(false);
        c1.setVisible(false);
        b.setVisible(false);
        l20.setVisible(false);
        c2.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U15.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1450, 650, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l21 = new JLabel(i6);
        l21.setBounds(0, 0, 1450, 650);
        add(l21);

        JLabel l22 = new JLabel("ADD STUDENT FEES");
        l22.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l22.setForeground(Color.CYAN);
        l22.setBounds(520, 20, 800, 50);
        l21.add(l22);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 240, 1400, 650);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String roll_no = t1.getText();

            if ((t1.getText().isEmpty()) || check_roll_no(t1.getText())) {

                if (roll_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_roll_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 4 Digit Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "select * from add_new_student_university where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";

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
                        l12.setVisible(true);
                        l13.setVisible(true);
                        l14.setVisible(true);
                        l15.setVisible(true);
                        l16.setVisible(true);
                        l17.setVisible(true);
                        l18.setVisible(true);
                        l19.setVisible(true);
                        c1.setVisible(true);
                        b.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String student_name = rs2.getString("student_name");
                        String gender = rs2.getString("gender");
                        String phone_no = rs2.getString("phone_no");
                        String course_name = rs2.getString("course_name");
                        String current_semester = rs2.getString("current_semester");
                        String current_year = rs2.getString("current_year");

                        l4.setText(student_name);
                        l6.setText(gender);
                        l8.setText(phone_no);
                        l10.setText(course_name);
                        l12.setText(current_semester);
                        l14.setText(current_year);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            new FeesInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b) {

            String hostel_status = (String) c1.getSelectedItem();

            if (hostel_status.equals("Yes")) {

                l20.setVisible(true);
                c2.setVisible(true);

            } else if (hostel_status.equals("No")) {

                l20.setVisible(false);
                c2.setVisible(false);

            }

        } else if (ae.getSource() == b3) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String roll_no = t1.getText();

            String student_name = l4.getText();
            String gender = l6.getText();
            String phone_no = l8.getText();

            String course_name = l10.getText();
            String current_semester = l12.getText();
            String current_year = l14.getText();

            String university_fees = l16.getText();
            String fees_status = l18.getText();

            String hostel_status = (String) c1.getSelectedItem();
            String hostel_fees = (String) c2.getSelectedItem();

            String status_2 = "No";

            try {

                Conn c = new Conn();

                String str3 = "insert into student_fees values('" + enrollment_id_no + "','" + roll_no + "','" + student_name + "','" + gender + "','" + phone_no + "','" + course_name + "','" + current_semester + "','" + current_year + "','" + university_fees + "','" + fees_status + "','" + hostel_status + "','" + hostel_fees + "','" + status_2 + "')";
                c.s.executeUpdate(str3);

                String str4 = "update add_new_student_university set status_1 = 'Yes' where enrollment_id_no = '" + enrollment_id_no + "'";
                c.s.executeUpdate(str4);

                JOptionPane.showMessageDialog(null, "New Student Fees Added");

                new FeesInformation().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b4) {

            new FeesInformation().setVisible(true);
            this.setVisible(false);

        }

    }

    Boolean check_roll_no(String s) {

        char s1[] = new char[5];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 4) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        new AddStudentFees();
    }

}
