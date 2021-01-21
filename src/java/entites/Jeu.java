
package entites;

// import java.util.List;

/*
Auteur: Djouela
Date de création: 21/01/2021
*/

public class Jeu {
    private int id;
    private String nom;
    private float prixHT;
    private String description;
    private String image; // nom de la photo
    
    private TVA tva;
    private Categorie categorie;
    
   // private List<Commentaire> commentaires;
    //private List<Evaluation> evalutations;
            

    public Jeu() {
    }

    public Jeu(int id, String nom, float prixHT, String description, String image) {
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
        this.description = description;
        this.image = image;
    }

    public Jeu(int id, String nom, float prixHT, String description, String image, TVA tva, Categorie categorie) {
        this.id = id;
        this.nom = nom;
        this.prixHT = prixHT;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Jeu{" + "id=" + id + ", nom=" + nom + ", prixHT=" + prixHT + '}';
    }

  
    
    
}
