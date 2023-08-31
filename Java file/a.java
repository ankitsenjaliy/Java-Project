package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class a extends JFrame implements ActionListener {

    String x[] = {"Roll Number", "Student Name", "Course Name", "Current Semester", ""};
    String y[][] = new String[20][6];

    JLabel l2;
    JTable t;
    JPanel p1;
    ButtonGroup G;
    JButton b1, b2, b3, b4;

    JRadioButton[] r1 = new JRadioButton[20];
    JRadioButton[] r2 = new JRadioButton[20];

    int i = 0, j = 0;

    a() {

        try {

            p1 = new JPanel();
            p1.setLayout(null);
            p1.setBackground(Color.YELLOW);
            p1.setBounds(0, 0, 1360, 180);
            add(p1);

            Conn c = new Conn();

            String str1 = "select * from add_new_student";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("roll_no");
                y[i][j++] = rs1.getString("student_name");
                y[i][j++] = rs1.getString("course_name");
                y[i][j++] = rs1.getString("current_semester");

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
        S.setBounds(0, 180, 1340, 550);
        add(S);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from add_new_subject";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int count = rs2.getInt(1);

            for (int i = 0; i < count; i++) {
                
                G = new ButtonGroup();

                r1[i] = new JRadioButton("A" + i);

                r1[i].setFont(new Font("Times New Roman", Font.PLAIN, 18));
                r1[i].setBounds(1100, 40 * i, 50, 35);
                r1[i].setBackground(Color.WHITE);
                r1[i].setForeground(Color.BLUE);
                G.add(r1[i]);
                t.add(r1[i]);

                r2[i] = new JRadioButton("A" + i);

                r2[i].setFont(new Font("Times New Roman", Font.PLAIN, 18));
                r2[i].setBounds(1200, 40 * i, 50, 35);
                r2[i].setBackground(Color.WHITE);
                r2[i].setForeground(Color.BLUE);
                G.add(r2[i]);
                t.add(r2[i]);

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(430, 180, 1360, 780);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        new a();
    }

}
