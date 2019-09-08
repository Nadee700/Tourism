<%-- 
    Document   : editVehicle
    Created on : Apr 29, 2018, 8:00:00 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit a vehicle</title>
        
        <style>      
 body {margin:0;font-family:Arial}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.active {
  background-color: #4CAF50;
  color: white;
}

.topnav .icon {
  display: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 17px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
    font-family: inherit;
    margin: 0;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.topnav a:hover, .dropdown:hover .dropbtn {
  background-color: #555;
  color: white;
}

.dropdown-content a:hover {
    background-color: #ddd;
    color: black;
}
  
            
 .button{
      background-color: #333;
      border: none;
      color: white;
      padding: 15px 20px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 16px;
      margin: 4px 2px;
      }
            
           .footer1 {
    position: relative;
    left: 0;
    bottom: 0;
    width: 100%;
    background-color: #333;
    color: white;
   
 }

 .fa {
    padding: 20px;
    font-size: 30px;
    width: 50px;
    text-align: center;
    text-decoration: none;
    margin: 5px 2px;
  }
  
  .fa:hover {
      opacity: 0.7;
  }
  
  .fa-facebook {
    background: #3B5998;
    color: white;
  }
  
  .fa-twitter {
    background: #55ACEE;
    color: white;
  }
  .fa-youtube {
    background: #bb0000;
    color: white;
  }
  
  .fa-instagram {
    background: #125688;
    color: white;
  }
        </style>

    </head>
  
     
        <br/><br/><br/>
         <%!
            Connection conn;
            PreparedStatement pstmt;
            ResultSet result;
            String qry;
            Integer VehicleID;
        %>
        <%
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","");
            if(request.getParameter("btnUpd")!= null){
                VehicleID = Integer.parseInt(request.getParameter("hiddenId"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    qry="UPDATE add_vehicle SET TransportMode =? ,VehicleType =?,ChassisNo =?,RegisterdDate=?,NoOfSeats=?, HiredPrice=?,ValueVehicle=?,Description=? WHERE VehicleID =?";
                    pstmt = conn.prepareStatement(qry);
                    pstmt.setString(1, request.getParameter("TransportMode"));
                    pstmt.setString(2, request.getParameter("VehicleType"));
                    pstmt.setString(3, request.getParameter("ChassisNo"));
                    pstmt.setString(4, request.getParameter("RegisterdDate"));
                    pstmt.setString(5, request.getParameter("NoOfSeats"));
                    pstmt.setString(6, request.getParameter("HiredPrice"));
                    pstmt.setString(7, request.getParameter("ValueVehicle"));
                    pstmt.setString(8, request.getParameter("Description"));
                    pstmt.setInt(9, VehicleID);
                    pstmt.executeUpdate();
                  //  response.sendRedirect("./editVehicle.jsp");
                
                } catch(ClassNotFoundException cnfe){
                   System.out.println("Class not found exception" + cnfe.toString());
                } catch(SQLException sqle){
                    out.println("SQL eCXCEPTION " + sqle);
                } 
            }
            if(request.getParameter("id")!=null && request.getParameter("id") != ""){
                VehicleID = Integer.parseInt(request.getParameter("id"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    qry="SELECT * FROM add_vehicle WHERE vehicleID =?";
                    pstmt = conn.prepareStatement(qry);
                    pstmt.setInt(1, VehicleID);
                    result=pstmt.executeQuery(); 
                    result.first();
                
                } catch(ClassNotFoundException cnfe){
                   System.out.println("Class not found exception" + cnfe.toString());
                } catch(SQLException sqle){
                    out.println("SQL eCXCEPTION " + sqle);
                }
            }else{
                response.sendRedirect("./EditVehicle.jsp");
            }
            
        %>
        
        <center>
            
        <h1>Edit Details of Vehicles</h1>
        <form id="editForm" action="" method="POST">
        <table border="2" width="500px" height="280px"> 
                <tr>
                    <td>
            <table border="0" cellspacing="5" cellpadding="5" align="center"> 
                <tbody>
                    <tr>
                        <td>Transport Mode : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="TransportMode" id="TransportMode" value ='<%=result.getString("TransportMode")%>' /></td>
                    </tr>
                    
                    <tr>
                        <td>Vehicle type :  </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="VehicleType" id="VehicleType" value ='<%=result.getString("VehicleType")%>' /></td></td>
                    </tr>
                    <tr>
                        <td>Vehicle ID : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="VehicleID" id="VehicleID" value ='<%=result.getString("VehicleID")%>' /></td></td>
                    </tr>
                    <tr>
                        <td>Chassis No : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="ChassisNo" id="ChassisNo" value ='<%=result.getString("ChassisNo")%>' /></td></td>
                    </tr>
                     <tr>
                        <td>Registered Date:  </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="date" name="RegisterdDate" id="RegisterdDate" value ='<%=result.getString("RegisterdDate")%>' /></td></td>
                    </tr>
                     <tr>
                        <td>No of seats:  </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="NoOfSeats" id="NoOfSeats" value ='<%=result.getString("NoOfSeats")%>' /></td></td>
                    </tr>
                      <tr>
                        <td>Hired price for vehicle : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="HiredPrice" id="HiredPrice" value ='<%=result.getString("HiredPrice")%>' /></td></td>
                    </tr>
                      <tr>
                        <td>Value of vehicle :  </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="ValueVehicle" id="ValueVehicle" value ='<%=result.getString("ValueVehicle")%>' /></td></td>
                    </tr>
                    <tr>
                        <td>Description : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=VehicleID%>"/>
                            <input type="text" name="Description" id="Description" value ='<%=result.getString("Description")%>' /></td></td>
                    </tr>
                    
                    <tr>
                        <td>
                            <button type="submit" name="btnUpd" value="Edit Vehicle" class="button">Edit Vehicle</button></td>
                        <td><a href ="VehicleList.jsp" class="button">Vehicle List</a></td>
                         </tr>
               </tbody>
            </table>
                    </td>
                    </tr>
            </table>
        </form>
    </center>
  <br/>
       <footer class="footer1">
    <table style="width: 100%;">
        <tr>
            <td><h2>Panorama Kaluthara</h2></td>
            <td><h2>Contact Details</h2></td>
            
            
            <td><h2>Social</h2></td>
        </tr>
        <tr>
            <td width="30%"><img src="IMG/logo2.png" style="width: 50%;"></td>
            <td><pre>Email:info@panoramahotelkalutara.com
                     Tel:+94(0) 34 2236738
                     Address:Kaluthara,
                     panaroma.</pre>
            </td>
                <td><a href="#" class="fa fa-facebook"></a>
                    <a href="#" class="fa fa-twitter"></a>
                    <a href="#" class="fa fa-youtube"></a>
                    <a href="#" class="fa fa-instagram"></a>
                </td>
            </tr>
    </table>
</footer>
    </body>
</html>
