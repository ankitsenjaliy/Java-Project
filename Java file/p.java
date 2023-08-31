package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class p extends JFrame {

    int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
    int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    JDialog d;
    JButton[] button = new JButton[49];

    JLabel l1;
    JPanel p;
    JTextField t1;
    JButton b3;

    p() {

        p = new JPanel();

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(100, 200, 200, 30);
        add(t1);

        b3 = new JButton("SUBMIT");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(400, 480, 150, 40);
        add(b3);

        JFrame f = new JFrame();
        add(p);
        pack();
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                t1.setText(new DatePicker(f).setPickedDate());
            }
        });

        d = new JDialog();
        d.setModal(true);
        String[] header = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
        JPanel p1 = new JPanel(new GridLayout(7, 7));
        p1.setPreferredSize(new Dimension(430, 120));

        for (int x = 0; x < button.length; x++) {
            final int selection = x;
            button[x] = new JButton();
            button[x].setFocusPainted(false);
            button[x].setBackground(Color.white);
            if (x > 6) {
                button[x].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        day = button[selection].getActionCommand();
                        d.dispose();
                    }
                });
            }
            if (x < 7) {
                button[x].setText(header[x]);
                button[x].setForeground(Color.red);
            }
            p1.add(button[x]);
        }

        setLayout(null);
        setBounds(100, 100, 1000, 800);
        setVisible(true);

    }

    public static void main(String[] args) {
        new p();
    }

}
