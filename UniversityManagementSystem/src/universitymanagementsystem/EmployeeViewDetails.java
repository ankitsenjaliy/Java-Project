package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeViewDetails extends JFrame implements ActionListener {

    JLabel l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31;
    JComboBox C1;
    JButton b1, b2, b3, b4;

    EmployeeViewDetails() {

        JLabel l1 = new JLabel("EMPLOYEE ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.ORANGE);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_employee";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("employee_id_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(450, 130, 200, 30);
        add(C1);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 220, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 220, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l2 = new JLabel("EMPLOYEE NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.CYAN);
        l2.setBounds(850, 100, 300, 30);
        add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(1200, 100, 600, 30);
        add(l3);

        l4 = new JLabel("FATHER NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.CYAN);
        l4.setBounds(850, 150, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(1200, 150, 600, 30);
        add(l5);

        l6 = new JLabel("AGE");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.CYAN);
        l6.setBounds(850, 200, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(1200, 200, 300, 30);
        add(l7);

        l8 = new JLabel("GENDER");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.CYAN);
        l8.setBounds(850, 250, 300, 30);
        add(l8);

        l9 = new JLabel();
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(1200, 250, 300, 30);
        add(l9);

        l10 = new JLabel("BIRTH DATE");
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.CYAN);
        l10.setBounds(100, 300, 300, 30);
        add(l10);

        l11 = new JLabel();
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.YELLOW);
        l11.setBounds(450, 300, 300, 30);
        add(l11);

        l12 = new JLabel("PHONE NUMBER");
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.CYAN);
        l12.setBounds(850, 300, 300, 30);
        add(l12);

        l13 = new JLabel();
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.YELLOW);
        l13.setBounds(1200, 300, 300, 30);
        add(l13);

        l14 = new JLabel("EMAIL ID");
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.CYAN);
        l14.setBounds(100, 350, 300, 30);
        add(l14);

        l15 = new JLabel();
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.YELLOW);
        l15.setBounds(450, 350, 1000, 30);
        add(l15);

        l16 = new JLabel("AADHAR CARD NUMBER");
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.CYAN);
        l16.setBounds(850, 350, 300, 30);
        add(l16);

        l17 = new JLabel();
        l17.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l17.setForeground(Color.YELLOW);
        l17.setBounds(1200, 350, 300, 30);
        add(l17);

        l18 = new JLabel("ALTERNATE PHONE NUMBER");
        l18.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l18.setForeground(Color.CYAN);
        l18.setBounds(100, 400, 310, 30);
        add(l18);

        l19 = new JLabel();
        l19.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l19.setForeground(Color.YELLOW);
        l19.setBounds(450, 400, 300, 30);
        add(l19);

        l20 = new JLabel("CITY");
        l20.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l20.setForeground(Color.CYAN);
        l20.setBounds(850, 400, 300, 30);
        add(l20);

        l21 = new JLabel();
        l21.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l21.setForeground(Color.YELLOW);
        l21.setBounds(1200, 400, 300, 30);
        add(l21);

        l22 = new JLabel("ADDRESS");
        l22.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l22.setForeground(Color.CYAN);
        l22.setBounds(100, 450, 300, 30);
        add(l22);

        l23 = new JLabel();
        l23.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l23.setForeground(Color.YELLOW);
        l23.setBounds(450, 450, 1500, 30);
        add(l23);

        l24 = new JLabel("PIN CODE NUMBER");
        l24.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l24.setForeground(Color.CYAN);
        l24.setBounds(100, 500, 300, 30);
        add(l24);

        l25 = new JLabel();
        l25.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l25.setForeground(Color.YELLOW);
        l25.setBounds(450, 500, 300, 30);
        add(l25);

        l26 = new JLabel("JOB NAME");
        l26.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l26.setForeground(Color.CYAN);
        l26.setBounds(850, 500, 300, 30);
        add(l26);

        l27 = new JLabel();
        l27.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l27.setForeground(Color.YELLOW);
        l27.setBounds(1200, 500, 600, 30);
        add(l27);

        l28 = new JLabel("EMPLOYEE SALARY");
        l28.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l28.setForeground(Color.CYAN);
        l28.setBounds(100, 550, 300, 30);
        add(l28);

        l29 = new JLabel();
        l29.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l29.setForeground(Color.YELLOW);
        l29.setBounds(450, 550, 300, 30);
        add(l29);

        l30 = new JLabel("EMPLOYEE PAYMENT STATUS");
        l30.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l30.setForeground(Color.CYAN);
        l30.setBounds(850, 550, 320, 30);
        add(l30);

        l31 = new JLabel();
        l31.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l31.setForeground(Color.YELLOW);
        l31.setBounds(1200, 550, 300, 30);
        add(l31);

        b3 = new JButton("PRINT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(500, 630, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(800, 630, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
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

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U16.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l32 = new JLabel(i3);
        l32.setBounds(0, 0, 1550, 750);
        add(l32);

        JLabel l33 = new JLabel("VIEW EMPLOYEE DETAILS");
        l33.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l33.setForeground(Color.GREEN);
        l33.setBounds(500, 20, 800, 50);
        l32.add(l33);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(330, 200, 1550, 750);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String employee_id_no = (String) C1.getSelectedItem();

            try {

                Conn c = new Conn();

                String str2 = "select * from add_new_employee where employee_id_no = '" + employee_id_no + "'";

                ResultSet rs2 = c.s.executeQuery(str2);

                if (rs2.next()) {

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
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

                    b3.setVisible(true);
                    b4.setVisible(true);

                    String employee_name = rs2.getString("employee_name");
                    String father_name = rs2.getString("father_name");
                    String age = rs2.getString("age");
                    String gender = rs2.getString("gender");
                    String date_of_birth = rs2.getString("date_of_birth");
                    String phone_no = rs2.getString("phone_no");
                    String email_id = rs2.getString("email_id");
                    String aadhar_card_no = rs2.getString("aadhar_card_no");
                    String alternate_phone_no = rs2.getString("alternate_phone_no");
                    String city = rs2.getString("city");
                    String address = rs2.getString("address");
                    String pin_code_no = rs2.getString("pin_code_no");
                    String job_name = rs2.getString("job_name");
                    String employee_salary = rs2.getString("employee_salary");
                    String employee_payment_status = rs2.getString("employee_payment_status");

                    l3.setText(employee_name);
                    l5.setText(father_name);
                    l7.setText(age);
                    l9.setText(gender);
                    l11.setText(date_of_birth);
                    l13.setText(phone_no);
                    l15.setText(email_id);
                    l17.setText(aadhar_card_no);
                    l19.setText(alternate_phone_no);
                    l21.setText(city);
                    l23.setText(address);
                    l25.setText(pin_code_no);
                    l27.setText(job_name);
                    l29.setText(employee_salary);
                    l31.setText(employee_payment_status);

                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new EmployeeInformation1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            new EmployeeInformation1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b4) {

            new EmployeeInformation1().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {

        new EmployeeViewDetails();
    }

}
