/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.LoginDAO;
import dao.RegisterDAO;
import entity.Account;
import entity.User_Information;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * 
 */
@WebServlet(name = "RegisterControl", urlPatterns = {"/RegisterControl"})
public class RegisterControl extends HttpServlet {

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
            HttpSession session = request.getSession();   
            session.setMaxInactiveInterval(1);
            String username = request.getParameter("user");
            String password = request.getParameter("pass");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            Date dob =  Date.valueOf(request.getParameter("dob"));
            RegisterDAO dao = new RegisterDAO();        
            LoginDAO ld = new LoginDAO();
            List<Account> a = ld.getAll();
            boolean isValid = true;
            for(int i = 0; i < a.size(); i++){
                if(a.get(i).getUsername().equalsIgnoreCase(username)){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                session.removeAttribute("existed");
                session.setAttribute("success", "Registration Successfull! You can now log in to your account");
                dao.addNewAccount(username, password, name, email, dob);
                response.sendRedirect("Login.jsp");
            }else{
                session.removeAttribute("success");
                session.setAttribute("existed", "Account Already Existed");
                response.sendRedirect("Register.jsp");
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
