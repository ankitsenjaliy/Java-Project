package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewStudent3 extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38;
    JTextField t1;
    JComboBox C1, C2, c1;
    JButton b, b1, b2, b3, b4;

    AddNewStudent3() {

        JLabel l1 = new JLabel("ENROLLMENT ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.GREEN);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from student_fees where hostel_status = 'Yes' and status_2 = 'No'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("enrollment_id_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(450, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("ROLL NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 150, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(450, 150, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 230, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 230, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("HOSTEL NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.MAGENTA);
        l3.setBounds(850, 100, 300, 30);
        add(l3);

        String hostel_name[] = {"Boys Hostel", "Girls Hostel"};
        c1 = new JComboBox(hostel_name);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(1200, 100, 200, 30);
        add(c1);

        l4 = new JLabel("ROOM NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.MAGENTA);
        l4.setBounds(850, 150, 300, 30);
        add(l4);

        C2 = new JComboBox();

        try {

            Conn c = new Conn();

            String str2 = "select * from add_new_room where room_status = 'Not Booked'";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                C2.addItem(rs2.getString("room_no"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C2.setBackground(Color.WHITE);
        C2.setForeground(Color.BLUE);
        C2.setBounds(1200, 150, 200, 30);
        add(C2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U17.jpg"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        b = new JButton(i3);
        b.setBounds(1410, 150, 30, 30);
        b.addActionListener(this);
        add(b);

        l5 = new JLabel("ROOM ID NUMBER");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.MAGENTA);
        l5.setBounds(850, 200, 300, 30);
        add(l5);

        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(1200, 200, 300, 30);
        add(l6);

        l7 = new JLabel("STUDENT NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.ORANGE);
        l7.setBounds(850, 250, 300, 30);
        add(l7);

        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.CYAN);
        l8.setBounds(1200, 250, 600, 30);
        add(l8);

        l9 = new JLabel("FATHER NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.ORANGE);
        l9.setBounds(100, 300, 300, 30);
        add(l9);

        l10 = new JLabel();
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.CYAN);
        l10.setBounds(450, 300, 600, 30);
        add(l10);

        l11 = new JLabel("AGE");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.ORANGE);
        l11.setBounds(850, 300, 300, 30);
        add(l11);

        l12 = new JLabel();
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.CYAN);
        l12.setBounds(1200, 300, 300, 30);
        add(l12);

        l13 = new JLabel("GENDER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.ORANGE);
        l13.setBounds(100, 350, 300, 30);
        add(l13);

        l14 = new JLabel();
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.CYAN);
        l14.setBounds(450, 350, 300, 30);
        add(l14);

        l15 = new JLabel("BIRTH DATE");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.ORANGE);
        l15.setBounds(850, 350, 300, 30);
        add(l15);

        l16 = new JLabel();
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.CYAN);
        l16.setBounds(1200, 350, 300, 30);
        add(l16);

        l17 = new JLabel("PHONE NUMBER");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.ORANGE);
        l17.setBounds(100, 400, 300, 30);
        add(l17);

        l18 = new JLabel();
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.CYAN);
        l18.setBounds(450, 400, 300, 30);
        add(l18);

        l19 = new JLabel("EMAIL ID");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.ORANGE);
        l19.setBounds(850, 400, 300, 30);
        add(l19);

        l20 = new JLabel();
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.CYAN);
        l20.setBounds(1200, 400, 1000, 30);
        add(l20);

        l21 = new JLabel("AADHAR CARD NUMBER");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.ORANGE);
        l21.setBounds(850, 450, 300, 30);
        add(l21);

        l22 = new JLabel();
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.CYAN);
        l22.setBounds(1200, 450, 300, 30);
        add(l22);

        l23 = new JLabel("FATHER PHONE NUMBER");
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.ORANGE);
        l23.setBounds(100, 450, 300, 30);
        add(l23);

        l24 = new JLabel();
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.CYAN);
        l24.setBounds(450, 450, 300, 30);
        add(l24);

        l25 = new JLabel("ADDRESS");
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.ORANGE);
        l25.setBounds(100, 500, 300, 30);
        add(l25);

        l26 = new JLabel();
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.CYAN);
        l26.setBounds(450, 500, 1500, 30);
        add(l26);

        l27 = new JLabel("CITY");
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.ORANGE);
        l27.setBounds(100, 550, 300, 30);
        add(l27);

        l28 = new JLabel();
        l28.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l28.setForeground(Color.CYAN);
        l28.setBounds(450, 550, 300, 30);
        add(l28);

        l29 = new JLabel("PIN CODE NUMBER");
        l29.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l29.setForeground(Color.ORANGE);
        l29.setBounds(850, 550, 300, 30);
        add(l29);

        l30 = new JLabel();
        l30.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l30.setForeground(Color.CYAN);
        l30.setBounds(1200, 550, 300, 30);
        add(l30);

        l31 = new JLabel("COURSE NAME");
        l31.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l31.setForeground(Color.ORANGE);
        l31.setBounds(100, 600, 300, 30);
        add(l31);

        l32 = new JLabel();
        l32.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l32.setForeground(Color.CYAN);
        l32.setBounds(450, 600, 600, 30);
        add(l32);

        l33 = new JLabel("CURRENT SEMESTER");
        l33.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l33.setForeground(Color.ORANGE);
        l33.setBounds(850, 600, 300, 30);
        add(l33);

        l34 = new JLabel();
        l34.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l34.setForeground(Color.CYAN);
        l34.setBounds(1200, 600, 300, 30);
        add(l34);

        l35 = new JLabel("CURRENT YEAR");
        l35.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l35.setForeground(Color.ORANGE);
        l35.setBounds(100, 650, 300, 30);
        add(l35);

        l36 = new JLabel();
        l36.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l36.setForeground(Color.CYAN);
        l36.setBounds(450, 650, 300, 30);
        add(l36);

        l37 = new JLabel("ADMISSION YEAR");
        l37.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l37.setForeground(Color.ORANGE);
        l37.setBounds(850, 650, 300, 30);
        add(l37);

        l38 = new JLabel();
        l38.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l38.setForeground(Color.CYAN);
        l38.setBounds(1200, 650, 300, 30);
        add(l38);

        b3 = new JButton("SUBMIT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(500, 720, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(800, 720, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l3.setVisible(false);
        c1.setVisible(false);
        l4.setVisible(false);
        C2.setVisible(false);
        b.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false);
        l10.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        l13.setVisible(false);
        l14.setVisible(false);
        l15.setVisible(false);
        l16.setVisible(false);
        l17.setVisible(false);
        l18.setVisible(false);
        l19.setVisible(false);
        l20.setVisible(false);
        l21.setVisible(false);
        l22.setVisible(false);
        l23.setVisible(false);
        l24.setVisible(false);
        l25.setVisible(false);
        l26.setVisible(false);
        l27.setVisible(false);
        l28.setVisible(false);
        l29.setVisible(false);
        l30.setVisible(false);
        l31.setVisible(false);
        l32.setVisible(false);
        l33.setVisible(false);
        l34.setVisible(false);
        l35.setVisible(false);
        l36.setVisible(false);
        l37.setVisible(false);
        l38.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U15.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l39 = new JLabel(i6);
        l39.setBounds(0, 0, 1550, 830);
        add(l39);

        JLabel l40 = new JLabel("NEW ADMISSION STUDENT");
        l40.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l40.setForeground(Color.YELLOW);
        l40.setBounds(500, 20, 800, 50);
        l39.add(l40);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(330, 160, 1550, 830);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String roll_no = t1.getText();

            if ((t1.getText().isEmpty()) || check_roll_no(t1.getText())) {

                if (roll_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_roll_no(t1.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 4 Digit Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {

                try {

                    Conn c = new Conn();

                    String str3 = "select * from add_new_student_university where enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "'";

                    ResultSet rs3 = c.s.executeQuery(str3);

                    if (rs3.next()) {

                        l3.setVisible(true);
                        c1.setVisible(true);
                        l4.setVisible(true);
                        C2.setVisible(true);
                        b.setVisible(true);
                        l5.setVisible(true);
                        l6.setVisible(true);
                        l7.setVisible(true);
                        l8.setVisible(true);
                        l9.setVisible(true);
                        l10.setVisible(true);
                        l11.setVisible(true);
                        l12.setVisible(true);
                        l13.setVisible(true);
                        l14.setVisible(true);
                        l15.setVisible(true);
                        l16.setVisible(true);
                        l17.setVisible(true);
                        l18.setVisible(true);
                        l19.setVisible(true);
                        l20.setVisible(true);
                        l21.setVisible(true);
                        l22.setVisible(true);
                        l23.setVisible(true);
                        l24.setVisible(true);
                        l25.setVisible(true);
                        l26.setVisible(true);
                        l27.setVisible(true);
                        l28.setVisible(true);
                        l29.setVisible(true);
                        l30.setVisible(true);
                        l31.setVisible(true);
                        l32.setVisible(true);
                        l33.setVisible(true);
                        l34.setVisible(true);
                        l35.setVisible(true);
                        l36.setVisible(true);
                        l37.setVisible(true);
                        l38.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String student_name = rs3.getString("student_name");
                        String father_name = rs3.getString("father_name");
                        String age = rs3.getString("age");
                        String gender = rs3.getString("gender");
                        String date_of_birth = rs3.getString("date_of_birth");
                        String phone_no = rs3.getString("phone_no");
                        String email_id = rs3.getString("email_id");
                        String aadhar_card_no = rs3.getString("aadhar_card_no");
                        String father_phone_no = rs3.getString("father_phone_no");
                        String address = rs3.getString("address");
                        String city = rs3.getString("city");
                        String pin_code_no = rs3.getString("pin_code_no");
                        String course_name = rs3.getString("course_name");
                        String current_semester = rs3.getString("current_semester");
                        String current_year = rs3.getString("current_year");
                        String admission_year = rs3.getString("admission_year");

                        l8.setText(student_name);
                        l10.setText(father_name);
                        l12.setText(age);
                        l14.setText(gender);
                        l16.setText(date_of_birth);
                        l18.setText(phone_no);
                        l20.setText(email_id);
                        l22.setText(aadhar_card_no);
                        l24.setText(father_phone_no);
                        l26.setText(address);
                        l28.setText(city);
                        l30.setText(pin_code_no);
                        l32.setText(course_name);
                        l34.setText(current_semester);
                        l36.setText(current_year);
                        l38.setText(admission_year);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new HostelInformation1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b) {

            String hostel_name = (String) c1.getSelectedItem();
            String room_no = (String) C2.getSelectedItem();

            try {

                Conn c = new Conn();

                String str4 = "select * from add_new_room where room_no = '" + room_no + "' and hostel_name = '" + hostel_name + "'";

                ResultSet rs4 = c.s.executeQuery(str4);

                while (rs4.next()) {

                    String room_id_no = rs4.getString("room_id_no");

                    l6.setText(room_id_no);
                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b3) {

            String enrollment_id_no = (String) C1.getSelectedItem();

            String roll_no = t1.getText();

            String hostel_name = (String) c1.getSelectedItem();
            String room_no = (String) C2.getSelectedItem();

            String room_id_no = l6.getText();

            String student_name = l8.getText();
            String father_name = l10.getText();
            String age = l12.getText();
            String gender = l14.getText();
            String date_of_birth = l16.getText();
            String phone_no = l18.getText();
            String email_id = l20.getText();
            String aadhar_card_no = l22.getText();
            String father_phone_no = l24.getText();
            String address = l26.getText();
            String city = l28.getText();
            String pin_code_no = l30.getText();
            String course_name = l32.getText();
            String current_semester = l34.getText();
            String current_year = l36.getText();
            String admission_year = l38.getText();

            try {

                Conn c = new Conn();

                String str5 = "insert into add_new_student_hostel values('" + room_id_no + "','" + enrollment_id_no + "','" + roll_no + "','" + hostel_name + "','" + room_no + "','" + student_name + "','" + father_name + "','" + age + "','" + gender + "','" + date_of_birth + "','" + phone_no + "','" + email_id + "','" + aadhar_card_no + "','" + father_phone_no + "','" + address + "','" + city + "','" + pin_code_no + "','" + course_name + "','" + current_semester + "','" + current_year + "','" + admission_year + "')";
                c.s.executeUpdate(str5);

                String str6 = "update add_new_room set room_status = 'Booked', student_status = 'Yes' where room_no = '" + room_no + "'";
                c.s.executeUpdate(str6);

                String str7 = "update student_fees set status_2 = 'Yes' where enrollment_id_no = '" + enrollment_id_no + "'";
                c.s.executeUpdate(str7);

                JOptionPane.showMessageDialog(null, "New Student Added");

                new HostelInformation1().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b4) {

            new HostelInformation1().setVisible(true);
            this.setVisible(false);
        }

    }

    Boolean check_roll_no(String s) {

        char s1[] = new char[5];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 4) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        new AddNewStudent3();
    }

}
