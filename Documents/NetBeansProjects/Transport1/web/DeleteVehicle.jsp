<%-- 
    Document   : DeleteVehicle
    Created on : Sep 2, 2018, 2:27:09 PM
    Author     : Nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete A Driver</title>
        
    </head>
    <body>
        <%!
            Connection conn;
            PreparedStatement pstmt;
            String qry;
            String VehicleID;

        %>
        <%
            if(request.getParameter("id")!=null && request.getParameter("id") != ""){
                VehicleID = request.getParameter("id");
                try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_system","root","");
                qry="DELETE FROM add_vehicle WHERE VehicleID =?";
                pstmt= conn.prepareStatement(qry);
                pstmt.setString(1, VehicleID);
                pstmt.executeUpdate();
                response.sendRedirect("./Vehicle.jsp");
            } catch(ClassNotFoundException cnfe){
               System.out.println("Class not found exception" + cnfe.toString());
            } catch(SQLException sqle){
                out.println("SQL eCXCEPTION " + sqle);
            }
            }
        %>
    </body>
</html>

