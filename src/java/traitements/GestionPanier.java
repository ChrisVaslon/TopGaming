/**
 * date : 21/01/2021
 *
 * @author Ousseynou
 */
package traitements;

import dao.JeuDao;
import entites.Jeu;
import entites.Ligne_Commande;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Collection;
import java.util.HashMap;

public class GestionPanier {

    // panier PROPRE à un utilisateur
    private HashMap<Integer, Ligne_Commande> panier;

    private JeuDao jeuDao;

    public GestionPanier() {
        this.panier = new HashMap<>();
        this.jeuDao = new JeuDao();
    }

    public void addJeu(Integer id) throws SQLException, ParseException {

        if (id == null ) {
            return;
        }      
        if (panier.containsKey(id)) {
            Ligne_Commande jeu = panier.get(id);
            int newQuantite = jeu.getQuantite() + 1;
            jeu.setQuantite(newQuantite);
        }  

    }

    public void viderPanier() {
        this.panier.clear();
    }

    public Collection<Ligne_Commande> getAllLignesPanier() {

        return this.panier.values();
    }

    public int CompteArticles() {
        int somme = 0;
        Collection<Ligne_Commande> lignes = this.getAllLignesPanier();
        for (Ligne_Commande jeu : lignes) {
            somme += jeu.getQuantite();
        }

        return somme;
    }

}
