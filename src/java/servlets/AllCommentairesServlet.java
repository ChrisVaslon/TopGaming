/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entites.Commentaire;
import entites.Jeu;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import traitements.GestionCommentaire;

/**
 *
 * @author djtew
 */
@WebServlet(name = "AllCommentairesServlet", urlPatterns = {"/all-commentaires"})
public class AllCommentairesServlet extends HttpServlet {

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
         request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        String urlJSP = "/WEB-INF/details-jeu.jsp";

         int id = Integer.parseInt(request.getParameter("id"));

        
        System.out.println(" dans servlet AllCommentaires");
        if (getServletContext().getAttribute("gestionCommentaire") == null) {
            getServletContext().setAttribute("gestionCommentaire", new GestionCommentaire());
        }
        GestionCommentaire gtCommentaire = (GestionCommentaire) getServletContext().getAttribute("gestionCommentaire");

        try {
          List<Commentaire> commentaires = gtCommentaire.selectAllCommentairesbyJeuId(id);
          request.setAttribute("commentaires", commentaires);
            System.out.println("liste commentaires: "+commentaires);
          
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireCarineServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CommentaireCarineServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        getServletContext().getRequestDispatcher(urlJSP).include(request, response);
         
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
