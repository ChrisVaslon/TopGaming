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
    private PointsAction pointsAction;


    public Evaluation() {
    }

    public Evaluation(int id, int valeur, Date date) {
        this.id = id;
        this.valeur = valeur;
        this.date = date;
    }

    public Evaluation(int id, int valeur, Date date, Jeu jeu, Membre membre, PointsAction pointsAction) {
        this.id = id;
        this.valeur = valeur;
        this.date = date;
        this.jeu = jeu;
        this.membre = membre;
        this.pointsAction = pointsAction;
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

    public PointsAction getPointsAction() {
        return pointsAction;
    }

    public void setPointsAction(PointsAction pointsAction) {
        this.pointsAction = pointsAction;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "id=" + id + ", valeur=" + valeur + ", date=" + date + ", jeu=" + jeu + ", membre=" + membre + '}';
    }


   
    
    
    
}
