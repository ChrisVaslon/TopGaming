 
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ousseynou
 */
public class GradeDao {
    
    
    private MaConnexionBDD mcBDD;

    public GradeDao() {
        mcBDD = new MaConnexionBDD();
    }

    public void setMcBDD(MaConnexionBDD mcBDD) {
        this.mcBDD = mcBDD;
    }
    
    public void AfficherGrade() throws SQLException{
        
          try(Connection cnn = mcBDD.getConnection();){
            String sql = "SELECT * FROM grade";
            PreparedStatement pstm = cnn.prepareStatement(sql);            
            pstm.executeQuery();
        }      
}
    
}
