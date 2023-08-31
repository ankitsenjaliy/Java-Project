package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CourseInformation extends JFrame implements ActionListener {

    String x[] = {"Course Code", "Course Name", "Course Semester", "Course Year"};
    String y[][] = new String[20][4];

    JLabel l2;
    JTable t;
    JButton b1, b2;

    int i = 0, j = 0;

    CourseInformation() {

        try {

            Conn c = new Conn();

            String str1 = "select * from add_new_course";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("course_code");
                y[i][j++] = rs1.getString("course_name");
                y[i][j++] = rs1.getString("course_semester");
                y[i][j++] = rs1.getString("course_year");

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
        S.setBounds(0, 180, 1343, 551);
        add(S);

        b1 = new JButton("ADD NEW COURSE");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(980, 30, 320, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("DELETE COURSE DETAILS");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(980, 110, 320, 50);
        b2.addActionListener(this);
        add(b2);

        JLabel l1 = new JLabel("COURSE INFORMATION");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.BLUE);
        l1.setBounds(420, 20, 800, 50);
        add(l1);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from add_new_course";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int course = rs2.getInt(1);

            l2 = new JLabel("COURSE = " + course);
            l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
            l2.setForeground(Color.RED);
            l2.setBounds(50, 80, 600, 30);
            add(l2);

        } catch (Exception e) {

            System.out.println(e);
        }

        JPanel p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        p1.setLayout(null);
        p1.setBounds(0, 0, 1360, 180);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.GREEN);
        p2.setLayout(null);
        p2.setBounds(0, 730, 1360, 80);
        add(p2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(430, 150, 1360, 850);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new AddNewCourse().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new CourseDeleteDetails().setVisible(true);
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new CourseInformation();
    }

}
