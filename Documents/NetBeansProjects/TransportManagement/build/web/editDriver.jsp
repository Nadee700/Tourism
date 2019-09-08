<%-- 
    Document   : editDriver
    Created on : Sep 1, 2018, 12:22:49 PM
    Author     : Nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit a Driver</title>
        
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
    font-size: 20px;
    width: 20px;
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
   
<div class="topnav" id="myTopnav">
        <a href="#home" class="active">Home</a>
        <a href="#">Rooms</a>
        <a href="#">Halls</a>
<!--       <div class="dropdown">
          <button class="dropbtn">Dropdown 
            <i class="fa fa-caret-down"></i>
          </button>
          <div class="dropdown-content">
            <a href="#">Link 1</a>
            <a href="#">Link 2</a>
            <a href="#">Link 3</a>
          </div>
        </div>              -->
        <a href="#">Transport</a>
        <a href="#t">About Us</a>
        <a href="#">Contact US</a>
        <a href="#">Login</a>
        
</div>
    </head>
    
     
        <br/><br/><br/>
         <%!
            Connection conn;
            PreparedStatement pstmt;
            ResultSet result;
            String qry;
            Integer DriverID;
        %>
        <%
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","");
            if(request.getParameter("btnUpd")!= null){
                DriverID = Integer.parseInt(request.getParameter("hiddenId"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    qry="UPDATE add_driver SET DriverName =?,ContactNo =?,NIC=?,Email=?,RegDate=?,Age=?,HomeCity=? WHERE DriverID =?";
                    pstmt = conn.prepareStatement(qry);
                    pstmt.setString(1, request.getParameter("DriverName"));
                    pstmt.setString(2, request.getParameter("ContactNo"));
                    pstmt.setString(3, request.getParameter("NIC"));
                    pstmt.setString(4, request.getParameter("Email"));
                    pstmt.setString(5, request.getParameter("RegDate"));
                    pstmt.setString(6, request.getParameter("Age"));
                    pstmt.setString(7, request.getParameter("HomeCity"));
                    pstmt.setInt(8, DriverID);
                    pstmt.executeUpdate();
                  //  response.sendRedirect("./editDriver.jsp");
                
                } catch(ClassNotFoundException cnfe){
                   System.out.println("Class not found exception" + cnfe.toString());
                } catch(SQLException sqle){
                    out.println("SQL eCXCEPTION " + sqle);
                } 
            }
            if(request.getParameter("id")!=null && request.getParameter("id") != ""){
                DriverID = Integer.parseInt(request.getParameter("id"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    qry="SELECT * FROM add_driver WHERE DriverID =?";
                    pstmt = conn.prepareStatement(qry);
                    pstmt.setInt(1, DriverID);
                    result=pstmt.executeQuery(); 
                    result.first();
                
                } catch(ClassNotFoundException cnfe){
                   System.out.println("Class not found exception" + cnfe.toString());
                } catch(SQLException sqle){
                    out.println("SQL eCXCEPTION " + sqle);
                }
            }else{
                response.sendRedirect("./editDriver.jsp");
            }
            
        %>

        <center>
            
        <h1>Edit Details of Drivers</h1>
        <form id="editForm" action="" method="POST">
        <table border="1" width="500px" height="280px"> 
                <tr>
                    <td>
            <table border="0" cellspacing="5" cellpadding="5" align="center"> 
                <tbody>
                    <tr>
                        <td>Driver Name : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="DriverName" id="DriverName" value ='<%=result.getString("DriverName")%>' /></td>
                    </tr>
                    
                    <tr>
                        <td>Driver ID :  </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="DriverID" id="DriverID" value ='<%=result.getString("DriverID")%>' /></td></td>
                    </tr>
                    <tr>
                        <td>Contact No : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="ContactNo" id="ContactNo" value ='<%=result.getString("ContactNo")%>' /></td></td>
                    </tr>
                    <tr>
                        <td>NIC : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="NIC" id="NIC" value ='<%=result.getString("NIC")%>' /></td></td>
                    </tr>
                     <tr>
                        <td>E-mail :</td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="Email" id="Email" value ='<%=result.getString("Email")%>' /></td></td>
                    </tr>
                     <tr>
                        <td>Registred Date: </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="date" name="RegDate" id="RegDate" value ='<%=result.getString("RegDate")%>' /></td></td>
                    </tr>
                      <tr>
                        <td>Age : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="Age" id="Age" value ='<%=result.getString("Age")%>' /></td></td>
                    </tr>
                      <tr>
                          <td>Home City : </td>
                        <td>
                            <input type="hidden" id="hiddenId" name="hiddenId" value ="<%=DriverID%>"/>
                            <input type="text" name="HomeCity" id="HomeCity" value ='<%=result.getString("HomeCity")%>' /></td></td>
                     </tr>
                     <tr>
                         <td><button type="submit" name="btnUpd" value="Edit Diver"  class="button">Edit Driver</button></td>
                        <td><a href ="DriverList.jsp" class="button">Driver List</a></td>
                        
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
