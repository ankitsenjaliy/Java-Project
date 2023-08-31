package universitymanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class LibraryForgotPassword extends JFrame implements ActionListener {

    JLabel l2;
    JTextField t1;
    JPasswordField t2, t3;
    JButton b1, b2;

    LibraryForgotPassword() {

        JLabel l1 = new JLabel("USER ACCOUNT");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLUE);
        l1.setBounds(100, 50, 300, 30);
        add(l1);

        l2 = new JLabel("Library");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(400, 50, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("USER NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(100, 100, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(400, 100, 200, 30);
        add(t1);

        JLabel l4 = new JLabel("NEW PASSWORD");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(100, 150, 300, 30);
        add(l4);

        t2 = new JPasswordField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(400, 150, 200, 30);
        add(t2);

        JLabel l5 = new JLabel("CONFIRM NEW PASSWORD");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(100, 200, 300, 30);
        add(l5);

        t3 = new JPasswordField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.BLUE);
        t3.setBounds(400, 200, 200, 30);
        add(t3);

        b1 = new JButton("UPDATE");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 270, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 270, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(640, 70, 200, 180);
        add(l6);

        JLabel l7 = new JLabel();
        l7.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 3), "",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(50, 200, 34)));
        l7.setBounds(30, 20, 830, 320);
        add(l7);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(550, 300, 910, 410);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String user_account = l2.getText();

            String user_name = t1.getText();
            String new_password = t2.getText();
            String confirm_new_password = t3.getText();

            if (user_name.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your User Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (new_password.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your New Password", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (confirm_new_password.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your Confirm New Password ", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                if (new_password.equals(confirm_new_password)) {

                    try {

                        Conn c = new Conn();

                        String str1 = "Update login set password = '" + new_password + "' where user_name = '" + user_name + "' and user_account = '" + user_account + "'";

                        c.s.executeUpdate(str1);

                        JOptionPane.showMessageDialog(null, "Update SuccessFully");

                        new LibraryLogin().setVisible(true);
                        this.setVisible(false);

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "New Password And Confirm New Password Are Not Equal", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else if (ae.getSource() == b2) {

            new LibraryLogin().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {

        new LibraryForgotPassword();
    }
}
