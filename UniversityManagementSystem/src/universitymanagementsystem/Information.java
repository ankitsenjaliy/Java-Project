package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Information extends JFrame implements ActionListener {

    JLabel l2;
    JTable t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

    Information() {

        b1 = new JButton("CHANGE USERNAME AND PASSWORD");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100, 100, 580, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("VIEW USERNAME AND PASSOWRD DETAILS");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(100, 200, 580, 50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("VIEW ENROLLMENT ID NUMBER AND PASSWORD DETAILS");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(100, 300, 580, 50);
        b3.addActionListener(this);
        add(b3);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U18.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1000, 650);
        add(l1);

        JLabel l2 = new JLabel("INFORMATION");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(250, 20, 800, 50);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(680, 330, 800, 450);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new ChangeUsernameAndPassword().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new ViewUsernameAndPasswordDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new ViewEnrollmentIdNumberAndPasswordDetails().setVisible(true);
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new Information();
    }

}
