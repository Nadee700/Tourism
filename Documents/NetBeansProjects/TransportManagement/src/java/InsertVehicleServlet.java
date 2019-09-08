/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import sun.util.logging.PlatformLogger;
//import servlet.InsertVehicle;

/**
 *
 * @author Nadee
 */
@WebServlet(urlPatterns = {"/InsertVehicleServlet"})
public class InsertVehicleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertVehicleServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertVehicleServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            InputStream inputStream = null;
            String TransportMode = request.getParameter("TransportMode");
            String VehicleType = request.getParameter("VehicleType");
            int VehicleID = Integer.parseInt(request.getParameter("VehicleID"));
            int ChassisNo = Integer.parseInt(request.getParameter("VehicleID"));
            String RegisterdDate = request.getParameter("RegisterdDate");
            Date d = Date.valueOf(RegisterdDate);
            int NoOfSeats = Integer.parseInt(request.getParameter("NoOfSeats"));
            int HiredPrice = Integer.parseInt(request.getParameter("HiredPrice"));
            int ValueVehicle = Integer.parseInt(request.getParameter("ValueVehicle"));
            String Description = request.getParameter("Description");
            String Image = request.getParameter("file");
            
           // Part part = request.getPart("file");
            //inputStream=part.getInputStream();
            //String file = extractFileName(part);
           
           // String savePath ="C:\\Users\\Nadee\\Documents\\NetBeansProjectsqqQop\\TransportManagement\\web\\IMG"+ File.separator + file;
           // File fileSaveDir = new File(savePath);
            
          //  part.write(savePath + File.separator);
            
            InsertVehicle v = new InsertVehicle(TransportMode,VehicleType,VehicleID,ChassisNo,d,NoOfSeats,HiredPrice,ValueVehicle,Description,Image);
            
            try{
                if(v.isInserted()){
                    response.sendRedirect("addVehicle.jsp");
                }else
                    out.println("error");
            }catch(ClassNotFoundException | SQLException e){
                Logger.getLogger(InsertVehicleServlet.class.getName()).log(Level.SEVERE, null, e);
                out.println(e.getMessage());
            }
        }
        
      
        
    }
    
      private String extractFileName(Part part){
            String contentDisp = part.getHeader("content-disposition");
            String[] items = contentDisp.split(";");
            for(String s : items ){
                if(s.trim().startsWith("filename")){
                    return s.substring(s.indexOf("=")+2,s.length()-1);
                }
            }
            return "";
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
