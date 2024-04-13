/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.getpharma.servlets;

import com.mycompany.getpharma.dao.UserDao;
import com.mycompany.getpharma.entites.User;
import com.mycompany.getpharma.helper.FactoryProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String email = request.getParameter("email");
String password = request.getParameter("password");

UserDao userDao = new UserDao(FactoryProvider.getFactory());
User user= userDao.getUserByEmailAndPassword(email,password);


HttpSession httpSession = request.getSession();
// System.out.println(user);
if(user==null){
    // out.println("<h1> Invalid details </h1>");
    httpSession.setAttribute("message", "Invalid Details !! Try with another one");
    response.sendRedirect("login.jsp");
    return;
}else{
    out.println("<h1>Welcome "+user.getUserName() + " </h1>");
    httpSession.setAttribute("current-user",user);
    if(user.getUserType().equals("admin")){
        response.sendRedirect("admin.jsp");
    }
    else if(user.getUserType().equals("normal")){
        response.sendRedirect("normal.jsp");
    }
    else{
        out.println("we have not identified user type");
    }
            //admin.jsp
    
    //normal.jsp
}
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
