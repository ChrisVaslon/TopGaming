/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entites.Commentaire;
import entites.Jeu;
import entites.Membre;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import traitements.GestionCommentaire;
import traitements.GestionJeu;

/**
 * Auteur: Djouela Date de création: 01/02/2021
 */
@WebServlet(name = "CommentaireCarineServlet", urlPatterns = {"/vers-commentaire"})
public class CommentaireCarineServlet extends HttpServlet {

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

        String valeur = request.getParameter("valeur");
        int idJeu = Integer.parseInt(request.getParameter("idJeu"));
        System.out.println("idJeu: " +idJeu);
        
       
        
       
        
        if (getServletContext().getAttribute("gestionCommentaire") == null) {
            getServletContext().setAttribute("gestionCommentaire", new GestionCommentaire());
        }
        GestionCommentaire gtCommentaire = (GestionCommentaire) getServletContext().getAttribute("gestionCommentaire");
        

        Membre user = (Membre)session.getAttribute("user");
        if (getServletContext().getAttribute("gestionJeu") == null) {
            getServletContext().setAttribute("gestionJeu", new GestionJeu());
        }
        GestionJeu gestionJeu = (GestionJeu) getServletContext().getAttribute("gestionJeu"); 
         if (getServletContext().getAttribute("gestionCommentaire") == null) {
            getServletContext().setAttribute("gestionCommentaire", new GestionCommentaire());
        }
        GestionCommentaire gtCommentaire2 = (GestionCommentaire) getServletContext().getAttribute("gestionCommentaire");
        
        if(user != null){
              try {
            Date date = new Date();
            Date dateModif = new Date();
             
            gtCommentaire.insererNouveauCommentaire(valeur, date, dateModif, idJeu, user.getId());
             System.out.println("-------------- idUser:" +user.getId());
             
               
             Jeu jeu = gestionJeu.selectJeuById(idJeu);
            request.setAttribute("jeu", jeu);
            
            List<Commentaire> commentaires = gtCommentaire2.selectAllCommentairesbyJeuId(idJeu);
          request.setAttribute("commentaires", commentaires);
             
           
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireCarineServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CommentaireCarineServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
              
           
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
