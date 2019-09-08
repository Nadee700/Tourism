package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class DriverList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Connection conn;
            Statement stat;
            ResultSet result;
            String qry;
            Integer DriverID;
        
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv =\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Driver List</title>\n");
      out.write("        \n");
      out.write("        <style>      \n");
      out.write("body {margin:0;font-family:Arial}\n");
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
      out.write("                 \n");
      out.write(" .button{\n");
      out.write("      background-color: #333;\n");
      out.write("      border: none;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px 32px;\n");
      out.write("      text-align: center;\n");
      out.write("      text-decoration: none;\n");
      out.write("      display: inline-block;\n");
      out.write("      font-size: 16px;\n");
      out.write("      margin: 4px 2px;\n");
      out.write("      }\n");
      out.write(" th{\n");
      out.write("      background-color: #333;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px;\n");
      out.write("                \n");
      out.write("      }\n");
      out.write(" td{\n");
      out.write("      border-bottom: 1px solid;\n");
      out.write("      }\n");
      out.write("            \n");
      out.write("            \n");
      out.write(" .footer1 {\n");
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
      out.write("    font-size: 20px;\n");
      out.write("    width: 20px;\n");
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
      out.write("  }          \n");
      out.write("        </style>\n");
      out.write("           \n");
      out.write("<div class=\"topnav\" id=\"myTopnav\">\n");
      out.write("        <a href=\"#home\" class=\"active\">Home</a>\n");
      out.write("        <a href=\"#\">Rooms</a>\n");
      out.write("        <a href=\"#\">Halls</a>\n");
      out.write("<!--       <div class=\"dropdown\">\n");
      out.write("          <button class=\"dropbtn\">Dropdown \n");
      out.write("            <i class=\"fa fa-caret-down\"></i>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"dropdown-content\">\n");
      out.write("            <a href=\"#\">Link 1</a>\n");
      out.write("            <a href=\"#\">Link 2</a>\n");
      out.write("            <a href=\"#\">Link 3</a>\n");
      out.write("          </div>\n");
      out.write("        </div>              -->\n");
      out.write("        <a href=\"#\">Transport</a>\n");
      out.write("        <a href=\"#t\">About Us</a>\n");
      out.write("        <a href=\"#\">Contact US</a>\n");
      out.write("        <a href=\"#\">Login</a>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("        <br/><br/><br/>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management","root","");
                stat= conn.createStatement();
                String query = request.getParameter("q");
                if(query!=null){
                    qry="SELECT * FROM add_driver where DriverName like '%"+query+"%' or ContactNo like '%"+query+"%' or NIC like '%"+query+"%' or Email like '%"+query+"%'or RegDate like '%"+query+"%'or Age like '%"+query+"%'or HomeCity like '%"+query+"%'";
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
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("     \n");
      out.write("        <h1>Driver List!</h1>\n");
      out.write("        \n");
      out.write("        <form  action=\"\" method=\"get\">\n");
      out.write("            Search &nbsp &nbsp &nbsp <input type=\"text\" class=\"form-control\" name=\"q\" placeholder=\"Search here....\"/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        <table border=\"1\" cellspacing=\"1\" cellpadding=\"4\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Driver Name</th>\n");
      out.write("                    <th>Driver ID</th>\n");
      out.write("                    <th>Contact No</th>\n");
      out.write("                    <th>NIC</th>\n");
      out.write("                    <th>E-mail</th>\n");
      out.write("                    <th>RegDate</th>\n");
      out.write("                    <th>Age</th>\n");
      out.write("                    <th>Home City</th>\n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    while (result.next()){
                        DriverID=result.getInt("DriverID");
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>");
      out.print(result.getString("DriverName"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("DriverID"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("ContactNo"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("NIC"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("Email"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("RegDate"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("Age"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(result.getString("HomeCity"));
      out.write("</td>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write(" \n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("                </br>\n");
      out.write("                </br>\n");
      out.write("                <a href =\"addDriver.jsp\" class=\"button\">Add Driver</a>\n");
      out.write("                <a href =\"Driver.jsp\" class=\"button\">Update Driver Details</a>\n");
      out.write("    </center>\n");
      out.write("    <br/><br/><br/>\n");
      out.write("    <footer class=\"footer1\">\n");
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
      out.write("\n");
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
