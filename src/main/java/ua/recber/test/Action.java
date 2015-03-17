/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.recber.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author recber
 */
public class Action extends HttpServlet {

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
        String bp1 = new String ("<link rel=\"stylesheet\" href=\"css/blueprint/screen.css\" "
                + "type=\"text/css\" media=\"screen, projection\" />");
        String bp2 = new String ("<link rel=\"stylesheet\" href=\"css/blueprint/print.css\" "
                + "type=\"text/css\" media=\"print\" />");
        String bp3 = new String (" <!--[if IE]><link rel=\"stylesheet\" href=\"css/blueprint/ie.css\" "
                + "type=\"text/css\" media=\"screen, projection\" /><![endif]-->");
        String bp4 = new String("<link rel=\"stylesheet\" "
                + "href=\"css/blueprint/plugins/fancy-type/scr\"/>");
        String bp5 = new String("<meta http-equiv= \"Content-Type\"  content=\"text/html; charset=UTF-8\"/>");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Action</title>");
            out.println ("<!-- Framework CSS -->");
            out.println(bp1);
            out.println(bp2);
            out.println(bp3);
            out.println("<!-- Import fancy-type plugin. -->");
            out.println(bp4);
            out.println(bp5); 
            
            out.println("<body>");
            out.println ("<div class=\"container\">");
            out.println("<h1>Action Form</h1>");
            out.println("</div>");
            
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Action1</td>");
            out.println("<td>");
            out.println(
                "<form method=\"post\" action =\"" + request.getContextPath()
                + "/1.do\" >");
            out.println("<input type=\"text\" name=\"Action1\" "
                    + "size=\"40\" maxlength=\"256\">");
            out.println("</td>");
            out.println("<td>");            
            out.println("<input type=\"submit\" value=\"Add\">");
            out.println("</td></form>");            
            out.println("</tr>");
            

            out.println("<tr>");
            out.println("<td>Action2</td>");
            out.println("<td>");
            out.println(
                "<form method=\"post\" action =\"" + request.getContextPath()
                + "/1.do\" >");
            out.println("<input type=\"text\" name=\"Action2\" "
                    + "size=\"40\" maxlength=\"256\">");
            out.println("</td>");
            out.println("<td>");            
            out.println("<input type=\"submit\" value=\"Add\">");
            out.println("</td></form>");            
            out.println("</tr>");            
            
            out.println("<tr>");
            out.println("<td>Action3</td>");
            out.println("<td>");
            out.println(
                "<form method=\"post\" action =\"" + request.getContextPath()
                + "/1.do\" >");
            out.println("<input type=\"text\" name=\"Action3\" "
                    + "size=\"40\" maxlength=\"256\">");
            out.println("</td>");
            out.println("<td>");            
            out.println("<input type=\"submit\" value=\"Add\">");
            out.println("</td></form>");            
            out.println("</tr>");
            out.println("<br>");              
            
            out.println("</body>");
            out.println("</html>");
        }
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
          //display the parameter names and values
        Enumeration paramNames = request.getParameterNames();
////        Map paramNames = request.getParameterMap();
////        paramNames.put(this, request);

        String parName;//this will hold the name of the parameter

        boolean emptyEnum = false;

        if (!paramNames.hasMoreElements()) {
////        if (!paramNames.isEmpty()) {            
            emptyEnum = true;
        }

       java.io.PrintWriter out = response.getWriter();
        out.println("<H1>Action Parameters</H1>");

        if (emptyEnum) {
            out.println(
                    "<h2>Sorry, the request does not contain any parameters</h2>");
        } else {
            out.println(
                    "<h2>Here are the submitted parameter values</h2>");
        }

        while (paramNames.hasMoreElements()) {
////        while (paramNames.isEmpty()) {            

            parName = (String) paramNames.nextElement();
////            parName = (String) paramNames.getOrDefault(out, emptyEnum);

            out.println(
                    "<strong>" + parName + "</strong> : "
                    + request.getParameter(parName));

            out.println("<br />");

        }//while

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
