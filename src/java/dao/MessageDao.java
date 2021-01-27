
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.time.LocalDate;


public class MessageDao {
    
    private MaConnexionBDD mcBDD;
    
    public MessageDao() {
        mcBDD = new MaConnexionBDD();
    }

    public MessageDao(MaConnexionBDD mcBDD) {
        this.mcBDD = mcBDD;
    }

    public void setMcBDD(MaConnexionBDD mcBDD) {
        this.mcBDD = mcBDD;
    }
    
    public void insererMessage(String contenu, Date dateMessage ) throws SQLException{
        
        try( Connection cnn = mcBDD.getConnection();){
            String sql = "INSERT INTO "
                    + "message(message_contenu, message_date, membre_id) "
                    + "VALUES(?,?,1)";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, contenu);
            pstm.setDate(2, new java.sql.Date(dateMessage.getTime()));
            
            pstm.executeQuery();
            
            
        }
    }
    
//     public int verifierExistanceMembre(String email) throws SQLException {
//        try (Connection cnn = mcBDD.getConnection();) { 
//            String sql = "SELECT * FROM message msg "
//                    + "JOIN  membre m ON m.membre_id = msg.membre_id "
//                    + "WHERE membre_email = ?";
//            PreparedStatement pstm = cnn.prepareStatement(sql);
//            pstm.setString(1, email);
//            ResultSet rs = pstm.executeQuery();
//           
//
//        }
//        return 0;
//    }
    
}
