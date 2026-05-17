import java.sql.*;
public class Conn {

    Connection c;
    Statement s;

    Conn(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //to load the MySQL JDBC driver
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "tasawar"); //to establish a connection to the MySQL database named "travelmanagementsystem" with username "root" and a password

            s=c.createStatement(); //to create a statement object to execute SQL queries on the database

        }
        catch (Exception e){
            e.printStackTrace(); //to print the stack trace of the exception if any error occurs while connecting to the database
        }
    }
    
}
