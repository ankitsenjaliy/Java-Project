package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JMenuBar ma;
    JMenu m1, m2;
    JMenuItem i1, i2, i3, i4;

    Dashboard() {

        ma = new JMenuBar();
        ma.setBounds(0, 0, 1950, 30);
        add(ma);

        m1 = new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.RED);
        ma.add(m1);

        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);

        m2 = new JMenu("ADMIN");
        m2.setForeground(Color.RED);
        ma.add(m2);

        i2 = new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);

        i3 = new JMenuItem("ADD ROOM");
        i3.addActionListener(this);
        m2.add(i3);

        i4 = new JMenuItem("ADD DRIVER");
        i4.addActionListener(this);
        m2.add(i4);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/4.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000);
        add(l1);

        JLabel l2 = new JLabel("WELCOMES YOU");
        l2.setFont(new Font("Tahoma", Font.BOLD, 50));
        l2.setForeground(Color.RED);
        l2.setBounds(800, 60, 1000, 85);
        l1.add(l2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(0, 0, 1950, 1020);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("RECEPTION")) {
            new Reception().setVisible(true);
            this.setVisible(false);
        } else if (ae.getActionCommand().equals("ADD EMPLOYEE")) {
            new AddEmployee().setVisible(true);
        } else if (ae.getActionCommand().equals("ADD ROOM")) {
            new AddRoom().setVisible(true);
        } else if (ae.getActionCommand().equals("ADD DRIVER")) {
            new AddDriver().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

}
