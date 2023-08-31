package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class ViewPaymentEmployee extends JFrame implements ActionListener {

    JTable t;
    JButton b1;

    ViewPaymentEmployee() {

        t = new JTable();
        t.setBounds(0, 130, 1300, 630);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        try {

            Conn c = new Conn();

            String str1 = "select * from add_payment_employee";

            ResultSet rs1 = c.s.executeQuery(str1);
            
            t.setModel(DbUtils.resultSetToTableModel(rs1));

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("JOB NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.GREEN);
        l1.setBounds(300, 100, 300, 30);
        add(l1);

        JLabel l2 = new JLabel("EMPLOYEE SALARY");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(850, 100, 300, 30);
        add(l2);

        b1 = new JButton("BACK");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(550, 780, 150, 40);
        b1.addActionListener(this);
        add(b1);

        JLabel l3 = new JLabel("VIEW PAYMENT DETAILS");
        l3.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(380, 20, 800, 50);
        add(l3);

        getContentPane().setBackground(Color.RED);

        setLayout(null);
        setBounds(460, 130, 1300, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new PaymentInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new ViewPaymentEmployee();
    }

}
