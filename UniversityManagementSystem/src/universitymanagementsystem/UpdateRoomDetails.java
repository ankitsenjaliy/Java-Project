package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateRoomDetails extends JFrame implements ActionListener {

    JLabel l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4;
    JComboBox c1;
    JButton b1, b2, b3, b4;

    UpdateRoomDetails() {

        JLabel l1 = new JLabel("HOSTEL NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(100, 130, 300, 30);
        add(l1);

        String hostel_name[] = {"Boys Hostel", "Girls Hostel"};
        c1 = new JComboBox(hostel_name);
        c1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        c1.setBackground(Color.WHITE);
        c1.setForeground(Color.RED);
        c1.setBounds(400, 130, 200, 30);
        add(c1);

        JLabel l2 = new JLabel("ROOM NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(100, 180, 300, 30);
        add(l2);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.BLUE);
        t1.setBounds(400, 180, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9')) && (caracter != 'B') && (caracter != 'G')
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only B,G Alphabet Keys Allowed And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 260, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 260, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l3 = new JLabel("ROOM STATUS");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(100, 350, 300, 30);
        add(l3);

        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.CYAN);
        l4.setBounds(400, 350, 300, 30);
        add(l4);

        l5 = new JLabel("CLEANING STATUS");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.GREEN);
        l5.setBounds(100, 400, 300, 30);
        add(l5);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.RED);
        t2.setBounds(400, 400, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if ((caracter != 'C') && (caracter != 'l') && (caracter != 'e') && (caracter != 'a') && (caracter != 'n')
                        && (caracter != 'D') && (caracter != 'i') && (caracter != 'r') && (caracter != 't') && (caracter != 'y')
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Clean And Dirty Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l6 = new JLabel("ACTIVATE STATUS");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(100, 450, 300, 30);
        add(l6);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.BLUE);
        t3.setBounds(400, 450, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if ((caracter != 'Y') && (caracter != 'e') && (caracter != 's') && (caracter != 'N') && (caracter != 'o')
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Yes And No Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        l7 = new JLabel("STUDENT STATUS");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.GREEN);
        l7.setBounds(100, 500, 300, 30);
        add(l7);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.RED);
        t4.setBounds(400, 500, 200, 30);
        add(t4);

        t4.setColumns(10);
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if ((caracter != 'Y') && (caracter != 'e') && (caracter != 's') && (caracter != 'N') && (caracter != 'o')
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Yes And No Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b3 = new JButton("UPDATE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150, 580, 150, 40);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("CANCEL");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(400, 580, 150, 40);
        b4.addActionListener(this);
        add(b4);

        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        t2.setVisible(false);
        l6.setVisible(false);
        t3.setVisible(false);
        l7.setVisible(false);
        t4.setVisible(false);

        b3.setVisible(false);
        b4.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/H5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(0, 0, 730, 700);
        add(l8);

        JLabel l9 = new JLabel("UPDATE ROOM DETAILS");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l9.setForeground(Color.CYAN);
        l9.setBounds(110, 20, 800, 50);
        l8.add(l9);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(730, 220, 730, 700);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String hostel_name = (String) c1.getSelectedItem();

            String room_no = t1.getText();

            if (room_no.length() == 0) {

                JOptionPane.showMessageDialog(null, "Please Enter Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str1 = "select * from add_new_room where hostel_name = '" + hostel_name + "' and room_no = '" + room_no + "'";

                    ResultSet rs1 = c.s.executeQuery(str1);

                    if (rs1.next()) {

                        l3.setVisible(true);
                        l4.setVisible(true);
                        l5.setVisible(true);
                        t2.setVisible(true);
                        l6.setVisible(true);
                        t3.setVisible(true);
                        l7.setVisible(true);
                        t4.setVisible(true);

                        b3.setVisible(true);
                        b4.setVisible(true);

                        String room_status = rs1.getString("room_status");
                        l4.setText(room_status);

                        t2.setText(rs1.getString("cleaning_status"));
                        t3.setText(rs1.getString("activate_status"));
                        t4.setText(rs1.getString("student_status"));

                    } else {

                        JOptionPane.showMessageDialog(null, "Invalid Room Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b2) {

            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String hostel_name = (String) c1.getSelectedItem();

            String room_no = t1.getText();

            String cleaning_status = t2.getText();
            String activate_status = t3.getText();
            String student_status = t4.getText();

            if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Cleaning Status", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t3.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Activate Status", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t4.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Please Enter Student Status", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "update add_new_room set cleaning_status = '" + cleaning_status + "', activate_status =  '" + activate_status + "', student_status = '" + student_status + "' where hostel_name = '" + hostel_name + "' and room_no = '" + room_no + "'";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, "Updated SuccessFully");

                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }

        } else if (ae.getSource() == b4) {

            this.setVisible(false);

        }
    }

    public static void main(String[] args) {

        new UpdateRoomDetails();
    }
}
