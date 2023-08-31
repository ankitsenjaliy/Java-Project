package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewEmployee1 extends JFrame implements ActionListener {

    JLabel l15, l17;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    ButtonGroup G;
    JRadioButton r1, r2;
    JComboBox c1, C1;
    JButton b1, b2, B1;

    AddNewEmployee1() {

        JLabel l1 = new JLabel("EMPLOYEE NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 150, 300, 30);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
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

        JLabel l2 = new JLabel("FATHER NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(800, 150, 300, 30);
        add(l2);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
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

        JLabel l3 = new JLabel("AGE");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(100, 200, 300, 30);
        add(l3);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.RED);
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

        JLabel l4 = new JLabel("GENDER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(800, 200, 300, 30);
        add(l4);

        G = new ButtonGroup();

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r1.setBackground(Color.WHITE);
        r1.setForeground(Color.RED);
        r1.setBounds(1150, 200, 80, 30);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        r2.setBackground(Color.WHITE);
        r2.setForeground(Color.RED);
        r2.setBounds(1270, 200, 80, 30);
        G.add(r2);
        add(r2);

        JLabel l5 = new JLabel("BIRTH DATE");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(100, 250, 300, 30);
        add(l5);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.BLUE);
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

        JLabel l6 = new JLabel("PHONE NUMBER");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(800, 250, 300, 30);
        add(l6);

        t5 = new JTextField();
        t5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t5.setForeground(Color.BLUE);
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

        JLabel l7 = new JLabel("EMAIL ID");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(100, 300, 300, 30);
        add(l7);

        t6 = new JTextField();
        t6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t6.setForeground(Color.RED);
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

        JLabel l8 = new JLabel("AADHAR CARD NUMBER");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(800, 300, 300, 30);
        add(l8);

        t7 = new JTextField();
        t7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t7.setForeground(Color.RED);
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

        JLabel l9 = new JLabel("ALTERNATE PHONE NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(100, 350, 310, 30);
        add(l9);

        t8 = new JTextField();
        t8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t8.setForeground(Color.BLUE);
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

        JLabel l10 = new JLabel("ADDRESS");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.YELLOW);
        l10.setBounds(800, 350, 300, 30);
        add(l10);

        t9 = new JTextField();
        t9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t9.setForeground(Color.BLUE);
        t9.setBounds(1150, 350, 200, 30);
        add(t9);

        t9.setColumns(10);
        t9.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l11 = new JLabel("CITY");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(100, 400, 300, 30);
        add(l11);

        String city[] = {"Rajkot", "Ahmadabad", "Surat", "Baroda", "Jamnagar", "Bhavnagar", "Junagadh", "Gandhinagar", "Anand", "Amreli", "Banas Kantha", "Bharuch", "Dahod", "Kachchh", "Kheda", "Mahesana", "Narmada", "Navsari", "Panch Mahal", "Patan", "Porbandar", "Sabar Kantha", "Surendranagar", "Tapi", "Morbi", "Valsad", "Nadiad", "Bhuj", "Gandhidham", "Vapi", "Gondal", "Somnath", "Godhra", "Kalol", "Botad", "Jetpur"};
        c1 = new JComboBox(city);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(450, 400, 200, 30);
        add(c1);

        JLabel l12 = new JLabel("PIN CODE NUMBER");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.YELLOW);
        l12.setBounds(800, 400, 300, 30);
        add(l12);

        t10 = new JTextField();
        t10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t10.setForeground(Color.RED);
        t10.setBounds(1150, 400, 200, 30);
        add(t10);

        t10.setColumns(10);
        t10.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l13 = new JLabel("JOB NAME");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.YELLOW);
        l13.setBounds(100, 450, 300, 30);
        add(l13);

        C1 = new JComboBox();

        try {
            
            Conn c = new Conn();

            String str1 = "select * from add_payment_employee";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("job_name"));

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(450, 450, 200, 30);
        add(C1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U17.jpg"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        B1 = new JButton(i3);
        B1.setBounds(660, 450, 30, 30);
        B1.addActionListener(this);
        add(B1);

        JLabel l14 = new JLabel("EMPLOYEE SALARY");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.YELLOW);
        l14.setBounds(800, 450, 300, 30);
        add(l14);

        l15 = new JLabel();
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.CYAN);
        l15.setBounds(1150, 450, 300, 30);
        add(l15);

        JLabel l16 = new JLabel("EMPLOYEE PAYMENT STATUS");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.YELLOW);
        l16.setBounds(100, 500, 320, 30);
        add(l16);

        l17 = new JLabel("No");
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.RED);
        l17.setBounds(450, 500, 300, 30);
        add(l17);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(500, 560, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(800, 560, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U18.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1450, 680, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l18 = new JLabel(i6);
        l18.setBounds(0, 0, 1450, 680);
        add(l18);

        JLabel l19 = new JLabel("ADD NEW EMPLOYEE");
        l19.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l19.setForeground(Color.CYAN);
        l19.setBounds(530, 20, 800, 50);
        l18.add(l19);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(390, 230, 1450, 680);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == B1) {

            String job_name = (String) C1.getSelectedItem();

            try {

                Conn c = new Conn();

                String str2 = "select * from add_payment_employee where job_name = '" + job_name + "'";

                ResultSet rs2 = c.s.executeQuery(str2);

                while (rs2.next()) {

                    String employee_salary = rs2.getString("employee_salary");

                    l15.setText(employee_salary);
                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b1) {

            String employee_name = t1.getText();
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
            String alternate_phone_no = t8.getText();
            String address = t9.getText();

            String city = (String) c1.getSelectedItem();

            String pin_code_no = t10.getText();

            String job_name = (String) C1.getSelectedItem();

            String employee_salary = l15.getText();

            String employee_payment_status = l17.getText();

            if (t1.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Employee Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Employee Father Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t3.getText().isEmpty()) || check_age(t3.getText())) {

                if (age.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Age", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_age(t3.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Valid 2 Digit Age", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if (t4.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Employee Birth Date", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t5.getText().isEmpty()) || check_phone_no(t5.getText())) {

                if (phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_phone_no(t5.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Valid 10 Digit Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t6.getText().isEmpty()) || check_email_id(t6.getText())) {

                if (email_id.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_email_id(t6.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Valid Email Id", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if ((t7.getText().isEmpty()) || check_aadhar_card_no(t7.getText())) {

                if (aadhar_card_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_aadhar_card_no(t7.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Valid 12 Digit Aadhar Card Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else if ((t8.getText().isEmpty()) || check_alternate_phone_no(t8.getText())) {

                if (alternate_phone_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Alternate Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_alternate_phone_no(t8.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Valid 10 Digit Alternate Phone Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else if (t9.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Employee Address", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t10.getText().isEmpty()) || check_pin_code_no(t10.getText())) {

                if (pin_code_no.length() == 0) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Address Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                } else if (check_pin_code_no(t10.getText())) {

                    JOptionPane.showMessageDialog(null, "Please Enter Employee Valid 6 Digit Address Pin Code Number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } else {

                try {

                    Conn c = new Conn();

                    int employee_no = 1;

                    String str3 = "select COUNT(*) from add_new_employee";

                    ResultSet rs3 = c.s.executeQuery(str3);

                    rs3.next();

                    int employee_id_no = employee_no + rs3.getInt(1);

                    String str4 = "insert into add_new_employee values('" + employee_id_no + "', '" + employee_name + "', '" + father_name + "', '" + age + "', '" + gender + "', '" + date_of_birth + "', '" + phone_no + "', '" + email_id + "', '" + aadhar_card_no + "', '" + alternate_phone_no + "', '" + address + "', '" + city + "', '" + pin_code_no + "', '" + job_name + "', '" + employee_salary + "','" + employee_payment_status + "')";
                    c.s.executeUpdate(str4);

                    JOptionPane.showMessageDialog(null, "New Employee Added" + "\n Employee Id Number = " + employee_id_no);

                    new EmployeeInformation1().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            new EmployeeInformation1().setVisible(true);
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

    Boolean check_alternate_phone_no(String s) {

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

        new AddNewEmployee1();
    }

}
