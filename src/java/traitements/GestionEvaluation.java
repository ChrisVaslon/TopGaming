/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitements;

import dao.EvaluationDao;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import outils.CustomedException;

/**
 *
 * @author Win 7
 */
public class GestionEvaluation {

    private EvaluationDao evaluationDao;

    public GestionEvaluation() {
        evaluationDao = new EvaluationDao();
    }

    public void InsertEvaluation(int membre_id, int stars, Date date, int jeux_id) throws SQLException, CustomedException {

        HashMap<String, String> erreurs = new HashMap<>();

        Boolean dejaEvalue = evaluationDao.verifierEvaluation(membre_id, jeux_id);
        if (dejaEvalue) {
            erreurs.put("errEvaluation", "Vous avez déjà évalué le jeu !");
        }

        if (!erreurs.isEmpty()) {
            CustomedException ex = new CustomedException(erreurs, "Echec de l'évaluation");
            throw ex;

        } else {
            evaluationDao.InsertEvaluation(membre_id, stars, date, jeux_id);
            evaluationDao.gainPoints(membre_id);
        }

    }

}
