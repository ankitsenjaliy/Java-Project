package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.*;
import java.util.*;

public class EmployeePayment extends JFrame implements ActionListener {

    JLabel l2, l3, l4, l5, l6, l7, l8, l9;
    JComboBox C1;
    JButton b1, b2, b3, b4;

    EmployeePayment() {

        JLabel l1 = new JLabel("EMPLOYEE ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_employee where employee_payment_status = 'No'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("employee_id_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.RED);
        C1.setBounds(400, 100, 200, 30);
        add(C1);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 180, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 180, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l2 = new JLabel("EMPLOYEE NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(100, 250, 300, 30);
        add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(400, 250, 600, 30);
        add(l3);

        l4 = new JLabel("JOB NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(100, 300, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(400, 300, 600, 30);
        add(l5);

        l6 = new JLabel("PAYMENT MONTH");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(100, 350, 300, 30);
        add(l6);

        DateFormat dateFormat = new SimpleDateFormat("MMMM-yyyy");
        Calendar cal = Calendar.getInstance();

        l7 = new JLabel(dateFormat.format(cal.getTime()));
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.BLUE);
        l7.setBounds(400, 350, 300, 30);
        add(l7);

        l8 = new JLabel("EMPLOYEE SALARY");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.BLUE);
        l8.setBounds(100, 400, 300, 30);
        add(l8);

        l9 = new JLabel();
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.RED);
        l9.setBounds(400, 400, 300, 30);
        add(l9);

        b3 = new JButton("PAY");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 460, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(400, 460, 150, 40);
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

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 580, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0, 0, 730, 580);
        add(l10);

        JLabel l11 = new JLabel("EMPLOYEE PAYMENT");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l11.setForeground(Color.RED);
        l11.setBounds(130, 20, 800, 50);
        l10.add(l11);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(730, 280, 730, 580);
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

                    b3.setVisible(true);
                    b4.setVisible(true);

                    String employee_name = rs2.getString("employee_name");
                    String job_name = rs2.getString("job_name");
                    String employee_salary = rs2.getString("employee_salary");

                    l3.setText(employee_name);
                    l5.setText(job_name);
                    l9.setText(employee_salary);

                }
            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new PaymentInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String employee_id_no = (String) C1.getSelectedItem();

            String employee_name = l3.getText();
            String job_name = l5.getText();
            String payment_month = l7.getText();
            String employee_salary = l9.getText();

            String employee_payment_status = "Yes";

            try {

                Conn c = new Conn();

                String str3 = "insert into employee_payment values('" + employee_id_no + "','" + employee_name + "','" + job_name + "','" + payment_month + "','" + employee_salary + "','" + employee_payment_status + "')";
                c.s.executeUpdate(str3);

                String str4 = "update add_new_employee set employee_payment_status = 'Yes' where employee_id_no = '" + employee_id_no + "'";
                c.s.executeUpdate(str4);

                JOptionPane.showMessageDialog(null, "Payment SuccessFully");

                new PaymentInformation().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b4) {

            new PaymentInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new EmployeePayment();
    }

}
