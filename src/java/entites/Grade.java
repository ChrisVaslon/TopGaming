/**
 *
 * @author Ousseynou
 */
package entites;


public class Grade {
    
    private int id;
    private String nom;
    private int min;
    private int max;
    

    public Grade() {
    }

    public Grade(int id, String nom, int min, int max) {
        this.id = id;
        this.nom = nom;
        this.min = min;
        this.max = max;
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

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", nom=" + nom + ", min=" + min + ", max=" + max + '}';
    }
    
    
    
    
    
    
}
