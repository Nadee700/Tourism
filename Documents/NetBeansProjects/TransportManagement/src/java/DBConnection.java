
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nadee
 */
public class DBConnection {
    private String url="jdbc:mysql://localhost:3306/hotel_system";
    private String uName="root";
    private String pw="";
    static Connection con = null;
    
public DBConnection(){}

public boolean isConnected() throws ClassNotFoundException, SQLException
{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection(url,uName,pw);
    if(con!=null)
        return true;
    else
        return false;
}
public static Connection getCon(){
    return con;
}
    
}
