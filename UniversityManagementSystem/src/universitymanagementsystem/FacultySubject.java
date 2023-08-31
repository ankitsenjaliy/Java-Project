package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class FacultySubject extends JFrame implements ActionListener {

    String course_name, enrollment_id_no;

    JTable t;
    JLabel l2, l4;
    JButton b1, b2;

    FacultySubject(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_subject where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                course_name = rs1.getString("course_name");
                enrollment_id_no = rs1.getString("enrollment_id_no");

            }
        } catch (Exception e) {

            System.out.println(e);
        }

        t = new JTable();
        t.setBounds(0, 230, 1400, 350);
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
        l1.setBounds(50, 80, 300, 30);
        add(l1);

        l2 = new JLabel(course_name);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(350, 80, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(50, 130, 300, 30);
        add(l3);

        l4 = new JLabel(enrollment_id_no);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(350, 130, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("SUBJECT ID NUMBER");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLUE);
        l5.setBounds(70, 200, 300, 30);
        add(l5);

        JLabel l6 = new JLabel("ROLL NUMBER");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.BLUE);
        l6.setBounds(450, 200, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("SUBJECT NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.BLUE);
        l7.setBounds(800, 200, 300, 30);
        add(l7);

        JLabel l8 = new JLabel("CURRENT SEMESTER");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.BLUE);
        l8.setBounds(1100, 200, 300, 30);
        add(l8);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 600, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(750, 600, 150, 40);
        b2.addActionListener(this);
        add(b2);

        JLabel l9 = new JLabel("YOUR SUBJECT");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l9.setForeground(Color.RED);
        l9.setBounds(550, 20, 800, 50);
        add(l9);

        getContentPane().setBackground(Color.CYAN);

        setLayout(null);
        setBounds(410, 220, 1400, 700);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {
                Conn c = new Conn();

                String str2 = "select subject_id_no,roll_no,subject_name,current_semester from add_new_subject where course_name = '" + l2.getText() + "' and enrollment_id_no = '" + l4.getText() + "'";

                ResultSet rs2 = c.s.executeQuery(str2);

                t.setModel(DbUtils.resultSetToTableModel(rs2));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new FacultySubject("");
    }

}
