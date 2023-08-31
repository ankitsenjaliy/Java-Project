package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FeesViewDetails extends JFrame implements ActionListener {

    String enrollment_id_no, roll_no, course_name, current_semester, current_year, student_name, gender, phone_no, university_fees, fees_status, hostel_status, hostel_fees;
    JButton b1, b2;

    FeesViewDetails(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from student_fees where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                enrollment_id_no = rs1.getString("enrollment_id_no");
                roll_no = rs1.getString("roll_no");
                course_name = rs1.getString("course_name");
                student_name = rs1.getString("student_name");
                current_semester = rs1.getString("current_semester");
                current_year = rs1.getString("current_year");
                gender = rs1.getString("gender");
                phone_no = rs1.getString("phone_no");
                university_fees = rs1.getString("university_fees");
                fees_status = rs1.getString("fees_status");
                hostel_status = rs1.getString("hostel_status");
                hostel_fees = rs1.getString("hostel_fees");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.GREEN);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        JLabel l2 = new JLabel(enrollment_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.CYAN);
        l2.setBounds(400, 130, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("ROLL NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.GREEN);
        l3.setBounds(650, 130, 300, 30);
        add(l3);

        JLabel l4 = new JLabel(roll_no);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.CYAN);
        l4.setBounds(900, 130, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("STUDENT NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.GREEN);
        l5.setBounds(100, 180, 300, 30);
        add(l5);

        JLabel l6 = new JLabel(student_name);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.CYAN);
        l6.setBounds(400, 180, 600, 30);
        add(l6);

        JLabel l7 = new JLabel("COURSE NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.GREEN);
        l7.setBounds(650, 180, 300, 30);
        add(l7);

        JLabel l8 = new JLabel(course_name);
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.CYAN);
        l8.setBounds(900, 180, 600, 30);
        add(l8);

        JLabel l9 = new JLabel("CURRENT SEMESTER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.GREEN);
        l9.setBounds(100, 230, 300, 30);
        add(l9);

        JLabel l10 = new JLabel(current_semester);
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.CYAN);
        l10.setBounds(400, 230, 300, 30);
        add(l10);

        JLabel l11 = new JLabel("CURRENT YEAR");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.GREEN);
        l11.setBounds(650, 230, 300, 30);
        add(l11);

        JLabel l12 = new JLabel(current_year);
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.CYAN);
        l12.setBounds(900, 230, 300, 30);
        add(l12);

        JLabel l13 = new JLabel("GENDER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.GREEN);
        l13.setBounds(100, 280, 300, 30);
        add(l13);

        JLabel l14 = new JLabel(gender);
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.CYAN);
        l14.setBounds(400, 280, 300, 30);
        add(l14);

        JLabel l15 = new JLabel("PHONE NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.GREEN);
        l15.setBounds(650, 280, 300, 30);
        add(l15);

        JLabel l16 = new JLabel(phone_no);
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.CYAN);
        l16.setBounds(900, 280, 300, 30);
        add(l16);

        JLabel l17 = new JLabel("UNIVERSITY FEES");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.GREEN);
        l17.setBounds(100, 330, 300, 30);
        add(l17);

        JLabel l18 = new JLabel(university_fees);
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.CYAN);
        l18.setBounds(400, 330, 300, 30);
        add(l18);

        JLabel l19 = new JLabel("FEES STATUS");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.GREEN);
        l19.setBounds(650, 330, 300, 30);
        add(l19);

        JLabel l20 = new JLabel(fees_status);
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.CYAN);
        l20.setBounds(900, 330, 300, 30);
        add(l20);

        JLabel l21 = new JLabel("HOSTEL STATUS");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.GREEN);
        l21.setBounds(100, 380, 300, 30);
        add(l21);

        JLabel l22 = new JLabel(hostel_status);
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.CYAN);
        l22.setBounds(400, 380, 300, 30);
        add(l22);

        JLabel l23 = new JLabel("HOSTEL FEES");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.GREEN);
        l23.setBounds(650, 380, 300, 30);
        add(l23);

        JLabel l24 = new JLabel(hostel_fees);
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.CYAN);
        l24.setBounds(900, 380, 300, 30);
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
        Image i2 = i1.getImage().getScaledInstance(1300, 580, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l25 = new JLabel(i3);
        l25.setBounds(0, 0, 1300, 580);
        add(l25);

        JLabel l26 = new JLabel("VIEW FEES DETAILS");
        l26.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l26.setForeground(Color.YELLOW);
        l26.setBounds(450, 20, 800, 50);
        l25.add(l26);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(460, 270, 1300, 580);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            new FeesInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new FeesInformation().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {

        new FeesViewDetails("");
    }

}
