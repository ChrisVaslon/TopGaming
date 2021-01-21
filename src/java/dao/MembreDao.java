/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Win 7
 */
public class MembreDao {
    private MaConnexionBDD McBDD;

    public MembreDao() {
         this.McBDD = new MaConnexionBDD();
    }
    
    public void InsertClient(String pseudo, String nom, String prenom, Date dateNaissance, String mail, String mdp, String rue, String ville,String cp, int tel) throws SQLException{
        try(Connection cnn = McBDD.getConnection();){
            String sql = "INSERT INTO membre(membre_pseudo, membre_nom, membre_prenom, membre_dateCreationProfil, membre_dateNaissance, membre_mail, membre_mdp, membre_rue, membre_ville, membre_cp, membre_tel, membre_points, grade_id, role_id) VALUES(?, ?, ?, ?, ?, ?, md5 (?), ?, ?, ?, ?, 10, 1, 1) ";
                  
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, pseudo);
            pstm.setString(2, nom);
            pstm.setString(3, prenom);
            java.sql.Date date = null;
            // TO DO, INDIQUER LA DATE DU JOUR
            pstm.setDate(4, date);
            pstm.setDate(5, (java.sql.Date) dateNaissance);
            pstm.setString(6, mail);
            pstm.setString(7, mdp);
            pstm.setString(8, rue);
            pstm.setString(9, ville);
            pstm.setString(10, cp);
            pstm.setInt(11, tel);

            pstm.executeUpdate();
        }
    }
    
    
    
    
}
