
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nadee
 */
public class InsertDriver {
    private String DriverName,NIC,Email,HomeCity; 
    private int DriverID,ContactNo,Age;
    private  Date RegDate;
    private DBConnection db = new DBConnection();
    private Connection newCon = null;
    
    public InsertDriver(String DriverName,int DriverID,int ContactNo, String NIC,String Email,Date RegDate,int Age, String HomeCity){
        this.DriverName = DriverName;
        this.DriverID = DriverID;
        this.ContactNo = ContactNo;
        this.NIC =NIC;
        this.Email = Email;
        this.RegDate = RegDate;
        this.Age = Age;
        this.HomeCity =HomeCity;
    }

    
    public boolean isInserted() throws ClassNotFoundException,SQLException{
            
            if(db.isConnected()){
            newCon = DBConnection.getCon();
            
            Statement stmt = newCon.createStatement();
            String query = "INSERT INTO add_driver(DriverName,DriverID,ContactNo,NIC,Email,RegDate,Age,HomeCity)VALUES('"+DriverName+"','"+DriverID+"','"+ContactNo+"','"+NIC+"','"+Email+"','"+RegDate+"','"+Age+"','"+HomeCity+"')";
            
            int result = stmt.executeUpdate(query);
            
            if(result > 0)
                return true;
            else
                return false;
       }else
        return false;
   }
    
   
}


