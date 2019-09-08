package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

public final class m_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   <meta charset=\"ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\t\n");
      out.write("body, html {\n");
      out.write("    height: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bgimg {\n");
      out.write("    background-color:#E6E6FA;\n");
      out.write("    height: 100%;\n");
      out.write("    background-position: center;\n");
      out.write("    background-size: cover;\n");
      out.write("    position: relative;\n");
      out.write("    color: black;\n");
      out.write("    font-family: \"Times New Roman\", Courier, monospace;\n");
      out.write("    font-size: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 80%;\n");
      out.write("    padding: 4px 20px;\n");
      out.write("    margin: 5px 0;\n");
      out.write("    border: 1px solid black;\n");
      out.write("    opacity: 0.8;\n");
      out.write("    text-color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* form header logo */\n");
      out.write("img.avatar {\n");
      out.write("    width: 60%;\n");
      out.write("    border-radius: 0%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* form footer logo */\n");
      out.write("img.avatar1 {\n");
      out.write("    width: 35%;\n");
      out.write("    border-radius: 0%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".middle {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("   \n");
      out.write("    position: fixed; /* Stay in place */\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%; /* Full width */\n");
      out.write("    height: 100%; /* Full height */\n");
      out.write("    overflow: auto; /* Enable scroll if needed */\n");
      out.write("    background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("    padding-top: 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content/Box */\n");
      out.write(".modal-content {\n");
      out.write("    background-color: #fefefe;\n");
      out.write("    margin: 30% auto 30% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("    border: 1px solid #888;\n");
      out.write("    width: 500px;\n");
      out.write("    backgroud-position:center; /* Could be more or less, depending on screen size */\n");
      out.write("    border-radius: 5%;\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Continu button */\n");
      out.write(".button {\n");
      out.write("    background-color: #4CAF50; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 5px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 12px;\n");
      out.write("    margin: 2px 1px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 2%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button2 {\n");
      out.write("    background-color: #3333cc;\n");
      out.write("    border-radius: 12px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".butn {\n");
      out.write("    border-radius: 12px;\n");
      out.write("    background: #FEFEFE;\n");
      out.write("    padding: 8px; \n");
      out.write("    width: 200px;\n");
      out.write("    height: 15px; \n");
      out.write("}  \n");
      out.write("\t\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"bgimg\">\n");
      out.write("  \n");
      out.write("  \t<div class=\"middle\">\n");
      out.write("  \t<div class=\"modal-content\">\n");
      out.write("         <br/>\n");
      out.write("         <img src=\"IMG/logo2.png\" width=\"47%\" height=\"30%\">\n");
      out.write("    <h2>WELCOME</h2>\n");
      out.write("    <h5>please enter your credentials to continue</h5>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \t<center>\n");
      out.write("   \t<form action=\"\" method=\"post\"/>\n");
      out.write("            <table>\n");
      out.write("   \t     <tr>\n");
      out.write("   \t\t<td>Username  </td>\n");
      out.write("                <td><input type=\"text\" name=\"uname\" id=\"uname\" placeholder=\"Enter Username\" class=\"butn\"></td>\n");
      out.write("   \t     </tr>\n");
      out.write("\n");
      out.write("   \t      <tr>\n");
      out.write("   \t\t<td>Password </td>\n");
      out.write("   \t\t<td><input type=\"password\" name=\"pw\" id=\"pw\" placeholder=\"Enter Password\"class=\"butn\"></td>\n");
      out.write("   \t      </tr>\n");
      out.write("\n");
      out.write("   \t    </div>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("     \n");
      out.write("        ");

            if(request.getParameter("login")!=null){
            
                String uname = request.getParameter("uname");
                String pw = request.getParameter("pw");
                
              
                if(uname.equals("manager")&& pw.equals("manager")){
                    response.sendRedirect("./Manager.jsp");
                }else
                {
                   out.println("Invalid UserName and Password");
   
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <form/>\n");
      out.write("                <a href=\"Manager.jsp\">\n");
      out.write("                    <input type=\"submit\"  name=\"submit\" id=\"submit\" value=\"Login\" button class=\"button button2\"/></a>\n");
      out.write("                <br/>\n");
      out.write("         \n");
      out.write("           <h6>Powered by Panaroma Hotel(Pvt)Limited<br/>\n");
      out.write("        \t&copy;2018 Event Services </h6>\n");
      out.write("        \t\n");
      out.write("         </center>\n");
      out.write("    \n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
