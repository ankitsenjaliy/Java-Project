package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class HostelLogin extends JFrame implements ActionListener {

    JLabel l2;
    JTextField t1;
    JPasswordField t2;
    JRadioButton r1;
    JButton b1, b2, b3;

    HostelLogin() {

        JLabel l1 = new JLabel("USER ACCOUNT");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(100, 50, 300, 30);
        add(l1);

        l2 = new JLabel("Hostel");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(350, 50, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("USER NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(100, 100, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(350, 100, 200, 30);
        add(t1);

        JLabel l4 = new JLabel("PASSWORD");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(100, 150, 300, 30);
        add(l4);

        t2 = new JPasswordField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(350, 150, 200, 30);
        add(t2);

        r1 = new JRadioButton("SHOW PASSWORD");
        r1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        r1.setBackground(Color.WHITE);
        r1.setForeground(Color.RED);
        r1.setBounds(420, 210, 200, 30);
        add(r1);

        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()) {

                    t2.setEchoChar('\u0000');

                } else {

                    t2.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));

                }
            }
        });

        b1 = new JButton("LOGIN");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(140, 260, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(380, 260, 150, 40);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("FORGOT PASSWORD");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(500, 330, 250, 40);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/H1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(180, 180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l5 = new JLabel(i3);
        l5.setBounds(600, 50, 200, 180);
        add(l5);

        JLabel l6 = new JLabel();
        l6.setBorder(new TitledBorder(new LineBorder(Color.ORANGE, 3), "",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(50, 200, 34)));
        l6.setBounds(30, 20, 770, 370);
        add(l6);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(550, 300, 850, 460);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
      
        if (ae.getSource() == b1) {

            String user_account = l2.getText();

            String user_name = t1.getText();
            String password = t2.getText();

            if (user_name.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your User Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (password.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your Password", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str1 = "select * from login where user_name = '" + user_name + "' and password = '" + password + "' and user_account = '" + user_account + "'";

                    ResultSet rs1 = c.s.executeQuery(str1);

                    if (rs1.next()) {

                        new HostelLoading().setVisible(true);
                        this.setVisible(false);

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid User Name And Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

          System.exit(0);

        } else if (ae.getSource() == b3) {

            new HostelForgotPassword().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {

        new HostelLogin();
    }
}
