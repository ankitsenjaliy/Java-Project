package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard2 extends JFrame implements ActionListener {

    JMenuBar ma;
    JMenu m1, m2, m3;
    JMenuItem i1, i2, i3, i4;

    Dashboard2() {

        ma = new JMenuBar();
        ma.setBounds(0, 0, 1950, 30);
        add(ma);

        m1 = new JMenu("ADVANCE ONLINE ROOM BOOKING");
        m1.setForeground(Color.RED);
        ma.add(m1);

        i1 = new JMenuItem("ADVANCE ROOM BOOKING");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("ADVANCE ONLINE ROOM BOOKING OTHER DETAILS");
        i2.addActionListener(this);
        m1.add(i2);

        m2 = new JMenu("PAYMENT METHOD");
        m2.setForeground(Color.RED);
        ma.add(m2);

        i3 = new JMenuItem("PAYMENT");
        i3.addActionListener(this);
        m2.add(i3);

        m3 = new JMenu("VIEW YOUR DETAILS");
        m3.setForeground(Color.RED);
        ma.add(m3);

        i4 = new JMenuItem("YOUR DETAILS");
        i4.addActionListener(this);
        m3.add(i4);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/17.jpg"));
        Image i6 = i5.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel l1 = new JLabel(i7);
        l1.setBounds(0, 0, 1950, 1000);
        add(l1);

        JLabel l2 = new JLabel("WELCOME YOU");
        l2.setFont(new Font("Tahoma", Font.BOLD, 50));
        l2.setForeground(Color.RED);
        l2.setBounds(800, 60, 1000, 85);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(0, 0, 1950, 1000);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("ADVANCE ROOM BOOKING")) {
            new AdvanceOnlineRoomBooking().setVisible(true);
//        }
//else if (ae.getActionCommand().equals("ADVANCE ONLINE ROOM BOOKING OTHER DETAILS")) {
//            new AdvanceOnlineRoomBookingOtherDetails().setVisible(true);
        } else if (ae.getActionCommand().equals("PAYMENT")) {
            new Payment().setVisible(true);
        } else if (ae.getActionCommand().equals("YOUR DETAILS")) {
            new View().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Dashboard2().setVisible(true);
    }

}
