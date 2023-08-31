package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddNewBook extends JFrame implements ActionListener {

    JLabel l2;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2;

    AddNewBook() {

        JLabel l1 = new JLabel("BOOK ID NUMBER");
        l1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l1.setForeground(Color.YELLOW);
        l1.setBounds(150, 100, 300, 30);
        add(l1);

        try {

            Conn c = new Conn();

            int bookidno = 101;

            String str1 = "select COUNT(*) from add_new_book";

            ResultSet rs1 = c.s.executeQuery(str1);

            rs1.next();

            int book_id_no = bookidno + rs1.getInt(1);

            l2 = new JLabel(book_id_no + "");
            l2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
            l2.setForeground(Color.CYAN);
            l2.setBounds(450, 100, 300, 30);
            add(l2);

        } catch (Exception e) {

            System.out.println(e);
        }

        JLabel l3 = new JLabel("BOOK NAME");
        l3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(150, 150, 300, 30);
        add(l3);

        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t1.setForeground(Color.RED);
        t1.setBounds(450, 150, 200, 30);
        add(t1);

        t1.setColumns(10);
        t1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }

            }
        });

        JLabel l4 = new JLabel("AUTHOR NAME");
        l4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l4.setForeground(Color.YELLOW);
        l4.setBounds(150, 200, 300, 30);
        add(l4);

        t2 = new JTextField();
        t2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t2.setForeground(Color.BLUE);
        t2.setBounds(450, 200, 200, 30);
        add(t2);

        t2.setColumns(10);
        t2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l5 = new JLabel("PUBLISHER NAME");
        l5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l5.setForeground(Color.YELLOW);
        l5.setBounds(150, 250, 300, 30);
        add(l5);

        t3 = new JTextField();
        t3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t3.setForeground(Color.RED);
        t3.setBounds(450, 250, 200, 30);
        add(t3);

        t3.setColumns(10);
        t3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && ((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != ' ') && (caracter != ',') && (caracter != '.') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Alphabet Keys And Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l6 = new JLabel("ISB NUMBER");
        l6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l6.setForeground(Color.YELLOW);
        l6.setBounds(150, 300, 300, 30);
        add(l6);

        t4 = new JTextField();
        t4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t4.setForeground(Color.BLUE);
        t4.setBounds(450, 300, 200, 30);
        add(t4);

        t4.setColumns(10);
        t4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b') && (caracter != '-')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l7 = new JLabel("TOTAL BOOK");
        l7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l7.setForeground(Color.YELLOW);
        l7.setBounds(150, 350, 300, 30);
        add(l7);

        t5 = new JTextField();
        t5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t5.setForeground(Color.RED);
        t5.setBounds(450, 350, 200, 30);
        add(t5);

        t5.setColumns(10);
        t5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l8 = new JLabel("BOOK PRICE");
        l8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l8.setForeground(Color.YELLOW);
        l8.setBounds(150, 400, 300, 30);
        add(l8);

        t6 = new JTextField();
        t6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t6.setForeground(Color.BLUE);
        t6.setBounds(450, 400, 200, 30);
        add(t6);

        t6.setColumns(10);
        t6.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        JLabel l9 = new JLabel("BOOK PAGES");
        l9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        l9.setForeground(Color.YELLOW);
        l9.setBounds(150, 450, 300, 30);
        add(l9);

        t7 = new JTextField();
        t7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        t7.setForeground(Color.RED);
        t7.setBounds(450, 450, 200, 30);
        add(t7);

        t7.setColumns(10);
        t7.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {

                    JOptionPane.showMessageDialog(null, "Only Numeric Keys Allowed", "ERROR", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
            }
        });

        b1 = new JButton("SUBMIT");
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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("project/icons/L5.jpg"));
        Image i2 = i1.getImage().getScaledInstance(820, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0, 0, 820, 650);
        add(l10);

        JLabel l11 = new JLabel("ADD NEW BOOK");
        l11.setFont(new Font("Times New Roman", Font.BOLD, 40));
        l11.setForeground(Color.GREEN);
        l11.setBounds(250, 20, 800, 50);
        l10.add(l11);

        getContentPane().setBackground(Color.WHITE);

        setLayout(null);
        setBounds(700, 260, 820, 650);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String book_id_no = l2.getText();

            String book_name = t1.getText();
            String author_name = t2.getText();
            String publisher_name = t3.getText();
            String isb_no = t4.getText();
            String total_book = t5.getText();
            String book_price = t6.getText();
            String book_pages = t7.getText();

            if (t1.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Book Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t2.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Book Author Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t3.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Please Enter Book Publisher Name", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t4.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Book ISB Number", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t5.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Total Book", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if ((t6.getText().isEmpty())) {

                JOptionPane.showMessageDialog(null, "Please Enter Book Price", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else if (t7.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please Enter Book Pages", "ERROR", JOptionPane.ERROR_MESSAGE);

            } else {

                try {

                    Conn c = new Conn();

                    String str2 = "insert into add_new_book values('" + book_id_no + "','" + book_name + "','" + author_name + "','" + publisher_name + "', '" + isb_no + "', '" + total_book + "', '" + book_price + "', '" + book_pages + "')";
                    c.s.executeUpdate(str2);

                    JOptionPane.showMessageDialog(null, "New Book Added");

                    new BookInformation().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {

                    System.out.println(e);
                }

            }
        } else if (ae.getSource() == b2) {

            new BookInformation().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddNewBook();
    }

}
