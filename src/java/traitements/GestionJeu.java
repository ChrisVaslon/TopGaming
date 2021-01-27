/*
 Auteur : Djouela    
 Date de création: 22/01/2021
 */
package traitements;

import dao.JeuDao;
import entites.Categories;
import entites.Jeu;
import java.sql.SQLException; 
import java.text.ParseException;
import java.util.List;

public class GestionJeu {

    private JeuDao jeuDao;
    private Categories categorie;

    public GestionJeu() {
        jeuDao = new JeuDao();
    }

    public List<Jeu> selectAllJeux() throws SQLException {
        return jeuDao.selectAllJeux();
    }

    public List<Jeu> selectAllJeuxByGenre(String genre) throws SQLException {

        return jeuDao.selectAllJeuxbyGenre(genre);

    }

    
    public Jeu selectJeuById(int id) throws SQLException, ParseException{
          
              return jeuDao.selectJeuById(id);
        
              
    }

}
