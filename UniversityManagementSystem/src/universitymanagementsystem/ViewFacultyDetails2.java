package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewFacultyDetails2 extends JFrame implements ActionListener {

    String user_account, enrollment_id_no, password, roll_no, faculty_name, father_name, age, gender, date_of_birth, phone_no, email_id, aadhar_card_no, alternate_phone_no, address, city, pin_code_no, course_name, course_code, admission_year, faculty_experience, faculty_salary, faculty_payment_status;
    JButton b1, b2;

    ViewFacultyDetails2(String enrollment_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_faculty where enrollment_id_no = '" + enrollment_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                user_account = rs1.getString("user_account");
                enrollment_id_no = rs1.getString("enrollment_id_no");
                password = rs1.getString("password");
                roll_no = rs1.getString("roll_no");
                faculty_name = rs1.getString("faculty_name");
                father_name = rs1.getString("father_name");
                age = rs1.getString("age");
                gender = rs1.getString("gender");
                date_of_birth = rs1.getString("date_of_birth");
                phone_no = rs1.getString("phone_no");
                email_id = rs1.getString("email_id");
                aadhar_card_no = rs1.getString("aadhar_card_no");
                alternate_phone_no = rs1.getString("alternate_phone_no");
                address = rs1.getString("address");
                city = rs1.getString("city");
                pin_code_no = rs1.getString("pin_code_no");
                course_name = rs1.getString("course_name");
                course_code = rs1.getString("course_code");
                admission_year = rs1.getString("admission_year");
                faculty_experience = rs1.getString("faculty_experience");
                faculty_salary = rs1.getString("faculty_salary");
                faculty_payment_status = rs1.getString("faculty_payment_status");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("USER ACCOUNT");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.ORANGE);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        JLabel l2 = new JLabel(user_account);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.CYAN);
        l2.setBounds(450, 130, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("ENROLLMENT ID NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.ORANGE);
        l3.setBounds(850, 130, 300, 30);
        add(l3);

        JLabel l4 = new JLabel(enrollment_id_no);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.CYAN);
        l4.setBounds(1200, 130, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("PASSWORD");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.ORANGE);
        l5.setBounds(100, 180, 300, 30);
        add(l5);

        JLabel l6 = new JLabel(password);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.CYAN);
        l6.setBounds(450, 180, 300, 30);
        add(l6);

        JLabel l7 = new JLabel("ROLL NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.ORANGE);
        l7.setBounds(850, 180, 300, 30);
        add(l7);

        JLabel l8 = new JLabel(roll_no);
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.CYAN);
        l8.setBounds(1200, 180, 300, 30);
        add(l8);

        JLabel l9 = new JLabel("FACULTY NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.ORANGE);
        l9.setBounds(100, 230, 300, 30);
        add(l9);

        JLabel l10 = new JLabel(faculty_name);
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.CYAN);
        l10.setBounds(450, 230, 600, 30);
        add(l10);

        JLabel l11 = new JLabel("FATHER NAME");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.ORANGE);
        l11.setBounds(850, 230, 300, 30);
        add(l11);

        JLabel l12 = new JLabel(father_name);
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.CYAN);
        l12.setBounds(1200, 230, 600, 30);
        add(l12);

        JLabel l13 = new JLabel("AGE");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.ORANGE);
        l13.setBounds(100, 280, 300, 30);
        add(l13);

        JLabel l14 = new JLabel(age);
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.CYAN);
        l14.setBounds(450, 280, 300, 30);
        add(l14);

        JLabel l15 = new JLabel("GENDER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.ORANGE);
        l15.setBounds(850, 280, 300, 30);
        add(l15);

        JLabel l16 = new JLabel(gender);
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.CYAN);
        l16.setBounds(1200, 280, 300, 30);
        add(l16);

        JLabel l17 = new JLabel("BIRTH DATE");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.ORANGE);
        l17.setBounds(100, 330, 300, 30);
        add(l17);

        JLabel l18 = new JLabel(date_of_birth);
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.CYAN);
        l18.setBounds(450, 330, 300, 30);
        add(l18);

        JLabel l19 = new JLabel("PHONE NUMBER");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.ORANGE);
        l19.setBounds(850, 330, 300, 30);
        add(l19);

        JLabel l20 = new JLabel(phone_no);
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.CYAN);
        l20.setBounds(1200, 330, 300, 30);
        add(l20);

        JLabel l21 = new JLabel("EMAIL ID");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.ORANGE);
        l21.setBounds(100, 380, 300, 30);
        add(l21);

        JLabel l22 = new JLabel(email_id);
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.CYAN);
        l22.setBounds(450, 380, 1000, 30);
        add(l22);

        JLabel l23 = new JLabel("AADHAR CARD NUMBER");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.ORANGE);
        l23.setBounds(850, 380, 300, 30);
        add(l23);

        JLabel l24 = new JLabel(aadhar_card_no);
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.CYAN);
        l24.setBounds(1200, 380, 300, 30);
        add(l24);

        JLabel l25 = new JLabel("ALTERNATE PHONE NUMBER");
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.ORANGE);
        l25.setBounds(100, 430, 310, 30);
        add(l25);

        JLabel l26 = new JLabel(alternate_phone_no);
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.CYAN);
        l26.setBounds(450, 430, 300, 30);
        add(l26);

        JLabel l27 = new JLabel("CITY");
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.ORANGE);
        l27.setBounds(850, 430, 300, 30);
        add(l27);

        JLabel l28 = new JLabel(city);
        l28.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l28.setForeground(Color.CYAN);
        l28.setBounds(1200, 430, 300, 30);
        add(l28);

        JLabel l29 = new JLabel("ADDRESS");
        l29.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l29.setForeground(Color.ORANGE);
        l29.setBounds(100, 480, 300, 30);
        add(l29);

        JLabel l30 = new JLabel(address);
        l30.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l30.setForeground(Color.CYAN);
        l30.setBounds(450, 480, 1500, 30);
        add(l30);

        JLabel l31 = new JLabel("PIN CODE NUMBER");
        l31.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l31.setForeground(Color.ORANGE);
        l31.setBounds(100, 530, 300, 30);
        add(l31);

        JLabel l32 = new JLabel(pin_code_no);
        l32.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l32.setForeground(Color.CYAN);
        l32.setBounds(450, 530, 300, 30);
        add(l32);

        JLabel l33 = new JLabel("COURSE NAME");
        l33.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l33.setForeground(Color.ORANGE);
        l33.setBounds(850, 530, 300, 30);
        add(l33);

        JLabel l34 = new JLabel(course_name);
        l34.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l34.setForeground(Color.CYAN);
        l34.setBounds(1200, 530, 600, 30);
        add(l34);

        JLabel l35 = new JLabel("COURSE CODE");
        l35.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l35.setForeground(Color.ORANGE);
        l35.setBounds(100, 580, 300, 30);
        add(l35);

        JLabel l36 = new JLabel(course_code);
        l36.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l36.setForeground(Color.CYAN);
        l36.setBounds(450, 580, 300, 30);
        add(l36);

        JLabel l37 = new JLabel("ADMISSION YEAR");
        l37.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l37.setForeground(Color.ORANGE);
        l37.setBounds(850, 580, 300, 30);
        add(l37);

        JLabel l38 = new JLabel(admission_year);
        l38.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l38.setForeground(Color.CYAN);
        l38.setBounds(1200, 580, 300, 30);
        add(l38);

        JLabel l39 = new JLabel("FACULTY EXPERIENCE");
        l39.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l39.setForeground(Color.ORANGE);
        l39.setBounds(100, 630, 300, 30);
        add(l39);

        JLabel l40 = new JLabel(faculty_experience);
        l40.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l40.setForeground(Color.CYAN);
        l40.setBounds(450, 630, 300, 30);
        add(l40);

        JLabel l41 = new JLabel("FACULTY SALARY");
        l41.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l41.setForeground(Color.ORANGE);
        l41.setBounds(850, 630, 300, 30);
        add(l41);

        JLabel l42 = new JLabel(faculty_salary);
        l42.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l42.setForeground(Color.CYAN);
        l42.setBounds(1200, 630, 300, 30);
        add(l42);

        JLabel l43 = new JLabel("FACULTY PAYMENT STATUS");
        l43.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l43.setForeground(Color.ORANGE);
        l43.setBounds(100, 680, 310, 30);
        add(l43);

        JLabel l44 = new JLabel(faculty_payment_status);
        l44.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l44.setForeground(Color.CYAN);
        l44.setBounds(450, 680, 300, 30);
        add(l44);

        b1 = new JButton("PRINT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(500, 750, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCLE");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(900, 750, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U15.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1600, 860, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l45 = new JLabel(i3);
        l45.setBounds(0, 0, 1600, 860);
        add(l45);

        JLabel l46 = new JLabel("YOUR INFORMATION");
        l46.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l46.setForeground(Color.PINK);
        l46.setBounds(540, 20, 800, 50);
        l45.add(l46);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(310, 140, 1600, 860);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            this.setVisible(false);
        }

    }

    public static void main(String[] args) {

        new ViewFacultyDetails2("");
    }

}
