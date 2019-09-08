<%-- 
    Document   : AddVehicle
    Created on : Sep 2, 2018, 2:18:12 PM
    Author     : Nadee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding a Vehicle</title>
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
                function addVehicleValidate(){
                    var trMode=document.forms["addVehicle"]["TransportMode"].value;
                    var vType=document.forms["addVehicle"] ["VehicleType"].value;
                    var vID=document.forms["addVehicle"] ["VehicleID"].value;
                    var chNo=document.forms["addVehicle"] ["ChassisNo"].value;
                    var regDate=document.forms["addVehicle"] ["RegisterdDate"].value;
                    var noOfseats=document.forms["addVehicle"] ["NoOfSeats"].value;
                    var hPrice=document.forms["addVehicle"] ["HiredPrice"].value;
                    var value=document.forms["addVehicle"] ["ValueVehicle"].value;
                    var description=document.forms["addVehicle"] ["Description"].value;
                    var s = document.forms["addVehicle"] ["btnAdd"].value;

                    if (trMode=== null || trMode===""){
                        alert("Please Enter Transportmode ");
                        return false;  
                    }
                    
                    else if (vID=== null || vID===""){
                        alert("Dear " +vID+ ", Please enter");
                        return false;
                    }
                    else if(chNo=== null || chNo===""){
                        alert("Dear " + chNo + ", Please enter");
                        return false;
                    }
                    
                    else if(regDate=== null || regDate===""){
                        alert("Dear " + regDate + ", Please enter");
                        return false;
                    }
                     
                    else if(noOfseats=== null || noOfseats===""){
                        alert("Dear " + noOfseats + ", Please enter");
                        return false;
                    }
                     
                    else if(hPrice=== null || hPrice===""){
                        alert("Dear " + hPrice + ", Please enter ");
                        return false;
                    }
                     
                    else if(value=== null || value===""){
                        alert("Dear " + value + ", Please enter ");
                        return false;
                    }
                       
                    else if(description=== null || description===""){
                        alert("Dear " + description + ", Please enter ");
                        return false;
                    }
                  }
         </script>
         
</head>

 
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
<body>
    <center>     
      
        <h1>Add Details of Vehicles</h1>
        
        <form name ="addVehicle" action="<%=request.getContextPath() %>/InsertVehicleServlet" method="POST">
            <table border="2" width="500px" height="280px"> 
                <tr>
                    <td>
            <table border="0" cellspacing="5" cellpadding="5" align="center"> 
                <tbody>
                
                    <tr>
                        <td>Transport Mode : </td>
                        <td><input type="text" name="TransportMode" id="TransportMode" size="40" required></td>
                    </tr>
                    <tr>
                        <td>Vehicle type : </td>
                        <td><input type="text" name="VehicleType" id="VehicleType" size="40" required></td>
                    </tr>
                    <tr>
                        <td>Vehicle ID : </td>
                        <td><input type="text" name="VehicleID" id="VehicleID" size="40" maxlength="10" required></td>
                    </tr>
                     <tr>
                        <td>Chassis No : </td>
                        <td><input type="text" name="ChassisNo" id="ChassisNo"  size="40"required></td>
                    </tr>
                    <tr>
                        <td>Registered Date: </td>
                        <td><input type="date" name="RegisterdDate" id="RegisterdDate" size="40" required></td>
                    </tr>
                     <tr>
                        <td>No of seats: </td>
                        <td><input type="text" name="NoOfSeats" id="NoOfSeats" size="40"required></td>
                    </tr>
                     <tr>
                        <td>Hired price for vehicle : </td>
                        <td><input type="text" name="HiredPrice" id="HiredPrice" size="40"required></td>
                    </tr>
                     <tr>
                        <td>Value of vehicle : </td>
                        <td><input type="text" name="ValueVehicle" id="ValueVehicle" size="40"required></td>
                    </tr>
                     <tr>
                        <td>Description : </td>
                        <td><input type="text" name="Description" id="Description" required
 			style="width:300px;height:80px;"/></td>
                    </tr>
                     <tr>
                        <td>Image Link : </td>
                        <td><input type="file" name="file" id="file" ></td>
                    </tr>
                    <tr>
                        </br>
                        <td><button type="submit" value="InsertVehicle" name="btnAdd"  class="button" onclick="return addVehicleValidate()" >Add a Vehicle</button></td>
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
