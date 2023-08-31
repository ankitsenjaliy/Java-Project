package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentDashboard extends JFrame implements ActionListener {

    String enrollment_id_no, student_name;

    JLabel l1;
    JPanel p1, p2;
    JButton b1, b2, b3;

    StudentDashboard(String enrollment_id_no) {

        this.enrollment_id_no = enrollment_id_no;

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_student_university where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                student_name = rs1.getString("student_name");

            }
        } catch (Exception e) {

            System.out.println(e);
        }

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.YELLOW);
        p1.setBounds(0, 0, 1950, 80);
        add(p1);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.MAGENTA);
        p2.setBounds(0, 50, 300, 1000);
        add(p2);

        l1 = new JLabel(student_name);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l1.setForeground(Color.BLUE);
        l1.setBounds(120, 10, 1000, 60);
        p1.add(l1);

        b1 = new JButton("YOUR INFORMATION");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setMargin(new Insets(0, 0, 0, 50));
        b1.setBounds(0, 30, 300, 50);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton("FEES INFORMATION");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setMargin(new Insets(0, 0, 0, 60));
        b2.setBounds(0, 80, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton("CHANGE PASSWORD");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setMargin(new Insets(0, 0, 0, 60));
        b3.setBounds(0, 130, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1640, 930, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(280, 80, 1680, 930);
        add(l2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U4.jpg"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l3 = new JLabel(i6);
        l3.setBounds(20, 5, 70, 70);
        p1.add(l3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new ViewStudentDetails2(enrollment_id_no).setVisible(true);

        } else if (ae.getSource() == b2) {

            new FeesPayment(enrollment_id_no).setVisible(true);

        } else if (ae.getSource() == b3) {

            new ChangePasswordStudent(enrollment_id_no).setVisible(true);

        }
    }

    public static void main(String[] args) {

        new StudentDashboard("");
    }

}
