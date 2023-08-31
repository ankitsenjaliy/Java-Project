package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentAttendancePage extends JFrame implements ActionListener {

    String enrollment_id_no, course_name;

    JLabel l2, l4, l6, l7;
    JComboBox C1;
    JPanel p;
    JButton b1, b2, b3;

    StudentAttendancePage(String enrollment_id_no) {

        try {

            Conn c = new Conn();

            String str1 = "select * from add_new_faculty where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                enrollment_id_no = rs1.getString("enrollment_id_no");
                course_name = rs1.getString("course_name");

            }
        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        l2 = new JLabel(enrollment_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(450, 130, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("COURSE NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.GREEN);
        l3.setBounds(100, 180, 300, 30);
        add(l3);

        l4 = new JLabel(course_name);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(450, 180, 600, 30);
        add(l4);

        JLabel l5 = new JLabel("SUBJECT NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(100, 230, 300, 30);
        add(l5);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str2 = "select * from add_new_subject where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                C1.addItem(rs2.getString("subject_name"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.RED);
        C1.setBounds(450, 230, 200, 30);
        add(C1);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 300, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(480, 300, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l6 = new JLabel("CURRENT SEMESTER");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(100, 380, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.GREEN);
        l7.setBounds(450, 380, 600, 30);
        add(l7);

        b3 = new JButton("NEXT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(330, 440, 150, 40);
        b3.addActionListener(this);
        add(b3);

        l6.setVisible(false);
        l7.setVisible(false);

        b3.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(860, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(0, 0, 860, 600);
        add(l8);

        JLabel l9 = new JLabel("ATTENDANCE");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l9.setForeground(Color.CYAN);
        l9.setBounds(280, 30, 600, 50);
        l8.add(l9);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(660, 260, 860, 550);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_name = l4.getText();
            String subject_name = (String) C1.getSelectedItem();

            try {

                Conn c = new Conn();

                String str3 = "select * from add_new_subject where course_name = '" + course_name + "' and subject_name = '" + subject_name + "'";

                ResultSet rs3 = c.s.executeQuery(str3);

                if (rs3.next()) {

                    l6.setVisible(true);
                    l7.setVisible(true);

                    b3.setVisible(true);

                    String current_semester = rs3.getString("current_semester");

                    l7.setText(current_semester);

                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String enrollment_id_no = l2.getText();

            String course_name = l4.getText();

            String subject_name = (String) C1.getSelectedItem();

            String current_semester = l7.getText();

            try {

                Conn c = new Conn();

                String str4 = "insert into attendance values('" + enrollment_id_no + "','" + course_name + "','" + subject_name + "','" + current_semester + "')";

                c.s.executeUpdate(str4);

                new AA(enrollment_id_no).setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {

        new StudentAttendancePage("");
    }

}
