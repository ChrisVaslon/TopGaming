

                    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entites.Commentaire;
import entites.Jeu;
import entites.Membre;
import entites.PointsAction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thula
 */

public class CommentaireDao {
        private MaConnexionBDD McBDD;
    private int c;

    public CommentaireDao() {
        this.McBDD = new MaConnexionBDD();
    }
    
    public List<Commentaire> selectAllCommentaire() throws SQLException {
        List<Commentaire> comms = new ArrayList<>();

        try (Connection cnn = McBDD.getConnection();) {
            String sql = "SELECT * FROM commentaire";

            PreparedStatement pstm = cnn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Commentaire comm = new Commentaire();

                comm.setId(rs.getInt("commentaire_id"));
                comm.setValeur(rs.getString("commentaire_valeur"));
                comm.setDate(rs.getDate("commentaire_date"));
                comm.setModifDate(rs.getDate("commentaire_modif_date"));
                
                comm.add(comm);

            }

        }
        return comms;
    }
    
    
    public Commentaire selectCommentaireById(int id) throws SQLException, ParseException {
        Commentaire comm = null;

        try (Connection cnn = McBDD.getConnection()) {
            String sql = "SELECT * FROM commentaire c "
                    + " JOIN jeu As j ON c.jeu_id = j.jeuxid "
                    + " JOIN pointsAction AS p ON c.Jeux_id = p.pointsAction_id "
                    + " JOIN memebre AS m ON c.membre_id = m.membre_id "
                    + " WHERE c.commentaire_id = ?";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setInt(c, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                comm = new Commentaire();
                
                comm.setId(rs.getInt("commentaire_id"));
                comm.setValeur(rs.getString("commentaire_valeur"));
                
                String dateStr = rs.getString("commentaire_date");
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date dateParution = sdf.parse(dateStr);
                comm.setDate(dateParution);
               
                String dateStr02 = rs.getString("commentaire_modif_date");
                
                SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date dateParution02 = sdf02.parse(dateStr02);
                comm.setDate(dateParution02);
                
                
                int idPointAction = rs.getInt("points_action_id");
                String nomPointAction = rs.getString("points_action_nom");
                int valeurPointAction = rs.getInt("points_action_valeur");
                
                PointsAction pointsActions = new PointsAction(idPointAction, nomPointAction, valeurPointAction);
                comm.setPointsAction(pointsActions);
                
                int idMemebre = rs.getInt("membreid");
                String nomMemebre = rs.getString("membrenom");
                String pseudoMemebre  = rs.getString("membre_pseudo");
                String prenomMemebre  = rs.getString("membre_prenom");
                String mailMemebre  = rs.getString("membre_mail");
                String mdpMemebre  = rs.getString("membre_mdp");
                String rueMemebre  = rs.getString("membre_rue");
                String villeMemebre  = rs.getString("membre_ville");
                String cpMemebre  = rs.getString("membre_cp");
                int telMemebre  = rs.getInt("membre_tel");
                int pointsMemebre  = rs.getInt("membre_points");
                Date dateCreationProfilMemebre  = rs.getDate("membre_dateCreationProfil");
                String dateNaissanceMemebre  = rs.getString("membre_dateNaissance");
                
                Membre membre = new Membre(idMemebre, pseudoMemebre, nomMemebre, prenomMemebre, dateCreationProfilMemebre, dateNaissanceMemebre, mailMemebre, mdpMemebre, rueMemebre, villeMemebre, cpMemebre, telMemebre, pointsMemebre);
                comm.setMembre(membre);
                
                int idJeux = rs.getInt("Jeux_id");
                String nomJeux = rs.getString("Jeux_nom");
                float prixHTJeux = rs.getFloat("Jeux_prixHT");
                String descriptionJeux = rs.getString("Jeux_description");
                String editeurJeux = rs.getString("Jeux_editeur");
                String imageJeux = rs.getString("Jeux_image");
                
                Jeu jeux = new Jeu(idJeux, nomJeux, prixHTJeux, descriptionJeux, editeurJeux, imageJeux);
                comm.setJeu(jeux);
            }

        }

        return comm;
    }

    
