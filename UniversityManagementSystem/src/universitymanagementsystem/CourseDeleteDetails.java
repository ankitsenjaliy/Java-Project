package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CourseDeleteDetails extends JFrame implements ActionListener {

    JLabel l2, l3, l4, l5, l6, l7;
    JComboBox C1;
    JButton b1, b2, b3;

    CourseDeleteDetails() {

        JLabel l1 = new JLabel("COURSE CODE");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(100, 100, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_course";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("course_code"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(350, 100, 200, 30);
        add(C1);

        b1 = new JButton("SEARCH");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150, 180, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(400, 180, 150, 40);
        b2.addActionListener(this);
        add(b2);

        l2 = new JLabel("COURSE NAME");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(100, 250, 300, 30);
        add(l2);

        l3 = new JLabel();
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(350, 250, 600, 30);
        add(l3);

        l4 = new JLabel("COURSE SEMESTER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(100, 300, 300, 30);
        add(l4);

        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLUE);
        l5.setBounds(350, 300, 300, 30);
        add(l5);

        l6 = new JLabel("COURSE YEAR");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.BLUE);
        l6.setBounds(100, 350, 300, 30);
        add(l6);

        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.RED);
        l7.setBounds(350, 350, 300, 30);
        add(l7);

        b3 = new JButton("DELETE");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(280, 420, 150, 40);
        b3.addActionListener(this);
        add(b3);

        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        
        b3.setVisible(false);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/U10.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l8 = new JLabel(i3);
        l8.setBounds(0, 0, 730, 550);
        add(l8);

        JLabel l9 = new JLabel("DELETE COURSE DETAILS");
        l9.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l9.setForeground(Color.BLUE);
        l9.setBounds(100, 20, 800, 50);
        l8.add(l9);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(730, 280, 730, 550);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String course_code = (String) C1.getSelectedItem();

            try {

                Conn c = new Conn();

                String str2 = "select * from add_new_course where course_code = '" + course_code + "'";

                ResultSet rs2 = c.s.executeQuery(str2);

                if (rs2.next()) {

                    l2.setVisible(true);
                    l3.setVisible(true);
                    l4.setVisible(true);
                    l5.setVisible(true);
                    l6.setVisible(true);
                    l7.setVisible(true);
                    
                    b3.setVisible(true);

                    String course_name = rs2.getString("course_name");
                    String course_semester = rs2.getString("course_semester");
                    String course_year = rs2.getString("course_year");

                    l3.setText(course_name);
                    l5.setText(course_semester);
                    l7.setText(course_year);

                }

            } catch (Exception e) {
                
                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new CourseInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            String course_code = (String) C1.getSelectedItem();

            try {

                Conn c = new Conn();

                String str3 = "delete from add_new_course where course_code = '" + course_code + "'";
                c.s.executeUpdate(str3);

                JOptionPane.showMessageDialog(null, "Course Delete SuccessFully");

                new CourseInformation().setVisible(true);
                this.setVisible(false);

            } catch (Exception e) {

                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {
        new CourseDeleteDetails();
    }

}
