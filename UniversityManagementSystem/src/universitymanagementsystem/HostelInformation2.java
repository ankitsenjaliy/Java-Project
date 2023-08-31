package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class HostelInformation2 extends JFrame implements ActionListener{

    String x[] = {"Room Number", "Student Name", "Hostel Name", "Gender", "Course Name"};
    String y[][] = new String[20][5];

    JLabel l2;
    JTable t;
    JButton b1;

    int i = 0, j = 0;

    HostelInformation2() {

        try {

            Conn c = new Conn();

            String str1 = "select * from add_new_student_hostel";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("room_no");
                y[i][j++] = rs1.getString("student_name");
                y[i][j++] = rs1.getString("hostel_name");
                y[i][j++] = rs1.getString("gender");
                y[i][j++] = rs1.getString("course_name");

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
        S.setBounds(0, 130, 1383, 601);
        add(S);

        b1 = new JButton("STUDENT DETAILS");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(1080, 50, 250, 50);
        b1.addActionListener(this);
        add(b1);

        JLabel l1 = new JLabel("STUDENT INFORMATION");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.RED);
        l1.setBounds(440, 20, 800, 50);
        add(l1);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from add_new_student_hostel";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int student = rs2.getInt(1);

            l2 = new JLabel("STUDENT = " + student);
            l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
            l2.setForeground(Color.BLUE);
            l2.setBounds(50, 60, 600, 30);
            add(l2);

        } catch (Exception e) {

            System.out.println(e);
        }

        JPanel p1 = new JPanel();
        p1.setBackground(Color.YELLOW);
        p1.setLayout(null);
        p1.setBounds(0, 0, 1400, 180);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.YELLOW);
        p2.setLayout(null);
        p2.setBounds(0, 730, 1400, 80);
        add(p2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 150, 1400, 850);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1){
            
            new HostelStudentDetails2().setVisible(true);
            this.setVisible(false);
        }
        
    }

    public static void main(String[] args) {

        new HostelInformation2();
    }

}
