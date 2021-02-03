/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author djtew
 */
public class PointsAction {
    private int id;
    private String nom;
    private int valeur;
    
    public static final String  COMMENTAIRE = "commentaire";
   // public static final String  EVALUATION = "evaluation";
    

    public PointsAction() {
    }

    public PointsAction(int id, String nom, int valeur) {
        this.id = id;
        this.nom = nom;
        this.valeur = valeur;
    }

    public PointsAction(int id) {
        this.id = id;
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

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "PointsAction{" + "id=" + id + ", nom=" + nom + ", valeur=" + valeur + '}';
    }
    
}
