<%-- 
    Document   : DeleteDriver
    Created on : Sep 2, 2018, 1:56:20 PM
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
            Integer DriverID;

        %>
        <%
            if(request.getParameter("id")!=null && request.getParameter("id") != ""){
                DriverID = Integer.parseInt(request.getParameter("id"));
                try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_system","root","");
                qry="DELETE FROM add_driver WHERE DriverID =?";
                pstmt= conn.prepareStatement(qry);
                pstmt.setInt(1, DriverID);
                pstmt.executeUpdate();
                response.sendRedirect("./Driver.jsp");
            } catch(ClassNotFoundException cnfe){
               System.out.println("Class not found exception" + cnfe.toString());
            } catch(SQLException sqle){
                out.println("SQL eCXCEPTION " + sqle);
            }
            }
        %>
    </body>
</html>
