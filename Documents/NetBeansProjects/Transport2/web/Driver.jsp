<%-- 
    Document   : Driver
    Created on : Sep 2, 2018, 1:59:21 PM
    Author     : Nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv ="Content-Type" content="text/html; charset=UTF-8">
        <title>Update/Delete Driver List</title>
        
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
                 
 .button{
      background-color: #333;
      border: none;
      color: white;
      padding: 15px 32px;
      text-align: center;
      text-decoration: none;
      display: inline-block;
      font-size: 16px;
      margin: 4px 2px;
      }
 th{
      background-color: #333;
      color: white;
      padding: 15px;
                
      }
 td{
      border-bottom: 1px solid;
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
 
        <%!
            Connection conn;
            Statement stat;
            ResultSet result;
            String qry;
            Integer DriverID;
        %>
        <%
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_system","root","");
                stat= conn.createStatement();
                String query = request.getParameter("q");
                if(query!=null){
                     qry="SELECT * FROM add_driver WHERE DriverName like '%"+query+"%' or ContactNo like '%"+query+"%' or NIC like '%"+query+"%' or Email like '%"+query+"%'or RegDate like '%"+query+"%' or Age like '%"+query+"%'or HomeCity like '%"+query+"%'";
                   result=stat.executeQuery(qry);            
                }else{
                    qry="SELECT * FROM add_driver";
                    result=stat.executeQuery(qry); 
                }  
            } catch(ClassNotFoundException cnfe){
               System.out.println("Class not found exception" + cnfe.toString());
            } catch(SQLException sqle){
                out.println("SQL eCXCEPTION " + sqle);
            }
        %>
    <center>
       
        <h1>Driver List</h1>
        <form  action="" method="get">
            Search &nbsp &nbsp &nbsp <input type="text" class="form-control" name="q" placeholder="Search here...."/>
        </form>
        <br/><br/><br/>
        <table border="1" cellspacing="1" cellpadding="4">
            <thead>
                <tr>
                    <th>Driver Name</th>
                    <th>Driver ID</th>
                    <th>Contact No</th>
                    <th>NIC</th>
                    <th>E-mail</th>
                    <th>RegDate</th>
                    <th>Age</th>
                    <th>Home City</th>
                    
                    <th colspan="2">Actions</th>
                    
                    
                </tr>
            </thead>
            <tbody>
                <%
                    while (result.next()){
                        DriverID=result.getInt("DriverID");
                %>
                <tr>
                    
                    <td><%=result.getString("DriverName")%></td>
                    <td><%=result.getString("DriverID")%></td>
                    <td><%=result.getString("ContactNo")%></td>
                    <td><%=result.getString("NIC")%></td>
                    <td><%=result.getString("Email")%></td>
                    <td><%=result.getString("RegDate")%></td>
                    <td><%=result.getString("Age")%></td>
                    <td><%=result.getString("HomeCity")%></td>
                  
                    <td><a href="EditDriver.jsp?id=<%=DriverID%>" class="button">Update</a></td>
                    <td><a href="DeleteDriver.jsp?id=<%=DriverID%>" onclick="return confirm('Are you Sure?')" class="button">Delete</a></td>
                    
                </tr>
                <%
                    }
                %> 
                
            </tbody>
        </table>
                </br>
                </br>
                <a href ="AddDriver.jsp" class="button">Add Driver</a>
                <a href ="DriverList.jsp" class="button">View Driver Details</a>
    </center>
                <br/></br><br/>
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
