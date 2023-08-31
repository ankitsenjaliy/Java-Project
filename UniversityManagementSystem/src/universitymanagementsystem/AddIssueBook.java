package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddIssueBook extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27;
    JTextField t1, t2, t3;
    JComboBox C1, C2;
    JButton b1, b2, b3, b4, b5, b6;

    AddIssueBook() {

        JLabel l1 = new JLabel("BOOK ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.GREEN);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(450, 100, 200, 30);
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

        JLabel l2 = new JLabel("BOOK NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 150, 300, 30);
        add(l2);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("book_name"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(450, 150, 200, 30);
        add(C1);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 220, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450, 220, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("AUTHOR NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(100, 300, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(450, 300, 600, 30);
        add(l4);

        l5 = new JLabel("PUBLISHER NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(100, 350, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(450, 350, 600, 30);
        add(l6);

        l7 = new JLabel("ISB NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.CYAN);
        l7.setBounds(100, 400, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(450, 400, 600, 30);
        add(l8);

        l9 = new JLabel("BOOK PRICE");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(100, 450, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(450, 450, 300, 30);
        add(l10);

        l11 = new JLabel("BOOK PAGES");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.CYAN);
        l11.setBounds(100, 500, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.YELLOW);
        l12.setBounds(450, 500, 300, 30);
        add(l12);

        JLabel l13 = new JLabel("ENROLLMENT ID NUMBER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.GREEN);
        l13.setBounds(850, 100, 300, 30);
        add(l13);

        C2 = new JComboBox();

        try {
            Conn c = new Conn();

            String str2 = "select * from add_new_student_university";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                C2.addItem(rs2.getString("enrollment_id_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C2.setBackground(Color.WHITE);
        C2.setForeground(Color.BLUE);
        C2.setBounds(1200, 100, 200, 30);
        add(C2);

        JLabel l14 = new JLabel("ROLL NUMBER");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.GREEN);
        l14.setBounds(850, 150, 300, 30);
        add(l14);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(1200, 150, 200, 30);
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

        b3 = new JButton("SEARCH");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(900, 220, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(1200, 220, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l15 = new JLabel("STUDENT NAME");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.CYAN);
        l15.setBounds(850, 300, 300, 30);
        add(l15);

        l16 = new JLabel();
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.YELLOW);
        l16.setBounds(1200, 300, 600, 30);
        add(l16);

        l17 = new JLabel("FATHER NAME");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.CYAN);
        l17.setBounds(850, 350, 300, 30);
        add(l17);

        l18 = new JLabel();
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.YELLOW);
        l18.setBounds(1200, 350, 600, 30);
        add(l18);

        l19 = new JLabel("PHONE NUMBER");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.CYAN);
        l19.setBounds(850, 400, 300, 30);
        add(l19);

        l20 = new JLabel();
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.YELLOW);
        l20.setBounds(1200, 400, 300, 30);
        add(l20);

        l21 = new JLabel("EMAIL ID");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.CYAN);
        l21.setBounds(850, 450, 300, 30);
        add(l21);

        l22 = new JLabel();
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.YELLOW);
        l22.setBounds(1200, 450, 1000, 30);
        add(l22);

        l23 = new JLabel("COURSE NAME");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.CYAN);
        l23.setBounds(850, 500, 300, 30);
        add(l23);

        l24 = new JLabel();
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.YELLOW);
        l24.setBounds(1200, 500, 600, 30);
        add(l24);

        l25 = new JLabel("CURRENT SEMESTER");
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.CYAN);
        l25.setBounds(850, 550, 300, 30);
        add(l25);

        l26 = new JLabel();
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.YELLOW);
        l26.setBounds(1200, 550, 300, 30);
        add(l26);

        l27 = new JLabel("ISSUE BOOK DATE");
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.YELLOW);
        l27.setBounds(100, 550, 300, 30);
        add(l27);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.RED);
        t3.setBounds(450, 550, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b5 = new JButton("SUBMIT");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(550, 630, 150, 40);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("BACK");
        b6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(850, 630, 150, 40);
        b6.addActionListener(this);
        add(b6);

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
        l26.setVisible(false);

        l27.setVisible(false);
        t3.setVisible(false);

        b5.setVisible(false);
        b6.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l28 = new JLabel(i3);
        l28.setBounds(0, 0, 1600, 750);
        add(l28);

        JLabel l29 = new JLabel("ADD ISSUE BOOK");
        l29.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l29.setForeground(Color.ORANGE);
        l29.setBounds(650, 20, 800, 50);
        l28.add(l29);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(310, 200, 1600, 750);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String book_id_no = t1.getText();

            String book_name = (String) C1.getSelectedItem();

            if ((t1.getText().isEmpty()) || check_book_id_no(t1.getText())) {

                if (book_id_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Book Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_book_id_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Valid 3 Digit Book Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                try {

                    Conn c = new Conn();

                    String str3 = "select * from add_new_book where book_id_no = '" + book_id_no + "' and book_name = '" + book_name + "'";

                    ResultSet rs3 = c.s.executeQuery(str3);

                    if (rs3.next()) {

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

                        l27.setVisible(true);
                        t3.setVisible(true);

                        String author_name = rs3.getString("author_name");
                        String publisher_name = rs3.getString("publisher_name");
                        String isb_no = rs3.getString("isb_no");
                        String book_price = rs3.getString("book_price");
                        String book_pages = rs3.getString("book_pages");

                        l4.setText(author_name);
                        l6.setText(publisher_name);
                        l8.setText(isb_no);
                        l10.setText(book_price);
                        l12.setText(book_pages);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Book Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new IssueBookInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String enrollment_id_no = (String) C2.getSelectedItem();

            String roll_no = t2.getText();

            if ((t2.getText().isEmpty()) || check_roll_no(t2.getText())) {

                if (roll_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_roll_no(t2.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 4 Digit Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                try {

                    Conn c = new Conn();

                    String str4 = "select * from add_new_student_university where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";

                    ResultSet rs4 = c.s.executeQuery(str4);

                    if (rs4.next()) {

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
                        l26.setVisible(true);

                        b5.setVisible(true);
                        b6.setVisible(true);

                        String student_name = rs4.getString("student_name");
                        String father_name = rs4.getString("father_name");
                        String phone_no = rs4.getString("phone_no");
                        String email_id = rs4.getString("email_id");
                        String course_name = rs4.getString("course_name");
                        String current_semester = rs4.getString("current_semester");

                        l16.setText(student_name);
                        l18.setText(father_name);
                        l20.setText(phone_no);
                        l22.setText(email_id);
                        l24.setText(course_name);
                        l26.setText(current_semester);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b4) {

            new IssueBookInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b5) {

            String book_id_no = t1.getText();

            String book_name = (String) C1.getSelectedItem();

            String author_name = l4.getText();
            String publisher_name = l6.getText();
            String isb_no = l8.getText();
            String book_price = l10.getText();
            String book_pages = l12.getText();

            String enrollment_id_no = (String) C2.getSelectedItem();

            String roll_no = t2.getText();

            String student_name = l16.getText();
            String father_name = l18.getText();
            String phone_no = l20.getText();
            String email_id = l22.getText();
            String course_name = l24.getText();
            String current_semester = l26.getText();

            String issue_book_date = t3.getText();

            if (t3.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Issue Book Date", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str5 = "insert into add_issue_book values('" + book_id_no + "','" + book_name + "','" + author_name + "','" + publisher_name + "','" + isb_no + "','" + book_price + "','" + book_pages + "','" + enrollment_id_no + "','" + roll_no + "','" + student_name + "','" + father_name + "','" + phone_no + "','" + email_id + "','" + course_name + "','" + current_semester + "','" + issue_book_date + "')";
                    c.s.executeUpdate(str5);

                    JOptionPane.showMessageDialog(null, "Issue Book Added");

                    new IssueBookInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == b6) {

            new IssueBookInformation().setVisible(true);
            this.setVisible(false);
        }

    }

    Boolean check_book_id_no(String s) {

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

        new AddIssueBook();
    }

}
