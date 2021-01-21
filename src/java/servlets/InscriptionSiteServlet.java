/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import traitements.GestionMembre;

/**
 *
 * @author Win 7
 */
@WebServlet(name = "InscriptionServlet", urlPatterns = {"/inscription-valider"})
public class InscriptionSiteServlet extends HttpServlet {

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

        String urlJSP = "/WEB-INF/accueil.jsp";

        String pseudo = request.getParameter("Pseudo");
        //pseudo = pseudo.trim();
        String nom = request.getParameter("Nom");
        //nom = nom.trim();
        String prenom = request.getParameter("Prenom");
        //prenom = prenom.trim();
        
        String dateNaissance = request.getParameter("DateNaissance");
        Date dateNaissance2 = null;
        try {
            dateNaissance2 = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissance);
        } catch (ParseException ex) {
            Logger.getLogger(InscriptionSiteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        String mail = request.getParameter("Mail");
        //mail = mail.trim();
        String mdp = request.getParameter("pwd");

        String rue = request.getParameter("Rue");
        //rue = rue.trim();

        String ville = request.getParameter("Ville");
        //ville = ville.trim();

        String cp = request.getParameter("Cp");
        //cp = cp.trim();

        int tel = Integer.parseInt(request.getParameter("Tel"));


        if (getServletContext().getAttribute("gestionMembre") == null) {
            getServletContext().setAttribute("gestionMembre", new GestionMembre()); // " new GestionClient()" => GestionClient GC = new GestionClient()"
        }
        GestionMembre gtMembre = (GestionMembre) getServletContext().getAttribute("gestionMembre");
       
        try {
            gtMembre.creerNouveauMembre(pseudo, nom, prenom, dateNaissance2, mail, mdp, rue, ville, cp, tel);
            
        } catch (SQLException ex) {
            Logger.getLogger(InscriptionSiteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
            request.setAttribute("msgSuccess", "Inscription reussi");

 
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
