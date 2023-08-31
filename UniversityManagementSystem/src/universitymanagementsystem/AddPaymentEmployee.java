package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddPaymentEmployee extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b1, b2;

    AddPaymentEmployee() {

        JLabel l1 = new JLabel("JOB NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 150, 300, 30);
        add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(400, 150, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l2 = new JLabel("EMPLOYEE SALARY");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 200, 300, 30);
        add(l2);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(400, 200, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 280, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 280, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(0, 0, 700, 400);
        add(l5);

        JLabel l6 = new JLabel("ADD PAYMENT EMPLOYEE");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l6.setForeground(Color.CYAN);
        l6.setBounds(80, 20, 800, 50);
        l5.add(l6);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(750, 330, 700, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String job_name = t1.getText();

            String employee_salary = t2.getText();

            if (job_name.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Job Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (employee_salary.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Employee Salary", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str1 = "insert into add_payment_employee values('" + job_name + "',  '" + employee_salary + "')";
                    c.s.executeUpdate(str1);

                    JOptionPane.showMessageDialog(null, "Payment Employee Added");

                    new PaymentInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b2) {

            new PaymentInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new AddPaymentEmployee();
    }

}
