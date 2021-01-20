/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Win 7
 */
public class Adresse {
    private int id;
    private String nom;
    private String prenom;
    private String rue;
    private String cp;
    private String ville;
   
    Membre membre;

    public Adresse() {
    }

    public Adresse(int id, String nom, String prenom, String rue, String cp, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public Adresse(int id, String nom, String prenom, String rue, String cp, String ville, Membre membre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.membre = membre;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public String toString() {
        return "Adresse{" + "id=" + id + ", nom=" + nom + '}';
    }
           
    
    
    
}
