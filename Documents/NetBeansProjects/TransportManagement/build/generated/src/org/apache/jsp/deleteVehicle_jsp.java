package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.Dialog;
import java.sql.*;
import java.util.*;

public final class deleteVehicle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            Connection conn;
            PreparedStatement pstmt;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Delete Vehicle</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("           <footer class=\"footer1\">\n");
      out.write("    <table style=\"width: 100%;\">\n");
      out.write("        <tr>\n");
      out.write("            <td><h2>Panorama Kaluthara</h2></td>\n");
      out.write("            <td><h2>Contact Details</h2></td>\n");
      out.write("            <td><h2>Social</h2></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><img src=\"img/logo2.png\" style=\"width: 30%;\"></td>\n");
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
