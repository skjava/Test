/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.recber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ua.recber.bean.ActionBean;

/**
 *
 * @author recber
 */
public class ActionServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ActionBean bean = ActionBean.get(session);
               
        for (String value : request.getParameterValues("action2"))
            if (!value.trim().isEmpty())
//                bean.addA2(Integer.parseInt(value.trim()));
               bean.addA2(String.valueOf(value.trim()));       
         response.sendRedirect("action.jsp");
                

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, "GET requests are not supported");
    }

}
