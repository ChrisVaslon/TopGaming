
package entites;

/*
Auteur: Djouela
Date de création: 20/01/2021
*/
public class TVA {
    private int id;
    private String nom;
    private float montant; // en pourcentage

    public TVA() {
    }

    public TVA(int id, String nom, float montant) {
        this.id = id;
        this.nom = nom;
        this.montant = montant;
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

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "TVA{" + "id=" + id + ", nom=" + nom + ", montant=" + montant + '}';
    }
    
    
    
}
