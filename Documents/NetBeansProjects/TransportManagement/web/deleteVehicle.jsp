<%-- 
    Document   : deleteVehicle
    Created on : Aug 11, 2018, 10:26:31 PM
    Author     : Nadee
--%>

<%@page import="java.awt.Dialog"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Vehicle</title>
    </head>
    <body>
        <%!
            Connection conn;
            PreparedStatement pstmt;
            String qry;
            Integer VehicleID;

        %>
        <%
            if(request.getParameter("id")!=null && request.getParameter("id") != ""){
                VehicleID = Integer.parseInt(request.getParameter("id"));
                try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","");
                qry="DELETE FROM add_vehicle WHERE VehicleID =?";
                pstmt= conn.prepareStatement(qry);
                pstmt.setInt(1, VehicleID);
                pstmt.executeUpdate();
               
                response.sendRedirect("./vehicleList.jsp");
            } catch(ClassNotFoundException cnfe){
               System.out.println("Class not found exception" + cnfe.toString());
            } catch(SQLException sqle){
                out.println("SQL eCXCEPTION " + sqle);
            }
            }
        %>
        
           <footer class="footer1">
    <table style="width: 100%;">
        <tr>
            <td><h2>Panorama Kaluthara</h2></td>
            <td><h2>Contact Details</h2></td>
            <td><h2>Social</h2></td>
        </tr>
        <tr>
            <td><img src="img/logo2.png" style="width: 30%;"></td>
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

