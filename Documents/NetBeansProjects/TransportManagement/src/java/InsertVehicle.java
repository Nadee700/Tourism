
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
public class InsertVehicle {
    private String TransportMode,VehicleType,Description,Image;
    private int VehicleID,ChassisNo,NoOfSeats,HiredPrice,ValueVehicle;
    private Date RegisterdDate;
    
    private DBConnection db = new DBConnection();
    private Connection newCon = null; 
    
     public InsertVehicle(String TransportMode,String VehicleType,int VehicleID, int ChassisNo, Date RegisterdDate, int NoOfSeats,int HiredPrice,int ValueVehicle, String Description,String Image){
        this.TransportMode = TransportMode;
        this.VehicleType = VehicleType;
        this.VehicleID = VehicleID;
        this.ChassisNo = ChassisNo;
        this.RegisterdDate = RegisterdDate;
        this.NoOfSeats = NoOfSeats;
        this.HiredPrice = HiredPrice;
        this.ValueVehicle = ValueVehicle;
        this.Description = Description;
        this.Image = Image;
        
    }        

      public boolean isInserted() throws ClassNotFoundException,SQLException{
        {
            if(db.isConnected()){
                newCon = DBConnection.getCon();
                
                Statement stmt = newCon.createStatement();
                String query ="INSERT INTO add_vehicle(TransportMode,VehicleType,VehicleID,ChassisNo,RegisterdDate,NoOfSeats,HiredPrice,ValueVehicle,Description,Image)VALUES"
                        + "('"+TransportMode+"','"+VehicleType+"','"+VehicleID+"','"+ChassisNo+"','"+RegisterdDate+"','"+NoOfSeats+"','"+HiredPrice+"','"+ValueVehicle+"','"+Description+"','"+Image+"')";
                
                int result = stmt.executeUpdate(query);
                if(result >0 )
                        return true;
                
                    else
                        return false;
                 }else
                        return false;
    }       
    
   }
}
