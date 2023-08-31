package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class NewRegistrationForm extends JFrame implements ActionListener {
    
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3, b4;
    
    NewRegistrationForm() {
        
        l1 = new JLabel("CUSTOMER ID NUNMER");
        l1.setBounds(40, 20, 150, 30);
        add(l1);
        
        t1 = new JTextField();
        t1.setBounds(200, 20, 150, 30);
        add(t1);
        
        l2 = new JLabel("PIN ID NUMBER");
        l2.setBounds(40, 70, 150, 30);
        add(l2);
        
        t2 = new JPasswordField();
        t2.setBounds(200, 70, 150, 30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/14.png"));
        Image i2 = i1.getImage().getScaledInstance(170, 170, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(380, 10, 200, 180);
        add(l3);
        
        b1 = new JButton("CANCLE");
        b1.setBounds(60, 140, 120, 30);
    b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("NEXT");
        b2.setBounds(200, 140, 120, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(600, 300, 600, 300);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
       
            new Login2().setVisible(true);
            this.setVisible(false);
             
        } else if (ae.getSource() == b2) {
            
            String customer_id_no = t1.getText();
            String pin_id_no = t2.getText();
            
            if (customer_id_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Customer Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else if (pin_id_no.length() == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter Your Pin Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            } else {
                
                try {
                    
                    Conn c = new Conn();
                    String str = "select * from new_registration_form where customer_id_no = '" + customer_id_no + "' and pin_id_no = '" + pin_id_no + "'";
                    
                    ResultSet rs = c.s.executeQuery(str);
                    
                    if (rs.next()) {
                        new NewRegistrationForm1().setVisible(true);
                        this.setVisible(false);
                        
                    } else {
                        
                        JOptionPane.showMessageDialog(null, "Invalid Customer Id Number And Pin Id Number", "ERROR", JOptionPane.ERROR_MESSAGE);
                        setVisible(true);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
        new NewRegistrationForm();
    }
    
}
