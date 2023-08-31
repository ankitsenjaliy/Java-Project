package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookViewDetails extends JFrame implements ActionListener {

    String Book_id_no, book_name, author_name, publisher_name, isb_no, total_book, book_price, book_pages;
   
    JButton b1, b2;

    BookViewDetails(String book_id_no) {

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_book where book_id_no = '" + book_id_no + "'";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                book_id_no = rs1.getString("book_id_no");
                book_name = rs1.getString("book_name");
                author_name = rs1.getString("author_name");
                publisher_name = rs1.getString("publisher_name");
                isb_no = rs1.getString("isb_no");
                total_book = rs1.getString("total_book");
                book_price = rs1.getString("book_price");
                book_pages = rs1.getString("book_pages");

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l1 = new JLabel("BOOK ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.CYAN);
        l1.setBounds(150, 100, 300, 30);
        add(l1);

        JLabel l2 = new JLabel(book_id_no);
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.GREEN);
        l2.setBounds(450, 100, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("BOOK NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.CYAN);
        l3.setBounds(150, 150, 300, 30);
        add(l3);

        JLabel l4 = new JLabel(book_name);
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.GREEN);
        l4.setBounds(450, 150, 600, 30);
        add(l4);

        JLabel l5 = new JLabel("AUTHOR NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.CYAN);
        l5.setBounds(150, 200, 300, 30);
        add(l5);

        JLabel l6 = new JLabel(author_name);
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.GREEN);
        l6.setBounds(450, 200, 600, 30);
        add(l6);

        JLabel l7 = new JLabel("PUBLISHER NAME");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.CYAN);
        l7.setBounds(150, 250, 300, 30);
        add(l7);

        JLabel l8 = new JLabel(publisher_name);
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.GREEN);
        l8.setBounds(450, 250, 600, 30);
        add(l8);

        JLabel l9 = new JLabel("ISB NUMBER");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.CYAN);
        l9.setBounds(150, 300, 300, 30);
        add(l9);

        JLabel l10 = new JLabel(isb_no);
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l10.setForeground(Color.GREEN);
        l10.setBounds(450, 300, 300, 30);
        add(l10);

        JLabel l11 = new JLabel("TOTAL BOOK");
        l11.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l11.setForeground(Color.CYAN);
        l11.setBounds(150, 350, 300, 30);
        add(l11);

        JLabel l12 = new JLabel(total_book);
        l12.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l12.setForeground(Color.GREEN);
        l12.setBounds(450, 350, 300, 30);
        add(l12);

        JLabel l13 = new JLabel("BOOK PRICE");
        l13.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l13.setForeground(Color.CYAN);
        l13.setBounds(150, 400, 300, 30);
        add(l13);

        JLabel l14 = new JLabel(book_price);
        l14.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l14.setForeground(Color.GREEN);
        l14.setBounds(450, 400, 300, 30);
        add(l14);

        JLabel l15 = new JLabel("BOOK PAGES");
        l15.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l15.setForeground(Color.CYAN);
        l15.setBounds(150, 450, 300, 30);
        add(l15);

        JLabel l16 = new JLabel(book_pages);
        l16.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l16.setForeground(Color.GREEN);
        l16.setBounds(450, 450, 300, 30);
        add(l16);

        b1 = new JButton("PRINT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(200, 530, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(450, 530, 150, 40);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L7.jpg"));
        Image i2 = i1.getImage().getScaledInstance(820, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l17 = new JLabel(i3);
        l17.setBounds(0, 0, 820, 650);
        add(l17);

        JLabel l18 = new JLabel("VIEW BOOK DETAILS");
        l18.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l18.setForeground(Color.YELLOW);
        l18.setBounds(180, 20, 800, 50);
        l17.add(l18);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(700, 260, 820, 650);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            JOptionPane.showMessageDialog(null, "Printed SuccessFully");

            new BookInformation().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new BookInformation().setVisible(true);
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new BookViewDetails("");
    }

}
