package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UniversityStudentDeleteDetails extends JFrame implements ActionListener {

    JLabel l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25;
    JTextField t1;
    JComboBox C1, c1;
    JButton b1, b2, b3, b4;

    UniversityStudentDeleteDetails() {

        JLabel l1 = new JLabel("COURSE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_course";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("course_name"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.RED);
        C1.setBounds(300, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("CURRENT SEMESTER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(60, 150, 300, 30);
        add(l2);

        String current_semester[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        c1 = new JComboBox(current_semester);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.BLUE);
        c1.setBounds(300, 150, 200, 30);
        add(c1);

        JLabel l3 = new JLabel("ROLL NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(60, 200, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(300, 200, 200, 30);
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
        b1.setBounds(80, 260, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 260, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l4 = new JLabel("STUDENT NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(600, 100, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(850, 100, 600, 30);
        add(l5);

        l6 = new JLabel("FATHER NAME");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(600, 150, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.BLUE);
        l7.setBounds(850, 150, 600, 30);
        add(l7);

        l8 = new JLabel("GENDER");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.BLUE);
        l8.setBounds(600, 200, 300, 30);
        add(l8);

        l9 = new JLabel();
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.RED);
        l9.setBounds(850, 200, 600, 30);
        add(l9);

        l10 = new JLabel("PHONE NUMBER");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.RED);
        l10.setBounds(600, 250, 300, 30);
        add(l10);

        l11 = new JLabel();
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.BLUE);
        l11.setBounds(850, 250, 300, 30);
        add(l11);

        l12 = new JLabel("PASSWORD");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.BLUE);
        l12.setBounds(600, 300, 300, 30);
        add(l12);

        l13 = new JLabel();
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.RED);
        l13.setBounds(850, 300, 300, 30);
        add(l13);

        l14 = new JLabel("ENROLLMENT ID NUMBER");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.RED);
        l14.setBounds(60, 350, 300, 30);
        add(l14);

        l15 = new JLabel();
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.BLUE);
        l15.setBounds(400, 350, 300, 30);
        add(l15);

        l16 = new JLabel("COURSE CODE");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.RED);
        l16.setBounds(600, 350, 300, 30);
        add(l16);

        l17 = new JLabel();
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.BLUE);
        l17.setBounds(850, 350, 300, 30);
        add(l17);

        l18 = new JLabel("AADHAR CARD NUMBER");
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.BLUE);
        l18.setBounds(60, 400, 300, 30);
        add(l18);

        l19 = new JLabel();
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.RED);
        l19.setBounds(400, 400, 300, 30);
        add(l19);

        l20 = new JLabel("CURRENT YEAR");
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.BLUE);
        l20.setBounds(600, 400, 300, 30);
        add(l20);

        l21 = new JLabel();
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.RED);
        l21.setBounds(850, 400, 300, 30);
        add(l21);

        l22 = new JLabel("USER ACCOUNT");
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.RED);
        l22.setBounds(60, 450, 300, 30);
        add(l22);

        l23 = new JLabel();
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.BLUE);
        l23.setBounds(400, 450, 600, 30);
        add(l23);

        l24 = new JLabel("ADMISSION YEAR");
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.RED);
        l24.setBounds(600, 450, 300, 30);
        add(l24);

        l25 = new JLabel();
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.BLUE);
        l25.setBounds(850, 450, 300, 30);
        add(l25);

        b3 = new JButton("DELETE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(350, 510, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(650, 510, 150, 40);
        b4.addActionListener(this);
        add(b4);

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
        l20.setVisible(false);
        l21.setVisible(false);
        l22.setVisible(false);
        l23.setVisible(false);
        l24.setVisible(false);
        l25.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 620, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l26 = new JLabel(i3);
        l26.setBounds(0, 0, 1150, 620);
        add(l26);

        JLabel l27 = new JLabel("DELETE STUDENT DETAILS");
        l27.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l27.setForeground(Color.RED);
        l27.setBounds(300, 20, 800, 50);
        l26.add(l27);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(530, 260, 1150, 620);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_name = (String) C1.getSelectedItem();

            String current_semester = (String) c1.getSelectedItem();

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

                    String str2 = "select * from add_new_student_university where course_name = '" + course_name + "' and current_semester = '" + current_semester + "' and roll_no = '" + roll_no + "'";

                    ResultSet rs2 = c.s.executeQuery(str2);

                    if (rs2.next()) {

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
                        l20.setVisible(true);
                        l21.setVisible(true);
                        l22.setVisible(true);
                        l23.setVisible(true);
                        l24.setVisible(true);
                        l25.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String student_name = rs2.getString("student_name");
                        String father_name = rs2.getString("father_name");
                        String gender = rs2.getString("gender");
                        String phone_no = rs2.getString("phone_no");
                        String password = rs2.getString("password");
                        String enrollment_id_no = rs2.getString("enrollment_id_no");
                        String course_code = rs2.getString("course_code");
                        String aadhar_card_no = rs2.getString("aadhar_card_no");
                        String current_year = rs2.getString("current_year");
                        String user_account = rs2.getString("user_account");
                        String admission_year = rs2.getString("admission_year");

                        l5.setText(student_name);
                        l7.setText(father_name);
                        l9.setText(gender);
                        l11.setText(phone_no);
                        l13.setText(password);
                        l15.setText(enrollment_id_no);
                        l17.setText(course_code);
                        l19.setText(aadhar_card_no);
                        l21.setText(current_year);
                        l23.setText(user_account);
                        l25.setText(admission_year);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            new StudentInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String course_name = (String) C1.getSelectedItem();

            String current_semester = (String) c1.getSelectedItem();

            String roll_no = t1.getText();

            String enrollment_id_no = l15.getText();
            String user_account = l23.getText();

            String course_code = l17.getText();
            String current_year = l21.getText();
            String admission_year = l25.getText();

            try {

                Conn c = new Conn();

                String str3 = "insert into university_student_admission_cancel values('" + user_account + "','" + enrollment_id_no + "','" + roll_no + "','" + course_name + "','" + course_code + "','" + current_semester + "','" + current_year + "','" + admission_year + "')";
                c.s.executeUpdate(str3);

                String str4 = "delete from add_new_student_university where course_name = '" + course_name + "' and current_semester = '" + current_semester + "' and roll_no = '" + roll_no + "'";
                c.s.executeUpdate(str4);

                String str5 = "delete from student_fees where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";
                c.s.executeUpdate(str5);

                JOptionPane.showMessageDialog(null, "Student Admission Cancel");

                new StudentInformation().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b4) {

            new StudentInformation().setVisible(true);
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

        new UniversityStudentDeleteDetails();
    }

}
