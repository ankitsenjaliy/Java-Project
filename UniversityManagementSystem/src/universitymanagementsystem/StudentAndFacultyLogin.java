package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class StudentAndFacultyLogin extends JFrame implements ActionListener {

    JTextField t1;
    JPasswordField t2;
    JComboBox C1;
    JCheckBox c1;
    JButton b1, b2, b3, b4;

    StudentAndFacultyLogin(String enrollment_id_no) {

        JLabel l1 = new JLabel("USER ACCOUNT");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(100, 50, 300, 30);
        add(l1);

        String user_account[] = {"Student", "Faculty"};
        C1 = new JComboBox(user_account);
        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.RED);
        C1.setBounds(400, 50, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("ENROLLMENT ID NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(100, 100, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
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

        JLabel l3 = new JLabel("PASSWORD");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(100, 150, 300, 30);
        add(l3);

        t2 = new JPasswordField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(400, 150, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '@') && (caracter != '#') && (caracter != '&') && (caracter != '$')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        c1 = new JCheckBox("SHOW PASSWORD");
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.BLUE);
        c1.setBounds(460, 210, 200, 30);
        add(c1);

        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (c1.isSelected()) {

                    t2.setEchoChar('\u0000');

                } else {

                    t2.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));

                }
            }
        });

        b1 = new JButton("LOGIN");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(140, 270, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(380, 270, 150, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("FORGOT PASSWORD");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(500, 340, 360, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("FORGOT ENROLLMENT ID NUMBER");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(500, 400, 360, 40);
        b4.addActionListener(this);
        add(b4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(660, 50, 220, 200);
        add(l4);
        
        JLabel l5 = new JLabel();
        l5.setBorder(new TitledBorder(new LineBorder(Color.RED, 3), "",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(50, 200, 34)));
        l5.setBounds(30, 20, 870, 450);
        add(l5);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(550, 250, 950, 540);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String user_account = (String) C1.getSelectedItem();

            String enrollment_id_no = t1.getText();
            String password = t2.getText();

            if ((t1.getText().isEmpty()) || check_enrollment_id_no(t1.getText())) {

                if (enrollment_id_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Enrollment Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_enrollment_id_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 10 Digit Enrollment Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t2.getText().isEmpty()) || check_password(t2.getText())) {

                if (password.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_password(t2.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Your Valid 8 Digit Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                if (user_account.equals("Student")) {

                    try {

                        Conn c = new Conn();

                        String str1 = "select * from student_faculty_login where enrollment_id_no = '" + enrollment_id_no + "' and password = '" + password + "' and user_account = '" + user_account + "'";

                        ResultSet rs1 = c.s.executeQuery(str1);

                        if (rs1.next()) {

                            new StudentDashboard(t1.getText()).setVisible(true);
                            this.setVisible(false);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid Enrollment Id Number And Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                            this.setVisible(true);
                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else if (user_account.equals("Faculty")) {

                    try {

                        Conn c = new Conn();

                        String str2 = "select * from student_faculty_login where enrollment_id_no = '" + enrollment_id_no + "' and password = '" + password + "' and user_account = '" + user_account + "'";

                        ResultSet rs2 = c.s.executeQuery(str2);

                        if (rs2.next()) {

                            new FacultyDashboard(t1.getText()).setVisible(true);
                            this.setVisible(false);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid Enrollment Id Number And Password", "ERROR", JOptionPane.ERROR_MESSAGE);

                            this.setVisible(true);
                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }
                }

            }
        } else if (ae.getSource() == b2) {

            new UniversityManagementSystem().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new StudentAndFacultyForgotPassword().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b4) {

            new StudentAndFacultyForgotEnrollmentNumber().setVisible(true);
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

    public static void main(String[] args) {

        new StudentAndFacultyLogin("");
    }
}
