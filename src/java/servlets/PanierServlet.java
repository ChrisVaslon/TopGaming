 /*
 * date : 21:/01/2021
 * @author Ousseynou
 */
package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import traitements.GestionPanier;

@WebServlet(name = "PanierServlet", urlPatterns = {"/panier"})
public class PanierServlet extends HttpServlet {

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
        HttpSession session = request.getSession();

        String root = "accueil";
        /* Enumeration<String> noms = request.getHeaderNames();*/
        /*
         while (noms.hasMoreElements()) {
         System.out.println(noms.nextElement());

         }
         */
        String orign = request.getHeader("referer");
        System.out.println("orign " + orign);

        String operation = request.getParameter("operation");
        String idParametre = request.getParameter("id");
        int id = Integer.parseInt(idParametre);
        // TO DO
        request.setAttribute("msgSuccess", "panier mis à jour!");

        if (session.getAttribute("gestionPanier") == null) {

            session.setAttribute("gestionPanier", new GestionPanier());
        }

        GestionPanier gestionPanier
                = (GestionPanier) session.getAttribute("gestionPanier");

        if ("ajouter".equals(operation)) {

            try {
                gestionPanier.addJeu(id);
            } catch (SQLException ex) {
                Logger.getLogger(PanierServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(PanierServlet.class.getName()).log(Level.SEVERE, null, ex);
            }

            String[] infos = orign.split("/");
            root = infos[infos.length - 1];

        }

        if ("enlever".equals(operation)) {
            // TO DO

            gestionPanier.viderPanier();

            root = "detail-panier";
        }

        if ("supprimer".equals(operation)) {
            // TO DO
            gestionPanier.supprimerArticle(id);
            root = "detail-panier";
        }

        response.sendRedirect(root);
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
