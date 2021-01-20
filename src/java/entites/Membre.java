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
public class Membre {
    private int id;
    private String pseudo;
    private String nom;
    private String prenom;
    private Date dateCreationProfil;
    private Date dateNaissance;
    private String mail;
    private String mdp;
    private String rue;
    private String ville;
    private String cp;
    private int tel;
    private int points;
    
    // en attendant la creation de la class grade
    Grade id;
    Role id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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

    public Date getDateCreationProfil() {
        return dateCreationProfil;
    }

    public void setDateCreationProfil(Date dateCreationProfil) {
        this.dateCreationProfil = dateCreationProfil;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Grade getId() {
        return id;
    }

    public void setId(Grade id) {
        this.id = id;
    }

    public Role getId() {
        return id;
    }

    public void setId(Role id) {
        this.id = id;
    }

    public Membre() {
    }

    public Membre(int id, String pseudo, String nom, String prenom, Date dateCreationProfil, Date dateNaissance, String mail, String mdp, String rue, String ville, String cp, int tel, int points) {
        this.id = id;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.dateCreationProfil = dateCreationProfil;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.mdp = mdp;
        this.rue = rue;
        this.ville = ville;
        this.cp = cp;
        this.tel = tel;
        this.points = points;
    }

    public Membre(int id, String pseudo, String nom, String prenom, Date dateCreationProfil, Date dateNaissance, String mail, String mdp, String rue, String ville, String cp, int tel, int points, Grade id, Role id) {
        this.id = id;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.dateCreationProfil = dateCreationProfil;
        this.dateNaissance = dateNaissance;
        this.mail = mail;
        this.mdp = mdp;
        this.rue = rue;
        this.ville = ville;
        this.cp = cp;
        this.tel = tel;
        this.points = points;
        this.id = id;
        this.id = id;
    }

    @Override
    public String toString() {
        return "membre{" + "id=" + id + ", pseudo=" + pseudo + ", nom=" + nom + ", id=" + id + '}';
    }
         
    
    
    
}
