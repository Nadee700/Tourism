package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testAddVehicle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/book_roomcss.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Non A/C Room Booking</title>\n");
      out.write("    <script>\n");
      out.write("        function dateValidate() {\n");
      out.write("            var arrival = document.getElementById(\"arrival\").value;\n");
      out.write("            var departure = document.getElementById(\"departure\").value;\n");
      out.write("            \n");
      out.write("            var arr_date = new Date(arrival);\n");
      out.write("            var dep_date = new Date(departure);\n");
      out.write("            var cur_date = new Date();\n");
      out.write("            \n");
      out.write("            if (arr_date.getTime() > dep_date.getTime()) {\n");
      out.write("                alert(\"select a correct departure date\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            if ((arr_date.getTime() < cur_date.getTime()) || dep_date.getTime() < cur_date.getTime()) {\n");
      out.write("                alert(\"select a correct arrival date or departure date\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("<div class=\"container_f\">\n");
      out.write("        <h1 style=\"text-align: center\">Room Reservation Form</h1>\n");
      out.write("        <form action=\"BookingServlet\" method=\"POST\" onsubmit=\"return dateValidate()\">\n");
      out.write("     <div class=\"row\">\n");
      out.write("              <div class=\"col-25\">\n");
      out.write("             <label for=\"fname\">Room Type </label>\n");
      out.write("              </div>\n");
      out.write("             <div class=\"col-75\">\n");
      out.write("                 <input type=\"text\" id=\"ac\" name=\"r_type\" value=\"Non A/C\" placeholder=\"A/C\" readonly>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"fname\">Your Name </label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <input type=\"text\" id=\"fname\" name=\"name\" placeholder=\"Your name..\" required>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"lname\">Your Email</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <input type=\"email\" id=\"lname\" name=\"email\" placeholder=\"Email..\" required>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"lname\">Arrival Date</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <input type=\"date\" id=\"arrival\" name=\"date_arr\" required>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"lname\">Departure Date</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <input type=\"date\" id=\"departure\" name=\"date_dep\" required>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"country\">No. of People</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <select id=\"num_people\" name=\"num_people\">\n");
      out.write("            <option value=\"1\">1</option>\n");
      out.write("            <option value=\"2\">2</option>\n");
      out.write("            <option value=\"3\">3</option>\n");
      out.write("            <option value=\"4\">4</option>\n");
      out.write("            <option value=\"5\">5</option>\n");
      out.write("            <option value=\"6\">6+</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"country\">no.of Rooms</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <select id=\"num_room\" name=\"num_room\">\n");
      out.write("            <option value=\"1\">1</option>\n");
      out.write("            <option value=\"2\">2</option>\n");
      out.write("            <option value=\"3\">3</option>\n");
      out.write("            <option value=\"4\">4</option>\n");
      out.write("            <option value=\"5\">5</option>\n");
      out.write("            <option value=\"6\">6+</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-25\">\n");
      out.write("          <label for=\"subject\">Your Message</label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-75\">\n");
      out.write("          <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:200px\"></textarea>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <!-- <button name=\"\" id=\"\" class=\"button1 b1\">Continue</button> -->\n");
      out.write("        <input type=\"submint\" class=\"button1 b1\" value=\"submit\">\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
