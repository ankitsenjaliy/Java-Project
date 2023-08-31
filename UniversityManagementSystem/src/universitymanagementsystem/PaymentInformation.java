package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class PaymentInformation extends JFrame implements ActionListener {

    JLabel l2;
    JTable t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    PaymentInformation() {

        b1 = new JButton("FACULTY PAYMENT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 100, 330, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UPDATE FACULTY PAYMENT");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(100, 200, 330, 50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("FACULTY PAYMENT DETAILS");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(100, 300, 330, 50);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("EMPLOYEE PAYMENT");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(560, 100, 330, 50);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("UPDATE EMPLOYEE PAYMENT");
        b5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(560, 200, 330, 50);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("EMPLOYEE PAYMENT DETAILS");
        b6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(560, 300, 330, 50);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("ADD EMPLOYEE PAYMENT");
        b7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(100, 500, 330, 50);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("VIEW PAYMENT EMPLOYEE");
        b8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(560, 500, 330, 50);
        b8.addActionListener(this);
        add(b8);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1000, 650);
        add(l1);

        JLabel l2 = new JLabel("PAYMENT INFORMATION");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(250, 20, 800, 50);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(610, 250, 1000, 650);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new FacultyPayment().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            try {

                Conn c = new Conn();

                String str1 = "update add_new_faculty set faculty_payment_status = 'No'";
                c.s.executeUpdate(str1);

                JOptionPane.showMessageDialog(null, "Faculty Payment Update SuccessFully");

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b3) {

            new FacultyPaymentDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b4) {

            new EmployeePayment().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b5) {

            try {

                Conn c = new Conn();

                String str2 = "update add_new_employee set employee_payment_status = 'No'";
                c.s.executeUpdate(str2);

                JOptionPane.showMessageDialog(null, "Employee Payment Update SuccessFully");

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b6) {

            new EmployeePaymentDetails().setVisible(true);;
            this.setVisible(false);

        } else if (ae.getSource() == b7) {

            new AddPaymentEmployee().setVisible(true);;
            this.setVisible(false);

        } else if (ae.getSource() == b8) {

            new ViewPaymentEmployee().setVisible(true);;
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {
        new PaymentInformation();
    }

}
