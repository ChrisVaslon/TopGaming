/**
 *
 * @author Ousseynou
 */
package servlets;

import dao.MembreDao;
import entites.Jeu;
import entites.Membre;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import traitements.GestionJeu;

@WebServlet(name = "Accueil", urlPatterns = {"/accueil"})
public class AccueilServlet extends HttpServlet {

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
       
       
       if(getServletContext().getAttribute("gestionJeu") == null){ 
                
                getServletContext().setAttribute("gestionJeu", new GestionJeu()); 
            }
       
       GestionJeu gestionJeu = (GestionJeu) getServletContext().getAttribute("gestionJeu");
       
        Cookie[] cookies = request.getCookies();
 
        if (cookies != null && session.getAttribute("user")== null) {
 
            for (Cookie cookie : cookies) {               
                MembreDao mbDao = new MembreDao();
                if(cookie.getName().equals("ResterConnecte")){
                    try {
                        String userChaineAleatoire = cookie.getValue();
                        Membre user = mbDao.CreerMembreAvecChaineAleatoire(userChaineAleatoire);
                        session.setAttribute("user", user);
                    } catch (SQLException ex) {
                        Logger.getLogger(AccueilServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
       
       
       try{
        List<Jeu> jeu = gestionJeu.selectAllJeuxByGenre("Dernières Sorties"); 
        
          request.setAttribute("jeu", jeu);
    
        } catch(SQLException ex){
            // to do
            System.out.println("erreur categories : " +ex.getMessage());
            ex.printStackTrace();
        }
        try{
        List<Jeu> jeu = gestionJeu.selectAllJeux(); 
        
          request.setAttribute("jeu0", jeu);
    
        } catch(SQLException ex){
            // to do
            System.out.println("erreur categories : " +ex.getMessage());
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
