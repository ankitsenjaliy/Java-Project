package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewCourse extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4;
    JButton b1, b2;

    AddNewCourse() {

        JLabel l1 = new JLabel("COURSE CODE");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(60, 150, 300, 30);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(300, 150, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Only Capital Alphabet Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l2 = new JLabel("COURSE NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(60, 200, 300, 30);
        add(l2);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(300, 200, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Only Alphabet Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l3 = new JLabel("COURSE SEMESTER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(60, 250, 300, 30);
        add(l3);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.RED);
        t3.setBounds(300, 250, 200, 30);
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

        JLabel l4 = new JLabel("COURSE YEAR");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.GREEN);
        l4.setBounds(60, 300, 300, 30);
        add(l4);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.BLUE);
        t4.setBounds(300, 300, 200, 30);
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

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 380, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(330, 380, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(0, 0, 600, 500);
        add(l5);

        JLabel l6 = new JLabel("ADD NEW COURSE");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l6.setForeground(Color.CYAN);
        l6.setBounds(100, 20, 800, 50);
        l5.add(l6);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(820, 330, 600, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_code = t1.getText();
            String course_name = t2.getText();
            String course_semester = t3.getText();
            String course_year = t4.getText();

            if (course_code.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Course Code", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (course_name.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Course Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t3.getText().isEmpty()) || check_course_semester(t3.getText())) {

                if (course_semester.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Course Semester", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_course_semester(t3.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Course Valid 1 Digit Semester", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t4.getText().isEmpty()) || check_course_year(t4.getText())) {

                if (course_year.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Course Year", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_course_year(t4.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Course Valid 1 Digit Year", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                try {

                    Conn c = new Conn();

                    String str1 = "insert into add_new_course values('" + course_code + "',  '" + course_name + "', '" + course_semester + "', '" + course_year + "')";
                    c.s.executeUpdate(str1);

                    JOptionPane.showMessageDialog(null, "New Course Added");

                    new CourseInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new CourseInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    Boolean check_course_semester(String s) {

        char s1[] = new char[2];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 1) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_course_year(String s) {

        char s1[] = new char[2];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        new AddNewCourse();
    }

}
