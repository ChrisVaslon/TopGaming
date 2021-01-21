
package entites;

/**
 *
 * @author djtew
 */
public class Points_Action {
    private int id;
    private String nom;
    private int valeur;

    public Points_Action() {
    }

    public Points_Action(int id, String nom, int valeur) {
        this.id = id;
        this.nom = nom;
        this.valeur = valeur;
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
        return "Points_Action{" + "id=" + id + ", nom=" + nom + ", valeur=" + valeur + '}';
    }
    
    
}
