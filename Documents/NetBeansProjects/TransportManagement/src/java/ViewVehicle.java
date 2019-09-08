
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nadee
 */
public class ViewVehicle {

    private String TransportMode, VehicleType, Description, Image;
    private int VehicleID, ChassisNo, NoOfSeats, HiredPrice, ValueVehicle;
    private Date RegisterdDate;

    private DBConnection db = new DBConnection();
    private Connection newCon = null;

    ResultSet result;
    String qry;

    public ViewVehicle( int VehicleID) {
        this.VehicleID = VehicleID;
      
    }

    public void isView() throws ClassNotFoundException, SQLException {
        {
            if (db.isConnected()) {
                newCon = DBConnection.getCon();

                Statement stmt = newCon.createStatement();
                String query = "SELECT * FROM add_vehicle  WHERE VehicleID= '" + VehicleID + "'";

                result = stmt.executeQuery(query);
                
                Vector v = new Vector();
                while (result.next()) {
                    
                   v.add(result.getString("name"));

                }

            }

        }

    }
}
