
package entites;

import java.util.List;

/*
Auteur: Djouela
Date de création: 21/01/2021

 */
public class Jeu {
    private int id;
    private String nom;
    private float prixHT;
    private String editeur;
    private String image;
    
    
    private TVA tva;
    private Categories categorie;
    
    /*
    private List<Commentaire> commentaires;
    private List<Evaluation> evaluations;
    */

    public Jeu() {
    }

    public Jeu(int id, String nom, float prixHT, String editeur, String image) {
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
        this.editeur = editeur;
        this.image = image;
    }

    public Jeu(int id, String nom, float prixHT, String editeur, String image, TVA tva, Categories categorie) {
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
        this.editeur = editeur;
        this.image = image;
        this.tva = tva;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public TVA getTva() {
        return tva;
    }

    public void setTva(TVA tva) {
        this.tva = tva;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public void setCategorie(Categories categorie) {
        this.categorie = categorie;
    }

     public float getPrixTTC(){
        return prixHT  + prixHT*(tva.getMontant()/100);
    }
    @Override
    public String toString() {
        return "Jeu{" + "id=" + id + ", nom=" + nom + ", prixHT=" + prixHT + '}';
    }

    
    
    
}
