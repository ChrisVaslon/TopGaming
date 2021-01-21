
package entites;
/*
Auteur: Djouela
Date de création: 20/01/2021
*/
import java.util.List;


public class Categorie {
    private int id;
    private List<String> genre;
    private List<Jeu> jeux;

    public Categorie() {
    }

    public Categorie(int id, List<String> genre) {
        this.id = id;
        this.genre = genre;
    }

    public Categorie(int id, List<String> genre, List<Jeu> jeux) {
        this.id = id;
        this.genre = genre;
        this.jeux = jeux;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<Jeu> getJeux() {
        return jeux;
    }

    public void setJeux(List<Jeu> jeux) {
        this.jeux = jeux;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", genre=" + genre + ", jeux=" + jeux + '}';
    }
    

    
}
