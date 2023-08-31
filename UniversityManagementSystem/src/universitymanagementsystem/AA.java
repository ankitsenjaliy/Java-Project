package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Scanner;

public class AA extends JFrame implements ActionListener {

    String x[] = {"Roll Number", "Enrollment Id Number", "Student Name", "Course Name", "Current Semester", "Attendance"};
    String y[][] = new String[20][6];

    JTable t;
    JLabel l2, l4, l6, l8;
    ButtonGroup G;
    JButton b1, b2;

    JRadioButton[] r1 = new JRadioButton[20];
    JRadioButton[] r2 = new JRadioButton[20];

    String[] roll_no;
    String[] enrollmentidno;
    String[] student_name;

    String course_name;
    String current_semester;

    String enrollmentno, subject_name;

    int i = 0, j = 0;

    int k = 0;

    AA(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from attendance where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                enrollmentno = rs1.getString("enrollment_id_no");
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

        try {

            roll_no = new String[k];
            enrollmentidno = new String[k];
            student_name = new String[k];

//            sc.useDelimiter("\\n|,");
//            for (int l = 0; l < k; l++) {
//
//                roll_no[l] = sc.next();
//                enrollmentidno[l] = sc.next();
//                student_name[l] = sc.next();
//            }
//            sc.close();

        } catch (Exception e) {

            System.out.println(e);
        }

        try {

            Conn c = new Conn();

            String str3 = "select count(*) from add_new_student_university where course_name = '" + course_name + "' and current_semester = '" + current_semester + "'";

            ResultSet rs3 = c.s.executeQuery(str3);

            rs3.next();

            int count = rs3.getInt(1);

            for (int l = 0; l < count; l++) {

                G = new ButtonGroup();

                r1[k] = new JRadioButton("Present");

                r1[k].setFont(new Font("Times New Roman", Font.PLAIN, 18));
                r1[k].setBounds(1250, 40 * l, 100, 35);
                r1[k].setBackground(Color.WHITE);
                r1[k].setForeground(Color.BLUE);
                G.add(r1[k]);
                t.add(r1[k]);

                r2[k] = new JRadioButton("Absent");

                r2[k].setFont(new Font("Times New Roman", Font.PLAIN, 18));
                r2[k].setBounds(1350, 40 * l, 200, 35);
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

            for (int l = 0; l < k; l++) {

                try {

                    String rollno = roll_no[l];
                    String enrollmentno = enrollmentidno[l];
                    String studentname = student_name[l];
                    String coursename = course_name;
                    String currentsemester = current_semester;

                    String attendance = null;

                    if (r1[l].isSelected()) {

                        attendance = "Present";

                    } else if ((r2[l].isSelected())) {

                        attendance = "Absent";

                    }

                    Conn c = new Conn();

                    String str6 = "insert into attendance_sheet values('" + rollno + "','" + enrollmentno + "','" + studentname + "','" + coursename + "','" + currentsemester + "','" + attendance + "')";

                    c.s.executeUpdate(str6);

                    JOptionPane.showMessageDialog(null, "Success");

                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new AA("");
    }

}
