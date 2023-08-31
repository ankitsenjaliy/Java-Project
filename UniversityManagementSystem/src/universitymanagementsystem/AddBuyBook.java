package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddBuyBook extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35;
    JTextField t1, t2, t3;
    JComboBox C1, C2;
    JButton b1, b2, b3, b4, b5, b6, B1;

    AddBuyBook() {

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

        l9 = new JLabel("TOTAL BOOK");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(100, 450, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(450, 450, 300, 30);
        add(l10);

        l11 = new JLabel("BOOK PRICE");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.CYAN);
        l11.setBounds(100, 500, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.YELLOW);
        l12.setBounds(450, 500, 300, 30);
        add(l12);

        l13 = new JLabel("BOOK PAGES");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.CYAN);
        l13.setBounds(100, 550, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.YELLOW);
        l14.setBounds(450, 550, 300, 30);
        add(l14);

        JLabel l15 = new JLabel("ENROLLMENT ID NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.GREEN);
        l15.setBounds(850, 100, 300, 30);
        add(l15);

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

        JLabel l16 = new JLabel("ROLL NUMBER");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.GREEN);
        l16.setBounds(850, 150, 300, 30);
        add(l16);

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

        l17 = new JLabel("STUDENT NAME");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.CYAN);
        l17.setBounds(850, 300, 300, 30);
        add(l17);

        l18 = new JLabel();
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.YELLOW);
        l18.setBounds(1200, 300, 600, 30);
        add(l18);

        l19 = new JLabel("FATHER NAME");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.CYAN);
        l19.setBounds(850, 350, 300, 30);
        add(l19);

        l20 = new JLabel();
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.YELLOW);
        l20.setBounds(1200, 350, 600, 30);
        add(l20);

        l21 = new JLabel("GENDER");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.CYAN);
        l21.setBounds(850, 400, 300, 30);
        add(l21);

        l22 = new JLabel();
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.YELLOW);
        l22.setBounds(1200, 400, 300, 30);
        add(l22);

        l23 = new JLabel("PHONE NUMBER");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.CYAN);
        l23.setBounds(850, 450, 300, 30);
        add(l23);

        l24 = new JLabel();
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.YELLOW);
        l24.setBounds(1200, 450, 300, 30);
        add(l24);

        l25 = new JLabel("EMAIL ID");
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.CYAN);
        l25.setBounds(850, 500, 300, 30);
        add(l25);

        l26 = new JLabel();
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.YELLOW);
        l26.setBounds(1200, 500, 1000, 30);
        add(l26);

        l27 = new JLabel("COURSE NAME");
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.CYAN);
        l27.setBounds(850, 550, 300, 30);
        add(l27);

        l28 = new JLabel();
        l28.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l28.setForeground(Color.YELLOW);
        l28.setBounds(1200, 550, 600, 30);
        add(l28);

        l29 = new JLabel("CURRENT SEMESTER");
        l29.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l29.setForeground(Color.CYAN);
        l29.setBounds(850, 600, 300, 30);
        add(l29);

        l30 = new JLabel();
        l30.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l30.setForeground(Color.YELLOW);
        l30.setBounds(1200, 600, 300, 30);
        add(l30);

        l31 = new JLabel("CURRENT YEAR");
        l31.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l31.setForeground(Color.CYAN);
        l31.setBounds(850, 650, 300, 30);
        add(l31);

        l32 = new JLabel();
        l32.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l32.setForeground(Color.YELLOW);
        l32.setBounds(1200, 650, 300, 30);
        add(l32);

        l33 = new JLabel("BUY TOTAL BOOK");
        l33.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l33.setForeground(Color.YELLOW);
        l33.setBounds(100, 600, 300, 30);
        add(l33);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.BLUE);
        t3.setBounds(450, 600, 200, 30);
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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L9.jpg"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        B1 = new JButton(i3);
        B1.setBounds(660, 600, 30, 30);
        B1.addActionListener(this);
        add(B1);

        l34 = new JLabel("TOTAL PAYMENT");
        l34.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l34.setForeground(Color.YELLOW);
        l34.setBounds(100, 650, 300, 30);
        add(l34);

        l35 = new JLabel();
        l35.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l35.setForeground(Color.GREEN);
        l35.setBounds(450, 650, 300, 30);
        add(l35);

        b5 = new JButton("SUBMIT");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(550, 730, 150, 40);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("BACK");
        b6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(850, 730, 150, 40);
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
        l13.setVisible(false);
        l14.setVisible(false);

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
        l28.setVisible(false);
        l29.setVisible(false);
        l30.setVisible(false);
        l31.setVisible(false);
        l32.setVisible(false);

        l33.setVisible(false);
        t3.setVisible(false);
        B1.setVisible(false);
        l34.setVisible(false);
        l35.setVisible(false);

        b5.setVisible(false);
        b6.setVisible(false);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L5.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1600, 850, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l36 = new JLabel(i6);
        l36.setBounds(0, 0, 1600, 850);
        add(l36);

        JLabel l37 = new JLabel("BUY BOOK DETAILS");
        l37.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l37.setForeground(Color.ORANGE);
        l37.setBounds(620, 20, 800, 50);
        l36.add(l37);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(310, 150, 1600, 850);
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
                        l13.setVisible(true);
                        l14.setVisible(true);

                        l33.setVisible(true);
                        t3.setVisible(true);
                        B1.setVisible(true);
                        l34.setVisible(true);
                        l35.setVisible(true);

                        String author_name = rs3.getString("author_name");
                        String publisher_name = rs3.getString("publisher_name");
                        String isb_no = rs3.getString("isb_no");
                        String total_book = rs3.getString("total_book");
                        String book_price = rs3.getString("book_price");
                        String book_pages = rs3.getString("book_pages");

                        l4.setText(author_name);
                        l6.setText(publisher_name);
                        l8.setText(isb_no);
                        l10.setText(total_book);
                        l12.setText(book_price);
                        l14.setText(book_pages);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Book Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new BuyBookInformation().setVisible(true);
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
                        l27.setVisible(true);
                        l28.setVisible(true);
                        l29.setVisible(true);
                        l30.setVisible(true);
                        l31.setVisible(true);
                        l32.setVisible(true);

                        b5.setVisible(true);
                        b6.setVisible(true);

                        String student_name = rs4.getString("student_name");
                        String father_name = rs4.getString("father_name");
                        String gender = rs4.getString("gender");
                        String phone_no = rs4.getString("phone_no");
                        String email_id = rs4.getString("email_id");
                        String course_name = rs4.getString("course_name");
                        String current_semester = rs4.getString("current_semester");
                        String current_year = rs4.getString("current_year");

                        l18.setText(student_name);
                        l20.setText(father_name);
                        l22.setText(gender);
                        l24.setText(phone_no);
                        l26.setText(email_id);
                        l28.setText(course_name);
                        l30.setText(current_semester);
                        l32.setText(current_year);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b4) {

            new BuyBookInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == B1) {

            String book_id_no = t1.getText();

            String book_name = (String) C1.getSelectedItem();

            String book_price = l12.getText();

            String buy_total_book = t3.getText();

            String total_payment;

            if (t3.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Buy Total Book", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str5 = "select * from add_new_book where book_id_no = '" + book_id_no + "' and book_name = '" + book_name + "'";

                    ResultSet rs5 = c.s.executeQuery(str5);

                    while (rs5.next()) {

                        int total_value = Integer.parseInt(book_price) * Integer.parseInt(buy_total_book);

                        total_payment = String.valueOf(total_value);

                        l35.setText(total_payment);

                    }

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b5) {

            String book_id_no = t1.getText();

            String book_name = (String) C1.getSelectedItem();

            String author_name = l4.getText();
            String publisher_name = l6.getText();
            String isb_no = l8.getText();
            String total_book = l10.getText();
            String book_price = l12.getText();
            String book_pages = l14.getText();

            String enrollment_id_no = (String) C2.getSelectedItem();

            String roll_no = t2.getText();

            String student_name = l18.getText();
            String father_name = l20.getText();
            String gender = l22.getText();
            String phone_no = l24.getText();
            String email_id = l26.getText();
            String course_name = l28.getText();
            String current_semester = l30.getText();
            String current_year = l32.getText();

            String buy_total_book = t3.getText();

            String total_payment = l35.getText();

            String total_value = null;

            if (t3.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Issue Book Date", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str6 = "select * from add_new_book where book_id_no = '" + book_id_no + "' and book_name = '" + book_name + "'";

                    ResultSet rs6 = c.s.executeQuery(str6);

                    while (rs6.next()) {

                        int total_value_1 = Integer.parseInt(total_book) - Integer.parseInt(buy_total_book);

                        total_value = String.valueOf(total_value_1);

                    }

                    String str7 = "update add_new_book set total_book = '" + total_value + "' where book_id_no = '" + book_id_no + "' and book_name = '" + book_name + "'";
                    c.s.executeUpdate(str7);

                    String str8 = "insert into add_buy_book values('" + book_id_no + "','" + book_name + "','" + author_name + "','" + publisher_name + "','" + isb_no + "','" + total_book + "','" + book_price + "','" + book_pages + "','" + enrollment_id_no + "','" + roll_no + "','" + student_name + "','" + father_name + "','" + gender + "','" + phone_no + "','" + email_id + "','" + course_name + "','" + current_semester + "','" + current_year + "','" + buy_total_book + "','" + total_payment + "')";
                    c.s.executeUpdate(str8);

                    JOptionPane.showMessageDialog(null, "Payment SuccessFully");

                    new BuyBookInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == b6) {

            new BuyBookInformation().setVisible(true);
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

        new AddBuyBook();
    }

}
