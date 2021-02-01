package dao;

import entites.Membre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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


    public void InsertMembre(String pseudo, String nom, String prenom, Date dateCreationProfil, Date dateNaissance, String mail, String mdp, String rue, String ville, String cp, int tel) throws SQLException {
        try (Connection cnn = McBDD.getConnection();) {
            String sql = "INSERT INTO membre(membre_pseudo, membre_nom, membre_prenom, membre_dateCreationProfil, membre_dateNaissance, membre_mail, membre_mdp, membre_rue, membre_ville, membre_cp, membre_tel, membre_points, grade_id, role_id) VALUES(?, ?, ?, ?, ?, ?, md5 (?), ?, ?, ?, ?, 10, 1, 1) ";

            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, pseudo);
            pstm.setString(2, nom);
            pstm.setString(3, prenom);

            // TO DO, INDIQUER LA DATE DU JOUR
            System.out.println("----------------");
            System.out.println(dateCreationProfil);
            System.out.println(dateNaissance);
            pstm.setDate(4, new java.sql.Date(dateCreationProfil.getTime()));
            pstm.setDate(5, new java.sql.Date(dateNaissance.getTime()));
            pstm.setString(6, mail);
            pstm.setString(7, mdp);
            pstm.setString(8, rue);
            pstm.setString(9, ville);
            pstm.setString(10, cp);
            pstm.setInt(11, tel);

            pstm.executeUpdate();
        }
    }

    public int verifierExistanceEmail(String mail) throws SQLException {
        try (Connection cnn = McBDD.getConnection();) {
            String sql = "SELECT COUNT(*) from membre WHERE membre_mail = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, mail);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            int qte = rs.getInt(1);
            return qte;
        }
    }

    public int verifierExistancePseudo(String pseudo) throws SQLException {
        try (Connection cnn = McBDD.getConnection();) {
            String sql = "SELECT COUNT(*) from membre WHERE membre_pseudo = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, pseudo);
            ResultSet rs = pstm.executeQuery();
            rs.next();
            int qte = rs.getInt(1);
            return qte;
        }

    }
    
    
        
        public Membre Connexion(String mail, String password) throws SQLException {
        Membre user = null;

        try (Connection cnn = McBDD.getConnection();) {
            String sql = "SELECT * FROM membre "
                    + "WHERE membre_mail = ?  AND membre_mdp = md5(?)";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, mail);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                user = new Membre();
                
                user.setNom(rs.getString("membre_nom"));
                user.setPrenom(rs.getString("membre_prenom"));
                user.setMail(rs.getString("membre_mail"));
                user.setId(rs.getInt("membre_id"));
            }

        }
        return user;
    }

    
}
