/*
 Auteur: Djouela
 Date de création: 29/01/2021
 */
package servlets;

import entites.Jeu;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import traitements.GestionContact;

@WebServlet(name = "ContactServlet", urlPatterns = {"/contact"})
public class ContactServlet extends HttpServlet {

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

        String urlJSP = "/WEB-INF/page-confirmation.jsp";

        String nom = request.getParameter("nom");
        nom = nom.trim();
        String prenom = request.getParameter("prenom");
        prenom = prenom.trim();
        String mail = request.getParameter("mail");
        mail = mail.trim();
      
        String message = request.getParameter("message");
        message = message.trim();

        if (getServletContext().getAttribute("gestionContact") == null) {
            getServletContext().setAttribute("gestionContact", new GestionContact());
        }
        GestionContact gtContact = (GestionContact) getServletContext().getAttribute("gestionContact");

//        try {
//            gestionContact.ajouterContact(nom, prenom, mail, message);
//            request.setAttribute("msgSucces", " Nous vous répondrons dans les plus brefs délais");
//
//        } catch (SQLException ex) {
//
//            request.setAttribute("nom", nom);
//            request.setAttribute("prenom", prenom);
//            request.setAttribute("mail", mail);
//            urlJSP = "/WEB-INF/contact.jsp";
//
//           
//            System.out.println(">>>>>>>>>> message error: " + ex.getMessage());
//            ex.printStackTrace();
//        }
        
        try {
            gtContact.ajouterContact(nom, prenom, mail, message);

            request.setAttribute("msgSucces", " Nous vous répondrons dans les plus brefs délais");

        } catch (SQLException ex) {

            System.out.println("erreur categories : " + ex.getMessage());
            ex.printStackTrace();
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
