package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class FacultyDetails extends JFrame implements ActionListener {

    JTable t;
    JComboBox C1, C2;
    JButton b1, b2;

    FacultyDetails() {

        t = new JTable();
        t.setBounds(0, 180, 1300, 580);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        JLabel l1 = new JLabel("COURSE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(30, 50, 300, 30);
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
        C1.setForeground(Color.RED);
        C1.setBounds(280, 50, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("COURSE CODE");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(30, 100, 300, 30);
        add(l2);

        C2 = new JComboBox();

        try {
            Conn c = new Conn();

            String str2 = "select * from add_new_course";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                C2.addItem(rs2.getString("course_code"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C2.setBackground(Color.WHITE);
        C2.setForeground(Color.RED);
        C2.setBounds(280, 100, 200, 30);
        add(C2);

        JLabel l3 = new JLabel("ROLL NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(100, 150, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("FACULTY NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(410, 150, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("COURSE NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(730, 150, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("COURSE CODE");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(1040, 150, 300, 30);
        add(l6);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(420, 780, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 780, 150, 40);
        b2.addActionListener(this);
        add(b2);

        JLabel l7 = new JLabel("FACULTY DETAILS");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l7.setForeground(Color.BLUE);
        l7.setBounds(500, 20, 800, 50);
        add(l7);

        getContentPane().setBackground(Color.GREEN);

        setLayout(null);
        setBounds(460, 130, 1300, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {
                Conn c = new Conn();

                String str3 = "select roll_no,faculty_name,course_name,course_code from add_new_faculty where course_name = '" + C1.getSelectedItem() + "' and course_code = '" + C2.getSelectedItem() + "'";

                ResultSet rs3 = c.s.executeQuery(str3);

                t.setModel(DbUtils.resultSetToTableModel(rs3));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new FacultyInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new FacultyDetails();
    }

}
