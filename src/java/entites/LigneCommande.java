package entites;

/*
auteur : thulaksan
date de creation : 19/01/2021
 */
public class LigneCommande {
    private int id;
    private float prixHT;
    private float tva;
    private int quantite;
    
    private Jeu jeu;
    private Commande commande;

    public LigneCommande() {
    }

     public LigneCommande(Jeu jeu) {
        this.jeu = jeu;
        this.quantite = 1 ;
        this.prixHT = jeu.getPrixHT();
        this.tva = jeu.getTva().getMontant();
    }
    
    
    public LigneCommande(int id, float prixHT, float TVA, int quantite, Jeu jeu, Commande commande) {
        this.id = id;
        this.prixHT = prixHT;
        this.tva = TVA;
        this.quantite = quantite;
        this.jeu = jeu;
        this.commande = commande;
    }

    public LigneCommande(LigneCommande jeu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        return tva;
    }

    public void setTVA(float TVA) {
        this.tva = TVA;
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
    
   public float getTotalLigne(){
        return  prixHT*getQuantite();
    }  
     

   
    @Override
    public String toString() {
        return "Ligne_Commande{" + "id=" + id + ", prixHT=" + prixHT + ", TVA=" + tva + ", quantite=" + quantite + ", jeu=" + jeu + ", commande=" + commande + '}';
    }

   
    
}
