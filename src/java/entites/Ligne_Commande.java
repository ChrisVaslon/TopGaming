package entites;

/*
auteur : thulaksan
date de creation : 19/01/2021
 */
public class Ligne_Commande {
    private int id;
    private float prixHT;
    private float TVA;
    private int quantite;
    
    private Jeu jeu;
    private Commande commande;

    public Ligne_Commande() {
    }

    public Ligne_Commande(int id, float prixHT, float TVA, int quantite, Jeu jeu, Commande commande) {
        this.id = id;
        this.prixHT = prixHT;
        this.TVA = TVA;
        this.quantite = quantite;
        this.jeu = jeu;
        this.commande = commande;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public float getTVA() {
        return TVA;
    }

    public void setTVA(float TVA) {
        this.TVA = TVA;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Ligne_Commande{" + "id=" + id + ", prixHT=" + prixHT + ", TVA=" + TVA + ", quantite=" + quantite + ", jeu=" + jeu + ", commande=" + commande + '}';
    }
    
}
