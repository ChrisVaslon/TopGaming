
package entites;

import java.util.Date;

/*
Auteur: Djouela
Date de création: 21/01/2021
*/
public class Commentaire {
    private int id;
    private String valeur;
    private Date date;
    private Date modifDate;
    
    private Points_Action pointsAction;
    private Jeu jeu;
    private Membre membre;

    public Commentaire() {
    }

    public Commentaire(int id, String valeur, Date date, Date modifDate) {
        this.id = id;
        this.valeur = valeur;
        this.date = date;
        this.modifDate = modifDate;
    }

    public Commentaire(int id, String valeur, Date date, Date modifDate, Points_Action pointsAction, Jeu jeu, Membre membre) {
        this.id = id;
        this.valeur = valeur;
        this.date = date;
        this.modifDate = modifDate;
        this.pointsAction = pointsAction;
        this.jeu = jeu;
        this.membre = membre;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getModifDate() {
        return modifDate;
    }

    public void setModifDate(Date modifDate) {
        this.modifDate = modifDate;
    }

    public Points_Action getPointsAction() {
        return pointsAction;
    }

    public void setPointsAction(Points_Action pointsAction) {
        this.pointsAction = pointsAction;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "id=" + id + ", valeur=" + valeur + ", date=" + date + ", modifDate=" + modifDate + ", jeu=" + jeu + ", membre=" + membre + '}';
    }

    

    
    
    
    
}
