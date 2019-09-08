package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class editVehicle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Connection conn;
            PreparedStatement pstmt;
            ResultSet result;
            String qry;
            Integer VehicleID;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit a vehicle</title>\n");
      out.write("        \n");
      out.write("        <style>      \n");
      out.write(" body {margin:0;font-family:Arial}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .icon {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("    font-size: 17px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color: inherit;\n");
      out.write("    font-family: inherit;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    float: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: #555;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("  \n");
      out.write("            \n");
      out.write(" .button{\n");
      out.write("      background-color: #333;\n");
      out.write("      border: none;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px 20px;\n");
      out.write("      text-align: center;\n");
      out.write("      text-decoration: none;\n");
      out.write("      display: inline-block;\n");
      out.write("      font-size: 16px;\n");
      out.write("      margin: 4px 2px;\n");
      out.write("      }\n");
      out.write("            \n");
      out.write("           .footer1 {\n");
      out.write("    position: relative;\n");
      out.write("    left: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #333;\n");
      out.write("    color: white;\n");
      out.write("   \n");
      out.write(" }\n");
      out.write("\n");
      out.write(" .fa {\n");
      out.write("    padding: 20px;\n");
      out.write("    font-size: 30px;\n");
      out.write("    width: 50px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    margin: 5px 2px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .fa:hover {\n");
      out.write("      opacity: 0.7;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .fa-facebook {\n");
      out.write("    background: #3B5998;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .fa-twitter {\n");
      out.write("    background: #55ACEE;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("  .fa-youtube {\n");
      out.write("    background: #bb0000;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .fa-instagram {\n");
      out.write("    background: #125688;\n");
      out.write("    color: white;\n");
      out.write("  }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#E6E6FA\">\n");
      out.write("     \n");
      out.write("        <br/><br/><br/>\n");
      out.write("         ");
      out.write("\n");
      out.write("        ");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","");
            if(request.getParameter("btnUpd")!= null){
                VehicleID = Integer.parseInt(request.getParameter("hiddenId"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    qry="UPDATE add_vehicle SET TransportMode =? , VehicleType =?,ChassisNo =?,RegisterdDate=?,NoOfSeats=?, HiredPrice=?,ValueVehicle=?,Description=? WHERE VehicleID =?";
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
                    response.sendRedirect("./editVehicle.jsp");
                
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
                response.sendRedirect("./editVehicle.jsp");
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            \n");
      out.write("        <h1>Edit Details of Vehicles</h1>\n");
      out.write("        <form id=\"editForm\" action=\"\" method=\"POST\">\n");
      out.write("        <table border=\"2\" width=\"500px\" height=\"280px\"> \n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("            <table border=\"0\" cellspacing=\"5\" cellpadding=\"5\" align=\"center\"> \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Transport Mode : </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"TransportMode\" id=\"TransportMode\" value ='");
      out.print(result.getString("TransportMode"));
      out.write("' /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Vehicle type :  </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"VehicleType\" id=\"VehicleType\" value ='");
      out.print(result.getString("VehicleType"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Vehicle ID : </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"VehicleID\" id=\"VehicleID\" value ='");
      out.print(result.getString("VehicleID"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Chassis No : </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"ChassisNo\" id=\"ChassisNo\" value ='");
      out.print(result.getString("ChassisNo"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>Registered Date:  </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"date\" name=\"RegisterdDate\" id=\"RegisterdDate\" value ='");
      out.print(result.getString("RegisterdDate"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>No of seats:  </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"NoOfSeats\" id=\"NoOfSeats\" value ='");
      out.print(result.getString("NoOfSeats"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Hired price for vehicle : </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"HiredPrice\" id=\"HiredPrice\" value ='");
      out.print(result.getString("HiredPrice"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Value of vehicle :  </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"ValueVehicle\" id=\"ValueVehicle\" value ='");
      out.print(result.getString("ValueVehicle"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Description : </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"hidden\" id=\"hiddenId\" name=\"hiddenId\" value =\"");
      out.print(VehicleID);
      out.write("\"/>\n");
      out.write("                            <input type=\"text\" name=\"Description\" id=\"Description\" value ='");
      out.print(result.getString("Description"));
      out.write("' /></td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"submit\" name=\"btnUpd\" value=\"Edit Vehicle\" class=\"button\">Edit Vehicle</button></td>\n");
      out.write("                        <td><a href =\"vehicleList.jsp\" class=\"button\">Vehicle List</a></td>\n");
      out.write("                         </tr>\n");
      out.write("               </tbody>\n");
      out.write("            </table>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("  <br/>\n");
      out.write("       <footer class=\"footer1\">\n");
      out.write("    <table style=\"width: 100%;\">\n");
      out.write("        <tr>\n");
      out.write("            <td><h2>Panorama Kaluthara</h2></td>\n");
      out.write("            <td><h2>Contact Details</h2></td>\n");
      out.write("            <td><h2>Social</h2></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td width=\"30%\"><img src=\"IMG/logo2.png\" style=\"width: 50%;\"></td>\n");
      out.write("            <td><pre>Email:info@panoramahotelkalutara.com\n");
      out.write("                     Tel:+94(0) 34 2236738\n");
      out.write("                     Address:Kaluthara,\n");
      out.write("                     panaroma.</pre>\n");
      out.write("            </td>\n");
      out.write("                <td><a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                    <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                    <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("                    <a href=\"#\" class=\"fa fa-instagram\"></a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("    </table>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
