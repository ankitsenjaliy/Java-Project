package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewStudent1 extends JFrame implements ActionListener {

    JLabel l1;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    ButtonGroup G;
    JRadioButton r1, r2;
    JComboBox C1, C2, c1, c2, c3, c4;
    JButton b1, b2;

    AddNewStudent1() {

        l1 = new JLabel("Student");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 80, 300, 30);
        add(l1);

        JLabel l2 = new JLabel("STUDENT NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLACK);
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
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Only Alphabet Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l3 = new JLabel("FATHER NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLACK);
        l3.setBounds(800, 150, 300, 30);
        add(l3);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(1150, 150, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Only Alphabet Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l4 = new JLabel("AGE");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLACK);
        l4.setBounds(100, 200, 300, 30);
        add(l4);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.BLUE);
        t3.setBounds(450, 200, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l5 = new JLabel("GENDER");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLACK);
        l5.setBounds(800, 200, 300, 30);
        add(l5);

        G = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r1.setBackground(Color.WHITE);
        r1.setForeground(Color.BLUE);
        r1.setBounds(1150, 200, 80, 30);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r2.setBackground(Color.WHITE);
        r2.setForeground(Color.BLUE);
        r2.setBounds(1270, 200, 80, 30);
        G.add(r2);
        add(r2);

        JLabel l6 = new JLabel("BIRTH DATE");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.BLACK);
        l6.setBounds(100, 250, 300, 30);
        add(l6);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.RED);
        t4.setBounds(450, 250, 200, 30);
        add(t4);

        t4.setColumns(10);
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l7 = new JLabel("PHONE NUMBER");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.BLACK);
        l7.setBounds(800, 250, 300, 30);
        add(l7);

        t5 = new JTextField();
        t5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t5.setForeground(Color.RED);
        t5.setBounds(1150, 250, 200, 30);
        add(t5);

        t5.setColumns(10);
        t5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l8 = new JLabel("EMAIL ID");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.BLACK);
        l8.setBounds(100, 300, 300, 30);
        add(l8);

        t6 = new JTextField();
        t6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t6.setForeground(Color.BLUE);
        t6.setBounds(450, 300, 200, 30);
        add(t6);

        t6.setColumns(10);
        t6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '@') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Only Small Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l9 = new JLabel("AADHAR CARD NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.BLACK);
        l9.setBounds(800, 300, 300, 30);
        add(l9);

        t7 = new JTextField();
        t7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t7.setForeground(Color.BLUE);
        t7.setBounds(1150, 300, 200, 30);
        add(t7);

        t7.setColumns(10);
        t7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l10 = new JLabel("FATHER PHONE NUMBER");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.BLACK);
        l10.setBounds(100, 350, 300, 30);
        add(l10);

        t8 = new JTextField();
        t8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t8.setForeground(Color.RED);
        t8.setBounds(450, 350, 200, 30);
        add(t8);

        t8.setColumns(10);
        t8.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l11 = new JLabel("CLASS X(%)");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.BLACK);
        l11.setBounds(800, 350, 300, 30);
        add(l11);

        t9 = new JTextField();
        t9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t9.setForeground(Color.RED);
        t9.setBounds(1150, 350, 200, 30);
        add(t9);

        t9.setColumns(10);
        t9.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l12 = new JLabel("CLASS XII(%)");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.BLACK);
        l12.setBounds(100, 400, 300, 30);
        add(l12);

        t10 = new JTextField();
        t10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t10.setForeground(Color.BLUE);
        t10.setBounds(450, 400, 200, 30);
        add(t10);

        t10.setColumns(10);
        t10.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l13 = new JLabel("ADDRESS");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.BLACK);
        l13.setBounds(800, 400, 300, 30);
        add(l13);

        t11 = new JTextField();
        t11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t11.setForeground(Color.BLUE);
        t11.setBounds(1150, 400, 200, 30);
        add(t11);

        t11.setColumns(10);
        t11.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l14 = new JLabel("CITY");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.BLACK);
        l14.setBounds(100, 450, 300, 30);
        add(l14);

        String city[] = {"Rajkot", "Ahmadabad", "Surat", "Baroda", "Jamnagar", "Bhavnagar", "Junagadh", "Gandhinagar", "Anand", "Amreli", "Banas Kantha", "Bharuch", "Dahod", "Kachchh", "Kheda", "Mahesana", "Narmada", "Navsari", "Panch Mahal", "Patan", "Porbandar", "Sabar Kantha", "Surendranagar", "Tapi", "Morbi", "Valsad", "Nadiad", "Bhuj", "Gandhidham", "Vapi", "Gondal", "Somnath", "Godhra", "Kalol", "Botad", "Jetpur"};
        c1 = new JComboBox(city);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(450, 450, 200, 30);
        add(c1);

        JLabel l15 = new JLabel("PIN CODE NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.BLACK);
        l15.setBounds(800, 450, 300, 30);
        add(l15);

        t12 = new JTextField();
        t12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t12.setForeground(Color.RED);
        t12.setBounds(1150, 450, 200, 30);
        add(t12);

        t12.setColumns(10);
        t12.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l16 = new JLabel("COURSE NAME");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.BLACK);
        l16.setBounds(100, 500, 300, 30);
        add(l16);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_course";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("course_name"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(450, 500, 200, 30);
        add(C1);

        JLabel l17 = new JLabel("COURSE CODE");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.BLACK);
        l17.setBounds(800, 500, 300, 30);
        add(l17);

        C2 = new JComboBox();

        try {
            Conn c = new Conn();

            String str2 = "select * from add_new_course";

            ResultSet rs2 = c.s.executeQuery(str2);

            while (rs2.next()) {

                C2.addItem(rs2.getString("course_code"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C2.setBackground(Color.WHITE);
        C2.setForeground(Color.BLUE);
        C2.setBounds(1150, 500, 200, 30);
        add(C2);

        JLabel l18 = new JLabel("CURRENT SEMESTER");
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.BLACK);
        l18.setBounds(100, 550, 300, 30);
        add(l18);

        String current_semester[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        c2 = new JComboBox(current_semester);
        c2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.RED);
        c2.setBounds(450, 550, 200, 30);
        add(c2);

        JLabel l19 = new JLabel("CURRENT YEAR");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.BLACK);
        l19.setBounds(800, 550, 300, 30);
        add(l19);

        String current_year[] = {"1", "2", "3", "4"};
        c3 = new JComboBox(current_year);
        c3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c3.setBackground(Color.WHITE);
        c3.setForeground(Color.RED);
        c3.setBounds(1150, 550, 200, 30);
        add(c3);

        JLabel l20 = new JLabel("ADMISSION YEAR");
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.BLACK);
        l20.setBounds(100, 600, 300, 30);
        add(l20);

        String admission_year[] = {"2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"};
        c4 = new JComboBox(admission_year);
        c4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c4.setBackground(Color.WHITE);
        c4.setForeground(Color.BLUE);
        c4.setBounds(450, 600, 200, 30);
        add(c4);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(500, 660, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(800, 660, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U11.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1450, 780, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l21 = new JLabel(i3);
        l21.setBounds(0, 0, 1450, 780);
        add(l21);

        JLabel l22 = new JLabel("NEW ADMISSION STUDENT");
        l22.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l22.setForeground(Color.GREEN);
        l22.setBounds(450, 20, 800, 50);
        l21.add(l22);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(390, 180, 1450, 780);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String user_account = l1.getText();
            String enrollment_id_no;
            String password;

            String student_name = t1.getText();
            String father_name = t2.getText();
            String age = t3.getText();

            String gender = null;

            if (r1.isSelected()) {

                gender = "Male";

            } else if (r2.isSelected()) {

                gender = "Female";
            }

            String date_of_birth = t4.getText();
            String phone_no = t5.getText();
            String email_id = t6.getText();
            String aadhar_card_no = t7.getText();
            String father_phone_no = t8.getText();
            String class_X = t9.getText();
            String class_XII = t10.getText();
            String address = t11.getText();

            String city = (String) c1.getSelectedItem();

            String pin_code_no = t12.getText();

            String course_name = (String) C1.getSelectedItem();
            String course_code = (String) C2.getSelectedItem();

            String current_semester = (String) c2.getSelectedItem();
            String current_year = (String) c3.getSelectedItem();
            String admission_year = (String) c4.getSelectedItem();

            String status_1 = "No";

            if (t1.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Father Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t3.getText().isEmpty()) || check_age(t3.getText())) {

                if (age.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Age", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_age(t3.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 2 Digit Age", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else if ((t4.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Birth Date", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t5.getText().isEmpty()) || check_phone_no(t5.getText())) {

                if (phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_phone_no(t5.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 10 Digit Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t6.getText().isEmpty()) || check_email_id(t6.getText())) {

                if (email_id.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_email_id(t6.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t7.getText().isEmpty()) || check_aadhar_card_no(t7.getText())) {

                if (aadhar_card_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_aadhar_card_no(t7.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 12 Digit Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else if ((t8.getText().isEmpty()) || check_father_phone_no(t8.getText())) {

                if (father_phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Father Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_father_phone_no(t8.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 10 Digit Father Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }
            } else if (t9.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Class 10 Percentages", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t10.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Class 12 Percentages", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t11.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Address", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t12.getText().isEmpty()) || check_pin_code_no(t12.getText())) {

                if (pin_code_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Address Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_pin_code_no(t12.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 6 Digit Address Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {

                try {

                    Conn c = new Conn();

                    int rollno = 1001;

                    String admission = String.valueOf(admission_year).substring(2);

                    String aadhar_card_number = String.valueOf(aadhar_card_no).substring(8);
                    String phone_number = String.valueOf(phone_no).substring(6);

                    String str3 = "select COUNT(*) from add_new_student_university where course_name = '" + course_name + "' and admission_year = '" + admission_year + "'";

                    ResultSet rs3 = c.s.executeQuery(str3);

                    rs3.next();

                    int roll_no = rollno + rs3.getInt(1);

                    enrollment_id_no = admission + course_code + "0" + roll_no;

                    password = aadhar_card_number + phone_number;

                    String str4 = "insert into add_new_student_university values('" + user_account + "','" + enrollment_id_no + "','" + password + "','" + roll_no + "', '" + student_name + "', '" + father_name + "', '" + age + "', '" + gender + "', '" + date_of_birth + "', '" + phone_no + "', '" + email_id + "','" + aadhar_card_no + "', '" + father_phone_no + "', '" + class_X + "', '" + class_XII + "', '" + address + "', '" + city + "', '" + pin_code_no + "', '" + course_name + "', '" + course_code + "','" + current_semester + "','" + current_year + "', '" + admission_year + "', '" + status_1 + "')";
                    c.s.executeUpdate(str4);

                    String str5 = "insert into student_faculty_login values('" + user_account + "','" + enrollment_id_no + "', '" + password + "','" + roll_no + "')";
                    c.s.executeUpdate(str5);

                    JOptionPane.showMessageDialog(null, "New Student Added" + "\n Enrollment Id Number = " + enrollment_id_no + "\n Password = " + password + "\n Roll Number = " + roll_no);

                    new StudentInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == b2) {

            new StudentInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    Boolean check_age(String s) {

        char s1[] = new char[3];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 2) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_phone_no(String s) {

        char s1[] = new char[11];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 10) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_email_id(String s) {

        char s1[] = new char[50];
        s1 = s.toCharArray();
        int i = 0, z = 0, m = 0;
        while (i != s1.length) {
            if (s1[i] == '@') {
                z = 1;
            } else if (s1[i] == '.') {
                m = 1;
            }
            i++;
        }
        if (z == 1 && m == 1) {
            return false;
        } else {
            return true;
        }
    }

    Boolean check_aadhar_card_no(String s) {

        char s1[] = new char[13];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {

            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 12) {
            return true;
        } else {
            return false;
        }
    }

    Boolean check_father_phone_no(String s) {

        char s1[] = new char[11];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 10) {
            return true;
        } else {
            return false;
        }

    }

    Boolean check_pin_code_no(String s) {

        char s1[] = new char[7];
        s1 = s.toCharArray();
        int i = 0, c = 0;
        while (i != s1.length) {
            if (s1[i] != '0' || s1[i] != '1' || s1[i] != '2' || s1[i] != '3' || s1[i] != '4' || s1[i] != '5' || s1[i] != '6' || s1[i] != '7' || s1[i] != '8' || s1[i] != '9') {
                c = 1;
            }

            i++;
        }
        if (c == 1 && i != 6) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        new AddNewStudent1();
    }

}
