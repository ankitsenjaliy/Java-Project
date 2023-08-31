package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeDeleteDetails extends JFrame implements ActionListener {

    JLabel l2, l3, l4, l5, l6, l7;
    JComboBox C1;
    JButton b1, b2, b3;

    EmployeeDeleteDetails() {

        JLabel l1 = new JLabel("EMPLOYEE ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(100, 100, 300, 30);
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

        l4 = new JLabel("FATHER NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(100, 300, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(400, 300, 600, 30);
        add(l5);

        l6 = new JLabel("JOB NAME");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(100, 350, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.BLUE);
        l7.setBounds(400, 350, 600, 30);
        add(l7);

        b3 = new JButton("DELETE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(280, 420, 150, 40);
        b3.addActionListener(this);
        add(b3);

        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);

        b3.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(0, 0, 730, 550);
        add(l8);

        JLabel l9 = new JLabel("DELETE EMPLOYEE DETAILS");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l9.setForeground(Color.RED);
        l9.setBounds(60, 20, 800, 50);
        l8.add(l9);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(730, 280, 730, 550);
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

                    b3.setVisible(true);

                    String employee_name = rs2.getString("employee_name");
                    String father_name = rs2.getString("father_name");
                    String job_name = rs2.getString("job_name");

                    l3.setText(employee_name);
                    l5.setText(father_name);
                    l7.setText(job_name);

                }
            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new EmployeeInformation1().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String employee_id_no = (String) C1.getSelectedItem();

            try {

                Conn c = new Conn();

                String str3 = "insert into employee_cancel values('" + employee_id_no + "')";
                c.s.executeUpdate(str3);

                String str4 = "delete from employee_payment where employee_id_no = '" + employee_id_no + "'";
                c.s.executeUpdate(str4);

                String str5 = "delete from add_new_employee where employee_id_no = '" + employee_id_no + "'";
                c.s.executeUpdate(str5);

                JOptionPane.showMessageDialog(null, "Employee Admission Cancel");

                new EmployeeInformation1().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {

        new EmployeeDeleteDetails();
    }

}
