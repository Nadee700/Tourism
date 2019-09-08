<%-- 
    Document   : addDriver
    Created on : Aug 11, 2018, 10:26:51 PM
    Author     : Nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding a Driver</title>
        <link rel="stylesheet" href="css/home_css.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
        
        <script>
                function addDriverValidate(){
                    var Dname=document.forms["AddDriver"]["DriverName"].value;
                    var Did=document.forms["AddDriver"] ["DriverID"].value;
                    var contactNo=document.forms["AddDriver"] ["ContactNo"].value;
                    var nicNO=document.forms["AddDriver"] ["NIC"].value;
                    var email=document.forms["AddDriver"]["Email"].value;
                    var regDate=document.forms["AddDriver"] ["RegDate"].value;
                    var age=document.forms["AddDriver"] ["Age"].value;
                    var HomeCity=document.forms["AddDriver"] ["HomeCity"].value;
                    var s = document.forms["AddDriver"] ["btnAdd"].value;

                    
                    if (Dname=== null || Dname===""){
                        alert("Dear " + Dname + ", Please enter your name");
                        return false;  
                    }
                    
                    else if (nicNO=== null || nicNO===""){
                        alert("Dear " + name + ", Please enter your NIC number");
                        return false;
                    }
                    //else if(nicNO.length<=10){
                     //   alert("Dear " + name + ", Invalid NIC number");
                    //    return false;
                   // }
                    
                    
                 //   else if(contact=== null || contact===""){
                 //       alert("Dear " + name + ", Please enter your contact number");
                 //       return false;
                    }
                   // 
                  //  else if(address=== null || address===""){
                  //      alert("Dear " + name + ", Please enter your address");
                  //      return false;
                    }
                    
                   
                }
             </script>
   
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
  
        
        <br/>
        <%--
            Connection conn;
            PreparedStatement pstmt;
            String qry;           
        %>
        <%
            if(request.getParameter("btnAdd")!=null){
                try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","");
                qry="INSERT INTO add_driver(DriverName,DriverID,ContactNo,NIC,Email,RegDate,Age,HomeCity) VALUES (?,?,?,?,?,?,?,?)";
                pstmt= conn.prepareStatement(qry);
                pstmt.setString(1, request.getParameter("txt1"));
                pstmt.setString(2, request.getParameter("txt2"));
                pstmt.setString(3, request.getParameter("txt3"));
                pstmt.setString(4, request.getParameter("txt4"));
                pstmt.setString(5, request.getParameter("txt5"));
                pstmt.setString(6, request.getParameter("txt6"));
                pstmt.setString(7, request.getParameter("txt7"));
                pstmt.setString(8, request.getParameter("txt8"));
                pstmt.executeUpdate();
                response.sendRedirect("./addDriver.jsp");
            } catch(ClassNotFoundException cnfe){
               System.out.println("Class not found exception" + cnfe.toString());
            } catch(SQLException sqle){
                out.println("SQL eCXCEPTION " + sqle);
            }
            }
        --%>
        
    <center>     
        
        <h1>Add Details of Drivers</h1>
        
        
        <form  name ="AddDriver" action="InsertDriverServlet" method="POST">
            <table border="1" width="500px" height="280px"> 
                <tr>
                    <td>
            <table border="0" cellspacing="5" cellpadding="5" align="center"> 
                <tbody>
                    <tr>
                        <td>Driver Name : </td>
                        <td><input type="text" name="DriverName" id="DriverName" size="40" required></td>
                    </tr>
                    <tr>
                        <td>Driver ID : </td>
                        <td><input type="text" name="DriverID" id="DriverID" size="40" required></td>
                    </tr>
                    <tr>
                        <td>Contact No : </td>
                        <td><input type="text/number" name="ContactNo" id="ContactNo" size="40" maxlength="10"required></td>
                    </tr>
                     <tr>
                        <td> NIC : </td>
                        <td><input type="text" name="NIC" id="NIC" size="40" required></td>
                    </tr>
                    <tr>
                        <td> E-mail : </td>
                        <td><input type="text" name="Email" id="Email" size="40" required></td>
                    </tr>
                    <tr>
                        <td>Registered Date : </td>
                        <td><input type="date" name="RegDate" id="RegDate" size="40" required></td>
                    </tr>
                     <tr>
                        <td>Age : </td>
                        <td><input type="text" name="Age" id="Age" size="40" required=></td>
                    </tr>
                     <tr>
                        <td>Home City : </td>
                       <td><input type="text" name="HomeCity" id="HomeCity" size="40"required></td>
                    </tr>
                    <tr>
                        </br>
                        <td><button type="submit" value="Add A Driver" name="btnAdd"  class="button">Add a Driver</button></td>
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
