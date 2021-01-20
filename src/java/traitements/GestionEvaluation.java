/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitements;

import dao.EvaluationDao;
import java.sql.SQLException;

/**
 *
 * @author Win 7
 */
public class GestionEvaluation {
    private EvaluationDao evaluationDao;

    public GestionEvaluation() {
        this.evaluationDao = evaluationDao;
    }
    
    public void InsertEvaluation() throws SQLException{
        evaluationDao.InsertEvaluation();
    }
            
}
