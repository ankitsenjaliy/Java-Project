package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    JButton b1, b2;

    HotelManagementSystem() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/1.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1360, 559);
        add(l1);

        JLabel l2 = new JLabel("HOTEL MANAGEMENT SYSTEM");
        l2.setFont(new Font("serif", Font.BOLD, 40));
        l2.setForeground(Color.RED);
        l2.setBounds(670, 10, 1500, 100);
        l1.add(l2);

        b1 = new JButton("HOTEL SYSTEM");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(1050, 420, 200, 50);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("ADVANCE ROOM BOOKING");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(100, 420, 200, 50);
        b2.addActionListener(this);
        l1.add(b2);

        setLayout(null);
        setBounds(300, 200, 1360, 559);
        setVisible(true);

        while (true) {
            l2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            l2.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Login().setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == b2) {
            new Login2().setVisible(true);
            this.setVisible(false);
        } 
    }

    public static void main(String[] args) {
        new HotelManagementSystem();

    }
}
