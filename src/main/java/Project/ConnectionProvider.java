/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author prita
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","12345");
           return con;
        }
        catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e);
            return null;
        }
    } 
    public static void main(String[] args) {
        
    }
    
}
