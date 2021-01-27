
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entites.Jeu;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import traitements.GestionJeu;

/*
Auteur: Djouela
Date de création: 22/01/2021
 */
@WebServlet(name = "CategoriesServlet", urlPatterns = {"/vers-categories"})
public class CategoriesServlet extends HttpServlet {

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
       
       String urlJSP = "/WEB-INF/categories.jsp";
       
       
       if(getServletContext().getAttribute("gestionJeu") == null){ 
                
                getServletContext().setAttribute("gestionJeu", new GestionJeu()); 
            }
       
       GestionJeu gestionJeu = (GestionJeu) getServletContext().getAttribute("gestionJeu");
        try{
        List<Jeu> categories = gestionJeu.selectAllJeux(); 
        
          request.setAttribute("categories", categories);
//          request.setAttribute("categories", categorie2);
//          request.setAttribute("categories", categorie3);
//          request.setAttribute("categories", categorie4);
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