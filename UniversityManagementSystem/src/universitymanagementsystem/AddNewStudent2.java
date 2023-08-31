package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewStudent2 extends JFrame implements ActionListener {

    JLabel l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13;
    ButtonGroup G;
    JRadioButton r1, r2;
    JComboBox C1, c1, c2;
    JButton b1, b2, b3, b4;

    AddNewStudent2() {

        JLabel l1 = new JLabel("COURSE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.CYAN);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

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
        C1.setBounds(400, 100, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("CURRENT SEMESTER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.CYAN);
        l2.setBounds(100, 150, 300, 30);
        add(l2);

        String current_semester[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        c1 = new JComboBox(current_semester);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(400, 150, 200, 30);
        add(c1);

        JLabel l3 = new JLabel("ROLL NUMBER");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(100, 200, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(400, 200, 200, 30);
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
        b1.setBounds(150, 270, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 270, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l4 = new JLabel("ENROLLMENT ID NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.CYAN);
        l4.setBounds(850, 100, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(1200, 100, 300, 30);
        add(l5);

        l6 = new JLabel("USER ACCOUNT");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.CYAN);
        l6.setBounds(850, 150, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(1200, 150, 300, 30);
        add(l7);

        l8 = new JLabel("STUDENT NAME");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(850, 200, 300, 30);
        add(l8);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(1200, 200, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Only Alphabet keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l9 = new JLabel("FATHER NAME");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(850, 250, 300, 30);
        add(l9);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.BLUE);
        t3.setBounds(1200, 250, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Only Alphabet keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l10 = new JLabel("AGE");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(850, 300, 300, 30);
        add(l10);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.RED);
        t4.setBounds(1200, 300, 200, 30);
        add(t4);

        t4.setColumns(10);
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l11 = new JLabel("GENDER");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(100, 350, 300, 30);
        add(l11);

        G = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r1.setBackground(Color.WHITE);
        r1.setForeground(Color.BLUE);
        r1.setBounds(450, 350, 80, 30);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r2.setBackground(Color.WHITE);
        r2.setForeground(Color.BLUE);
        r2.setBounds(570, 350, 80, 30);
        G.add(r2);
        add(r2);

        l12 = new JLabel("BIRTH DATE");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.YELLOW);
        l12.setBounds(850, 350, 300, 30);
        add(l12);

        t5 = new JTextField();
        t5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t5.setForeground(Color.BLUE);
        t5.setBounds(1200, 350, 200, 30);
        add(t5);

        t5.setColumns(10);
        t5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l13 = new JLabel("PHONE NUMBER");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.YELLOW);
        l13.setBounds(100, 400, 300, 30);
        add(l13);

        t6 = new JTextField();
        t6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t6.setForeground(Color.RED);
        t6.setBounds(450, 400, 200, 30);
        add(t6);

        t6.setColumns(10);
        t6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l14 = new JLabel("EMAIL ID");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.YELLOW);
        l14.setBounds(850, 400, 300, 30);
        add(l14);

        t7 = new JTextField();
        t7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t7.setForeground(Color.RED);
        t7.setBounds(1200, 400, 200, 30);
        add(t7);

        t7.setColumns(10);
        t7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '@') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Only Small Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l15 = new JLabel("AADHAR CARD NUMBER");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.YELLOW);
        l15.setBounds(100, 450, 300, 30);
        add(l15);

        t8 = new JTextField();
        t8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t8.setForeground(Color.BLUE);
        t8.setBounds(450, 450, 200, 30);
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

        l16 = new JLabel("FATHER PHONE NUMBER");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.YELLOW);
        l16.setBounds(850, 450, 300, 30);
        add(l16);

        t9 = new JTextField();
        t9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t9.setForeground(Color.BLUE);
        t9.setBounds(1200, 450, 200, 30);
        add(t9);

        t9.setColumns(10);
        t9.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l17 = new JLabel("CLASS X(%)");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.YELLOW);
        l17.setBounds(100, 500, 300, 30);
        add(l17);

        t10 = new JTextField();
        t10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t10.setForeground(Color.RED);
        t10.setBounds(450, 500, 200, 30);
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

        l18 = new JLabel("CLASS XII(%)");
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.YELLOW);
        l18.setBounds(850, 500, 300, 30);
        add(l18);

        t11 = new JTextField();
        t11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t11.setForeground(Color.RED);
        t11.setBounds(1200, 500, 200, 30);
        add(t11);

        t11.setColumns(10);
        t11.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l19 = new JLabel("ADDRESS");
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.YELLOW);
        l19.setBounds(100, 550, 300, 30);
        add(l19);

        t12 = new JTextField();
        t12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t12.setForeground(Color.BLUE);
        t12.setBounds(450, 550, 200, 30);
        add(t12);

        t12.setColumns(10);
        t12.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l20 = new JLabel("CITY");
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.YELLOW);
        l20.setBounds(850, 550, 300, 30);
        add(l20);

        String city[] = {"Rajkot", "Ahmadabad", "Surat", "Baroda", "Jamnagar", "Bhavnagar", "Junagadh", "Gandhinagar", "Anand", "Amreli", "Banas Kantha", "Bharuch", "Dahod", "Kachchh", "Kheda", "Mahesana", "Narmada", "Navsari", "Panch Mahal", "Patan", "Porbandar", "Sabar Kantha", "Surendranagar", "Tapi", "Morbi", "Valsad", "Nadiad", "Bhuj", "Gandhidham", "Vapi", "Gondal", "Somnath", "Godhra", "Kalol", "Botad", "Jetpur"};
        c2 = new JComboBox(city);
        c2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c2.setBackground(Color.WHITE);
        c2.setForeground(Color.BLUE);
        c2.setBounds(1200, 550, 200, 30);
        add(c2);

        l21 = new JLabel("PIN CODE NUMBER");
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.YELLOW);
        l21.setBounds(100, 600, 300, 30);
        add(l21);

        t13 = new JTextField();
        t13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t13.setForeground(Color.RED);
        t13.setBounds(450, 600, 200, 30);
        add(t13);

        t13.setColumns(10);
        t13.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l22 = new JLabel("COURSE CODE");
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.CYAN);
        l22.setBounds(850, 600, 300, 30);
        add(l22);

        l23 = new JLabel();
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.YELLOW);
        l23.setBounds(1200, 600, 300, 30);
        add(l23);

        l24 = new JLabel("CURRENT YEAR");
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.CYAN);
        l24.setBounds(100, 650, 300, 30);
        add(l24);

        l25 = new JLabel();
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.YELLOW);
        l25.setBounds(450, 650, 300, 30);
        add(l25);

        l26 = new JLabel("ADMISSION YEAR");
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.CYAN);
        l26.setBounds(850, 650, 300, 30);
        add(l26);

        l27 = new JLabel();
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.YELLOW);
        l27.setBounds(1200, 650, 300, 30);
        add(l27);

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

        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        t2.setVisible(false);
        l9.setVisible(false);
        t3.setVisible(false);
        l10.setVisible(false);
        t4.setVisible(false);
        l11.setVisible(false);
        r1.setVisible(false);
        r2.setVisible(false);
        l12.setVisible(false);
        t5.setVisible(false);
        l13.setVisible(false);
        t6.setVisible(false);
        l14.setVisible(false);
        t7.setVisible(false);
        l15.setVisible(false);
        t8.setVisible(false);
        l16.setVisible(false);
        t9.setVisible(false);
        l17.setVisible(false);
        t10.setVisible(false);
        l18.setVisible(false);
        t11.setVisible(false);
        l19.setVisible(false);
        t12.setVisible(false);
        l20.setVisible(false);
        c2.setVisible(false);
        l21.setVisible(false);
        t13.setVisible(false);
        l22.setVisible(false);
        l23.setVisible(false);
        l24.setVisible(false);
        l25.setVisible(false);
        l26.setVisible(false);
        l27.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l28 = new JLabel(i3);
        l28.setBounds(0, 0, 1500, 830);
        add(l28);

        JLabel l29 = new JLabel("NEW ADMISSION STUDENT");
        l29.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l29.setForeground(Color.GREEN);
        l29.setBounds(500, 20, 800, 50);
        l28.add(l29);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(360, 160, 1500, 830);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_name = (String) C1.getSelectedItem();

            String current_semester = (String) c1.getSelectedItem();

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

                    String str2 = "select * from university_student_admission_cancel where course_name = '" + course_name + "' and current_semester = '" + current_semester + "' and roll_no = '" + roll_no + "'";

                    ResultSet rs2 = c.s.executeQuery(str2);

                    if (rs2.next()) {

                        l4.setVisible(true);
                        l5.setVisible(true);
                        l6.setVisible(true);
                        l7.setVisible(true);
                        l8.setVisible(true);
                        t2.setVisible(true);
                        l9.setVisible(true);
                        t3.setVisible(true);
                        l10.setVisible(true);
                        t4.setVisible(true);
                        l11.setVisible(true);
                        r1.setVisible(true);
                        r2.setVisible(true);
                        l12.setVisible(true);
                        t5.setVisible(true);
                        l13.setVisible(true);
                        t6.setVisible(true);
                        l14.setVisible(true);
                        t7.setVisible(true);
                        l15.setVisible(true);
                        t8.setVisible(true);
                        l16.setVisible(true);
                        t9.setVisible(true);
                        l17.setVisible(true);
                        t10.setVisible(true);
                        l18.setVisible(true);
                        t11.setVisible(true);
                        l19.setVisible(true);
                        t12.setVisible(true);
                        l20.setVisible(true);
                        c2.setVisible(true);
                        l21.setVisible(true);
                        t13.setVisible(true);
                        l22.setVisible(true);
                        l23.setVisible(true);
                        l24.setVisible(true);
                        l25.setVisible(true);
                        l26.setVisible(true);
                        l27.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String enrollment_id_no = rs2.getString("enrollment_id_no");
                        String user_account = rs2.getString("user_account");
                        String course_code = rs2.getString("course_code");
                        String current_year = rs2.getString("current_year");
                        String admission_year = rs2.getString("admission_year");

                        l5.setText(enrollment_id_no);
                        l7.setText(user_account);
                        l23.setText(course_code);
                        l25.setText(current_year);
                        l27.setText(admission_year);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Roll Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                        setVisible(true);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new StudentInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String course_name = (String) C1.getSelectedItem();
            String current_semester = (String) c1.getSelectedItem();

            String roll_no = t1.getText();

            String enrollment_id_no = l5.getText();
            String user_account = l7.getText();

            String password;

            String student_name = t2.getText();
            String father_name = t3.getText();
            String age = t4.getText();

            String gender = null;

            if (r1.isSelected()) {
                gender = "Male";

            } else if (r2.isSelected()) {
                gender = "Female";
            }

            String date_of_birth = t5.getText();
            String phone_no = t6.getText();
            String email_id = t7.getText();
            String aadhar_card_no = t8.getText();
            String father_phone_no = t9.getText();
            String class_X = t10.getText();
            String class_XII = t11.getText();
            String address = t12.getText();

            String city = (String) c2.getSelectedItem();

            String pin_code_no = t13.getText();

            String course_code = l23.getText();
            String current_year = l25.getText();
            String admission_year = l27.getText();

            String status_1 = "No";

            if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t3.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Father Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t4.getText().isEmpty()) || check_age(t4.getText())) {

                if (age.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Age", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_age(t4.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 2 Digit Age", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else if ((t5.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Birth Date", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t6.getText().isEmpty()) || check_phone_no(t6.getText())) {

                if (phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_phone_no(t6.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 10 Digit Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t7.getText().isEmpty()) || check_email_id(t7.getText())) {

                if (email_id.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_email_id(t7.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t8.getText().isEmpty()) || check_aadhar_card_no(t8.getText())) {

                if (aadhar_card_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_aadhar_card_no(t8.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 12 Digit Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else if ((t9.getText().isEmpty()) || check_father_phone_no(t9.getText())) {

                if (father_phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Father Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_father_phone_no(t9.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 10 Digit Father Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }
            } else if (t10.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Class 10 Percentages", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t11.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Class 12 Percentages", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t12.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Address", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t13.getText().isEmpty()) || check_pin_code_no(t13.getText())) {

                if (pin_code_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Address Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_pin_code_no(t13.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Student Valid 6 Digit Address Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {

                try {

                    Conn c = new Conn();

                    String aadhar_card_number = String.valueOf(aadhar_card_no).substring(8);
                    String phone_number = String.valueOf(phone_no).substring(6);

                    password = aadhar_card_number + phone_number;

                    String str3 = "insert into add_new_student_university values('" + user_account + "','" + enrollment_id_no + "','" + password + "','" + roll_no + "', '" + student_name + "', '" + father_name + "', '" + age + "', '" + gender + "', '" + date_of_birth + "', '" + phone_no + "', '" + email_id + "','" + aadhar_card_no + "', '" + father_phone_no + "', '" + class_X + "', '" + class_XII + "', '" + address + "', '" + city + "', '" + pin_code_no + "', '" + course_name + "', '" + course_code + "','" + current_semester + "','" + current_year + "', '" + admission_year + "', '" + status_1 + "')";
                    c.s.executeUpdate(str3);

                    String str4 = "update student_faculty_login set password = '" + password + "' where enrollment_id_no = '" + enrollment_id_no + "'";
                    c.s.executeUpdate(str4);

                    String str5 = "delete from university_student_admission_cancel where user_account = '" + user_account + "' and enrollment_id_no = '" + enrollment_id_no + "' and roll_no = '" + roll_no + "' and course_name = '" + course_name + "' and current_semester = '" + current_semester + "'";
                    c.s.executeUpdate(str5);

                    JOptionPane.showMessageDialog(null, "New Student Added" + "\n Enrollment Id Number = " + enrollment_id_no + "\n Password = " + password + "\n Roll Number = " + roll_no);

                    new StudentInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == b4) {

            new StudentInformation().setVisible(true);
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

        new AddNewStudent2();
    }

}
