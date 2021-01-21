/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.Date;

/**
 *
 * @author Win 7
 */
public class Evaluation {
    private int id;
    private int valeur;
    private Date date;
    
    private Jeu jeu;
    private Membre membre;
    private Points_Action pointsAction;


    public Evaluation() {
    }

    public Evaluation(int id, int valeur, Date date) {
        this.id = id;
        this.valeur = valeur;
        this.date = date;
    }


    public Evaluation(int id, int valeur, Date date, Jeu jeu, Membre membre, Points_Action points) {
        this.id = id;
        this.valeur = valeur;
        this.date = date;
        this.jeu = jeu;
        this.membre = membre;
        this.pointsAction = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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


    public Points_Action getPoints() {
        return pointsAction;
    }

    public void setPoints(Points_Action points) {

        this.pointsAction = points;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "id=" + id + ", valeur=" + valeur + '}';
    }
    
    
    
}
