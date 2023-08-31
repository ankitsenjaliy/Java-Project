package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewSubject extends JFrame implements ActionListener {

    JLabel l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
    JTextField t1, t2, t3, t4;
    JComboBox C1, c1;
    JButton b1, b2, b3, b4;

    AddNewSubject() {

        JLabel l1 = new JLabel("COURSE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 100, 300, 30);
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
        C1.setBounds(350, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("CURRENT SEMESTER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(100, 150, 300, 30);
        add(l2);

        String current_semester[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        c1 = new JComboBox(current_semester);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(350, 150, 200, 30);
        add(c1);

        JLabel l3 = new JLabel("ROLL NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(100, 200, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(350, 200, 200, 30);
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
        b1.setBounds(130, 270, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(350, 270, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l4 = new JLabel("ENROLLMENT ID NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.GREEN);
        l4.setBounds(650, 100, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(1000, 100, 300, 30);
        add(l5);

        l6 = new JLabel("USER ACCOUNT");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.GREEN);
        l6.setBounds(650, 150, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(1000, 150, 300, 30);
        add(l7);

        l8 = new JLabel("FACULTY NAME");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.GREEN);
        l8.setBounds(650, 200, 300, 30);
        add(l8);

        l9 = new JLabel();
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(1000, 200, 300, 30);
        add(l9);

        l10 = new JLabel("COURSE CODE");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.GREEN);
        l10.setBounds(650, 250, 300, 30);
        add(l10);

        l11 = new JLabel();
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(1000, 250, 300, 30);
        add(l11);

        l12 = new JLabel("SUBJECT CODE");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.GREEN);
        l12.setBounds(650, 300, 300, 30);
        add(l12);

        l13 = new JLabel();
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.YELLOW);
        l13.setBounds(1000, 300, 310, 30);
        add(l13);

        l14 = new JLabel("SUBJECT NAME");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.GREEN);
        l14.setBounds(650, 350, 300, 30);
        add(l14);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(1000, 350, 200, 30);
        add(t2);

        l15 = new JLabel("THEORY MARKS");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.GREEN);
        l15.setBounds(100, 350, 300, 30);
        add(l15);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.RED);
        t3.setBounds(350, 350, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l16 = new JLabel("PRACTICAL MARKS");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.GREEN);
        l16.setBounds(100, 400, 300, 30);
        add(l16);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.BLUE);
        t4.setBounds(350, 400, 200, 30);
        add(t4);

        t4.setColumns(10);
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l17 = new JLabel("SUBJECT STATUS");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.GREEN);
        l17.setBounds(650, 400, 300, 30);
        add(l17);

        l18 = new JLabel("Yes");
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.YELLOW);
        l18.setBounds(1000, 400, 300, 30);
        add(l18);

        b3 = new JButton("SUBMIT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400, 470, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(700, 470, 150, 40);
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
        t2.setVisible(false);
        l15.setVisible(false);
        t3.setVisible(false);
        l16.setVisible(false);
        t4.setVisible(false);
        l17.setVisible(false);
        l18.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U15.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 580, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l19 = new JLabel(i3);
        l19.setBounds(0, 0, 1300, 580);
        add(l19);

        JLabel l20 = new JLabel("ADD NEW SUBJECT");
        l20.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l20.setForeground(Color.CYAN);
        l20.setBounds(450, 20, 800, 50);
        l19.add(l20);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(460, 280, 1300, 580);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_name = (String) C1.getSelectedItem();

            String current_semester = (String) c1.getSelectedItem();

            String roll_no = t1.getText();

            String subject_code;

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
                        t2.setVisible(true);
                        l15.setVisible(true);
                        t3.setVisible(true);
                        l16.setVisible(true);
                        t4.setVisible(true);
                        l17.setVisible(true);
                        l18.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String enrollment_id_no = rs2.getString("enrollment_id_no");
                        String user_account = rs2.getString("user_account");
                        String faculty_name = rs2.getString("faculty_name");
                        String course_code = rs2.getString("course_code");

                        l5.setText(enrollment_id_no);
                        l7.setText(user_account);
                        l9.setText(faculty_name);
                        l11.setText(course_code);

                        int count = 100;

                        String str3 = "select COUNT(*) from add_new_subject where course_name = '" + course_name + "'  and current_semester = '" + current_semester + "'";

                        ResultSet rs3 = c.s.executeQuery(str3);

                        rs3.next();

                        int code = count + rs3.getInt(1);

                        subject_code = course_code + "0" + current_semester + code;

                        l13.setText(subject_code);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {

                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new SubjectInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String course_name = (String) C1.getSelectedItem();

            String current_semester = (String) c1.getSelectedItem();

            String roll_no = t1.getText();

            String enrollment_id_no = l5.getText();
            String user_account = l7.getText();
            String faculty_name = l9.getText();
            String course_code = l11.getText();
            String subject_code = l13.getText();

            String subject_name = t2.getText();

            String theory_marks = t3.getText();
            String practical_marks = t4.getText();
            
            String subject_status = l18.getText();

            if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Subject Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t3.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Theory Marks", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t4.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Practical Marks", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    int subject_no = 1;

                    String str4 = "select COUNT(*) from add_new_subject";

                    ResultSet rs4 = c.s.executeQuery(str4);

                    rs4.next();

                    int subject_id_no = subject_no + rs4.getInt(1);

                    String str5 = "insert into add_new_subject values('" + subject_id_no + "', '" + enrollment_id_no + "', '" + user_account + "', '" + roll_no + "', '" + faculty_name + "',  '" + subject_code + "', '" + subject_name + "',  '" + course_code + "','" + course_name + "', '" + current_semester + "', '" + theory_marks + "', '" + practical_marks + "', '" + subject_status + "')";
                    c.s.executeUpdate(str5);

                    JOptionPane.showMessageDialog(null, "New Subject Added" + "\nSubject Id Number = " + subject_id_no);

                    new SubjectInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == b4) {

            new SubjectInformation().setVisible(true);
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

        new AddNewSubject();
    }

}
