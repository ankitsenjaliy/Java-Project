package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class IssueBookInformation extends JFrame implements ActionListener {

    String x[] = {"Book Id Number", "Book Name", "Enrollment Id Number", "Student Name", "Course Name", "Issue Book Date"};
    String y[][] = new String[20][6];

    JLabel l2;
    JTable t;
    JButton b1, b2, b3;

    int i = 0, j = 0;

    IssueBookInformation() {

        try {

            Conn c = new Conn();

            String str1 = "select * from add_issue_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("book_id_no");
                y[i][j++] = rs1.getString("book_name");
                y[i][j++] = rs1.getString("enrollment_id_no");
                y[i][j++] = rs1.getString("student_name");
                y[i][j++] = rs1.getString("course_name");
                y[i][j++] = rs1.getString("issue_book_date");

                i++;
                j = 0;
            }

            t = new JTable(y, x);

        } catch (Exception e) {

            System.out.println(e);

        }

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 40));
        t.setRowHeight(40);

        JScrollPane S = new JScrollPane(t);
        S.setBounds(0, 180, 1383, 551);
        add(S);

        b1 = new JButton("ADD ISSUE BOOK");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50, 70, 300, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("ISSUE BOOK VIEW DETAILS");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(1040, 70, 300, 50);
        b2.addActionListener(this);
        add(b2);

        JLabel l1 = new JLabel("ISSUE BOOK INFORMATION");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.RED);
        l1.setBounds(420, 20, 800, 50);
        add(l1);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from add_issue_book";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int issue_book = rs2.getInt(1);

            l2 = new JLabel("ISSUE BOOK = " + issue_book);
            l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
            l2.setForeground(Color.BLUE);
            l2.setBounds(530, 120, 600, 30);
            add(l2);

        } catch (Exception e) {

            System.out.println(e);
        }

        JPanel p1 = new JPanel();
        p1.setBackground(Color.YELLOW);
        p1.setLayout(null);
        p1.setBounds(0, 0, 1400, 180);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.YELLOW);
        p2.setLayout(null);
        p2.setBounds(0, 730, 1400, 100);
        add(p2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 150, 1400, 850);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new AddIssueBook().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new IssueBookViewDetails().setVisible(true);
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new IssueBookInformation();
    }

}
