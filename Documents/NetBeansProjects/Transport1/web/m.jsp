<%-- 
    Document   : ManagerLogin
    Created on : Oct 6, 2018, 3:42:29 PM
    Author     : Nadee
--%>



<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	
body, html {
    height: 100%;
    margin: 0;
}

.bgimg {
    background-color:#E6E6FA;
    height: 100%;
    background-position: center;
    background-size: cover;
    position: relative;
    color: black;
    font-family: "Times New Roman", Courier, monospace;
    font-size: 20px;

}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 80%;
    padding: 4px 20px;
    margin: 5px 0;
    border: 1px solid black;
    opacity: 0.8;
    text-color:white;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* form header logo */
img.avatar {
    width: 60%;
    border-radius: 0%;
}


/* form footer logo */
img.avatar1 {
    width: 35%;
    border-radius: 0%;
}


.middle {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    text-align: center;
}

/* The Modal (background) */
.modal {
   
    position: fixed; /* Stay in place */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
    padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
    background-color: #fefefe;
    margin: 30% auto 30% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 500px;
    backgroud-position:center; /* Could be more or less, depending on screen size */
    border-radius: 5%;
    opacity: 0.8;
}

/* Continu button */
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 5px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    margin: 2px 1px;
    cursor: pointer;
    border-radius: 2%;
}

.button2 {
    background-color: #3333cc;
    border-radius: 12px;
}

.butn {
    border-radius: 12px;
    background: #FEFEFE;
    padding: 8px; 
    width: 200px;
    height: 15px; 
}  
	
</style>

    
</script>
</head>
<body>
	<div class="bgimg">
  
  	<div class="middle">
  	<div class="modal-content">
         <br/>
         <img src="IMG/logo2.png" width="47%" height="30%">
    <h2>WELCOME</h2>
    <h5>please enter your credentials to continue</h5>
    
    
   	<center>
   	<form action="" method="post"/>
            <table>
   	     <tr>
   		<td>Username  </td>
                <td><input type="text" name="uname" id="uname" placeholder="Enter Username" class="butn"></td>
   	     </tr>

   	      <tr>
   		<td>Password </td>
   		<td><input type="password" name="pw" id="pw" placeholder="Enter Password"class="butn"></td>
   	      </tr>

   	    </div>
            </table>
            
     
        <%
            if(request.getParameter("login")!=null){
            
                String uname = request.getParameter("uname");
                String pw = request.getParameter("pw");
                
              
                if(uname.equals("manager")&& pw.equals("manager")){
                    response.sendRedirect("./Manager.jsp");
                }else
                {
                   out.println("Invalid UserName and Password");
   
            }
        %>

        <form/>
                <a href="Manager.jsp">
                    <input type="submit"  name="submit" id="submit" value="Login" button class="button button2"/></a>
                <br/>
         
           <h6>Powered by Panaroma Hotel(Pvt)Limited<br/>
        	&copy;2018 Event Services </h6>
        	
         </center>
    
   </div>
  </div>
 </div>
</div>

</body>
</html>