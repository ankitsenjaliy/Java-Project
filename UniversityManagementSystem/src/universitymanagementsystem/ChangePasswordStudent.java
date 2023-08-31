package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ChangePasswordStudent extends JFrame implements ActionListener {

    String enrollment_id_no;

    JLabel l2, l5, l6;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3, b4;

    ChangePasswordStudent(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from student_faculty_login where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                enrollment_id_no = rs1.getString("enrollment_id_no");

            }
        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        l2 = new JLabel(enrollment_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.CYAN);
        l2.setBounds(450, 130, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("PHONE NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(100, 180, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(450, 180, 200, 30);
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

        JLabel l4 = new JLabel("OLD PASSWORD");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(100, 230, 300, 30);
        add(l4);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(450, 230, 200, 30);
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

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 300, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450, 300, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l5 = new JLabel("NEW PASSWORD");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(100, 380, 300, 30);
        add(l5);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.RED);
        t3.setBounds(450, 380, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '@') && (caracter != '#') && (caracter != '&') && (caracter != '$')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l6 = new JLabel("CONFIRM NEW PASSWORD");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.CYAN);
        l6.setBounds(100, 430, 300, 30);
        add(l6);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.BLUE);
        t4.setBounds(450, 430, 200, 30);
        add(t4);

        t4.setColumns(10);
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '@') && (caracter != '#') && (caracter != '&') && (caracter != '$')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b3 = new JButton("CHANGE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 500, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("CANCEL");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(450, 500, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l5.setVisible(false);
        t3.setVisible(false);
        l6.setVisible(false);
        t4.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U16.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(0, 0, 800, 630);
        add(l7);

        JLabel l8 = new JLabel("CHANGE PASSWORD");
        l8.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l8.setForeground(Color.GREEN);
        l8.setBounds(200, 20, 800, 50);
        l7.add(l8);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(720, 270, 800, 630);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String enrollment_id_no = l2.getText();

            String phone_no = t1.getText();
            String password = t2.getText();

            if ((t1.getText().isEmpty()) || check_phone_no(t1.getText())) {

                if (phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_phone_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 10 Digit Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t2.getText().isEmpty()) || check_password(t2.getText())) {

                if (password.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Old Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_password(t2.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 8 Digit Old Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "select * from add_new_student_university where enrollment_id_no = '" + enrollment_id_no + "' and phone_no = '" + phone_no + "' and password = '" + password + "'";

                    ResultSet rs2 = c.s.executeQuery(str2);

                    if (rs2.next()) {

                        l5.setVisible(true);
                        t3.setVisible(true);
                        l6.setVisible(true);
                        t4.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Phone Number And Old Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String enrollment_id_no = l2.getText();

            String new_password = t3.getText();
            String confirm_new_password = t4.getText();

            if ((t3.getText().isEmpty()) || check_new_password(t3.getText())) {

                if (new_password.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your New Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_new_password(t3.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 8 Digit New Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t4.getText().isEmpty()) || check_confirm_new_password(t4.getText())) {

                if (confirm_new_password.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Confirm New Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_confirm_new_password(t4.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 8 Digit Confirm New Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                if (new_password.equals(confirm_new_password)) {

                    try {

                        Conn c = new Conn();

                        String str3 = "Update student_faculty_login set password = '" + new_password + "' where enrollment_id_no = '" + enrollment_id_no + "'";
                        c.s.executeUpdate(str3);

                        String str4 = "Update add_new_student_university set password = '" + new_password + "' where enrollment_id_no = '" + enrollment_id_no + "'";
                        c.s.executeUpdate(str4);

                        {
                            JOptionPane.showMessageDialog(null, "Change Password SuccessFully");

                            this.setVisible(false);

                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "New Password And Confirm New Password Are Not Equal", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else if (ae.getSource()
                == b4) {

            this.setVisible(false);

        }

    }

    Boolean check_phone_no(String s) {

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

    Boolean check_password(String s) {

        char s1[] = new char[9];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 8) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_new_password(String s) {

        char s1[] = new char[9];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 8) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_confirm_new_password(String s) {

        char s1[] = new char[9];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 8) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        new ChangePasswordStudent("");
    }

}
