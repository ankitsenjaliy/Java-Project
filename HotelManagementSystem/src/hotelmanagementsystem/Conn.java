package hotelmanagementsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn() {
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");;
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/hotelmanagement", "root", "SENJALIYA@8672");
            s = c.createStatement();
            
            System.out.print(s);
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Conn();
    }

}
