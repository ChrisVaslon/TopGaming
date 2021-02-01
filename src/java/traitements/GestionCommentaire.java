package traitements;

import dao.CommentaireDao;
import entites.Commentaire;
import java.sql.SQLException;
import java.text.ParseException;
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
}
