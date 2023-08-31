package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class FacultyPaymentDetails extends JFrame implements ActionListener {

    JTable t;
    JTextField t1;
    ButtonGroup G;
    JRadioButton r1, r2;
    JButton b1, b2;

    FacultyPaymentDetails() {

        t = new JTable();
        t.setBounds(0, 180, 1300, 580);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        JLabel l1 = new JLabel("PAYMENT MONTH");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(60, 90, 300, 30);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(300, 90, 200, 30);
        add(t1);
 
        G = new ButtonGroup();

        r1 = new JRadioButton("ONLY DISPLAY PAYMENT STATUS YES");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r1.setBackground(Color.CYAN);
        r1.setForeground(Color.BLACK);
        r1.setBounds(880, 70, 390, 30);
        G.add(r1);
        add(r1);

        r2 = new JRadioButton("ONLY DISPLAY PAYMENT STATUS NO");
        r2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r2.setBackground(Color.CYAN);
        r2.setForeground(Color.BLACK);
        r2.setBounds(880, 110, 390, 30);
        G.add(r2);
        add(r2);

        JLabel l2 = new JLabel("FACULTY NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(150, 150, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("FACULTY SALARY");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(560, 150, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("FACULTY PAYMENT STATUS");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(920, 150, 310, 30);
        add(l4);

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

        JLabel l5 = new JLabel("FACULTY PAYMENT DETAILS");
        l5.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l5.setForeground(Color.BLUE);
        l5.setBounds(350, 20, 800, 50);
        add(l5);

        getContentPane().setBackground(Color.CYAN);

        setLayout(null);
        setBounds(460, 130, 1300, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {
                Conn c = new Conn();

                String str1 = "select faculty_name,faculty_salary,faculty_payment_status from faculty_payment where payment_month = '" + t1.getText() + "'";

                String str2 = "select faculty_name,faculty_salary,faculty_payment_status from add_new_faculty where faculty_payment_status = 'YES'";

                String str3 = "select faculty_name,faculty_salary,faculty_payment_status from add_new_faculty where faculty_payment_status = 'NO'";

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
        new FacultyPaymentDetails();
    }

}
