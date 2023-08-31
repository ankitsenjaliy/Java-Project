package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class StudentAndFacultyForgotPassword extends JFrame implements ActionListener {

    JComboBox C1;
    JTextField t1, t2;
    JButton b1, b2;

    StudentAndFacultyForgotPassword() {

        JLabel l1 = new JLabel("USER ACCOUNT");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(100, 50, 300, 30);
        add(l1);

        String account[] = {"Student", "Faculty"};
        C1 = new JComboBox(account);
        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(400, 50, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("ENROLLMENT ID NUMBER");
        l2.setFont(new Font("Times NEW ROMAN", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(100, 100, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(400, 100, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Capital Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l3 = new JLabel("AADHAR CARD NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(100, 150, 300, 30);
        add(l3);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(400, 150, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SHOW");
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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(640, 50, 200, 180);
        add(l4);

        JLabel l5 = new JLabel();
        l5.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 3), "",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(50, 200, 34)));
        l5.setBounds(30, 20, 830, 280);
        add(l5);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(550, 300, 910, 370);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String user_account = (String) C1.getSelectedItem();

            String enrollment_id_no = t1.getText();
            String aadhar_card_no = t2.getText();

            String password;

            if ((t1.getText().isEmpty()) || check_enrollment_id_no(t1.getText())) {

                if (enrollment_id_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Enrollment Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_enrollment_id_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 10 Digit Enrollment Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t2.getText().isEmpty()) || check_aadhar_card_no(t2.getText())) {

                if (aadhar_card_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_aadhar_card_no(t2.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 12 Digit Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                if (user_account.equals("Student")) {

                    try {

                        Conn c = new Conn();

                        String str1 = "select * from add_new_student_university where enrollment_id_no = '" + enrollment_id_no + "' and aadhar_card_no = '" + aadhar_card_no + "'";

                        ResultSet rs1 = c.s.executeQuery(str1);

                        if (rs1.next()) {

                            password = rs1.getString("password");

                            JOptionPane.showMessageDialog(null, "Show Password" + "\n Password = " + password);

                            new StudentAndFacultyLogin("").setVisible(true);
                            this.setVisible(false);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid Enrollment Id Number And Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                } else if (user_account.equals("Faculty")) {

                    try {

                        Conn c = new Conn();

                        String str2 = "select * from add_new_faculty where enrollment_id_no = '" + enrollment_id_no + "' and aadhar_card_no = '" + aadhar_card_no + "'";

                        ResultSet rs2 = c.s.executeQuery(str2);

                        if (rs2.next()) {

                            password = rs2.getString("password");

                            JOptionPane.showMessageDialog(null, "Show Password" + "\n Password = " + password);

                            new StudentAndFacultyLogin("").setVisible(true);
                            this.setVisible(false);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid Enrollment Id Number And Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }
                }

            }
        } else if (ae.getSource() == b2) {

            new StudentAndFacultyLogin("").setVisible(true);
            this.setVisible(false);
        }
    }

    Boolean check_enrollment_id_no(String s) {

        char s1[] = new char[11];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 10) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_aadhar_card_no(String s) {

        char s1[] = new char[13];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 12) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        new StudentAndFacultyForgotPassword();
    }
}
