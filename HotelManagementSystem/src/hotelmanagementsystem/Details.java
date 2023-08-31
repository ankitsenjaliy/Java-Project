package hotelmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Details extends JFrame implements ActionListener {

    String name, age, gender, date, month, year, city, phone_no, email_id, id_card, id_card_no, address, pin_code_no;
    JButton b1, b2;

    Details(String id_card_no) {
        try {
            Conn c = new Conn();
            String str = "select * from new_registration_form_1 where id_card_no = '" + id_card_no + "'";
            ResultSet rs = c.s.executeQuery(str);

            while (rs.next()) {

                name = rs.getString("name");
                age = rs.getString("age");
                gender = rs.getString("gender");
                date = rs.getString("date");
                month = rs.getString("month");
                year = rs.getString("year");
                city = rs.getString("city");
                phone_no = rs.getString("phone_no");
                email_id = rs.getString("email_id");
                id_card = rs.getString("id_card");
                id_card_no = rs.getString("id_card_no");
                address = rs.getString("address");
                pin_code_no = rs.getString("pin_code_no");

            }
        } catch (Exception e) {
            System.out.println(e);
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/22.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1300, 800);
        add(l1);

        JLabel l2 = new JLabel("NAME");
        l2.setFont(new Font("Tahoma", Font.BOLD, 22));
        l2.setForeground(Color.RED);
        l2.setBounds(100, 150, 400, 30);
        l1.add(l2);

        JLabel l3 = new JLabel(name);
        l3.setFont(new Font("Tahoma", Font.BOLD, 22));
        l3.setForeground(Color.RED);
        l3.setBounds(400, 150, 400, 30);
        l1.add(l3);

        JLabel l4 = new JLabel("AGE");
        l4.setFont(new Font("Tahoma", Font.BOLD, 22));
        l4.setForeground(Color.RED);
        l4.setBounds(700, 150, 400, 30);
        l1.add(l4);

        JLabel l5 = new JLabel(age);
        l5.setFont(new Font("Tahoma", Font.BOLD, 22));
        l5.setForeground(Color.RED);
        l5.setBounds(1000, 150, 400, 30);
        l1.add(l5);

        JLabel l6 = new JLabel("GENDER");
        l6.setFont(new Font("Tahoma", Font.BOLD, 22));
        l6.setForeground(Color.RED);
        l6.setBounds(100, 200, 400, 30);
        l1.add(l6);

        JLabel l7 = new JLabel(gender);
        l7.setFont(new Font("Tahoma", Font.BOLD, 22));
        l7.setForeground(Color.RED);
        l7.setBounds(400, 200, 400, 30);
        l1.add(l7);

        JLabel l8 = new JLabel("DATE");
        l8.setFont(new Font("Tahoma", Font.BOLD, 22));
        l8.setForeground(Color.RED);
        l8.setBounds(700, 200, 400, 30);
        l1.add(l8);

        JLabel l9 = new JLabel(date);
        l9.setFont(new Font("Tahoma", Font.BOLD, 22));
        l9.setForeground(Color.RED);
        l9.setBounds(1000, 200, 400, 30);
        l1.add(l9);

        JLabel l10 = new JLabel("MONTH");
        l10.setFont(new Font("Tahoma", Font.BOLD, 22));
        l10.setForeground(Color.RED);
        l10.setBounds(100, 250, 400, 30);
        l1.add(l10);

        JLabel l11 = new JLabel(month);
        l11.setFont(new Font("Tahoma", Font.BOLD, 22));
        l11.setForeground(Color.RED);
        l11.setBounds(400, 250, 400, 30);
        l1.add(l11);

        JLabel l12 = new JLabel("YEAR");
        l12.setFont(new Font("Tahoma", Font.BOLD, 22));
        l12.setForeground(Color.RED);
        l12.setBounds(700, 250, 400, 30);
        l1.add(l12);

        JLabel l13 = new JLabel(year);
        l13.setFont(new Font("Tahoma", Font.BOLD, 22));
        l13.setForeground(Color.RED);
        l13.setBounds(1000, 250, 400, 30);
        l1.add(l13);

        JLabel l14 = new JLabel("CITY");
        l14.setFont(new Font("Tahoma", Font.BOLD, 22));
        l14.setForeground(Color.RED);
        l14.setBounds(100, 300, 400, 30);
        l1.add(l14);

        JLabel l15 = new JLabel(city);
        l15.setFont(new Font("Tahoma", Font.BOLD, 22));
        l15.setForeground(Color.RED);
        l15.setBounds(400, 300, 400, 30);
        l1.add(l15);

        JLabel l16 = new JLabel("PHONE NUMBER");
        l16.setFont(new Font("Tahoma", Font.BOLD, 22));
        l16.setForeground(Color.RED);
        l16.setBounds(700, 300, 400, 30);
        l1.add(l16);

        JLabel l17 = new JLabel(phone_no);
        l17.setFont(new Font("Tahoma", Font.BOLD, 22));
        l17.setForeground(Color.RED);
        l17.setBounds(1000, 300, 400, 30);
        l1.add(l17);

        JLabel l18 = new JLabel("EMAIL ID");
        l18.setFont(new Font("Tahoma", Font.BOLD, 22));
        l18.setForeground(Color.RED);
        l18.setBounds(100, 350, 400, 30);
        l1.add(l18);

        JLabel l19 = new JLabel(email_id);
        l19.setFont(new Font("Tahoma", Font.BOLD, 22));
        l19.setForeground(Color.RED);
        l19.setBounds(400, 350, 400, 30);
        l1.add(l19);

        JLabel l20 = new JLabel("ID CARD");
        l20.setFont(new Font("Tahoma", Font.BOLD, 22));
        l20.setForeground(Color.RED);
        l20.setBounds(700, 350, 400, 30);
        l1.add(l20);

        JLabel l21 = new JLabel(id_card);
        l21.setFont(new Font("Tahoma", Font.BOLD, 22));
        l21.setForeground(Color.RED);
        l21.setBounds(1000, 350, 400, 30);
        l1.add(l21);

        JLabel l22 = new JLabel("ID CARD NUMBER");
        l22.setFont(new Font("Tahoma", Font.BOLD, 22));
        l22.setForeground(Color.RED);
        l22.setBounds(100, 400, 400, 30);
        l1.add(l22);

        JLabel l23 = new JLabel(id_card_no);
        l23.setFont(new Font("Tahoma", Font.BOLD, 22));
        l23.setForeground(Color.RED);
        l23.setBounds(400, 400, 400, 30);
        l1.add(l23);

        JLabel l24 = new JLabel("ADDRESS");
        l24.setFont(new Font("Tahoma", Font.BOLD, 22));
        l24.setForeground(Color.RED);
        l24.setBounds(700, 400, 400, 30);
        l1.add(l24);

        JLabel l25 = new JLabel(address);
        l25.setFont(new Font("Tahoma", Font.BOLD, 22));
        l25.setForeground(Color.RED);
        l25.setBounds(1000, 400, 400, 30);
        l1.add(l25);

        JLabel l26 = new JLabel("PIN CODE NUMBER");
        l26.setFont(new Font("Tahoma", Font.BOLD, 22));
        l26.setForeground(Color.RED);
        l26.setBounds(100, 450, 400, 30);
        l1.add(l26);

        JLabel l27 = new JLabel(pin_code_no);
        l27.setFont(new Font("Tahoma", Font.BOLD, 22));
        l27.setForeground(Color.RED);
        l27.setBounds(400, 450, 400, 30);
        l1.add(l27);

        JLabel l28 = new JLabel("YOUR INFORMATION");
        l28.setFont(new Font("Tahoma", Font.BOLD, 40));
        l28.setForeground(Color.YELLOW);
        l28.setBounds(450, 30, 450, 40);
        l1.add(l28);

        b1 = new JButton("PRINT");
        b1.setBounds(400, 550, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 550, 150, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l1.add(b2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(350, 200, 1300, 700);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            this.setVisible(false);

        } else if (ae.getSource() == b2) {
            new View().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Details("");
    }
}
