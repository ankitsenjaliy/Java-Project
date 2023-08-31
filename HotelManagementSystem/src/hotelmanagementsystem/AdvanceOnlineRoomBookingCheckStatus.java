package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AdvanceOnlineRoomBookingCheckStatus extends JFrame implements ActionListener {

    Choice c1;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1, b2, b3;

    AdvanceOnlineRoomBookingCheckStatus() {

        JLabel l1 = new JLabel("ID CARD NUMBER");
        l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l1.setBounds(60, 50, 220, 30);
        add(l1);

        c1 = new Choice();

        try {
            Conn c = new Conn();
            String str = "select * from new_registration_form_2";
            ResultSet rs = c.s.executeQuery(str);

            while (rs.next()) {
                c1.add(rs.getString("id_card_no"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        c1.setBounds(350, 50, 180, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(60, 100, 220, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(350, 100, 180, 30);
        add(t1);

        JLabel l3 = new JLabel("NAME");
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setBounds(60, 150, 220, 30);
        add(l3);

        t2 = new JTextField();
        t2.setBounds(350, 150, 180, 30);
        add(t2);

        JLabel l4 = new JLabel("ID CARD");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setBounds(60, 200, 220, 30);
        add(l4);

        t3 = new JTextField();
        t3.setBounds(350, 200, 180, 30);
        add(t3);

        JLabel l5 = new JLabel("CHECK - IN STATUS");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setBounds(60, 250, 220, 30);
        add(l5);

        t4 = new JTextField();
        t4.setBounds(350, 250, 180, 30);
        add(t4);

        JLabel l6 = new JLabel("DEPOSIT AMOUNT");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setBounds(60, 300, 220, 30);
        add(l6);

        t5 = new JTextField();
        t5.setBounds(350, 300, 180, 30);
        add(t5);

        JLabel l7 = new JLabel("PENDING AMOUNT");
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setBounds(60, 350, 220, 30);
        add(l7);

        t6 = new JTextField();
        t6.setBounds(350, 350, 180, 30);
        add(t6);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(580, 70, 500, 400);
        add(l8);

        JLabel l9 = new JLabel("UPDATE CHECK STATUS");
        l9.setFont(new Font("Tahoma", Font.BOLD, 30));
        l9.setForeground(Color.RED);
        l9.setBounds(650, 20, 450, 30);
        add(l9);

        b1 = new JButton("CHECK");
        b1.setBounds(200, 420, 130, 30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("UPDATE");
        b2.setBounds(100, 480, 130, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("BACK");
        b3.setBounds(300, 480, 130, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);

        getContentPane().setBackground(Color.GREEN);

        setLayout(null);
        setBounds(400, 200, 1150, 600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String room_no = null;
            String deposit = null;
            int pending_amount;
            String price = null;

            String id_card_no = c1.getSelectedItem();
            try {
                Conn c = new Conn();

                String str1 = "select * from new_registration_form_2 where id_card_no = '" + id_card_no + "' ";
                ResultSet rs1 = c.s.executeQuery(str1);
                while (rs1.next()) {
                    t1.setText(rs1.getString("room_no"));
                    t4.setText(rs1.getString("checked_in"));
                    t5.setText(rs1.getString("deposit"));
                    room_no = rs1.getString("room_no");
                    deposit = rs1.getString("deposit");
                }

                String str2 = "select * from new_registration_form_1 where id_card_no = '" + id_card_no + "' ";
                ResultSet rs2 = c.s.executeQuery(str2);
                while (rs2.next()) {

                    t2.setText(rs2.getString("name"));
                    t3.setText(rs2.getString("id_card"));

                }

                String str3 = "select * from add_room where room_no = '" + room_no + "'";
                ResultSet rs3 = c.s.executeQuery(str3);
                while (rs3.next()) {

                    price = rs3.getString("price");
                    pending_amount = Integer.parseInt(price) - Integer.parseInt(deposit);
                    t6.setText(Integer.toString(pending_amount));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if (ae.getSource() == b2) {

            String id_card_no = c1.getSelectedItem();

            String room_no = t1.getText();
            String name = t2.getText();
            String id_card = t3.getText();
            String checked_in = t4.getText();
            String deposit = t5.getText();
            String pending_amount = t6.getText();

            if (room_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (name.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (checked_in.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (deposit.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (pending_amount.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Only Check Button", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {
                    Conn c = new Conn();

                    String str = "update new_registration_form_1 set name = '" + name + "'where id_card_no = '" + id_card_no + "'";
                    c.s.executeUpdate(str);

                    String str2 = "update new_registration_form_2 set room_no = '" + room_no + "', checked_in = '" + checked_in + "', deposit = '" + deposit + "' where id_card_no = '" + id_card_no + "'";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, "Check Updated SuccessFully");
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
        new AdvanceOnlineRoomBookingCheckStatus();
    }
}
