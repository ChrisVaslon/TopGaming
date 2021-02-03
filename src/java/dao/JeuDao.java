/*
 Auteur: Djouela
 Date de création: 22/01/2021
 */
package dao;

import entites.Jeu;
import entites.TVA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;

public class JeuDao {

    private MaConnexionBDD mcBDD;

    public JeuDao() {
        mcBDD = new MaConnexionBDD();
    }

    public void setMcBDD(MaConnexionBDD mcBDD) {
        this.mcBDD = mcBDD;
    }

    public List< Jeu> selectAllJeux() throws SQLException {
        List<Jeu> jeux = new ArrayList<>();

        try (Connection cnn = mcBDD.getConnection();) {
            String sql = "SELECT * FROM jeu ";
            //  + "JOIN TVA t ON t.TVA_id = j.TVA_id ";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Jeu jeu = new Jeu();

                jeu.setNom(rs.getString("jeu_nom"));
                jeu.setId(rs.getInt("jeux_id"));
                jeu.setImage(rs.getString("jeu_image"));
                jeu.setPrixHT(rs.getFloat("jeu_prixHT"));

                //tva
//                int idTva = rs.getInt("TVA_id");
//                String nomTva = rs.getString("TVA_nom");
//                float montantTva = rs.getFloat("TVA_montant");
//
//                TVA tva = new TVA(idTva, nomTva, montantTva);
//                jeu.setTva(tva);
                jeux.add(jeu);

            }

        }
        return jeux;
    }

    public List< Jeu> selectAllJeuxbyGenre(String genre) throws SQLException {
        List<Jeu> jeux = new ArrayList<>();

        try (Connection cnn = mcBDD.getConnection();) {
            String sql = "SELECT * FROM jeu j "
                    + "JOIN categorie c ON c.categorie_id = j.categorie_id "
                    + "JOIN tva t ON t.TVA_id = j.TVA_id "
                    + "WHERE c.categorie_genre = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, genre);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Jeu jeu = new Jeu();

                String nom = rs.getString("jeu_nom");
                jeu.setNom(rs.getString("jeu_nom"));

                jeu.setId(rs.getInt("jeux_id"));
                jeu.setImage(rs.getString("jeu_image"));
                jeu.setPrixHT(rs.getFloat("jeu_prixHT"));

                int idTva = rs.getInt("TVA_id");
                String nomTva = rs.getString("TVA_nom");
                float montantTva = rs.getFloat("TVA_montant");

                TVA Tva = new TVA(idTva, nomTva, montantTva);
                jeu.setTva(Tva);

                jeux.add(jeu);

            }
            return jeux;
        }
    }
  
    public Jeu selectJeuById(int id) throws SQLException {
        Jeu jeu = null;
        try (Connection cnn = mcBDD.getConnection()) {
            String sql = "SELECT * FROM jeu j "
                    + " JOIN tva t ON t.TVA_id = j.TVA_id "
                    + " WHERE j.jeux_id = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                jeu = new Jeu(); 
                jeu.setNom(rs.getString("jeu_nom"));
                jeu.setId(rs.getInt("jeux_id"));
                jeu.setImage(rs.getString("jeu_image"));
                jeu.setDescription(rs.getString("jeu_description")); 
                jeu.setPrixHT(rs.getFloat("jeu_prixHT")); 
                
                int idTva = rs.getInt("TVA_id");
                String nomTva = rs.getString("TVA_nom");
                float montantTva = rs.getFloat("TVA_montant");

                TVA Tva = new TVA(idTva, nomTva, montantTva);
                jeu.setTva(Tva);
                 
            }

        }

        return jeu;
    }
}

