/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

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

    public void InsertEvaluation(int membre_id, int stars, Date date, int jeux_id) throws SQLException {
        try (Connection cnn = McBDD.getConnection();) {
            String sql = "INSERT INTO evaluation(evaluation_valeur, evaluation_date, points_action_id, jeux_id, membre_id) "
                    + "VALUES (?, ?, 1, ?, ?)";

            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setInt(1, stars);
            pstm.setDate(2, new java.sql.Date(date.getTime()));
            pstm.setInt(3, jeux_id);
            pstm.setInt(4, membre_id);

            pstm.executeUpdate();
        }
    }

    public boolean verifierEvaluation(int membre_id, int jeux_id) throws SQLException {
        try (Connection cnn = McBDD.getConnection();) {
            Boolean evaluationPresente = false;
            String sql = "SELECT * FROM evaluation "
                    + " WHERE membre_id = ? "
                    + "AND jeux_id = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setInt(1, membre_id);
            pstm.setInt(2, jeux_id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                evaluationPresente = true;
            }

            return evaluationPresente;
        }
    }

    public void gainPoints(int membre_id) throws SQLException {
        try (Connection cnn = McBDD.getConnection();) {
            String sql = "UPDATE membre "
                    + " JOIN evaluation as e ON membre.membre_id = e.membre_id"
                    + " JOIN points_action as pa ON e.points_action_id = pa.points_action_id"
                    + " SET membre_points = membre_points + pa.points_action_valeur"
                    + " WHERE membre.membre_id = '" + membre_id + "' AND pa.points_action_id = 1";
            // A MODIFIER 3 par points-action-valeurs
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.executeUpdate();
        }
    }

    public Double AfficherMoyenneEvaluation(int jeux_id) throws SQLException {
        Double moyenne = 0.0;
        try (Connection cnn = McBDD.getConnection();) {
            
            String sql = "SELECT AVG(evaluation_valeur) FROM evaluation "
                    + "WHERE jeux_id = ? ";

            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setInt(1, jeux_id);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            moyenne = rs.getDouble(1);
            System.out.println(">>>>>>>>>>>>>>>>>>" + moyenne);
            if (moyenne == null) {
                moyenne = 0.0;
            }
        }
        return moyenne;
    }

}
