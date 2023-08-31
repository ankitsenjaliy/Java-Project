package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewEnrollmentIdNumberAndPasswordDetails extends JFrame implements ActionListener {

    String x[] = {"User Account", "Enrollment Id Number", "Password", "Roll Number"};
    String y[][] = new String[20][4];

    JLabel l2;
    JTable t;
    JButton b1;

    int i = 0, j = 0;

    ViewEnrollmentIdNumberAndPasswordDetails() {

        try {

            Conn c = new Conn();

            String str1 = "select * from student_faculty_login";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("user_account");
                y[i][j++] = rs1.getString("enrollment_id_no");
                y[i][j++] = rs1.getString("password");
                y[i][j++] = rs1.getString("roll_no");

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
        S.setBounds(0, 180, 1383, 571);
        add(S);

        b1 = new JButton("BACK");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(600, 770, 150, 50);
        b1.addActionListener(this);
        add(b1);

        JLabel l1 = new JLabel("VIEW ENROLLMENT ID NUMBER AND PASSWORD DETAILS");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.RED);
        l1.setBounds(100, 20, 1200, 50);
        add(l1);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from student_faculty_login";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int student_and_faculty = rs2.getInt(1);

            l2 = new JLabel("STUDENT AND FACULTY = " + student_and_faculty);
            l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
            l2.setForeground(Color.BLUE);
            l2.setBounds(400, 120, 600, 30);
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
        p2.setBounds(0, 730, 1400, 110);
        add(p2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 130, 1400, 880);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new Information().setVisible(true);
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new ViewEnrollmentIdNumberAndPasswordDetails();
    }

}
