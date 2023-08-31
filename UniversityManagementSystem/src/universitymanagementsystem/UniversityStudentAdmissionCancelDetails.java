package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class UniversityStudentAdmissionCancelDetails extends JFrame implements ActionListener {

    JTable t;
    JComboBox C1, c1;
    JButton b1, b2, b3;

    UniversityStudentAdmissionCancelDetails() {

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
        l1.setForeground(Color.BLUE);
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
        C1.setForeground(Color.RED);
        C1.setBounds(280, 80, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("CURRENT SEMESTER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(30, 130, 300, 30);
        add(l2);

        String current_semester[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        c1 = new JComboBox(current_semester);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(280, 130, 200, 30);
        add(c1);

        JLabel l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(30, 190, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("ROLL NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(420, 190, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("COURSE NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(730, 190, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("CURRENT SEMESTER");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(1010, 190, 300, 30);
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

        b3 = new JButton("ADD NEW STUDENT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(930, 100, 300, 50);
        b3.addActionListener(this);
        add(b3);

        JLabel l7 = new JLabel("STUDENT ADMISSION CANCEL DETAILS");
        l7.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l7.setForeground(Color.BLUE);
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

                String str2 = "select enrollment_id_no,roll_no,course_name,current_semester from university_student_admission_cancel where course_name = '" + C1.getSelectedItem() + "' and current_semester = '" + c1.getSelectedItem() + "'";

                ResultSet rs2 = c.s.executeQuery(str2);

                t.setModel(DbUtils.resultSetToTableModel(rs2));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new StudentInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new AddNewStudent2().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new UniversityStudentAdmissionCancelDetails();
    }

}
