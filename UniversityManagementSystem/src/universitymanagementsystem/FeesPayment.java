package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FeesPayment extends JFrame implements ActionListener {

    String enrollment_id_no, roll_no, student_name, gender, phone_no, course_name, current_semester, university_fees, hostel_fees;

    JLabel l2, l4, l20;
    JButton b1, b2;

    FeesPayment(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from student_fees where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                enrollment_id_no = rs1.getString("enrollment_id_no");
                roll_no = rs1.getString("roll_no");
                student_name = rs1.getString("student_name");
                gender = rs1.getString("gender");
                phone_no = rs1.getString("phone_no");
                course_name = rs1.getString("course_name");
                current_semester = rs1.getString("current_semester");
                university_fees = rs1.getString("university_fees");
                hostel_fees = rs1.getString("hostel_fees");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.CYAN);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        l2 = new JLabel(enrollment_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(450, 130, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("ROLL NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(750, 130, 300, 30);
        add(l3);

        l4 = new JLabel(roll_no);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(1000, 130, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("STUDENT NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(100, 180, 300, 30);
        add(l5);

        JLabel l6 = new JLabel(student_name);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(450, 180, 600, 30);
        add(l6);

        JLabel l7 = new JLabel("GENDER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.CYAN);
        l7.setBounds(750, 180, 300, 30);
        add(l7);

        JLabel l8 = new JLabel(gender);
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(1000, 180, 300, 30);
        add(l8);

        JLabel l9 = new JLabel("PHONE NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(100, 230, 300, 30);
        add(l9);

        JLabel l10 = new JLabel(phone_no);
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(450, 230, 300, 30);
        add(l10);

        JLabel l11 = new JLabel("COURSE NAME");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.CYAN);
        l11.setBounds(750, 230, 300, 30);
        add(l11);

        JLabel l12 = new JLabel(course_name);
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.YELLOW);
        l12.setBounds(1000, 230, 600, 30);
        add(l12);

        JLabel l13 = new JLabel("CURRENT SEMESTER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.CYAN);
        l13.setBounds(100, 280, 300, 30);
        add(l13);

        JLabel l14 = new JLabel(current_semester);
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.YELLOW);
        l14.setBounds(450, 280, 300, 30);
        add(l14);

        JLabel l15 = new JLabel("UNIVERSITY FEES");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.YELLOW);
        l15.setBounds(750, 280, 300, 30);
        add(l15);

        JLabel l16 = new JLabel(university_fees);
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.GREEN);
        l16.setBounds(1000, 280, 300, 30);
        add(l16);

        JLabel l17 = new JLabel("HOSTEL FEES");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.YELLOW);
        l17.setBounds(100, 330, 300, 30);
        add(l17);

        JLabel l18 = new JLabel(hostel_fees);
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.GREEN);
        l18.setBounds(450, 330, 300, 30);
        add(l18);

        JLabel l19 = new JLabel("TOTAL FEES");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.YELLOW);
        l19.setBounds(750, 330, 300, 30);
        add(l19);

        l20 = new JLabel();
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.GREEN);
        l20.setBounds(1000, 330, 300, 30);
        add(l20);

        try {

            String total_fees;

            Conn c = new Conn();

            String str2 = "select * from student_fees where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                int value = Integer.parseInt(university_fees) + Integer.parseInt(hostel_fees);

                total_fees = String.valueOf(value);

                l20.setText(total_fees);

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        b1 = new JButton("PAY");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 410, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(750, 410, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 530, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(0, 0, 1400, 530);
        add(l21);

        JLabel l22 = new JLabel("YOUR FEES DETAILS");
        l22.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l22.setForeground(Color.GREEN);
        l22.setBounds(480, 20, 800, 50);
        l21.add(l22);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 300, 1400, 530);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String enrollment_id_no = l2.getText();
            String roll_no = l4.getText();

            try {

                Conn c = new Conn();

                String str3 = "Update student_fees set fees_status = 'Yes' where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";
                c.s.executeUpdate(str3);

            } catch (Exception e) {

                System.out.println(e);
            }

            JOptionPane.showMessageDialog(null, "Payment SuccessFully");

            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            this.setVisible(false);
        }

    }

    public static void main(String[] args) {

        new FeesPayment("");
    }

}
