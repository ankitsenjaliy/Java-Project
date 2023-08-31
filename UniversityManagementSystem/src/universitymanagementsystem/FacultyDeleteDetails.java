package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FacultyDeleteDetails extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
    JTextField t1;
    JComboBox C1;
    JButton b1, b2, b3, b4;

    FacultyDeleteDetails() {

        JLabel l1 = new JLabel("COURSE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
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
        C1.setForeground(Color.BLUE);
        C1.setBounds(300, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("ROLL NUMBER");
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

        l3 = new JLabel("FACULTY NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(600, 100, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(850, 100, 600, 30);
        add(l4);

        l5 = new JLabel("FATHER NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLUE);
        l5.setBounds(600, 150, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(850, 150, 600, 30);
        add(l6);

        l7 = new JLabel("PHONE NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.RED);
        l7.setBounds(600, 200, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.BLUE);
        l8.setBounds(850, 200, 300, 30);
        add(l8);

        l9 = new JLabel("USER ACCOUNT");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.BLUE);
        l9.setBounds(600, 250, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.RED);
        l10.setBounds(850, 250, 300, 30);
        add(l10);

        l11 = new JLabel("ENROLLMENT ID NUMBER");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.RED);
        l11.setBounds(60, 300, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.BLUE);
        l12.setBounds(380, 300, 300, 30);
        add(l12);

        l13 = new JLabel("PASSWORD");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.RED);
        l13.setBounds(600, 300, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.BLUE);
        l14.setBounds(850, 300, 300, 30);
        add(l14);

        l15 = new JLabel("AADHAR CARD NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.BLUE);
        l15.setBounds(60, 350, 300, 30);
        add(l15);

        l16 = new JLabel();
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.RED);
        l16.setBounds(380, 350, 300, 30);
        add(l16);

        l17 = new JLabel("COURSE CODE");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.BLUE);
        l17.setBounds(600, 350, 300, 30);
        add(l17);

        l18 = new JLabel();
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.RED);
        l18.setBounds(850, 350, 300, 30);
        add(l18);

        b3 = new JButton("DELETE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(350, 410, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(650, 410, 150, 40);
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

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 520, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l19 = new JLabel(i3);
        l19.setBounds(0, 0, 1150, 520);
        add(l19);

        JLabel l20 = new JLabel("DELETE FACULTY DETAILS");
        l20.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l20.setForeground(Color.BLUE);
        l20.setBounds(300, 20, 800, 50);
        l19.add(l20);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(530, 300, 1150, 520);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_name = (String) C1.getSelectedItem();

            String roll_no = t1.getText();

            if ((t1.getText().isEmpty()) || check_roll_no(t1.getText())) {

                if (roll_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Faculty Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_roll_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Faculty Valid 3 Digit Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "select * from add_new_faculty where course_name = '" + course_name + "' and roll_no = '" + roll_no + "'";

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

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String faculty_name = rs2.getString("faculty_name");
                        String father_name = rs2.getString("father_name");
                        String phone_no = rs2.getString("phone_no");
                        String user_account = rs2.getString("user_account");
                        String enrollment_id_no = rs2.getString("enrollment_id_no");
                        String password = rs2.getString("password");
                        String aadhar_card_no = rs2.getString("aadhar_card_no");
                        String course_code = rs2.getString("course_code");

                        l4.setText(faculty_name);
                        l6.setText(father_name);
                        l8.setText(phone_no);
                        l10.setText(user_account);
                        l12.setText(enrollment_id_no);
                        l14.setText(password);
                        l16.setText(aadhar_card_no);
                        l18.setText(course_code);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            new FacultyInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String course_name = (String) C1.getSelectedItem();

            String user_account = l10.getText();
            String enrollment_id_no = l12.getText();

            String roll_no = t1.getText();

            String course_code = l18.getText();

            try {

                Conn c = new Conn();

                String str3 = "insert into faculty_admission_cancel values('" + user_account + "','" + enrollment_id_no + "','" + roll_no + "','" + course_name + "','" + course_code + "')";
                c.s.executeUpdate(str3);

                String str4 = "update add_new_subject set subject_status = 'No' where enrollment_id_no = '" + enrollment_id_no + "'";
                c.s.executeUpdate(str4);

                String str5 = "delete from faculty_payment where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";
                c.s.executeUpdate(str5);

                String str6 = "delete from add_new_faculty where course_name = '" + course_name + "' and roll_no = '" + roll_no + "'";
                c.s.executeUpdate(str6);

                JOptionPane.showMessageDialog(null, "Faculty Admission Cancel");

                new FacultyInformation().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b4) {

            new FacultyInformation().setVisible(true);
            this.setVisible(false);

        }

    }

    Boolean check_roll_no(String s) {

        char s1[] = new char[4];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 3) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        new FacultyDeleteDetails();
    }

}
