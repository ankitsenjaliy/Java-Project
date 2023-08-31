package hotelmanagementsystem;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class Reception extends JFrame implements ActionListener {

    JMenuBar ma;
    JMenu m1, m2, m3, m4, m5, m6, m7;
    JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19;

    Reception() {

        ma = new JMenuBar();
        ma.setBounds(0, 0, 1500, 30);
        add(ma);

        m1 = new JMenu("CUSTOMER DETAILS");
        m1.setForeground(Color.RED);
        ma.add(m1);

        i1 = new JMenuItem("NEW CUSTOMER FORM");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("CUSTOMER INFORMATION");
        i2.addActionListener(this);
        m1.add(i2);

        m2 = new JMenu("ALL DETAILS");
        m2.setForeground(Color.RED);
        ma.add(m2);

        i3 = new JMenuItem("EMPLOYEE INFORMATION");
        i3.addActionListener(this);
        m2.add(i3);

        i4 = new JMenuItem("MANAGER INFORMATION");
        i4.addActionListener(this);
        m2.add(i4);

        i5 = new JMenuItem("WAITER/WAITRESS INFORMATION");
        i5.addActionListener(this);
        m2.add(i5);

        i6 = new JMenuItem("KITCHEN STAFF INFORMATION");
        i6.addActionListener(this);
        m2.add(i6);

        m3 = new JMenu("ROOM DETAILS");
        m3.setForeground(Color.RED);
        ma.add(m3);

        i7 = new JMenuItem("ROOM INFORMATION");
        i7.addActionListener(this);
        m3.add(i7);

        i8 = new JMenuItem("SEARCH ROOM");
        i8.addActionListener(this);
        m3.add(i8);

        i9 = new JMenuItem("UPDATE ROOM STATUS");
        i9.addActionListener(this);
        m3.add(i9);

        m4 = new JMenu("CHECK DETAILS");
        m4.setForeground(Color.RED);
        ma.add(m4);

        i10 = new JMenuItem("CHECK OUT");
        i10.addActionListener(this);
        m4.add(i10);

        i11 = new JMenuItem("UPDATE CHECK STATUS");
        i11.addActionListener(this);
        m4.add(i11);

        m5 = new JMenu("DRIVER DETAILS");
        m5.setForeground(Color.RED);
        ma.add(m5);

        i12 = new JMenuItem("DRIVER INFORMATION");
        i12.addActionListener(this);
        m5.add(i12);

        i13 = new JMenuItem("PICK UP SERVICE");
        i13.addActionListener(this);
        m5.add(i13);

        m6 = new JMenu("ADVANCE ONLINE ROOM BOOKING");
        m6.setForeground(Color.RED);
        ma.add(m6);

        i14 = new JMenuItem("NEW REGISTRATION CUSTOMER INFORMATION 1");
        i14.addActionListener(this);
        m6.add(i14);

        i15 = new JMenuItem("NEW REGISTRATION CUSTOMER INFORMATION 2");
        i15.addActionListener(this);
        m6.add(i15);

        i16 = new JMenuItem("ADVANCE ONLINE ROOM BOOKING ROOM STATUS");
        i16.addActionListener(this);
        m6.add(i16);

        i17 = new JMenuItem("ADVANCE ONLINE ROOM BOOKING CHECK STATUS");
        i17.addActionListener(this);
        m6.add(i17);

        i18 = new JMenuItem("ADVANCE ONLINE ROOM BOOKING CHECK OUT");
        i18.addActionListener(this);
        m6.add(i18);

        m7 = new JMenu("EXIT");
        m7.setForeground(Color.RED);
        ma.add(m7);

        i19 = new JMenuItem("LOG OUT");
        i19.addActionListener(this);
        m7.add(i19);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/8.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1500, 800);
        add(l1);

        JLabel l2 = new JLabel("HOTEL RECEPTION");
        l2.setFont(new Font("Tahoma", Font.BOLD, 50));
        l2.setForeground(Color.YELLOW);
        l2.setBounds(530, 50, 500, 50);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(250, 150, 1500, 820);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("NEW CUSTOMER FORM")) {
            new NewCustomerForm().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("CUSTOMER INFORMATION")) {
            new CustomerInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("EMPLOYEE INFORMATION")) {
            new EmployeeInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("MANAGER INFORMATION")) {
            new ManagerInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("WAITER/WAITRESS INFORMATION")) {
            new WaiterAndWaitressInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("KITCHEN STAFF INFORMATION")) {
            new KitchenStaffInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("ROOM INFORMATION")) {
            new RoomInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("SEARCH ROOM")) {
            new SearchRoom().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("UPDATE ROOM STATUS")) {
            new UpdateRoomStatus().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("CHECK OUT")) {
            new CheckOut().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("UPDATE CHECK STATUS")) {
            new UpdateCheckStatus().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("DRIVER INFORMATION")) {
            new DriverInformation().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("PICK UP SERVICE")) {
            new PickUpService().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("NEW REGISTRATION CUSTOMER INFORMATION 1")) {
            new NewRegistrationCustomerInformation1().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("NEW REGISTRATION CUSTOMER INFORMATION 2")) {
            new NewRegistrationCustomerInformation2().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("ADVANCE ONLINE ROOM BOOKING ROOM STATUS")) {
            new AdvanceOnlineRoomBookingRoomStatus().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("ADVANCE ONLINE ROOM BOOKING CHECK STATUS")) {
            new AdvanceOnlineRoomBookingCheckStatus().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("ADVANCE ONLINE ROOM BOOKING CHECK OUT")) {
            new AdvanceOnlineRoomBookingCheckOut().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("LOG OUT")) {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Reception();
    }

}
