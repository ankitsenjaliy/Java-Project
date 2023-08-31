package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class SubjectViewDetails extends JFrame implements ActionListener {

    String subject_id_no, enrollment_id_no, roll_no, faculty_name, subject_code, subject_name, course_code, course_name, current_semester, theory_marks, practical_marks, subject_status;
    JButton b1, b2;

    SubjectViewDetails(String subject_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_subject where subject_id_no = '" + subject_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                subject_id_no = rs1.getString("subject_id_no");
                enrollment_id_no = rs1.getString("enrollment_id_no");
                roll_no = rs1.getString("roll_no");
                faculty_name = rs1.getString("faculty_name");
                subject_code = rs1.getString("subject_code");
                subject_name = rs1.getString("subject_name");
                course_code = rs1.getString("course_code");
                course_name = rs1.getString("course_name");
                current_semester = rs1.getString("current_semester");
                theory_marks = rs1.getString("theory_marks");
                practical_marks = rs1.getString("practical_marks");
                subject_status = rs1.getString("subject_status");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("SUBJECT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.CYAN);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        JLabel l2 = new JLabel(subject_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(400, 130, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(800, 130, 300, 30);
        add(l3);

        JLabel l4 = new JLabel(enrollment_id_no);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.GREEN);
        l4.setBounds(1100, 130, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("ROLL NUMBER");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(100, 180, 300, 30);
        add(l5);

        JLabel l6 = new JLabel(roll_no);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.GREEN);
        l6.setBounds(400, 180, 600, 30);
        add(l6);

        JLabel l7 = new JLabel("FACULTY NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.CYAN);
        l7.setBounds(800, 180, 300, 30);
        add(l7);

        JLabel l8 = new JLabel(faculty_name);
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.GREEN);
        l8.setBounds(1100, 180, 300, 30);
        add(l8);

        JLabel l9 = new JLabel("SUBJECT NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(100, 230, 300, 30);
        add(l9);

        JLabel l10 = new JLabel(subject_name);
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.GREEN);
        l10.setBounds(400, 230, 600, 30);
        add(l10);

        JLabel l11 = new JLabel("SUBJECT CODE");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.CYAN);
        l11.setBounds(800, 230, 300, 30);
        add(l11);

        JLabel l12 = new JLabel(subject_code);
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.GREEN);
        l12.setBounds(1100, 230, 300, 30);
        add(l12);

        JLabel l13 = new JLabel("COURSE NAME");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.CYAN);
        l13.setBounds(100, 280, 300, 30);
        add(l13);

        JLabel l14 = new JLabel(course_name);
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.GREEN);
        l14.setBounds(400, 280, 600, 30);
        add(l14);

        JLabel l15 = new JLabel("COURSE CODE");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.CYAN);
        l15.setBounds(800, 280, 300, 30);
        add(l15);

        JLabel l16 = new JLabel(course_code);
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.GREEN);
        l16.setBounds(1100, 280, 300, 30);
        add(l16);

        JLabel l17 = new JLabel("CURRENT SEMESTER");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.CYAN);
        l17.setBounds(100, 330, 300, 30);
        add(l17);

        JLabel l18 = new JLabel(current_semester);
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.GREEN);
        l18.setBounds(400, 330, 300, 30);
        add(l18);

        JLabel l19 = new JLabel("THEORY MARKS");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.CYAN);
        l19.setBounds(800, 330, 300, 30);
        add(l19);

        JLabel l20 = new JLabel(theory_marks);
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.GREEN);
        l20.setBounds(1100, 330, 300, 30);
        add(l20);

        JLabel l21 = new JLabel("PRACTICAL MARKS");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.CYAN);
        l21.setBounds(100, 380, 300, 30);
        add(l21);

        JLabel l22 = new JLabel(practical_marks);
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.GREEN);
        l22.setBounds(400, 380, 300, 30);
        add(l22);

        JLabel l23 = new JLabel("SUBJECT STATUS");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.CYAN);
        l23.setBounds(800, 380, 300, 30);
        add(l23);

        JLabel l24 = new JLabel(subject_status);
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.GREEN);
        l24.setBounds(1100, 380, 300, 30);
        add(l24);

        b1 = new JButton("PRINT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(400, 460, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(700, 460, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U16.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1350, 580, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l25 = new JLabel(i3);
        l25.setBounds(0, 0, 1350, 580);
        add(l25);

        JLabel l26 = new JLabel("VIEW SUBJECT DETAILS");
        l26.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l26.setForeground(Color.YELLOW);
        l26.setBounds(450, 20, 800, 50);
        l25.add(l26);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(430, 270, 1350, 580);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            new SubjectInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new SubjectInformation().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new SubjectViewDetails("");
    }

}
