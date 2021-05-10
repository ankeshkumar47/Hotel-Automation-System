package hotel.automation.system;
import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    
    public conn(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql:///projecthms","root","Ankesh@1");
        s=c.createStatement();
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}
