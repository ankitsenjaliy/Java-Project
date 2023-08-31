package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2, t3;
    JButton b1, b2, b3;

    ForgotPassword() {

        l1 = new JLabel("USER NAME");
        l1.setBounds(40, 20, 100, 30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(230, 20, 150, 30);
        add(t1);

        l2 = new JLabel("NEW PASSWORD");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        t2 = new JPasswordField();
        t2.setBounds(230, 70, 150, 30);
        add(t2);

        l2 = new JLabel("COMFIRM NEW PASSWORD");
        l2.setBounds(40, 120, 160, 30);
        add(l2);

        t3 = new JPasswordField();
        t3.setBounds(230, 120, 150, 30);
        add(t3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(390, 30, 220, 180);
        add(l3);

        b1 = new JButton("UPDATE");
        b1.setBounds(50, 200, 120, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCLE");
        b2.setBounds(220, 200, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(600, 300, 630, 330);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String username = t1.getText();
            String new_password = t2.getText();
            String confirm_new_password = t3.getText();

            if (username.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your User Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (new_password.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your New Password", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (confirm_new_password.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Confirm New Password ", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                if (new_password.equals(confirm_new_password)) {

                    try {

                        Conn c = new Conn();

                        String str = "Update login set password = '" + new_password + "'";

                        int rs = c.s.executeUpdate(str);

                        {
                            JOptionPane.showMessageDialog(null, "Updated SuccessFully");
                            new Login().setVisible(true);
                            this.setVisible(false);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "New Password And Confirm New Password Are Not Equal", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ForgotPassword();
    }
}
