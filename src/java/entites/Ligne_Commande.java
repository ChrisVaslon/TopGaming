package entites;

/*
auteur : thulaksan
date de creation : 19/01/2021
 */
public class Ligne_Commande {
    private int id;
    private float prixHT;
    private float TVA;
    private int quantites;
    
    Jeux jeux;
    Commande command;

    public Ligne_Commande() {
    }

    public Ligne_Commande(int id, float prixHT, float TVA, int quantites, Jeux jeux, Commande command) {
        this.id = id;
        this.prixHT = prixHT;
        this.TVA = TVA;
        this.quantites = quantites;
        this.jeux = jeux;
        this.command = command;
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

    public int getQuantites() {
        return quantites;
    }

    public void setQuantites(int quantites) {
        this.quantites = quantites;
    }

    public Jeux getJeux() {
        return jeux;
    }

    public void setJeux(Jeux jeux) {
        this.jeux = jeux;
    }

    public Commande getCommand() {
        return command;
    }

    public void setCommand(Commande command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Ligne_De_Commande{" + "id=" + id + ", prixHT=" + prixHT + ", TVA=" + TVA + ", quantites=" + quantites + ", jeux=" + jeux + ", command=" + command + '}';
    }
    
    
}
