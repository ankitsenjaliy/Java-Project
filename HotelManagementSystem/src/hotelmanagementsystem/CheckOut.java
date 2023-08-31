package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class CheckOut extends JFrame implements ActionListener {

    Choice c1;
    JTextField t1;
    JButton b1, b2, b3;

    CheckOut() {

        JLabel l1 = new JLabel("ID CARD NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 50, 220, 30);
        add(l1);

        c1 = new Choice();

        try {
            Conn c = new Conn();
            String str = "select * from new_customer_form";
            ResultSet rs = c.s.executeQuery(str);

            while (rs.next()) {
                c1.add(rs.getString("id_card_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        c1.setBounds(350, 50, 180, 30);
        add(c1);

        JLabel l2 = new JLabel("CUSTOMER ROOM NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 100, 220, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(350, 100, 180, 30);
        add(t1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/12.jpg"));
        Image i2 = i1.getImage().getScaledInstance(230, 230, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l7 = new JLabel(i3);
        l7.setBounds(450, 10, 500, 400);
        add(l7);

        JLabel l8 = new JLabel("CHECK OUT");
        l8.setFont(new Font("Tahoma", Font.BOLD, 30));
        l8.setForeground(Color.RED);
        l8.setBounds(610, 20, 450, 30);
        add(l8);

        b1 = new JButton("CHECK OUT");
        b1.setBounds(200, 200, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UPDATE");
        b2.setBounds(100, 250, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("BACK");
        b3.setBounds(300, 250, 130, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.GREEN);

        setLayout(null);
        setBounds(400, 200, 900, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            String id_card_no = c1.getSelectedItem();
            try {
                Conn c = new Conn();

                String str = "select * from new_customer_form where id_card_no = '" + id_card_no + "' ";
                ResultSet rs = c.s.executeQuery(str);
                while (rs.next()) {
                    t1.setText(rs.getString("room_no"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {

            String id_card_no = c1.getSelectedItem();
            String room_no = t1.getText();

            if (room_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Out Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {
                try {
                    Conn c = new Conn();

                    String str = "delete from new_customer_form where id_card_no = '" + id_card_no + "'";
                    c.s.executeUpdate(str);

                    String str2 = "update add_room set availability = 'Available' where room_no = '" + room_no + "'";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, "Check Out Updated SuccessFully");
                    new Reception().setVisible(true);
                    setVisible(false);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == b3) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new CheckOut();
    }
}
