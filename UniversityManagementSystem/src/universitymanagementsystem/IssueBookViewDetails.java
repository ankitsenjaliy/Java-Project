package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class IssueBookViewDetails extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30;
    JTextField t1;
    JComboBox C1;
    JButton b1, b2, b3, b4;

    IssueBookViewDetails() {

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.CYAN);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_issue_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("enrollment_id_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(450, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("BOOK ID NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.CYAN);
        l2.setBounds(100, 150, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(450, 150, 200, 30);
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

        l3 = new JLabel("BOOK NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(850, 200, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.GREEN);
        l4.setBounds(1200, 200, 600, 30);
        add(l4);

        l5 = new JLabel("AUTHOR NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(850, 250, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.GREEN);
        l6.setBounds(1200, 250, 600, 30);
        add(l6);

        l7 = new JLabel("PUBLISHER NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(100, 300, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.GREEN);
        l8.setBounds(450, 300, 600, 30);
        add(l8);

        l9 = new JLabel("ISB NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(850, 300, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.GREEN);
        l10.setBounds(1200, 300, 300, 30);
        add(l10);

        l11 = new JLabel("BOOK PRICE");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(100, 350, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.GREEN);
        l12.setBounds(450, 350, 300, 30);
        add(l12);

        l13 = new JLabel("BOOK PAGES");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.YELLOW);
        l13.setBounds(850, 350, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.GREEN);
        l14.setBounds(1200, 350, 300, 30);
        add(l14);

        l15 = new JLabel("ROLL NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.YELLOW);
        l15.setBounds(100, 400, 300, 30);
        add(l15);

        l16 = new JLabel();
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.GREEN);
        l16.setBounds(450, 400, 300, 30);
        add(l16);

        l17 = new JLabel("STUDENT NAME");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.YELLOW);
        l17.setBounds(850, 400, 300, 30);
        add(l17);

        l18 = new JLabel();
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.GREEN);
        l18.setBounds(1200, 400, 600, 30);
        add(l18);

        l19 = new JLabel("FATHER NAME");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.YELLOW);
        l19.setBounds(100, 450, 300, 30);
        add(l19);

        l20 = new JLabel();
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.GREEN);
        l20.setBounds(450, 450, 600, 30);
        add(l20);

        l21 = new JLabel("PHONE NUMBER");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.YELLOW);
        l21.setBounds(850, 450, 300, 30);
        add(l21);

        l22 = new JLabel();
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.GREEN);
        l22.setBounds(1200, 450, 300, 30);
        add(l22);

        l23 = new JLabel("EMAIL ID");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.YELLOW);
        l23.setBounds(100, 500, 300, 30);
        add(l23);

        l24 = new JLabel();
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.GREEN);
        l24.setBounds(450, 500, 1000, 30);
        add(l24);

        l25 = new JLabel("COURSE NAME");
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.YELLOW);
        l25.setBounds(850, 500, 300, 30);
        add(l25);

        l26 = new JLabel();
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.GREEN);
        l26.setBounds(1200, 500, 600, 30);
        add(l26);

        l27 = new JLabel("CURRENT SEMESTER");
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.YELLOW);
        l27.setBounds(100, 550, 300, 30);
        add(l27);

        l28 = new JLabel();
        l28.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l28.setForeground(Color.GREEN);
        l28.setBounds(450, 550, 300, 30);
        add(l28);

        l29 = new JLabel("ISSUE BOOK DATE");
        l29.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l29.setForeground(Color.GREEN);
        l29.setBounds(850, 550, 300, 30);
        add(l29);

        l30 = new JLabel();
        l30.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l30.setForeground(Color.YELLOW);
        l30.setBounds(1200, 550, 300, 30);
        add(l30);

        b3 = new JButton("PRINT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(550, 630, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(850, 630, 150, 40);
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

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l31 = new JLabel(i3);
        l31.setBounds(0, 0, 1600, 750);
        add(l31);

        JLabel l32 = new JLabel("ISSUE BOOK VIEW DETAILS");
        l32.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l32.setForeground(Color.ORANGE);
        l32.setBounds(550, 20, 800, 50);
        l31.add(l32);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(310, 200, 1600, 750);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String book_id_no = t1.getText();

            if ((t1.getText().isEmpty()) || check_book_id_no(t1.getText())) {

                if (book_id_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Book Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_book_id_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Valid 3 Digit Book Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "select * from add_issue_book where enrollment_id_no = '" + enrollment_id_no + "' and book_id_no = '" + book_id_no + "'";

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

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String book_name = rs2.getString("book_name");
                        String author_name = rs2.getString("author_name");
                        String publisher_name = rs2.getString("publisher_name");
                        String isb_no = rs2.getString("isb_no");
                        String book_price = rs2.getString("book_price");
                        String book_pages = rs2.getString("book_pages");
                        String roll_no = rs2.getString("roll_no");
                        String student_name = rs2.getString("student_name");
                        String father_name = rs2.getString("father_name");
                        String phone_no = rs2.getString("phone_no");
                        String email_id = rs2.getString("email_id");
                        String course_name = rs2.getString("course_name");
                        String current_semester = rs2.getString("current_semester");
                        String issue_book_date = rs2.getString("issue_book_date");

                        l4.setText(book_name);
                        l6.setText(author_name);
                        l8.setText(publisher_name);
                        l10.setText(isb_no);
                        l12.setText(book_price);
                        l14.setText(book_pages);
                        l16.setText(roll_no);
                        l18.setText(student_name);
                        l20.setText(father_name);
                        l22.setText(phone_no);
                        l24.setText(email_id);
                        l26.setText(course_name);
                        l28.setText(current_semester);
                        l30.setText(issue_book_date);

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

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            new IssueBookInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b4) {

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

    public static void main(String[] args) {

        new IssueBookViewDetails();
    }

}
