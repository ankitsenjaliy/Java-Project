package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeInformation1 extends JFrame implements ActionListener {

    String x[] = {"Employee Id Number", "Employee Name", "Gender", "Phone Number", "Job Name"};
    String y[][] = new String[20][5];

    JLabel l2;
    JTable t;
    JButton b1, b2, b3, b4, b5, b6;

    int i = 0, j = 0;

    EmployeeInformation1() {

        try {

            Conn c = new Conn();

            String str1 = "select * from add_new_employee";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("employee_id_no");
                y[i][j++] = rs1.getString("employee_name");
                y[i][j++] = rs1.getString("gender");
                y[i][j++] = rs1.getString("phone_no");
                y[i][j++] = rs1.getString("job_name");

                i++;
                j = 0;
            }

            t = new JTable(y, x);

        } catch (Exception e) {

            System.out.println(e);

        }

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 40));
        t.setRowHeight(40);

        JScrollPane S = new JScrollPane(t);
        S.setBounds(0, 180, 1383, 551);
        add(S);

        b1 = new JButton("ADD NEW EMPLOYEE");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50, 30, 310, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("EMPLOYEE DETAILS");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(50, 110, 310, 50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("VIEW EMPLOYEE DETAILS");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(1040, 30, 310, 50);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("UPDATE EMPLOYEE DETAILS");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(1040, 110, 310, 50);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("DELETE EMPLOYEE DETAILS");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(50, 760, 330, 50);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("EMPLOYEE ADMISSION CANCEL");
        b6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(1000, 760, 340, 50);
        b6.addActionListener(this);
        add(b6);

        JLabel l1 = new JLabel("EMPLOYEE INFORMATION");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.BLUE);
        l1.setBounds(450, 20, 800, 50);
        add(l1);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from add_new_employee";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int employee = rs2.getInt(1);

            l2 = new JLabel("EMPLOYEE = " + employee);
            l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
            l2.setForeground(Color.RED);
            l2.setBounds(550, 120, 600, 30);
            add(l2);

        } catch (Exception e) {

            System.out.println(e);
        }

        JPanel p1 = new JPanel();
        p1.setBackground(Color.YELLOW);
        p1.setLayout(null);
        p1.setBounds(0, 0, 1400, 180);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.YELLOW);
        p2.setLayout(null);
        p2.setBounds(0, 730, 1400, 110);
        add(p2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 130, 1400, 880);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new AddNewEmployee1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new EmployeeDetails1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new EmployeeViewDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b4) {

            new UpdateEmployeeDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b5) {

            new EmployeeDeleteDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b6) {

            new AddNewEmployee2().setVisible(true);;
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {
        new EmployeeInformation1();
    }

}
