
package hmssystem;

import java.sql.*;


public class Dbconn {
    Connection e;
    Statement s;
    
    public Dbconn(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            e = DriverManager.getConnection("jdbc:mysql:///holidayinndb","root","abcd12345");
            s = e.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
