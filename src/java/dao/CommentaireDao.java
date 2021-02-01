
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

/*
Auteur: Djouela
Date de création: 31/01/2021
 */
public class CommentaireDao {
    
    private MaConnexionBDD mcBDD;

    public CommentaireDao() {
        mcBDD = new MaConnexionBDD();
    }

    public void setMcBDD(MaConnexionBDD mcBDD) {
        this.mcBDD = mcBDD;
    }
    
    public void insererCommentaire(String commentaire, Date date, Date modifDate) throws SQLException{
        
        try(Connection cnn = mcBDD.getConnection();){
            String sql = "INSERT INTO commentaire c "
                    + "JOIN jeu j ON j.jeux_id = c.jeux_id "
                    + "JOIN membre m ON m.membre_id = c.membre_id "
                    + "JOIN points_action pa ON pa.points_action_id = c.points_action_id";
            
        }
    }
    
    
    
}
