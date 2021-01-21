/**
 * date : 21/01/2021
 * @author Ousseynou
 */ 
package dao;

 
import entites.Jeu;
import entites.TVA;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList; 
import java.util.List;


public class JeuDao {
    
    
     private MaConnexionBDD mcBDD;
 

    public JeuDao() {
        this.mcBDD = new MaConnexionBDD();
    }

    public void setMcBDD(MaConnexionBDD mcBDD) {
        this.mcBDD = mcBDD;
    }

    // methodes pour executer du sql
    public List<Jeu> selectAllJeux() throws SQLException {

        List<Jeu> jeux = new ArrayList<>();
        try (Connection cnn = mcBDD.getConnection()) {
            String sql = "SELECT * FROM jeu";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Jeu jeu = new Jeu();
                String nom = rs.getString("jeu_nom");
                jeu.setNom(nom);

                jeu.setId(rs.getInt("jeu_id"));
                jeu.setPrixHT(rs.getFloat("jeu_prixHT"));
                jeu.setImage(rs.getString("jeu_image"));
              

                jeux.add(jeu);
            }

        }

        return jeux;
    }

     // methodes pour executer du sql
    public Jeu selectJeuById(Integer id ) throws SQLException, ParseException {

        Jeu jeu = null;

        try (Connection cnn = mcBDD.getConnection()) {
            String sql = "SELECT * FROM jeu AS j "
                    + "JOIN tva AS t ON j.tva_id = t.tva_id "
                    + "JOIN editeur AS e ON j.editeur_id = e.editeur_id "
                    + "WHERE j.jeu_id = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                jeu = new Jeu();
                String nom = rs.getString("jeu_nom");
                jeu.setNom(nom);

                jeu.setId(rs.getInt("jeu_id"));
                jeu.setImage(rs.getString("livre_image"));
                jeu.setPrixHT(rs.getFloat("livre_prixHT"));
                jeu.setDescription(rs.getString("livre_description"));
            

                // tva 
                int idTva = rs.getInt("tva_id");
                String labelTva = rs.getString("tva_label");
                float tauxTva = rs.getFloat("tva_taux");

                TVA Tva = new TVA(idTva, labelTva, tauxTva);
                jeu.setTva(Tva);

                 
            }

        }

        return jeu;
    }
    
    
    
}
