package traitements;

import dao.CommentaireDao;
import entites.Commentaire;
import entites.Jeu;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thula
 */
public class GestionCommentaire {
    private CommentaireDao commentaireDao;

    public GestionCommentaire () {
        this.commentaireDao = new CommentaireDao();
    }
    
    public List<Commentaire> selectAllCommentaire() throws SQLException {
        return commentaireDao.selectAllCommentaire();
    }
    
    public Commentaire selectCommentaireById(int id) throws SQLException, ParseException{
    
            return commentaireDao.selectCommentaireById(id);
    }
    
    public int selectionnerPointsActionId ( int pointsActionId, String pointsActionNom) throws SQLException {
        
        
        return pointsActionId;
    }


    public void insererNouveauCommentaire( String valeur, Date date, Date dateModif,  int idJeu, int idMembre) throws SQLException, ParseException{
        
    commentaireDao.insererCommentaire(valeur, date, dateModif, idJeu, idMembre);
}

   public List<Commentaire> selectAllCommentairesbyJeuId(int id) throws SQLException, ParseException{
       
        return commentaireDao.selectAllCommentairesbyJeuId(id);
       
   } 
   

    
}
