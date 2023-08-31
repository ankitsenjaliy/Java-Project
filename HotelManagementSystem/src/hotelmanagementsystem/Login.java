package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3;

    Login() {

        l1 = new JLabel("USERNAME");
        l1.setBounds(40, 20, 100, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);

        l2 = new JLabel("PASSWORD");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 30);
        add(t2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(300, 30, 220, 150);
        add(l3);

        b1 = new JButton("LOGIN");
        b1.setBounds(40, 140, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCLE");
        b2.setBounds(180, 140, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("FORGOT PASSWORD");
        b3.setBounds(270, 210, 170, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(600, 300, 550, 330);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String username = t1.getText();
            String password = t2.getText();

            if (username.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your User Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (password.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Password", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
                
                try {

                    Conn c = new Conn();
                    String str = "select * from login where username='" + username + "' and password='" + password + "'";

                    ResultSet rs = c.s.executeQuery(str);

                    if (rs.next()) {
                        new Dashboard().setVisible(true);
                        this.setVisible(false);
                        
                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Username And Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                        setVisible(true);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if (ae.getSource() == b2) {
            System.exit(0);
        } else if (ae.getSource() == b3) {

            new ForgotPassword().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
