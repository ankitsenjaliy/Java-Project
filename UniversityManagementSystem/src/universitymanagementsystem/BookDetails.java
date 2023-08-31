package universitymanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;

public class BookDetails extends JFrame implements ActionListener {

    JTable t;
    JComboBox C1;
    JButton b1, b2;

    BookDetails() {

        t = new JTable();
        t.setBounds(0, 160, 1300, 600);
        add(t);

        t.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 22));
        t.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t.setForeground(Color.BLACK);
        t.getTableHeader().setBackground(Color.CYAN);
        t.getTableHeader().setPreferredSize(new Dimension(150, 0));
        t.setRowHeight(30);

        JLabel l1 = new JLabel("BOOK NAME");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.RED);
        l1.setBounds(50, 80, 300, 30);
        add(l1);

        C1 = new JComboBox();

        try {
            Conn c = new Conn();

            String str1 = "select * from add_new_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            while (rs1.next()) {

                C1.addItem(rs1.getString("book_name"));

            }

        } catch (Exception e) {

            System.out.println(e);
        }

        C1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        C1.setBackground(Color.WHITE);
        C1.setForeground(Color.BLUE);
        C1.setBounds(280, 80, 200, 30);
        add(C1);

        JLabel l2 = new JLabel("BOOK ID NUMBER");
        l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l2.setForeground(Color.BLUE);
        l2.setBounds(70, 130, 300, 30);
        add(l2);

        JLabel l3 = new JLabel("BOOK NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.BLUE);
        l3.setBounds(420, 130, 300, 30);
        add(l3);

        JLabel l4 = new JLabel("ISB NUMBER");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.BLUE);
        l4.setBounds(740, 130, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("TOTAL BOOK");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.BLUE);
        l5.setBounds(1050, 130, 300, 30);
        add(l5);

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(420, 780, 150, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 780, 150, 40);
        b2.addActionListener(this);
        add(b2);

        JLabel l6 = new JLabel("STUDENT DETAILS");
        l6.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l6.setForeground(Color.RED);
        l6.setBounds(500, 20, 800, 50);
        add(l6);

        getContentPane().setBackground(Color.GREEN);

        setLayout(null);
        setBounds(460, 130, 1300, 880);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            try {
                Conn c = new Conn();

                String str1 = "select book_id_no,book_name,isb_no,total_book from add_new_book where book_name = '" + C1.getSelectedItem() + "'";

                ResultSet rs1 = c.s.executeQuery(str1);

                t.setModel(DbUtils.resultSetToTableModel(rs1));

            } catch (Exception e) {

                System.out.println(e);
            }

        } else if (ae.getSource() == b2) {

            new BookInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new BookDetails();
    }

}
