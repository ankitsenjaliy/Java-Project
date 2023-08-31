package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ChangeUsernameAndPassword extends JFrame implements ActionListener {

    JLabel l4, l5;
    JTextField t1, t2, t3, t4;
    JComboBox c1;
    JButton b1, b2, b3, b4;

    ChangeUsernameAndPassword() {

        JLabel l1 = new JLabel("USER ACCOUNT");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.BLACK);
        l1.setBounds(100, 50, 300, 30);
        add(l1);

        String user_account[] = {"University", "Hostel", "Library"};
        c1 = new JComboBox(user_account);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(400, 50, 200, 30);
        add(c1);

        JLabel l2 = new JLabel("USER NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLACK);
        l2.setBounds(100, 100, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(400, 100, 200, 30);
        add(t1);

        JLabel l3 = new JLabel("PASSWORD");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLACK);
        l3.setBounds(100, 150, 300, 30);
        add(l3);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(400, 150, 200, 30);
        add(t2);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 210, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 210, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l4 = new JLabel("NEW USER NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLACK);
        l4.setBounds(100, 280, 300, 30);
        add(l4);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.BLUE);
        t3.setBounds(400, 280, 200, 30);
        add(t3);

        l5 = new JLabel("NEW PASSWORD");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLACK);
        l5.setBounds(100, 330, 300, 30);
        add(l5);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.RED);
        t4.setBounds(400, 330, 200, 30);
        add(t4);

        b3 = new JButton("CHANGE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 400, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("BACK");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(400, 400, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l4.setVisible(false);
        t3.setVisible(false);
        l5.setVisible(false);
        t4.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U9.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 520, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(0, 0, 730, 520);
        add(l6);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(740, 300, 730, 520);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String user_account = (String) c1.getSelectedItem();

            String user_name = t1.getText();
            String password = t2.getText();

            if (user_name.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your User Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (password.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your Password", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                if (user_account.equals("University")) {

                    try {

                        Conn c = new Conn();

                        String str1 = "select * from login where user_name = '" + user_name + "' and password = '" + password + "' and user_account = '" + user_account + "'";

                        ResultSet rs1 = c.s.executeQuery(str1);

                        if (rs1.next()) {

                            l4.setVisible(true);
                            t3.setVisible(true);
                            l5.setVisible(true);
                            t4.setVisible(true);

                            b3.setVisible(true);
                            b4.setVisible(true);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid User Name And Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else if (user_account.equals("Hostel")) {

                    try {

                        Conn c = new Conn();

                        String str2 = "select * from login where user_name = '" + user_name + "' and password = '" + password + "' and user_account = '" + user_account + "'";

                        ResultSet rs2 = c.s.executeQuery(str2);

                        if (rs2.next()) {

                            l4.setVisible(true);
                            t3.setVisible(true);
                            l5.setVisible(true);
                            t4.setVisible(true);

                            b3.setVisible(true);
                            b4.setVisible(true);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid User Name And Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else if (user_account.equals("Library")) {

                    try {

                        Conn c = new Conn();

                        String str3 = "select * from login where user_name = '" + user_name + "' and password = '" + password + "' and user_account = '" + user_account + "'";

                        ResultSet rs3 = c.s.executeQuery(str3);

                        if (rs3.next()) {

                            l4.setVisible(true);
                            t3.setVisible(true);
                            l5.setVisible(true);
                            t4.setVisible(true);

                            b3.setVisible(true);
                            b4.setVisible(true);

                        } else {

                            JOptionPane.showMessageDialog(null, "Invalid User Name And Password", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                }

            }
        } else if (ae.getSource() == b2) {

            new Information().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String user_account = (String) c1.getSelectedItem();

            String user_name = t3.getText();
            String password = t4.getText();

            if (user_name.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your User Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (password.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Your Password", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                if (user_account.equals("University")) {

                    try {

                        Conn c = new Conn();

                        String str4 = "update login set user_name = '" + user_name + "', password = '" + password + "' where user_account = '" + user_account + "'";

                        c.s.executeUpdate(str4);

                        JOptionPane.showMessageDialog(null, "User Name And Password Change");

                        new Information().setVisible(true);
                        this.setVisible(false);

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else if (user_account.equals("Hostel")) {

                    try {

                        Conn c = new Conn();

                        String str5 = "update login set user_name = '" + user_name + "', password = '" + password + "' where user_account = '" + user_account + "'";

                        c.s.executeUpdate(str5);

                        JOptionPane.showMessageDialog(null, "User Name And Password Change");

                        new Information().setVisible(true);
                        this.setVisible(false);

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                } else if (user_account.equals("Library")) {

                    try {

                        Conn c = new Conn();

                        String str4 = "update login set user_name = '" + user_name + "', password = '" + password + "' where user_account = '" + user_account + "'";

                        c.s.executeUpdate(str4);

                        JOptionPane.showMessageDialog(null, "User Name And Password Change");

                        new Information().setVisible(true);
                        this.setVisible(false);

                    } catch (Exception e) {

                        System.out.println(e);
                    }

                }

            }

        } else if (ae.getSource() == b4) {

            new Information().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {

        new ChangeUsernameAndPassword();
    }
}
