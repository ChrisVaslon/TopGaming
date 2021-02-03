/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entites.Jeu;
import entites.Membre;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import outils.CustomedException;
import traitements.GestionEvaluation;

/**
 *
 * @author Win 7
 */
@WebServlet(name = "EvaluationServlet", urlPatterns = {"/evaluation"})
public class EvaluationServlet extends HttpServlet {

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
        
            String urlJSP = "/WEB-INF/detail-jeu.jsp";
            
            String evaluer = request.getParameter("evaluer");
            Membre user = (Membre) session.getAttribute("user");
            System.out.println(session.getAttribute("user"));  // ATTENTION, si COOKIE, sessionscope est vide !
            System.out.println("user = " + user);
            int membre_id = user.getId();
            int stars = Integer.parseInt(request.getParameter("valeur"));
            int jeux_id = Integer.parseInt(request.getParameter("id"));
            System.out.println("id = " + request.getParameter("id"));
 
        if (getServletContext().getAttribute("gestionEvaluation") == null) {
            getServletContext().setAttribute("gestionEvaluation", new GestionEvaluation()); // " new GestionClient()" => GestionClient GC = new GestionClient()"
        }
        GestionEvaluation gtEvaluation = (GestionEvaluation) getServletContext().getAttribute("gestionEvaluation");
        
        try {
            Date date = new Date();
            System.out.println("----------------");
            System.out.println(membre_id);
            System.out.println(stars);
            System.out.println(new Date());
            System.out.println(jeux_id);
            
            gtEvaluation.InsertEvaluation(membre_id, stars, new Date(), jeux_id);
        } catch (SQLException ex) {
            Logger.getLogger(EvaluationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CustomedException ex) {
            HashMap<String, String> erreurs = ex.getErreurs();
           request.setAttribute("errEvaluation", erreurs.get("errEvaluation"));
            System.out.println("erreur deja evalue");
        }
        
        //getServletContext().getRequestDispatcher(urlJSP).include(request, response);
         // response.sendRedirect("jeu");
        
        System.out.println(request.getParameter("id"));
        request.getRequestDispatcher("jeu").include(request,response);
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
