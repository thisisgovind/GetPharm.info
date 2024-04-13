
package com.mycompany.getpharma.servlets;
import com.mycompany.getpharma.dao.dog;
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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {
         private SessionFactory factory;

      
    private  void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           try{
         String userName=   request.getParameter("user_name") ;  
               String userEmail=request.getParameter("user_email");
              String email = userEmail;
              dog Dog=new dog(FactoryProvider.getFactory());
              User user1= Dog.getUserByEmail(email);
             
               String userPassword=request.getParameter("user_password");
               String userPhone=request.getParameter("user_phone");
               String userAddress=request.getParameter("user_address");
               //validation
               if(userName.isEmpty()){
                  // out.println("name is blank");
                 
          HttpSession http=request.getSession();
          http.setAttribute("message","warning invalid!! username");
          response.sendRedirect("register.jsp");
                return;
                  
               }
         
                if(userPassword.isEmpty()){
                  // out.println("name is blank");
                 
          HttpSession http=request.getSession();
          http.setAttribute("message","warning invalid!! password");
          response.sendRedirect("register.jsp");
                return;                
               }
                                 if(userEmail.isEmpty()){
                  // out.println("name is blank");
                 
          HttpSession http=request.getSession();
          http.setAttribute("message","warning invalid!! mail");
          response.sendRedirect("register.jsp");
                return;
                  
               }
                                   if(user1!=null){
                   HttpSession http=request.getSession();
          http.setAttribute("message","warning email already exist");
          response.sendRedirect("register.jsp");
                return;          
               }
 if(userPhone.isEmpty()){
                  // out.println("name is blank");
                 
          HttpSession http=request.getSession();
          http.setAttribute("message","warning invalid!! phone");
          response.sendRedirect("register.jsp");
                return;
                  
               }
 if(userAddress.isEmpty()){
                  // out.println("name is blank");
                 
          HttpSession http=request.getSession();
          http.setAttribute("message","warning invalid!! userADDRESS");
          response.sendRedirect("register.jsp");
                return;
                  
               }


//creating user object to store data
User user=new User( userName,  userEmail,  userPassword,  userPhone, "default.jpg", userAddress, "normal");
    Session hibernateSession=FactoryProvider.getFactory().openSession();
    Transaction tx=hibernateSession.beginTransaction();
    int userId=(int) hibernateSession.save(user);
    tx.commit();
         hibernateSession.close();
          HttpSession http=request.getSession();
          http.setAttribute("message","Registration Successful !! userId is"+userId);
          response.sendRedirect("register.jsp");
                return;
           }
           catch(Exception e){
               e.printStackTrace();
               
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
