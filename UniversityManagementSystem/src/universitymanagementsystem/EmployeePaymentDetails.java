package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class EmployeePaymentDetails extends JFrame implements ActionListener {

    JTable t;
    JTextField t1;
    JComboBox c1;
    ButtonGroup G;
    JRadioButton r1, r2;
    JButton b1, b2;

    EmployeePaymentDetails() {

        t = new JTable();
        t.setBounds(0, 200, 1300, 560);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        JLabel l1 = new JLabel("JOB NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(30, 80, 300, 30);
        add(l1);

        String job_name[] = {"Hostel Management", "Room Keeping", "Kitchen Staff", "Room Service"};
        c1 = new JComboBox(job_name);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.BLUE);
        c1.setBounds(300, 80, 200, 30);
        add(c1);

        JLabel l2 = new JLabel("PAYMENT MONTH");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(30, 120, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(300, 120, 200, 30);
        add(t1);

        G = new ButtonGroup();

        r1 = new JRadioButton("ONLY DISPLAY PAYMENT STATUS YES");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r1.setBackground(Color.YELLOW);
        r1.setForeground(Color.BLACK);
        r1.setBounds(880, 80, 390, 30);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("ONLY DISPLAY PAYMENT STATUS NO");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r2.setBackground(Color.YELLOW);
        r2.setForeground(Color.BLACK);
        r2.setBounds(880, 120, 390, 30);
        G.add(r2);
        add(r2);

        JLabel l3 = new JLabel("EMPLOYEE NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(130, 170, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("EMPLOYEE SALARY");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(560, 170, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("EMPLOYEE PAYMENT STATUS");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLUE);
        l5.setBounds(910, 170, 320, 30);
        add(l5);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(420, 780, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 780, 150, 40);
        b2.addActionListener(this);
        add(b2);

        JLabel l6 = new JLabel("EMPLOYEE PAYMENT DETAILS");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l6.setForeground(Color.RED);
        l6.setBounds(320, 20, 800, 50);
        add(l6);

        getContentPane().setBackground(Color.YELLOW);

        setLayout(null);
        setBounds(460, 130, 1300, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {
                Conn c = new Conn();

                String str1 = "select employee_name,employee_salary,employee_payment_status from employee_payment where job_name = '" + c1.getSelectedItem() + "' and payment_month = '" + t1.getText() + "'";

                String str2 = "select employee_name,employee_salary,employee_payment_status from add_new_employee where employee_payment_status = 'YES' and job_name = '" + c1.getSelectedItem() + "'";

                String str3 = "select employee_name,employee_salary,employee_payment_status from add_new_employee where employee_payment_status = 'NO' and job_name = '" + c1.getSelectedItem() + "'";

                if (r1.isSelected()) {

                    ResultSet rs = c.s.executeQuery(str2);
                    t.setModel(DbUtils.resultSetToTableModel(rs));

                } else if (r2.isSelected()) {

                    ResultSet rs = c.s.executeQuery(str3);
                    t.setModel(DbUtils.resultSetToTableModel(rs));

                } else {

                    ResultSet rs = c.s.executeQuery(str1);
                    t.setModel(DbUtils.resultSetToTableModel(rs));

                }

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new PaymentInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new EmployeePaymentDetails();
    }

}
