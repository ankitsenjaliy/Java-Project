package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class FacultyAdmissionCancelDetails extends JFrame implements ActionListener {

    JTable t;
    JComboBox C1, C2;
    JButton b1, b2, b3;

    FacultyAdmissionCancelDetails() {

        t = new JTable();
        t.setBounds(0, 220, 1300, 540);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        JLabel l1 = new JLabel("COURSE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(30, 80, 300, 30);
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
        C1.setBounds(280, 80, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("COURSE CODE");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(30, 130, 300, 30);
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
        C2.setForeground(Color.BLUE);
        C2.setBounds(280, 130, 200, 30);
        add(C2);

        JLabel l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(30, 190, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("ROLL NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(410, 190, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("COURSE NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLUE);
        l5.setBounds(720, 190, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("COURSE CODE");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.BLUE);
        l6.setBounds(1040, 190, 300, 30);
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

        b3 = new JButton("ADD NEW FACULTY");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(930, 100, 300, 50);
        b3.addActionListener(this);
        add(b3);

        JLabel l7 = new JLabel("FACULTY ADMISSION CANCEL DETAILS");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l7.setForeground(Color.RED);
        l7.setBounds(250, 20, 1000, 50);
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

                String str3 = "select enrollment_id_no,roll_no,course_name,course_code from faculty_admission_cancel where course_name = '" + C1.getSelectedItem() + "'";

                ResultSet rs3 = c.s.executeQuery(str3);

                t.setModel(DbUtils.resultSetToTableModel(rs3));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new FacultyInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new AddNewFaculty2().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new FacultyAdmissionCancelDetails();
    }

}
