package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class Statistics extends JFrame implements ActionListener {

    JTable t1, t2;
    JButton b1;

    Statistics() {

        t1 = new JTable();
        t1.setBounds(0, 60, 1600, 330);
        add(t1);

        t1.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLACK);
        t1.getTableHeader().setBackground(Color.CYAN);
        t1.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t1.setRowHeight(30);

        try {

            Conn c = new Conn();

            String str1 = "select book_id_no,book_name,enrollment_id_no,student_name,course_name,issue_book_date from add_issue_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            t1.setModel(DbUtils.resultSetToTableModel(rs1));

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("BOOK ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(40, 30, 300, 30);
        add(l1);

        JLabel l2 = new JLabel("BOOK NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(330, 30, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(530, 30, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("STUDENT NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(850, 30, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("COURSE NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(1120, 30, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("ISSUE BOOK DATE");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(1360, 30, 300, 30);
        add(l6);

        t2 = new JTable();
        t2.setBounds(0, 450, 1600, 330);
        add(t2);

        t2.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLACK);
        t2.getTableHeader().setBackground(Color.CYAN);
        t2.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t2.setRowHeight(30);

        try {

            Conn c = new Conn();

            String str2 = "select book_id_no,book_name,enrollment_id_no,student_name,issue_book_date,return_book_date from add_return_book";

            ResultSet rs2 = c.s.executeQuery(str2);

            t2.setModel(DbUtils.resultSetToTableModel(rs2));

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l7 = new JLabel("BOOK ID NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.RED);
        l7.setBounds(40, 420, 300, 30);
        add(l7);

        JLabel l8 = new JLabel("BOOK NAME");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.RED);
        l8.setBounds(330, 420, 300, 30);
        add(l8);

        JLabel l9 = new JLabel("ENROLLMENT ID NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.RED);
        l9.setBounds(530, 420, 300, 30);
        add(l9);

        JLabel l10 = new JLabel("STUDENT NAME");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.RED);
        l10.setBounds(850, 420, 300, 30);
        add(l10);

        JLabel l11 = new JLabel("ISSUE BOOK DATE");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.RED);
        l11.setBounds(1100, 420, 300, 30);
        add(l11);

        JLabel l12 = new JLabel("RETURN BOOK DATE");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.RED);
        l12.setBounds(1350, 420, 300, 30);
        add(l12);

        b1 = new JButton("CANCEL");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(700, 800, 150, 40);
        b1.addActionListener(this);
        add(b1);

        getContentPane().setBackground(Color.YELLOW);

        setLayout(null);
        setBounds(310, 130, 1600, 900);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new Statistics();
    }

}
