/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Win 7
 */
public class EvaluationDao {
    private MaConnexionBDD McBDD;

    public EvaluationDao() {
        this.McBDD = new MaConnexionBDD();
    }

    public void setMcBDD() {
        this.McBDD = McBDD;
    }

    public MaConnexionBDD getMcBDD() {
        return McBDD;
    }
    
     public void InsertEvaluation() throws SQLException{
        try(Connection cnn = McBDD.getConnection();){
            String sql = "";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            
            pstm.executeUpdate();
        }
    }
    
}
