package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BookInformation extends JFrame implements ActionListener {

    String x[] = {"Book Id Number", "Book Name", "Author Name", "Publisher Name", "Total Book", "Price Book"};
    String y[][] = new String[20][6];

    JLabel l2;
    JTable t;
    JButton b1, b2, b3, b4;

    int i = 0, j = 0;

    BookInformation() {

        try {

            Conn c = new Conn();

            String str1 = "select * from add_new_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                y[i][j++] = rs1.getString("book_id_no");
                y[i][j++] = rs1.getString("book_name");
                y[i][j++] = rs1.getString("author_name");
                y[i][j++] = rs1.getString("publisher_name");
                y[i][j++] = rs1.getString("total_book");
                y[i][j++] = rs1.getString("book_price");

                i++;
                j = 0;
            }

            t = new JTable(y, x);

        } catch (Exception e) {

            System.out.println(e);

        }

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 40));
        t.setRowHeight(40);

        JScrollPane S = new JScrollPane(t);
        S.setBounds(0, 180, 1383, 551);
        add(S);

        b1 = new JButton("ADD NEW BOOK");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50, 30, 300, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BOOK DETAILS");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(50, 110, 300, 50);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("VIEW BOOK DETAILS");
        b3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(1040, 30, 300, 50);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("UPDATE BOOK DETAILS");
        b4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(1040, 110, 300, 50);
        b4.addActionListener(this);
        add(b4);

        JLabel l1 = new JLabel("BOOK INFORMATION");
        l1.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l1.setForeground(Color.GREEN);
        l1.setBounds(480, 20, 800, 50);
        add(l1);

        try {

            Conn c = new Conn();

            String str2 = "select count(*) from add_new_book";

            ResultSet rs2 = c.s.executeQuery(str2);

            rs2.next();

            int book = rs2.getInt(1);

            l2 = new JLabel("BOOK = " + book);
            l2.setFont(new Font("Times New Roman", Font.BOLD, 40));
            l2.setForeground(Color.YELLOW);
            l2.setBounds(600, 120, 600, 30);
            add(l2);

        } catch (Exception e) {

            System.out.println(e);
        }

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        p1.setLayout(null);
        p1.setBounds(0, 0, 1400, 180);
        add(p1);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.RED);
        p2.setLayout(null);
        p2.setBounds(0, 730, 1400, 100);
        add(p2);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(410, 150, 1400, 850);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            new AddNewBook().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b2) {

            new BookDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b3) {

            new BookSearchDetails().setVisible(true);
            this.setVisible(false);

        } else if (ae.getSource() == b4) {

            new UpdateBookDetails().setVisible(true);
            this.setVisible(false);

        }

    }

    public static void main(String[] args) {

        new BookInformation();
    }

}
