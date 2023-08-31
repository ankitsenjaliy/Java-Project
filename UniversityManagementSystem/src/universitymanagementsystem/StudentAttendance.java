package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentAttendance extends JFrame implements ActionListener {

    String x[] = {"Roll Number", "Enrollment Id Number", "Student Name", "Course Name", "Current Semester", "Attendance"};
    String y[][] = new String[20][6];

    JTable t;
    JLabel l2, l4, l6, l8;
    ButtonGroup G;
    JButton b1, b2;

    String enrollment_id_no, course_name, subject_name, current_semester;

    JRadioButton[] r1 = new JRadioButton[20];
    JRadioButton[] r2 = new JRadioButton[20];

    int i = 0, j = 0;
    
    int l = 0;

    StudentAttendance(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from attendance where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                enrollment_id_no = rs1.getString("enrollment_id_no");
                course_name = rs1.getString("course_name");
                subject_name = rs1.getString("subject_name");
                current_semester = rs1.getString("current_semester");

            }

        } catch (Exception e) {

            System.out.println(e);
        }
        
        try {
            Conn c = new Conn();

            String str2 = "select * from add_new_student_university where course_name = '" + course_name + "' and current_semester = '" + current_semester + "'";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                y[i][j++] = rs2.getString("roll_no");
                y[i][j++] = rs2.getString("enrollment_id_no");
                y[i][j++] = rs2.getString("student_name");
                y[i][j++] = rs2.getString("course_name");
                y[i][j++] = rs2.getString("current_semester");

                i++;
                j = 0;

            }

            t = new JTable(y, x);

            t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 20));
            t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            t.setForeground(Color.BLACK);
            t.getTableHeader().setBackground(Color.CYAN);
            t.getTableHeader().setPreferredSize(new Dimension(150, 40));
            t.setRowHeight(40);

            JScrollPane S = new JScrollPane(t);
            S.setBounds(0, 230, 1483, 511);
            add(S);

        } catch (Exception e) {

            System.out.println(e);

        }

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(50, 80, 300, 30);
        add(l1);

        l2 = new JLabel(enrollment_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLACK);
        l2.setBounds(350, 80, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("COURSE NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(50, 130, 300, 30);
        add(l3);

        l4 = new JLabel(course_name);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLACK);
        l4.setBounds(350, 130, 600, 30);
        add(l4);

        JLabel l5 = new JLabel("SUBJECT NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(950, 130, 300, 30);
        add(l5);

        l6 = new JLabel(subject_name);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.BLACK);
        l6.setBounds(1250, 130, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("CURRENT SEMESTER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.RED);
        l7.setBounds(950, 180, 300, 30);
        add(l7);

        l8 = new JLabel(current_semester);
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.BLACK);
        l8.setBounds(1250, 180, 300, 30);
        add(l8);

        try {

            Conn c = new Conn();

            String str3 = "select count(*) from add_new_student_university where course_name = '" + course_name + "' and current_semester = '" + current_semester + "'";

            ResultSet rs3 = c.s.executeQuery(str3);

            rs3.next();

            int count = rs3.getInt(1);

            for (int k = 0; k < count; k++) {

                G = new ButtonGroup();

                r1[k] = new JRadioButton("Present");

                r1[k].setFont(new Font("Times New Roman", Font.PLAIN, 18));
                r1[k].setBounds(1250, 40 * k, 100, 35);
                r1[k].setBackground(Color.WHITE);
                r1[k].setForeground(Color.BLUE);
                G.add(r1[k]);
                t.add(r1[k]);

                r2[k] = new JRadioButton("Absent");

                r2[k].setFont(new Font("Times New Roman", Font.PLAIN, 18));
                r2[k].setBounds(1350, 40 * k, 200, 35);
                r2[k].setBackground(Color.WHITE);
                r2[k].setForeground(Color.RED);
                G.add(r2[k]);
                t.add(r2[k]);
            }

        } catch (Exception e) {

            System.out.println(e);
        }

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 760, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(850, 760, 150, 40);
        b2.addActionListener(this);
        add(b2);

        JLabel l9 = new JLabel("ATTENDANCE SHEET");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l9.setForeground(Color.BLUE);
        l9.setBounds(500, 30, 600, 50);
        add(l9);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.YELLOW);
        p1.setBounds(0, 0, 1500, 230);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.YELLOW);
        p2.setBounds(0, 730, 1500, 100);
        add(p2);

        setLayout(null);
        setBounds(360, 140, 1500, 860);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String roll_no = null;
            String enrollment_id_no = null;
            String student_name = null;

            String course_name = l4.getText();
            String subject_name = l6.getText();
            String current_semester = l8.getText();

            String attendance = null;

            if (r1[l].isSelected()) {

                attendance = "Present";

            } else if ((r2[l].isSelected())) {

                attendance = "Absent";

            }

            try {

                Conn c = new Conn();

                String str4 = "select * from add_new_student_university where course_name = '" + course_name + "' and current_semester = '" + current_semester + "'";

                ResultSet rs4 = c.s.executeQuery(str4);

                while (rs4.next()) {

                    roll_no = rs4.getString("roll_no");
                    enrollment_id_no = rs4.getString("enrollment_id_no");
                    student_name = rs4.getString("student_name");

                }

                int l = 0;

                String str5 = "select count(*) from add_new_student_university";

                ResultSet rs5 = c.s.executeQuery(str5);

                rs5.next();

                int count = rs5.getInt(1);

                for (int m = 0; m < count; m++) {

                    String str6 = "insert into attendance_sheet values('" + roll_no + "','" + enrollment_id_no + "','" + student_name + "','" + course_name + "','" + subject_name + "','" + current_semester + "','" + attendance + "')";

                    c.s.executeUpdate(str6);

                    l++;

                }

                JOptionPane.showMessageDialog(null, "Success");

                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new StudentAttendance("");
    }

}
